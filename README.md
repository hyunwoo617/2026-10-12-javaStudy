## 1일차 | 2026.10.12 (월) | 과정 소개


<details>
<summary><b>자바 전체 커리큘럼 로드맵</b></summary>

<br>

**기본 과정**
- 변수 / 데이터형 / 연산자 / 제어문 / 배열
- 프로그램의 "순서"와 "연산 처리"를 배우는 단계

**객체 지향**
- 클래스 / 객체 / 메소드 / 생성자 / 인터페이스 / 추상클래스
- 4대 특징: 캡슐화, 은닉화, 상속, 다형성
- 설계 원칙 SOLID 개념

**예외 처리**
- 프로그램이 비정상 종료되지 않고 정상적으로 수행되도록 처리하는 방법

**라이브러리 (필수)**
- 데이터 저장: Collection
- 파일 입출력: IO
- 오라클 연동: JDBC
- 기타: 쓰레드, 네트워크

</details>

<details>
<summary><b>프로그램이 동작하는 기본 순서</b></summary>

<br>

1. 사용자가 보낸 데이터를 **메모리에 저장** → 변수
2. 요청을 **처리** → 제어문 / 연산자
   - 자주 쓰는 기능은 **메소드(함수)** 로 묶어 재사용
3. 결과값을 **출력** → IO

> 같은 기능끼리 묶어서 관리하는 것(메소드, 객체)이 자바의 핵심이다.

</details>

<details>
<summary><b>변수와 데이터형 첫 소개</b></summary>

<br>

- 변수 = **메모리 공간에 붙인 이름**
- 메모리는 주소(0, 4, 8, 12…)로 구분되고, 값이 저장된 위치를 쉽게 찾기 위해 별칭(변수명)을 붙인다.
- 메모리 크기를 정하는 것이 **데이터형**
  - 자바가 제공하는 데이터형
  - 사용자 정의 데이터형(클래스)

</details>

---

## 2일차 | 2026.10.13 (화) | Chapter 01. 자바 소개

<details>
<summary><b>자바의 특징</b></summary>

<br>

| 특징 | 설명 |
|---|---|
| 이식성 | 모든 운영체제에서 실행 가능 |
| 자동 메모리 해제 | 가비지 컬렉션(GC) 사용, 필요 시 `System.gc()`로 직접 호출 가능 |
| 객체 지향 | 조립식으로 개발 (메인보드처럼 부품을 조립하는 개념), Spring의 CBD와 연결 |
| 풍부한 라이브러리 | 자바가 기능을 제공하여 개발 속도 향상 |

</details>

<details>
<summary><b>자바 실행 과정 (컴파일 / 인터프리터)</b></summary>

<br>

```
A.java  ──── javac ────▶  A.class  ──── java ────▶  실행
(개발자가 읽는 소스)   (컴파일)    (바이트 코드)  (인터프리터)
```

- **javac (컴파일)**: 소스를 컴퓨터가 인식하는 언어(바이트 코드)로 변환, 이때 문법 검사
- **java (인터프리터)**: `.class` 파일을 한 줄씩 읽어서 실행하고 출력
- 이클립스는 코딩할 때마다 컴파일하기 때문에 에러를 바로 확인할 수 있다.

</details>

<details>
<summary><b>개발 환경 설치</b></summary>

<br>

- **JDK 21** 설치 (jdk.java.net) → 자바 개발 도구
- **Eclipse** 설치 (eclipse.org, J2EE 버전) → 편집기
- 환경 변수 설정
  - `path` : `C:\jdk-21\bin`
  - `classpath` : `.;C:\jdk-21\lib`
- 설치 확인 명령어: `java -version`, `java`, `javac`

</details>

<details>
<summary><b>코딩 기본 규칙과 주석</b></summary>

<br>

- 모든 프로그램은 **`main()`** 이 필요하다 (프로그램의 시작점)
- 프로그램은 컴퓨터가 명령을 수행하도록 만드는 것이며, 명령이 끝나면 반드시 **`;`**
- **클래스명과 파일명은 동일**해야 한다
- 가급적 한글명은 사용하지 않는다
- **주석**: 컴파일되지 않는 부분으로, 소스를 알아보기 쉽게 설명하는 용도
  - 여러 줄 주석 `/* */` : `Ctrl + Shift + /` (해제 `Ctrl + Shift + \`)
  - 한 줄 주석 `//` : `Ctrl + /`

</details>

<details>
<summary><b>좋은 프로그램의 조건과 앞으로의 학습 흐름</b></summary>

<br>

**좋은 프로그램의 조건**
1. 재사용
2. 가독성
3. 확장성 (리팩토링)
- 위 3가지가 모여 **유지보수성**이 좋아진다.
- 예) 데이터를 저장할 때 `n`보다 `name`처럼 의미가 있는 변수명을 사용

**1~4장 흐름**
| 장 | 내용 |
|---|---|
| 1장 | 자바 소개 (실행 방법, 특징, 설치, 주의점) |
| 2장 | 데이터 저장 방법 (변수 / 상수, 데이터형) |
| 3장 | 연산 처리 (단항, 이항, 삼항) |
| 4장 | 프로그램 제어 (제어문) |

</details>

<details>
<summary><b>실습</b></summary>

<br>

```java
public class 자바동작과정 {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

- 첫 프로그램 작성, 컴파일, 실행 확인

</details>

---

## 3일차 | 2026.10.14 (수) | Chapter 02. 변수와 데이터형

<details>
<summary><b>변수란? (메모리 저장 원리)</b></summary>

<br>

- 변수 = 한 개의 데이터를 저장하는 메모리 공간
- 모든 프로그래밍 언어는 **RAM**에 저장하고, 프로그램이 종료되면 해제된다.
- 영구 저장이 필요하면 파일 또는 DB(오라클, MySQL, PostgreSQL)를 사용한다.
- 메모리 위치를 알기 쉽도록 이름(별칭)을 부여한 것이 변수

</details>

<details>
<summary><b>데이터형 (기본형 8종 + 참조형)</b></summary>

<br>

| 구분 | 데이터형 | 크기 | 특징 / 용도 |
|---|---|:---:|---|
| 정수 | `byte` | 1byte | -128 ~ 127, 네트워크 전송 / 파일 업로드 |
| 정수 | `short` | 2byte | -32768 ~ 32767, 사용 빈도 낮음 (C언어 호환) |
| 정수 | **`int`** | 4byte | 약 21억, **기본 정수형**, 일반 프로그램에서 가장 많이 사용 |
| 정수 | **`long`** | 8byte | 금융권 / 빅데이터 / AI, 값 뒤에 `L` |
| 실수 | `float` | 4byte | 소수점 약 6자리, 값 뒤에 `f` |
| 실수 | **`double`** | 8byte | 소수점 약 15자리, **기본 실수형** |
| 논리 | `boolean` | 1byte | `true` / `false` |
| 문자 | `char` | 2byte | 문자 1개, 유니코드(0~65535), `'A'` |

- **참조형**: `String`(자바에서 제공하는 클래스), 배열, 클래스, 인터페이스
- 문자 여러 개는 `String` → `"ABC"`
- 용도 정리
  - 일반 통계 / 총합 → `int`
  - 평균 → `double`
  - 학점 → `char`
  - 존재 여부 → `boolean`
- 크기 순서: `byte < char < int < long < float < double`

</details>

<details>
<summary><b>변수 선언과 명명 규칙</b></summary>

<br>

**선언 형식**
```java
데이터형 변수명 = 값;
int a = 10;          // 변수 (변하는 수)
final int B = 10;    // 상수 (재할당 시 오류)
```

**변수 이름 규칙 (식별자)**
1. 알파벳 / 한글로 시작하고, 대소문자를 구분 (`a`, `A`는 다른 변수)
2. 숫자 사용 가능, 단 **맨 앞에는 불가** (`a1` 가능, `1a` 불가)
3. 특수문자는 `_`, `$` 만 가능
4. 공백 사용 불가
5. 키워드(예약어) 사용 불가

**개발자 약속 (관례)**
- 변수는 소문자로 시작, 단어가 2개 이상이면 **캐멀 표기** (`firstName`, `engScore`)
- 상수는 전체 대문자 (`final double PI = 3.14;`)
- 클래스명은 대문자로 시작
- 3~10자 정도로, 알아보기 쉽게 작성

</details>

<details>
<summary><b>값 표기 방법 (리터럴)</b></summary>

<br>

| 구분 | 표기 |
|---|---|
| 10진수 | `10`, `20` |
| 8진수 | `007` (0으로 시작) |
| 16진수 | `0xFF` |
| 2진수 | `0b0101` |
| long | `10L` / `10l` |
| float | `10.5F` / `10.5f` |
| double | `10.5` (`D`는 생략 가능) |
| char | `'A'` (작은따옴표, 빈 값 `''`은 오류) |

- `byte`, `short`는 별도 구분자가 없고, **범위를 벗어나지 않게** 주의
- 컴퓨터는 정수 리터럴을 무조건 `int`, 실수 리터럴을 `double`로 인식

</details>

<details>
<summary><b>형변환 (자동 / 강제)</b></summary>

<br>

```
byte < char < int < long < float < double
  ────── 자동 형변환 (UpCasting) ──────▶
  ◀───── 강제 형변환 (DownCasting) ─────
