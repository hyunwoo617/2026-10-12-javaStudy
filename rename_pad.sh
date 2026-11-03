#!/bin/bash
# (1일차) -> (01일차) 처럼 일차 숫자를 두 자리로 맞춰서 GitHub 정렬 순서를 바로잡는다.
# 사용법: bash rename_pad.sh (미리보기) / bash rename_pad.sh --run (실제 변경)

RUN=0
[ "$1" = "--run" ] && RUN=1

if [ ! -d ".git" ]; then
  echo "[오류] 저장소 최상위 폴더에서 실행하세요. (.git 폴더가 있는 곳)"
  exit 1
fi

[ $RUN -eq 0 ] && echo "===== 미리보기 (실제로 바뀌지 않습니다) =====" || echo "===== 변경 시작 ====="

COUNT=0
for d in */; do
  d="${d%/}"
  if [[ "$d" =~ ^\(([0-9]+)일차\)\ (.+)$ ]]; then
    num="${BASH_REMATCH[1]}"
    rest="${BASH_REMATCH[2]}"
    padded=$(printf "%02d" "$((10#$num))")
    new="($padded일차) $rest"
    [ "$d" = "$new" ] && continue
    if [ -e "$new" ]; then echo "[건너뜀] 이미 있음: $new"; continue; fi
    echo "$d  ->  $new"
    if [ $RUN -eq 1 ]; then
      git mv "$d" "$new" || { echo "[실패] $d"; exit 1; }
      if [ -f "$new/.project" ]; then
        sed -i "0,/<name>[^<]*<\/name>/s//<name>$new<\/name>/" "$new/.project"
      fi
    fi
    COUNT=$((COUNT+1))
  fi
done

echo
echo "변경 대상 ${COUNT}개"

if [ $RUN -eq 0 ]; then
  echo "문제없으면  bash rename_pad.sh --run  으로 실제 변경하세요."
  exit 0
fi

git add -A -- . ":(exclude)$(basename "$0")" ":(exclude)rename_folders.sh"
git commit -m "폴더명 일차를 두 자리로 통일 (01일차 ~ 16일차)"

read -p "GitHub에 push 할까요? (y/N): " ans
if [ "$ans" = "y" ] || [ "$ans" = "Y" ]; then
  git push
else
  echo "push는 하지 않았습니다. 나중에 git push 하세요."
fi