```

- **자동 형변환**: 작은 데이터형 → 큰 데이터형
```java
  long l = 10;       // int → long
  double d = 100;    // 100.0 으로 저장
```
- **강제 형변환**: 큰 데이터형 → 작은 데이터형, 소수점이 사라질 수 있음
```java
  int a = (int) 10.5;   // 10
```
- `boolean`은 형변환에서 제외
- `char`는 문자가 아니라 **문자에 해당하는 숫자(유니코드)** 를 저장
```java
  (char) 97   // 'a'
  (int) '0'   // 48
  (int) 'A'   // 65
```
- 작은 데이터형에 큰 값은 저장할 수 없다 (`int a = 10L;` 오류)

</details>

<details>
<summary><b>변수 초기화와 키보드 입력 (Scanner)</b></summary>

<br>

**초기화 방법**
- 선언과 동시에 값 설정 (명시적 초기화): `int a = 10;`
- 선언 후 값 대입: 사용자 입력값, 난수 처리 시 사용
- **지역변수는 반드시 초기화한 후에 사용**해야 한다.

**난수**
```java
int a = (int)(Math.random() * 100) + 1;   // 1 ~ 100
```

**Scanner로 입력받기**
```java
import java.util.Scanner;

Scanner scan = new Scanner(System.in);
System.out.print("정수 입력:");
int a = scan.nextInt();    // 입력값을 a라는 메모리 공간에 저장
```

</details>

<details>
<summary><b>출력 방법</b></summary>

<br>

| 명령 | 설명 |
|---|---|
| `System.out.print()` | 가로 출력 |
| `System.out.println()` | 세로 출력 (줄바꿈) |
| `System.out.printf()` | 서식이 있는 출력 |

- 특수문자: `\n`(줄바꿈), `\t`(탭)

</details>

<details>
<summary><b>JVM / JDK 구조 정리</b></summary>

<br>

**JVM의 역할**
- 일반 프로그램은 운영체제(API)를 통해 하드웨어에 접근하지만, 자바는 **JVM**이 중간에서 통신 역할을 한다.
- 그래서 어떤 운영체제에서도 실행되지만 실행 속도는 상대적으로 느리다.

**JDK 구성 요소**
| 구성 | 설명 |
|---|---|
| JRE | 실행 환경 (JVM + 라이브러리 포함) |
| JVM | 자바 가상 머신 |
| `javac` | 컴파일러 (컴퓨터가 인식하는 언어로 변경) |
| `java` | 프로그램 실행 (한 줄씩 읽는 인터프리터) |
| `javap` | 역컴파일러 |
| `javaw` | 서버 구동 (톰캣 등) |
| `jar` | 배포용 압축 (.class 파일을 모아서 배포) |

**자바로 만들 수 있는 프로그램**
- 모바일 (안드로이드), 게임 (Swing / JavaFX), 웹 (Spring, Kotlin도 JVM 기반)

**소스 코딩 규칙 재정리**
- `public class`의 이름은 파일명과 동일
- 실행하려면 `main`이 반드시 필요
- 명령문은 `;`로 종료, 순서대로 실행
- 이클립스 실행 단축키: `Ctrl + F11`

</details>

<details>
<summary><b>실습</b></summary>

<br>

- 데이터형별 변수 선언 후 출력 (`byte`, `int`, `long`, `float`, `double`, `boolean`, `char`)
- 자동 형변환과 강제 형변환 확인, 문자 ↔ 유니코드 변환 출력
- `Scanner`로 정수 입력받아 출력
- `print`와 `println`, 탭 문자 출력 차이 확인

</details>

---

## 4일차 | 2026.10.15 (목) | Chapter 03. 연산자

- 결과를 직접 계산해 적어 둔 항목: 증감 연산자 합산, 문자열 `+` 결합, 부동소수점 오차(77)

<details>
<summary><b>연산자 큰 그림과 변수 초기화 정리</b></summary>

<br>

**프로그램의 구성**
```
데이터 저장  →  데이터 가공 (연산자 / 제어문 / 메소드)  →  결과 출력
```
- 한 개 저장: 변수 / 같은 타입 여러 개: 배열 / 다른 타입 여러 개: 클래스

**연산자 분류 (피연산자 개수 기준)**
| 구분 | 종류 |
|---|---|
| 단항 (1개) | 증감 `++ --`, 부정 `!`, 형변환 `(데이터형)` |
| 이항 (2개) | 산술, 비교, 논리, 대입, 비트, 비트 이동 |
| 삼항 (3개) | `조건 ? 값1 : 값2` |

**변수 초기화 패턴**
```java
int a = 10, b = 10, c = 10;   // 여러 개 선언
a = b = c = 10;               // 같은 값 대입
int b = a;                    // 다른 변수 값으로 초기화

// 값 교체 (swap) : 임시 변수 사용
int temp = a;
a = b;
b = temp;
```

**특수문자 (이스케이프)**
| 표기 | 의미 |
|---|---|
| `\n` | 줄바꿈 |
| `\t` | 탭 (일정 간격) |
| `\\` | `\` (경로명) |
| `\"` | `"` |

</details>

<details>
<summary><b>단항 연산자 - 증감 연산자 (++, --)</b></summary>

<br>

- 1씩 증가 / 감소, 반복문의 **카운트 처리**에 주로 사용 (장바구니, 좋아요, 검색 결과 수 등)
- **전위** `++a` : 먼저 증가하고 나중에 대입
- **후위** `a++` : 먼저 대입하고 나중에 증가

```java
int a = 10;
int b = a++;   // b = 10, a = 11  (대입 후 증가)

a = 10;
int c = ++a;   // c = 11, a = 11  (증가 후 대입)

a = 10;
int r = ++a + ++a + a++;       // 11 + 12 + 12 = 35
a = 10;
int s = a++ + ++a + a++ + ++a; // 10 + 12 + 12 + 14 = 48
```

- 1 증가 표현 3가지: `a++` / `a = a + 1` / `a += 1`
- 실습: 배열에 1~10 난수를 저장하면서 값이 5인 개수를 `++count`로 카운트

</details>

<details>
<summary><b>단항 연산자 - 부정 연산자(!)와 형변환 연산자</b></summary>

<br>

**부정 연산자 `!`**
- `true` ↔ `false` 반전, 조건문에 사용
- 활용: 예약일 체크, 체크인 / 체크아웃, 좋아요 토글
- 반복문에서 `bCheck = !bCheck;`로 사용자 / 컴퓨터 턴을 번갈아 처리하는 예제

**형변환 연산자**
- 자동: `long a = 100;`, `int a = 'A';` (65), `10.5 + 10` → `10.5 + 10.0 = 20.5`
- 강제: `int a = (int) 10.5;` → 10
- 괄호 위치에 따라 결과가 달라진다
```java
  (int)(10.5 + 10.5)      // 21
  (int)10.5 + (int)10.5   // 20
```
- 실수 오차: `(int)((123456.78 - 123456) * 100)` → 78이 아니라 **77** (부동소수점 오차)

**산술 규칙**
1. 서로 다른 데이터형끼리 연산하면 **큰 데이터형으로 변환 후** 처리
2. **int 이하**(byte, short, char)끼리의 연산 결과는 **int**
   - `byte + byte = int`, `char + char = int`, `byte + char = int`
   - `char + double = double`, `byte + int + long = long`
- `byte` 3개를 더하면(127 + 100 + 39 = 266) int로 받아야 하며, 266의 2진수는 `Integer.toBinaryString(266)`로 확인

</details>

<details>
<summary><b>이항 연산자 - 산술 연산자 (+ - * / %)</b></summary>

<br>

- `* / %` 가 `+ -` 보다 우선순위가 높다
- **`+`**: 산술 + **문자열 결합**
```java
  "10" + 10     // "1010"
  7 + "7" + 7 + 7   // "7777"
  7 + 7 + "7" + 7   // "1477"
```
- **`/`**
  - 정수 / 정수 = 정수 (소수점 제거) → `5/2 = 2`, `5/2.0 = 2.5`
  - 정수를 0으로 나누면 오류 발생 → 삼항 연산자로 방어: `b == 0 ? "0으로 나눌 수 없다" : a / b`
  - 실수는 오류 없이 `5 / 0.0` → Infinity, `5 % 0.0` → NaN
- **`%`** (나머지)
  - 부호는 **앞(왼쪽) 피연산자의 부호**를 따른다
    - `5 % 2 = 1`, `5 % -2 = 1`, `-5 % 2 = -1`, `-5 % -2 = -1`
  - 활용: 짝수 / 홀수, 배수, 윤년 계산, 숫자 자르기
- 자릿수 분리
```java
  int won = 789;
  won / 100        // 7   (백의 자리)
  (won % 100) / 10 // 8   (십의 자리)
  won % 10         // 9   (일의 자리)
```
- 출력 서식: `%d` 정수 / `%f` 실수 / `%.2f` 소수점 2자리 / `%c` 문자 / `%s` 문자열

</details>

<details>
<summary><b>이항 연산자 - 비교 연산자</b></summary>

<br>

| 연산자 | 의미 |
|---|---|
| `==` | 같다 |
| `!=` | 같지 않다 |
| `<` `>` | 작다 / 크다 |
| `<=` `>=` | 작거나 같다 / 크거나 같다 |

- 결과는 항상 **`true` / `false`** → 조건문, 반복문에서 사용
- 숫자형(byte, char, int, long, float, double)은 모두 비교 가능
  - 문자는 연산 시 자동으로 int로 변환 → `'A' == 65` 는 `true`
  - `float`와 `double` 비교 시 큰 데이터형으로 변환 후 비교
- `boolean`은 `==`, `!=` 만 가능
- **문자열은 `==` 대신 `equals()`** 사용 (주소 비교 vs 값 비교)
  - 그 외: `compareTo()`, `contains()`, `startsWith()`, `endsWith()`
  - 로그인 ID 비교 예제: `mId.equals(id)`

</details>

<details>
<summary><b>이항 연산자 - 논리 연산자 (&&, ||)</b></summary>

<br>

| 조건1 | 조건2 | `&&` (직렬) | `\|\|` (병렬) |
|:---:|:---:|:---:|:---:|
| true | true | true | true |
| true | false | false | true |
| false | true | false | true |
| false | false | false | false |

- `&&` : **범위 안**에 있는 경우 (`score >= 90 && score <= 100`), id && pwd
- `||` : **범위 밖**에 있는 경우 (`score < 0 || score > 100`)
- **단락 평가(Short-circuit)**: `&&`는 앞이 false, `||`는 앞이 true면 뒤를 계산하지 않는다 (뒤 조건의 코드는 실행되지 않음)
- 실습: 입력한 문자가 알파벳인지 판별
```java
  c >= 'A' && c <= 'Z'                          // 대문자
  c >= 'a' && c <= 'z'                          // 소문자
  !((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))   // 알파벳이 아님
```
- 응용: **Jsoup**으로 지니 차트를 크롤링해 입력한 검색어가 포함된 곡명만 출력 (`contains` 활용, 외부 라이브러리 맛보기)

</details>

<details>
<summary><b>이항 연산자 - 대입 연산자와 복합 대입 연산자</b></summary>

<br>

- `=` : 오른쪽 값을 왼쪽 변수에 대입 (**우선순위 가장 낮음**, 오른쪽 → 왼쪽)
- 복합 대입: `+=`, `-=`, `*=`, `/=`, `%=`
```java
  a += 5;        // a = a + 5
  s3 += s1;      // 문자열 누적 결합
  d /= 3.0;      // 내부적으로 형변환 처리 후 대입
```
- 증가량이 클 때는 `++`보다 `+=` 사용
- 복합 대입은 속도가 느리지 않고, 형변환을 내부적으로 처리해 주는 경우가 많다.

</details>

<details>
<summary><b>이항 연산자 - 비트 연산자와 비트 이동 연산자</b></summary>

<br>

| 연산자 | 규칙 | 예시 |
|:---:|---|---|
| `&` | 둘 다 1일 때만 1 | `35 & 20 = 0`, `28 & 10 = 8` |
| `\|` | 하나라도 1이면 1 | `35 \| 20 = 55`, `28 \| 10 = 30` |
| `^` | 서로 다르면 1 | `35 ^ 20 = 55`, `28 ^ 10 = 22` |
| `<<` | `x << y` = x × 2^y | `10 << 2 = 40` |
| `>>` | `x >> y` = x ÷ 2^y | `10 >> 2 = 2` |

- 진법 변환 메소드
```java
  Integer.toBinaryString(100)  // 2진수
  Integer.toOctalString(100)   // 8진수
  Integer.toHexString(100)     // 16진수
```
- 연산자 우선순위: 증감 → 형변환 → 산술 → 비교 → 논리 → 대입

</details>

<details>
<summary><b>삼항 연산자</b></summary>

<br>

```java
조건 ? 값1 : 값2     // true면 값1, false면 값2
```

- `if ~ else`를 간결하게 표현, 화면 출력 시 유용
- 조건에는 부정 / 비교 / 논리 연산자 사용 (결과가 true/false)
- JSP, Thymeleaf처럼 **HTML과 Java가 섞이는 코드**에서 자주 사용
- 실습: 정수를 입력받아 짝수 / 홀수 출력
```java
  System.out.println(num % 2 == 0 ? "짝수" : "홀수");
```

</details>

<details>
<summary><b>자바 기초 종합 테스트 (20문항) 풀이</b></summary>

<br>

| 분야 | 핵심 개념 | 정답 |
|---|---|:---:|
| 실행 과정 (1) | javac는 바이트코드(.class)를 생성 | ② |
| JVM (2) | 인터프리터와 JIT 컴파일러가 실행 | ② |
| 식별자 (3) | 숫자로 시작할 수 없다 | ① |
| 데이터형 (4) | `String`은 기본형이 아닌 참조형 | ④ |
| 리터럴 (5) | 정수 리터럴의 기본 타입은 `int` | ② |
| 변수 선언 (6) | `char`는 `'K'`, `boolean`은 `true/false` | ② |
| 초기화 (7) | 지역변수는 사용 전에 반드시 초기화 | ① |
| 우선순위 (8) | 증감 연산자가 가장 높음 | ③ |
| 산술 (9) | `5 + 3 * 2 = 11` | ② |
| 증감 (10) | 후위는 다른 연산이 끝난 후 증감 | ② |
| 자동 형변환 (11) | `int` → `double` | ③ |
| 강제 형변환 (12) | `int n = (int) 3.14;` | ③ |
| 비교 연산 (13) | 결과는 항상 `boolean` | ③ |
| 단락 평가 (14) | `&&`, `\|\|` | ② |
| 삼항 (15) | `조건식 ? 참값 : 거짓값` | ③ |
| 문자열 결합 (16) | 문자열과 결합하면 결과는 문자열 | ① |
| 비트 연산 (17) | `& \| ^ ~` | ④ |
| 대입 연산 (18) | 복합 대입이 느리다는 설명이 **틀린** 설명 | ② |
| 후위 증감 (19) | `b = a++` → 출력 10 | ① |
| 상수 (20) | `final` 키워드 | ② |

**함께 정리한 내용**
- 변수의 종류와 메모리 영역
  - 멤버변수(인스턴스) → heap
  - 정적변수 → method area
  - 지역변수, 매개변수 → stack (메소드 종료 시 자동 삭제)
- 인스턴스 변수는 자동 초기화되지만, 지역변수는 자동 초기화되지 않는다.
- 자바 소스 구조: `package` → `import` → `class` (멤버변수, 정적변수, 생성자, 메소드, `main`)

</details>

<details>
<summary><b>앞으로 배울 내용 (로드맵)</b></summary>

<br>

- 제어문 → 배열 → 메소드 → 객체지향 → 예외처리
- 라이브러리: Collection, IO, JDBC
- 이후 확장: Oracle, HTML/CSS/JavaScript, JSP, Spring Boot, Spring Security(JWT), AWS 등

</details>

<details>
<summary><b>실습</b></summary>

<br>

- 국어 / 영어 / 수학 점수를 입력받아 **총점과 평균** 출력 (`printf("%.2f")`)
- 정수 입력 후 **짝수 / 홀수 판별** (삼항 연산자)
- 금액을 **100원 / 10원 / 1원 단위로 분리** (`/`, `%`)
- 입력 문자가 **알파벳인지 판별** (논리 연산자)
- 배열 난수에서 특정 값의 **개수 세기** (증감 연산자)
- 문자열 `equals()`로 **로그인 ID 비교**
- 연산자 결과 직접 출력으로 **나머지 부호 규칙 확인**

</details>

---

## 5일차 | 2026.10.16 (금) | Chapter 04. 제어문 (조건문, 선택문)


<details>
<summary><b>제어문 분류와 기본 규칙</b></summary>

<br>

| 목적 | 문장 |
|---|---|
| 조건에 따라 실행 | if, if ~ else, else if, switch |
| 같은 작업 반복 | for, while, do ~ while |
| 반복 중단 / 건너뛰기 | break, continue |

- 조건식에는 true / false가 나오는 비교, 논리, 부정 연산자만 쓴다.
- 중괄호가 없으면 바로 아래 한 문장만 제어한다. 문장이 둘 이상이면 중괄호를 쓴다.
- `if (조건);` 처럼 세미콜론을 붙이면 뒤의 블록은 조건과 상관없이 항상 실행된다. (제어문요약.java 주석)
- 반복문은 6일차에 정리했다.

</details>

<details>
<summary><b>if와 if ~ else</b></summary>

<br>

짝수 / 홀수 판별을 if 두 개로 쓴 코드(제어문종류.java)와 if ~ else로 쓴 코드(선택조건문_1.java)가 있다.

```java
// 제어문종류.java
if (num % 2 == 0) { ... }   // 짝수
if (num % 2 != 0) { ... }   // 홀수

// 선택조건문_1.java
if (a % 2 == 0) { ... }     // 짝수
else { ... }                // 홀수
```

- if 두 개는 서로 독립이라, 첫 번째가 true여도 두 번째 조건을 다시 검사한다.
- else는 앞 조건이 false일 때만 들어가서 검사가 한 번이다.
- else만 단독으로는 쓸 수 없다.
- true / false로 나누는 경우가 웹에서 많다. 로그인 성공이면 메인으로, 실패면 재로그인.

</details>

<details>
<summary><b>else if (다중 조건문)</b></summary>

<br>

```java
// 다중조건문_1.java (일부)
char op = scan.next().charAt(0);

if (op == '+')
{
    System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
}
else if (op == '-')
{
    System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
}
else
{
    System.err.println("연산자가 아닙니다!");
}
```

- 위에서부터 차례로 검사하고, 처음 true인 블록 하나만 실행한 뒤 나머지는 건너뛴다.
- 독립 if는 true인 블록이 여러 개 실행될 수 있지만 else if는 하나뿐이다.
- 메뉴 처리에 쓴다. 다중조건문_2.java는 `while (true)` 안에서 메뉴 번호 1~7을 else if로 나누고, 7이면 `System.exit(0)`으로 끝낸다. 없는 번호는 마지막 else에서 다시 입력받는다.

</details>

<details>
<summary><b>switch (선택문)</b></summary>

<br>

```java
// 선택문_1.java
switch (month)
{
case 12, 1, 2 -> System.out.println(month + "는(은) 겨울입니다");
case 3, 4, 5  -> System.out.println(month + "는(은) 봄입니다");
case 6, 7, 8  -> System.out.println(month + "는(은) 여름입니다");
case 9, 10, 11 -> System.out.println(month + "는(은) 가을입니다");
default -> System.out.println("없는 달입니다");
}
```

| 구분 | 기존 문법 | 화살표 문법 (JDK 14 이상) |
|---|---|---|
| break | 직접 써야 함 | 필요 없음 |
| 여러 값 묶기 | `case 3: case 4: case 5:` | `case 3, 4, 5 ->` |

- 값 하나로 고를 때 쓴다. 범위 비교는 if가 맞다.
- 정수, 문자, 문자열을 받을 수 있다. 선택문_2.java는 `switch (scan.next())`로 연산자 문자열을 받는다.
- 나눗셈 case 안에서 switch를 한 번 더 써서 `num2`가 0인 경우를 따로 처리했다.
- case 값은 중복되면 안 되고, 없는 값은 default로 처리한다.

| 구분 | 독립 if | if ~ else if | switch |
|---|---|---|---|
| 비교 방식 | 조건마다 따로 | 위에서부터 순서대로 | 값 하나와 case 비교 |
| 실행되는 블록 | 여러 개 가능 | 1개 | 1개 (화살표 문법 기준) |
| 어울리는 경우 | 서로 관계없는 검사 | 범위 | 메뉴, 계절 |

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| 가위바위보. 경우 9개를 나열한 조건(주석 처리)을 `com - user` 값 하나로 if 3개로 줄임 |
| 난수 3개(1~100)의 최대값, 최소값. `max = a`로 시작해 if 2개로 비교 |
| 사칙연산. 나눗셈은 `num2 == 0`이면 메시지만 출력 |
| 입력 문자를 대문자 / 소문자 / 숫자 / 기타로 구분 |
| 3과목 총점, 평균, 평균 60 이상이면 합격 |
| 난수로 알파벳을 만들고 대문자 / 소문자 구분 |
| 사원 관리 메뉴 7개, 종료 선택 전까지 반복 |
| 월을 입력하지 않고 난수로 뽑아 계절 판별 (else if를 switch로 교체) |
| 문자열 switch로 계산기 |
| `5 / 0.0`과 `5 % 0.0` 결과 확인 (Infinity, NaN) |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- 기존 switch에서 break를 빼면 어떻게 동작하는가? (선택문_1.java의 주석 처리한 코드로 확인)
- 정수를 0으로 나누면 오류인데, `5 / 0.0`은 왜 오류 없이 Infinity가 나오는가?

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

조건이 범위면 else if, 값이 딱 떨어지면 switch를 쓴다. 독립 if는 서로 영향이 없어서, 하나만 실행되게 하려면 else로 묶어야 한다.

</details>

---

## 6일차 | 2026.10.19 (월) | Chapter 04. 제어문 (반복문)


<details>
<summary><b>반복문 종류와 for문의 동작 순서</b></summary>

<br>

| 반복문 | 쓰는 경우 | 비고 |
|---|---|---|
| for | 반복 횟수를 알 때 | 화면 UI, 페이지 나누기, 배열, 컬렉션 |
| while | 반복 횟수를 모를 때 | 파일, 데이터베이스, 네트워크처럼 종료 시점이 정해지지 않은 작업 |
| do ~ while | 한 번은 반드시 실행해야 할 때 | 사용 빈도가 거의 없다 |
| break / continue | 반복 중단 / 이번 회차만 건너뛰기 | 반복문 안에서 if와 함께 쓴다 |

```java
for (초기값; 조건식; 증감식)
{
    반복 수행 문장
}
```

- 초기값은 어디부터, 조건식은 어디까지, 증감식은 몇 씩 움직일지를 정한다.
- 실행 순서는 초기값 → 조건식 → 반복 문장 → 증감식이고, 두 번째 회차부터는 조건식 → 반복 문장 → 증감식만 돈다. 조건식이 false가 되면 종료한다.

```java
for (int i = 1; i <= 3; i++)
{
    System.out.println(i);
}
// i=1 → 1 <= 3 true  → 1 출력 → i++
// i=2 → 2 <= 3 true  → 2 출력 → i++
// i=3 → 3 <= 3 true  → 3 출력 → i++
// i=4 → 4 <= 3 false → 종료
```

- for 안에서 선언한 변수는 for가 끝나면 사라진다. 지역변수는 선언한 `{}` 안에서만 쓸 수 있다.
- 제어문은 기본적으로 한 문장만 제어하므로 여러 문장을 반복하려면 `{}`를 쓴다.

</details>

<details>
<summary><b>for문 활용 - 증가 단위, 문자, 누적 변수</b></summary>

<br>

**증감식을 바꾸면 출력이 달라진다**
```java
for (char c = 'A'; c <= 'Z'; c++) { ... }   // A ~ Z
for (char c = 'Z'; c >= 'A'; c--) { ... }   // Z ~ A
for (int i = 1; i <= 10; i += 2) { ... }    // 1 3 5 7 9
```
- char도 내부적으로는 숫자(유니코드)라서 `c++`, `c <= 'Z'`가 된다. 3일차에 배운 형변환 내용과 이어진다.
- 반복문_5는 같은 A~Z를 `char c = 'A'`를 for 밖에 선언하고 `for (int i = 0; i < 26; i++)` 안에서 `c++`로 출력하는 방식으로도 짜 봤다. 앞의 for에서 쓴 `c`는 for가 끝나면 사라지기 때문에 같은 이름으로 다시 선언할 수 있다.

**누적 변수**
```java
int sum = 0;                    // for 밖에서 선언
for (int i = 1; i <= 100; i++)
{
    sum += i;
}
System.out.println(sum);        // 5050
```
- `sum`을 for 안에 선언하면 매 회차마다 0으로 다시 만들어지고, for가 끝나면 사라져서 밖에서 출력할 수 없다. 합을 모으는 변수는 반복문 밖에 둔다.
- 값이 변하는 과정은 `sum=0, i=1` → `sum=1`, `sum=1, i=2` → `sum=3`, ... `sum=4950, i=100` → `sum=5050` 순서다.

**짝수 / 홀수에 따라 더하기 빼기**
```java
for (int i = 1; i <= 10; i++)
{
    if (i % 2 == 0) sum -= i;   // 짝수는 뺀다
    else            sum += i;   // 홀수는 더한다
}
// 1-2+3-4+5-6+7-8+9-10 = -5
```

**기타**
- 입력받은 정수까지의 합: 조건식을 `i <= num`으로 두면 입력값이 반복 횟수가 된다.
- 구구단: 단은 입력받고 곱하는 수만 1~9로 반복한다.
- B, D, F ... N 출력: `c += 2`로 건너뛰고, 쉼표는 첫 글자 뒤부터 앞에 붙이도록 `if (c > 'B' && c <= 'N')`으로 처리했다.
- 로또 6개: `(int)(Math.random() * 45) + 1`을 6번 반복한다. 중복 검사를 하지 않아서 같은 번호가 나올 수 있다. `Thread.sleep(1000)`은 예외 처리가 필요해서 main에 `throws Exception`을 붙였다.

</details>

<details>
<summary><b>무한루프와 break / continue (UP - DOWN 게임)</b></summary>

<br>

```java
// 반복문_4.java (일부)
int com = (int)(Math.random() * 100) + 1;
for (;;)                                  // 무한루프
{
    int user = scan.nextInt();
    if (user < 1 || user > 100)
    {
        System.out.println("잘못된 입력입니다!!");
        continue;                         // 아래 비교를 건너뛰고 다음 회차로
    }
    if (com > user)      { /* 더 큰 수를 입력하라는 힌트 */ }
    else if (com < user) { /* 더 작은 수를 입력하라는 힌트 */ }
    else
    {
        System.err.println("정답입니다");
        break;                            // 반복 종료
    }
}
System.out.println("프로그램 종료!!");
```

- 몇 번 만에 맞출지 알 수 없어서 횟수를 정할 수 없다. 이럴 때 `for (;;)`로 무한루프를 만들고 맞췄을 때 `break`로 빠져나온다.
- `continue`는 반복문의 나머지 부분을 건너뛰고 다음 회차로 넘어간다. for에서는 증감식으로 이동한다.
- `break`는 반복문 자체를 끝낸다.
- 범위 검사에 4일차의 `||`가 쓰였다. 1~100 밖이면 오류이므로 "범위를 벗어나는 경우"에 해당한다.
- 이 코드는 for지만 횟수를 모르는 경우라서 while로 짜도 되는 구조다. 이 부분은 아래 while과 비교해서 정리했다.

</details>

<details>
<summary><b>while문</b></summary>

<br>

```java
int i = 1;               // 초기값
while (i <= 10)          // 조건식
{
    System.out.print(i + " ");
    i++;                 // 증감식
}
// 반복이 끝난 뒤 i = 11
```

- 초기값과 증감식을 직접 써야 한다. 증감식을 빼먹으면 조건이 계속 true라서 무한루프가 된다.
- 같은 1~10 출력을 while과 for로 나란히 짜서 비교했다.

| 구분 | for | while |
|---|---|---|
| 초기값 | 괄호 안에서 선언, for가 끝나면 사라짐 | 밖에서 선언, 반복이 끝난 뒤에도 값이 남음 (위에서 `i = 11`) |
| 어울리는 경우 | 횟수를 아는 경우 | 종료 시점을 모르는 경우 |

**while로 푼 문제**
| 내용 | 결과 |
|---|---|
| 1~100 사이 3, 5, 7의 배수 | 배수마다 while을 따로 돌려 출력 |
| 1~100 총합, 짝수합, 홀수합 | 5050 / 2550 / 2500 |
| `char c = 'Z'`부터 `c--` | Z ~ A |
| 10부터 1까지 카운트다운, `Thread.sleep(1000)` | 1초 간격 출력 후 발사 메시지 |
| 매일 1000원씩 7일 저금 | 7000원 |

- while_2는 if 세 개를 한 while 안에 넣은 코드(주석 처리)도 있다. 독립 if라서 15처럼 3과 5의 공배수는 두 번 출력된다. 배수별로 구분해서 보려고 while을 세 번 나눴다.
- while_3은 총합을 `sum`에 먼저 누적하고, 짝수 / 홀수는 if ~ else로 나눠서 따로 누적한다. 합 변수가 3개이고 루프 변수 `i`는 하나다.

</details>

<details>
<summary><b>while문 실무 코드 맛보기 (파일 읽기, DB 조회)</b></summary>

<br>

**파일 읽기**
```java
FileReader fr = new FileReader("파일 경로");
int i = 0;
while ((i = fr.read()) != -1)     // -1이면 파일의 끝(EOF)
{
    System.out.print((char) i);
}
```
- `read()`는 글자를 정수로 읽어서 돌려주고, 더 읽을 게 없으면 -1을 돌려준다. 몇 글자인지 모르니 while을 쓴다.
- `(i = fr.read()) != -1`은 읽어서 i에 대입하고 곧바로 비교하는 구조다. 대입 연산자의 우선순위가 낮아서 괄호가 필요하다.
- 경로에 내 PC의 폴더 이름이 그대로 들어 있어서, 폴더 이름이 바뀌면 파일을 찾지 못한다.

**DB 조회**
```java
ResultSet rs = ps.executeQuery();
while (rs.next())                 // 다음 행이 있으면 true
{
    System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
}
```
- 조회된 행이 몇 개인지 모르기 때문에 `rs.next()`가 false가 될 때까지 while로 한 행씩 읽는다.
- DB 접속 정보(url, user, pwd)는 코드에 쓰지 않고 `db.properties` 파일에서 `Properties`로 읽는다. 이 파일은 저장소에 올리지 않았다.
- JDBC는 아직 배우지 않았다. 반복문이 실무에서 어떻게 쓰이는지 보는 용도로 따라 쳤고, 오라클이 연결되어 있어야 실행된다.

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| 대문자 / 소문자 정방향, 역방향 출력, 1~10, 홀수. 파일 위쪽 주석에 1~5일차 내용을 한 번에 정리 |
| 1~100 합. 누적 변수 위치와 값 변화 주석으로 확인 |
| 입력받은 단의 구구단 |
| UP - DOWN 게임. 무한루프, continue, break |
| A~Z를 for 두 가지 방식으로 출력 |
| 로또 번호 6개, 1초 간격 출력 |
| 2+4+...+100, 5의 배수, B~N 두 칸씩. 앞의 두 개는 주석 처리 |
| 1-2+3-...-10 = -5 |
| 입력받은 정수까지의 합 |
| for 정리 주석만 있고 실행 코드는 없음 |
| while 기본, 배수, 합계, 역순 문자, 카운트다운, 저금 |
| 파일 읽기, DB 조회 (따라 쳐 본 코드) |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- `while (true)`와 `for (;;)`는 같은 무한루프인데, 어느 쪽이 더 많이 쓰이는가?

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

횟수를 알면 for, 모르면 while을 쓴다. 합계처럼 값을 모으는 변수는 반복문 밖에 선언하고, 중간에 빠져나올 때는 break, 이번 회차만 넘길 때는 continue를 쓴다. 파일 읽기와 DB 조회처럼 끝이 정해지지 않은 작업은 while로 처리한다.

</details>

---

## 7일차 | 2026.10.20 (화) | 반복 제어문, Chapter 05. 참조타입 (문자열)


<details>
<summary><b>반복 제어문 - break와 continue</b></summary>

<br>

| 구분 | 동작 |
|---|---|
| break | 반복문을 중단한다. switch에서도 쓴다 |
| continue | 이번 회차의 나머지를 건너뛰고 다음 회차로 넘어간다 |

```java
// 반복제어문_1.java
for (int i = 1; i <= 10; i++)
{
    if (i == 5) break;       // 1 2 3 4 출력 후 종료
    System.out.println(i);
}

for (int i = 1; i <= 10; i++)
{
    if (i == 5) continue;    // 5만 빼고 1 ~ 10 출력
    System.out.println(i);
}
```

- break와 continue 바로 아래에는 코드를 쓸 수 없다. 실행될 일이 없는 문장이라 오류가 난다.
- 자기가 속한 반복문 하나만 제어한다. for 안의 for에서 안쪽 break는 안쪽 반복문만 끝낸다.
- continue가 이동하는 위치가 반복문마다 다르다. for는 증감식으로, while과 do ~ while은 조건식으로 이동한다.

**continue를 쓸 때 증감식 위치**
```java
int i = 1;
do
{
    System.out.println(i);
    if (i == 5) continue;    // i++를 건너뛴다
    System.out.println(i);
    i++;
} while (i <= 10);
```
- 문제: `i`가 5가 되면 계속 5만 출력되고 끝나지 않는다.
- 원인: continue가 `i++`를 건너뛰고 바로 조건식으로 가는데, `i`가 5 그대로라서 `i <= 10`이 계속 true다. for는 continue를 만나도 증감식이 실행되지만 while류는 증감식이 본문 안에 있어서 건너뛰어진다.
- 해결: while / do ~ while에서 continue를 쓸 때는 `i++`를 continue보다 앞에 두거나, 건너뛰기 전에 증감을 처리해야 한다.
- do ~ while은 `do { } while (조건식);` 형태로, 조건과 상관없이 한 번은 먼저 실행한다.

</details>

<details>
<summary><b>입력값 검사 - while(true) + continue + break 패턴</b></summary>

<br>

```java
// 반복제어문_2.java (국어 부분)
while (true)
{
    System.out.print("국어입력:");
    kor = scan.nextInt();
    if (kor < 0 || kor > 100)
    {
        System.out.println("잘못된 입력입니다!");
        continue;      // 처음부터 다시 입력
    }
    break;             // 정상 입력이면 while 종료
}
```

- 범위를 벗어나면 continue로 다시 입력받고, 정상이면 break로 빠져나온다. 입력 횟수를 알 수 없어서 무한루프로 만든다.
- 범위 밖 조건에 4일차의 `||`를 썼다. 0 미만이거나 100 초과인 경우다.
- 국어, 영어, 수학에 같은 while을 세 번 썼다. 중복이 많아서 메소드를 배우면 하나로 줄일 수 있다.
- 입력 뒤에는 총점, 평균(`%.2f`), 학점을 출력한다. 학점은 `switch (avg / 10)`에서 `case 10, 9 -> 'A'`, 8은 B, 7은 C, 6은 D, 5는 F로 나눈다.

**UP - DOWN 게임 다시 작성**
- 6일차 `반복문_4`와 같은 게임이다. `for (;;)` 무한루프, 범위 밖이면 continue, 맞히면 break 구조도 같다.
- 주석에 `while (true)`와 `do`로도 만들 수 있다고 적어 두었다. 무한루프는 세 반복문 모두로 만들 수 있다.

</details>

<details>
<summary><b>참조형과 자바 메모리 구조 (String 저장 방식)</b></summary>

<br>

**데이터형 복습**
```
데이터형 ─┬─ 기본형 (byte, int, long, double, boolean, char)
          └─ 참조형 (메모리 주소를 저장) ─┬─ 배열
                                          └─ 클래스 ─┬─ 라이브러리 (String 등)
                                                     └─ 사용자 정의 클래스
```
- 문자는 char 대신 String을 주로 쓴다.
- 참조형은 여러 개의 데이터를 한 메모리에 저장해서 사용한다.

**자바 메모리 구조**
| 영역 | 저장 내용 | 관리 |
|---|---|---|
| Method Area | 메소드, static | |
| Stack | 지역변수 | 자동으로 관리 |
| Heap | 참조형 변수가 가리키는 실제 데이터 | new로 생성, 해제는 가비지 컬렉션(GC)이 처리 |

**String 저장 방법 두 가지**
```java
String s  = "Java";
String s1 = "Java";                 // 같은 문자열은 같은 메모리를 가리킨다 → s == s1 은 true
String s2 = new String("Java");     // 새 메모리를 만들어서 저장 → s == s2 는 false
```
- `new`로 만드는 방식은 쓰지 않는다. 일반 변수처럼 `""`로 쓰는 게 표준이다.
- String은 `char[]`을 다루는 클래스이고, 한 번 만든 문자열은 변경할 수 없다(final). 메소드가 제공하는 기능만 쓴다.
- 문자열은 `""`, 문자 하나는 `''`다.
- 4일차에 정리한 "문자열 비교는 `==`가 아니라 `equals()`"가 이 구조 때문이다. `==`는 주소를 비교하고 `equals()`는 값을 비교한다.

</details>

<details>
<summary><b>문자열 검색 - startsWith, contains, endsWith (Jsoup 응용)</b></summary>

<br>

| 메소드 | 의미 |
|---|---|
| `startsWith(검색어)` | 앞부분이 같은 경우 |
| `endsWith(검색어)` | 뒷부분이 같은 경우 |
| `contains(검색어)` | 어디든 포함된 경우 |

```java
// 문자열_2.java (일부)
String fd = JOptionPane.showInputDialog("검색어 입력: ");
for (int i = 1; i <= 4; i++)                       // 지니 차트 1 ~ 4페이지
{
    Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?...&pg=" + i).get();
    Elements title  = doc.select("table.list-wrap a.title");
    Elements singer = doc.select("table.list-wrap a.artist");
    for (int j = 0; j < title.size(); j++)
    {
        if (title.get(j).text().contains(fd))      // 제목에 검색어가 포함되면
            System.out.println(title.get(j).text() + "(" + singer.get(j).text() + ")");
    }
}
```

- 4일차에 맛보기로 했던 Jsoup 크롤링을 이번에는 `JOptionPane`으로 검색어를 입력받고 4페이지를 돌려 검색하는 형태로 만들었다.
- 제목 목록과 가수 목록의 순서가 같아서 같은 인덱스 `j`로 짝을 맞춘다.
- 호출 방향이 중요하다. 제목 안에 검색어가 있는지 보려면 `title.contains(fd)`이고, `fd.contains(제목)`은 의미가 반대라서 틀린다.
- 파일에는 `startsWith`, `contains`가 주석으로 있고 `endsWith`가 켜져 있다. 위 코드는 `contains` 기준으로 정리했고, 세 메소드는 주석을 바꿔서 결과를 비교할 수 있다.
- `java.lang` 패키지는 import를 생략해도 컴파일할 때 자동으로 붙는다. Jsoup, `javax.swing`은 직접 import해야 한다.

</details>

<details>
<summary><b>문자열 변환 - replace, replaceAll, 대소문자</b></summary>

<br>

| 메소드 | 설명 |
|---|---|
| `toUpperCase()` / `toLowerCase()` | 대문자 / 소문자 변환 |
| `replace(a, b)` | 일반 문자 / 문자열 변경 |
| `replaceAll(정규식, b)` | 정규식으로 변경 |

- 정규식 예: `[가-힣]` 한글 전체, `[A-Za-z]` 알파벳 전체, `[0-9]` 숫자 전체, `[^가-힣]` 한글이 아닌 것 전체

```java
String msg = "Hello Java!!";
System.out.println(msg = msg.replace('a', 'b'));        // Hello Jbvb!!
System.out.println(msg = msg.replace("Java", "Oracle")); // Hello Jbvb!!  (바뀌지 않음)

final String s = "ABCD가나다라12345";
s.replaceAll("[가-힣]", "0");     // ABCD000012345
s.replaceAll("[A-Z]", " ");       // "    가나다라12345"
s.replaceAll("[0-9]", " ");       // "ABCD가나다라     "
s.replaceAll("[^가-힣]", " ");    // "    가나다라     "
```

- `replace`는 원본을 바꾸지 않고 바뀐 새 문자열을 돌려준다. 그래서 `msg = msg.replace(...)`처럼 다시 대입해야 변수에 반영된다.
- 두 번째 줄이 바뀌지 않은 이유: 앞에서 `a`를 `b`로 바꿔서 `Java`가 이미 `Jbvb`가 되어 찾을 문자열이 없다. 실행 순서가 결과에 영향을 준다.
- 입력은 `nextLine()`이 공백을 포함한 한 줄 전체이고, `next()`는 공백 앞까지다. (문자열_3.java 주석 처리된 코드)

</details>

<details>
<summary><b>문자열 자르기 - substring, indexOf, lastIndexOf</b></summary>

<br>

| 메소드 | 설명 |
|---|---|
| `substring(start)` | start 인덱스부터 끝까지 |
| `substring(start, end)` | start부터 end - 1까지 |
| `indexOf(문자)` | 앞에서부터 찾은 위치 |
| `lastIndexOf(문자)` | 뒤에서부터 찾은 위치 |

```java
String msg = "Hello Java!!";          // 인덱스는 0부터
msg.substring(6);                     // Java!!
msg.substring(0, 5);                  // Hello  (end - 1까지)

String s = "자바.java";
s.substring(s.indexOf(".") + 1);      // java  (확장자)

String path = "C:\\Users\\...\\src\\MainClass.java";
path.substring(path.lastIndexOf("\\") + 1);   // MainClass.java  (파일명)
```

- 점이나 역슬래시 위치를 `indexOf`로 찾고, 거기서 1을 더한 인덱스부터 자르면 그 문자 뒤쪽만 남는다.
- 파일명처럼 앞에 같은 문자가 여러 번 나오는 경우는 `lastIndexOf`로 마지막 위치를 찾는다. `\`는 4일차에 배운 이스케이프다.
- 찾는 문자가 없으면 `indexOf`, `lastIndexOf`는 -1을 돌려준다.

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| break, continue 동작 확인. do ~ while에서 continue 위치에 따른 무한루프 |
| 세 과목 점수 입력값 검사(0 ~ 100), 총점, 평균, 학점 |
| UP - DOWN 게임을 `for (;;)`로 다시 작성 |
| 참조형, 메모리 구조, String 저장 방식 정리 (주석만 있고 실행 코드는 없음) |
| Jsoup으로 지니 차트 4페이지에서 검색어가 들어간 곡 찾기 |
| `replace`, `replaceAll`로 문자, 한글, 숫자 바꾸기 |
| `substring`, `indexOf`, `lastIndexOf`로 확장자와 파일명 추출 |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- 반복제어문_2의 학점 switch에는 default가 없다. 평균이 50 미만이면 어느 case에도 걸리지 않아서 처음에 넣어 둔 `'A'`가 그대로 학점으로 출력된다. default를 추가해야 한다.
- 반복제어문_3은 `(int)(Math.random() * 100)`이라 정답이 0 ~ 99다. 그런데 입력은 1 ~ 100만 받아서 정답이 0이면 맞힐 수 없다. 6일차처럼 `+ 1`을 붙여야 한다.
- `s == s1`, `s == s2`, `equals()`의 결과는 문자열_1.java에서 코드로 직접 출력해 보지 않았다. 직접 실행해서 확인할 것.

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

while류에서 continue를 쓰면 증감식이 건너뛰어질 수 있어서 증감 위치를 먼저 봐야 한다. 문자열은 한 번 만들면 바뀌지 않아서 replace, substring 같은 메소드는 새 문자열을 돌려주고, 그 값을 변수에 다시 받아야 쓸 수 있다. 문자열 비교는 주소가 아니라 값을 봐야 해서 equals()를 쓴다.

</details>

---

## 8일차 | 2026.10.21 (수) | Chapter 05. 참조타입 (문자열 메소드 정리, 배열)


<details>
<summary><b>메소드 읽는 법과 오버로딩</b></summary>

<br>

```
리턴형 메소드명(매개변수...)
{
    기능 수행
    return 값;          // 리턴형과 같은 데이터형
}

int add(int a, int b)   // 원형
{
    return a + b;
}
int c = add(10, 20);    // 호출할 때는 리턴형을 쓰지 않는다
```

- 메소드는 특정 기능을 수행하는 명령문의 집합이다. 라이브러리 클래스에 들어 있는 메소드는 원형만 보고 쓴다.
- 처음 보는 메소드는 순서대로 확인한다: 어느 클래스인지, 어떤 기능인지, 매개변수가 무엇인지, 리턴형이 무엇인지, 어떻게 호출하는지.
- 결과값이 없으면 리턴형이 `void`다.
- 같은 이름의 메소드가 매개변수만 다르게 여러 개 있는 것이 오버로딩이다. `String.valueOf(int)`, `valueOf(long)`, `valueOf(boolean)`, `valueOf(char[])`가 그 예다.
- `String.valueOf(a)`, `String.join(...)`처럼 객체를 만들지 않고 클래스 이름으로 부르는 메소드는 static(공유 메소드)이다.

</details>

<details>
<summary><b>문자열 메소드 - trim, valueOf, join, format</b></summary>

<br>

| 메소드 | 설명 | 원형 / 결과 |
|---|---|---|
| `trim()` | 좌우 공백 제거 | `String trim()` |
| `valueOf()` | 모든 데이터형을 문자열로 변환 | `10` → `"10"`, `10.5` → `"10.5"`, `true` → `"true"` |
| `split()` | 구분 문자로 잘라서 배열에 저장 | 설명만 들음 (코드 없음) |
| `join()` | 여러 문자열을 구분자로 묶어서 하나로 | 가변형 매개변수 |
| `format()` | 형식에 맞춰 문자열 생성 | `printf()`와 같은 서식 |

```java
// 문자열_5.java
String msg = " Hello Java ";
msg.length();                        // 12
msg = msg.trim();
msg.length();                        // 10

int a = 100, b = 200;
System.out.println(a + b);                    // 300
System.out.println(String.valueOf(a) + b);    // 100200  ("100" + 200)

String.join("/", "2026", "10", "21");         // 2026/10/21
String.format("%d %d %d %d %.2f", 90, 90, 80, 260, 260 / 3.0);   // 90 90 80 260 86.67
```

- `trim()`은 공백 문자 하나하나가 글자 수에 포함되어서 길이가 12에서 10으로 줄어드는 것으로 확인했다. 검색어, ID, 비밀번호처럼 사용자가 입력하는 값에 쓴다.
- `valueOf(a) + b`는 앞이 문자열이 되어서 4일차에 정리한 문자열 결합으로 처리된다.
- `format()`은 화면에 출력하지 않고 문자열로 돌려주는 점이 `printf()`와 다르다.
- 문자열_6.java는 `JFrame`에 `JTextField`를 붙이고 `tf.setText(String.valueOf(100))`로 숫자를 넣는다. `setText()`는 문자열만 받아서 int를 `valueOf()`로 바꿔야 한다. `extends JFrame`은 상속이라 아직 배우지 않았고, 따라 쳐서 동작만 확인했다.

</details>

<details>
<summary><b>문자열 메소드 전체 정리</b></summary>

<br>

| 분류 | 메소드 | 설명 |
|---|---|---|
| 비교 | `equals()` | 문자열 자체 비교, 대소문자 구분 |
| 길이 | `length()` | 문자 개수 |
| 찾기 | `indexOf()`, `lastIndexOf()` | 앞 / 뒤에서부터 위치 찾기, 없으면 -1 |
| 공백 | `trim()`, `strip()` | 좌우 공백 제거. `strip()`은 JDK 11부터, 유니코드 공백까지 더 넓게 지원 |
| 대소문자 | `toUpperCase()`, `toLowerCase()` | 대문자 / 소문자 변환 |
| 변경 | `replace()` | 문자 / 문자열 변경 |
| 결합 | `concat()` | 문자열 결합, `+`를 쓰기 때문에 거의 쓰지 않음 |
| 검사 | `startsWith()`, `endsWith()`, `contains()` | 앞 / 뒤가 같은지, 포함하는지 |
| 변환 | `valueOf()`, `format()` | 다른 데이터형을 문자열로 / 형식에 맞춰 변환 |
| 자르기 | `split()`, `substring()` | 구분 문자로 잘라 배열에 저장 / 인덱스로 자르기 |

```java
// 문자열_정리.java
String s = "Hello bJava";
int aa = s.indexOf("b");      // 6
if (aa == -1)
{
    System.out.println("찾는 문자열이 없습니다");
}
```
- `indexOf()`는 찾는 문자가 없을 때 -1이라서 이 값으로 존재 여부를 판단한다. 위 코드는 `b`가 인덱스 6에 있어서 아무것도 출력되지 않는다.
- 7일차에 배운 검색, 변환, 자르기 메소드가 이 표에 모두 들어 있다. 다음에 필요할 때 이 표에서 먼저 찾는다.

</details>

<details>
<summary><b>배열의 개념과 특징</b></summary>

<br>

- 같은 유형의 데이터를 여러 개 모아서 관리하는 참조형이다. 다른 유형을 모을 때는 클래스를 쓴다.
- 크기가 고정이다. 크기를 바꿔야 하면 더 큰 배열을 만들어서 복사해야 하고, 가변 크기가 필요하면 컬렉션(ArrayList 등)을 쓴다. 컬렉션은 다음 과정에서 배운다.

| 구분 | 내용 |
|---|---|
| 특징 | 연속된 메모리, 인덱스로 접근, 고정 크기, 같은 데이터형만 저장 |
| 장점 | 인덱스로 접근해서 빠르다 / 구조가 단순하다 / 크기가 고정이라 메모리 사용량을 예측하기 쉽다 |
| 단점 | 추가, 삭제가 어렵다 / 크게 만들면 안 쓰는 메모리가 낭비된다 / 같은 데이터형만 저장해서 유연하지 않다 |

**배열이 필요한 이유**
- 학생 3명의 국어, 영어, 수학, 총점, 평균, 학점을 변수로 만들면 `kor1, kor2, kor3`, `eng1, ...`처럼 18개를 일일이 선언하고, 입력과 계산도 학생마다 같은 코드를 세 번 써야 한다. 관련된 데이터끼리 배열로 묶으면 for 하나로 처리된다.

</details>

<details>
<summary><b>배열 선언, 초기화, 출력, 메모리 구조</b></summary>

<br>

**선언**
```java
int[] arr;        // 권장
int arr[];        // C언어 방식
```

**초기화 세 가지**
```java
int[] arr = {10, 20, 30, 40, 50};          // 선언과 동시에 값 지정 (파일, DB에서 읽은 값)
int[] arr = new int[5];                    // 개수만 지정, 기본값으로 채워짐 (가장 많이 사용)
int[] arr; arr = new int[]{10, 20, 30};    // 선언 후 나중에 초기화
```

**new로 만들었을 때 기본값**
| 데이터형 | 기본값 |
|---|---|
| int | 0 |
| long | 0L |
| double | 0.0 |
| char | `'\0'` |
| boolean | false |
| String (참조형) | null |

- `String` 배열의 기본값 null은 주소가 없다는 뜻이다. 이 상태에서 메소드를 호출하면 `NullPointerException`이 난다.

**출력 방법 두 가지**
```java
for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }   // 일반 for: 인덱스로 접근
for (int a : arr) { System.out.println(a); }                          // for-each: 값을 꺼냄
System.out.println(Arrays.toString(arr));                             // [10, 20, 30, ...]
```
- 일반 for는 인덱스를 이용해서 값을 읽고 쓴다. for-each는 값만 꺼내므로 출력용이다. 배열 값을 바꿀 때는 일반 for를 쓴다.
- for-each는 배열과 컬렉션에서만 쓸 수 있고, 웹에서 목록을 출력할 때 주로 쓴다.
- `Arrays.toString()`은 배열 내용을 한 번에 출력한다. 배열_2.java 주석에 적어 둔 `[I@31befd9f` 같은 값은 참조형 변수를 그대로 출력했을 때 나오는 형태다.

**메모리 구조**
```
int[] arr = {10, 20, 30};

Stack                 Heap (연속 배치, 간격 일정)
arr [ 0x100 ]  ───▶   [10]  [20]  [30]
                      arr[0] arr[1] arr[2]     arr.length = 3
```
- 변수 `arr`는 Stack에 있고, 실제 값은 Heap에 순서대로 연속해서 만들어진다.
- int는 4byte라서 칸마다 주소가 4씩 늘어난다. 그래서 `arr[i]`의 위치는 시작 주소 + (i × 4)로 바로 계산되고, 이것이 인덱스 접근이 빠른 이유다.
- `arr[0] = 100`은 메모리에 쓰기(저장), `arr[0]`을 읽는 것은 메모리 읽기다.

</details>

<details>
<summary><b>배열 활용 - 성적 처리, 최대 / 최소와 위치</b></summary>

<br>

**학생 3명 성적 처리**
```java
int[] kor = new int[3];       // int kor1, kor2, kor3 를 대체
int[] eng = new int[3];
int[] math = new int[3];
int[] total = new int[3];
double[] avg = new double[3];
char[] score = new char[3];

for (int i = 0; i < 3; i++)
{
    System.out.print((i + 1) + "번째 국어입력:");
    kor[i] = scan.nextInt();
    // eng[i], math[i]도 같은 방식으로 입력
    total[i] = kor[i] + eng[i] + math[i];
    avg[i] = total[i] / 3.0;
    switch (total[i] / 30)
    {
    case 10, 9 -> score[i] = 'A';
    case 8 -> score[i] = 'B';
    case 7 -> score[i] = 'C';
    case 6 -> score[i] = 'D';
    default -> score[i] = 'F';
    }
}
```
- 학생이 몇 명이든 인덱스 `i`와 반복 횟수만 바꾸면 된다. 변수를 번호로 구분하던 코드(파일에 주석으로 남겨 둠)가 배열 6개와 for 하나로 줄었다.
- 학점은 평균 / 10이 기준인데 평균이 총점 / 3이라서 `총점 / 30`으로 바로 나눈다.
- 7일차 `반복제어문_2`와 달리 `default -> 'F'`가 있어서 60점 미만도 학점이 나온다.
- 결과는 `printf("국어:%-5d영어:%-5d ...평균:%-7.2f학점:%5c\n", ...)`로 출력한다. `%-5d`의 `-`는 왼쪽 정렬이고, 숫자는 칸 폭이다.

**최대 / 최소와 위치**
```java
int[] arr = new int[10];
for (int i = 0; i < arr.length; i++)
    arr[i] = (int)(Math.random() * 100) + 1;     // 1 ~ 100

int max = arr[0];                                // 첫 값으로 시작
int min = arr[0];
for (int i : arr)
{
    if (i > max) max = i;
    if (i < min) min = i;
}

int index = 0;
for (int i = 0; i < arr.length; i++)
{
    if (max == arr[i]) { index = i; break; }     // 처음 찾으면 종료
}
System.out.println("max의 위치:" + (index + 1));
```
- 시작값을 `arr[0]`으로 두면 배열의 값 범위와 상관없이 비교할 수 있다. 6일차 `단일조건문_1`에서 `max = a`로 시작한 것과 같은 방식이다.
- 인덱스는 0부터라서 몇 번째인지 출력할 때는 `index + 1`로 출력한다.
- 위치 찾기에 7일차에 배운 `break`를 썼다. 같은 값이 여러 개 있어도 첫 번째 위치만 나온다.

</details>

<details>
<summary><b>배열 활용 - 중복 없는 로또, 랜덤 알파벳</b></summary>

<br>

**중복 없는 로또**
```java
int[] lotto = new int[6];
for (int i = 0; i < lotto.length; i++)
{
    lotto[i] = (int)(Math.random() * 45) + 1;
    for (int j = 0; j < i; j++)          // 앞에서 뽑은 번호와 비교
    {
        if (lotto[i] == lotto[j])
        {
            i--;                         // 같은 칸을 다시 뽑는다
            break;
        }
    }
}
Arrays.sort(lotto);                      // 오름차순 정렬
for (int i : lotto) System.out.print(i + " ");
```
- 6일차 `반복문_6`은 중복이 나올 수 있었는데, 배열에 저장하고 앞 칸들과 비교해서 중복을 없앴다.
- 같은 값이 있으면 `i--`로 인덱스를 되돌려서 이번 칸에 다시 뽑는다. 이때 `break`는 안쪽 for(j)만 끝낸다. 7일차에 정리한 "자기 반복문만 제어한다"가 여기서 쓰였다.
- `Arrays.sort()`로 정렬한 뒤 출력한다.

**랜덤 알파벳 10개**
```java
char[] alpha = new char[10];
for (int i = 0; i < alpha.length; i++)
{
    alpha[i] = (char)((Math.random() * 26) + 65);    // 65 = 'A'
}
for (char c : alpha) System.out.print(c + " ");
```
- 알파벳이 26개라서 0 ~ 25에 65를 더하면 `'A'` ~ `'Z'`의 유니코드 값이 되고, `(char)`로 변환하면 문자가 된다. 3일차 형변환에서 배운 char와 숫자의 관계가 그대로 쓰인다.

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| `trim`, `valueOf`, `join`, `format` 실행, 메소드 읽는 법 정리 |
| `JTextField`에 `String.valueOf(100)` 넣기 |
| 문자열 메소드 전체 정리, `indexOf`의 -1 확인 |
| 배열 개념, 선언, 초기화, 메모리 구조 정리. 학생 3명 성적 처리를 변수 방식(주석)에서 배열 방식으로 변경 |
| 난수 10개에서 최대 / 최소와 위치, 일반 for / for-each / `Arrays.toString` 출력 |
| 중복 없는 로또 번호 6개, 정렬 |
| 랜덤 알파벳 10개 |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- `split()`은 문자열_5 주석에만 있고 코드로 실행해 보지 않았다. 직접 짜서 확인할 것.
- 배열_1의 점수 입력에는 7일차에 배운 범위 검사(0 ~ 100)를 붙이지 않았다. 음수나 100 초과 값도 그대로 계산된다.
- 배열_2의 최대 / 최소가 같은 값이 여러 개일 때 모든 위치를 찾으려면 어떻게 해야 하는가?
- 배열은 크기를 바꿀 수 없다. 주석에 나온 ArrayList 같은 컬렉션이 어떻게 크기를 늘리는지 다음 과정에서 확인할 것.

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

배열은 같은 형의 데이터를 인덱스로 묶어서 관리하고, 크기는 만들 때 정해진다. 일반 for는 값을 읽고 바꿀 수 있고 for-each는 읽기만 된다. 최대, 최소는 첫 값에서 시작해 하나씩 비교하고, 중복 제거는 앞 칸들과 비교하는 반복문을 하나 더 쓴다. 처음 보는 메소드는 리턴형, 이름, 매개변수를 먼저 읽는다.

</details>
