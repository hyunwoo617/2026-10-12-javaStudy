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

---

## 9일차 | 2026.10.22 (목) | Chapter 05. 참조타입 (일차원 배열 총정리)

<details>
<summary><b>배열의 개념과 사용처</b></summary>

<br>

- 배열은 **같은 자료형의 데이터를 여러 개 저장할 수 있는 자료구조**다.

**일반 변수로 저장 (비효율적)**
```java
int score1 = 85;
int score2 = 90;
int score3 = 75;
int score4 = 100;
int score5 = 80;
```
- 변수가 5개 필요하고 관리가 번거롭다.

**배열로 저장 (효율적)**
```java
int[] scores = {85, 90, 75, 100, 80};
```

| 인덱스 | 0 | 1 | 2 | 3 | 4 |
|:---:|:---:|:---:|:---:|:---:|:---:|
| 값 | 85 | 90 | 75 | 100 | 80 |

- `int[]` : 정수형 배열 타입
- `scores` : 배열을 참조하는 변수
- `{85, 90, 75, 100, 80}` : 배열에 저장되는 값
- 배열의 크기 : 5 / 인덱스 : 0부터 4까지

**배열 사용처**
| 분야 | 배열 사용 예시 |
|---|---|
| 학교 | 학생별 점수, 출석 번호 |
| 쇼핑몰 | 상품 가격, 장바구니 수량 |
| 게임 | 플레이어 체력, 캐릭터 능력치 |
| 데이터 분석 | 일별 매출, 월별 방문자 수 |
| 서버 개발 | 조회 결과 처리, 임시 데이터 목록 |
| 알고리즘 | 정렬, 검색, 최댓값 / 최솟값 찾기 |

- 실무에서는 **데이터 개수가 고정된 경우** 배열이 유용하다.
- 데이터 개수가 자주 바뀌는 목록은 `ArrayList`, 객체 간 관계는 클래스나 다른 컬렉션을 쓰는 경우가 많다.

</details>

<details>
<summary><b>배열의 메모리 할당</b></summary>

<br>

```java
int[] scores = new int[5];
```

```
Stack                  Heap
scores  ───────▶   [0] [0] [0] [0] [0]
(참조 변수)          0   1   2   3   4
                    배열 객체 (int[5])
```

- `scores`는 배열 객체를 **참조하는 변수**다.
- `new int[5]`는 정수 5개를 저장할 수 있는 **배열 객체를 생성**한다.
- 배열 원소는 **연속된 인덱스**로 접근한다.
- 배열의 길이는 **생성 후 변경할 수 없다.**
- 자바의 배열 객체는 일반적으로 **힙**에 생성된다.

</details>

<details>
<summary><b>선언, 생성, 초기화</b></summary>

<br>

배열을 사용하는 방법은 크게 세 가지다.

**1. 배열 선언** (아직 생성되지 않은 상태)
```java
int[] numbers;
String[] names;
double[] prices;
```

**2. 배열 생성** (기본값으로 초기화됨)
```java
int[] numbers = new int[5];
```

| 자료형 | 기본 초기값 |
|---|---|
| `int` | `0` |
| `double` | `0.0` |
| `boolean` | `false` |
| `char` | `'\u0000'` |
| 참조형 | `null` |

**3. 선언과 초기화**
```java
int[] numbers = {10, 20, 30, 40, 50};

String[] fruits = {"사과", "바나나", "포도"};
```
- 변수를 먼저 선언한 후 값을 지정할 때는 `new int[]{...}` 형태를 사용한다.

</details>

<details>
<summary><b>인덱스(Index)</b></summary>

<br>

- 인덱스는 **배열 안에서 데이터의 위치를 나타내는 번호**다.

```java
int[] numbers = {10, 20, 30, 40, 50};
```

| 인덱스 | 0 | 1 | 2 | 3 | 4 |
|:---:|:---:|:---:|:---:|:---:|:---:|
| 값 | 10 | 20 | 30 | 40 | 50 |

- 첫 번째 인덱스 : `0`
- 마지막 인덱스 : `배열.length - 1`
- 배열의 길이 : `배열.length`

```java
System.out.println(numbers[0]);       // 10
System.out.println(numbers[2]);       // 30
System.out.println(numbers[4]);       // 50
System.out.println(numbers.length);   // 5
```

- 잘못된 인덱스에 접근하면 `ArrayIndexOutOfBoundsException`이 발생한다.
```java
System.out.println(numbers[5]);   // 오류
```

</details>

<details>
<summary><b>배열 값 변경하기</b></summary>

<br>

- 배열의 **크기는 고정**이지만 각 **원소의 값은 변경**할 수 있다.

```java
int[] scores = {80, 90, 70};

scores[0] = 100;
scores[2] = 85;

System.out.println(scores[0]);   // 100
System.out.println(scores[1]);   // 90
System.out.println(scores[2]);   // 85
```

| 인덱스 | 0 | 1 | 2 |
|---|:---:|:---:|:---:|
| 변경 전 | 80 | 90 | 70 |
| 변경 후 | 100 | 90 | 85 |

</details>

<details>
<summary><b>for문으로 배열 사용하기</b></summary>

<br>

- 배열은 인덱스를 이용하기 때문에 **반복문과 함께 사용하면 편리**하다.

**기본 for문 (인덱스 사용)**
```java
int[] scores = {85, 90, 75, 100, 80};

for (int i = 0; i < scores.length; i++)
{
    System.out.println(scores[i]);
}
```

**향상된 for문 (인덱스 불필요)**
```java
for (int score : scores)
{
    System.out.println(score);
}
```

**반복문 코드의 의미**
| 코드 | 의미 |
|---|---|
| `int i = 0` | 첫 번째 인덱스부터 시작 |
| `i < scores.length` | 배열의 길이보다 작은 동안 반복 |
| `i++` | 인덱스를 1씩 증가 |
| `scores[i]` | 현재 인덱스의 값 가져오기 |

</details>

<details>
<summary><b>이중 for문과 배열</b></summary>

<br>

- 이중 for문은 **반복문 안에 반복문이 들어 있는 구조**다.

**예제 1. 별 삼각형 출력**
```java
for (int i = 1; i <= 5; i++)
{
    for (int j = 1; j <= i; j++)
    {
        System.out.print("*");
    }
    System.out.println();
}
```
```
*
**
***
****
*****
```

**예제 2. 모든 원소 쌍 비교**
```java
for (int i = 0; i < n; i++)
{
    for (int j = 0; j < n; j++)
    {
        System.out.println(numbers[i] + " - " + numbers[j]);
    }
}
```
- 원소가 3개면 3 x 3 = 9번 비교한다.

**예제 3. 중복 없이 비교**
```java
for (int i = 0; i < n; i++)
{
    for (int j = i + 1; j < n; j++)
    {
        System.out.println(numbers[i] + "," + numbers[j]);
    }
}
```
- 같은 원소, 중복된 쌍은 제외한다.

</details>

<details>
<summary><b>간단한 알고리즘 예제</b></summary>

<br>

일차원 배열을 활용한 대표적인 알고리즘 5가지

| 번호 | 알고리즘 | 핵심 코드 |
|:---:|---|---|
| 1 | 합계와 평균 구하기 | `sum += scores[i]`, `avg = (double) sum / n` |
| 2 | 최댓값과 최솟값 찾기 | `if (arr[i] > max) max = arr[i];` |
| 3 | 짝수 개수 세기 | `if (arr[i] % 2 == 0) count++;` |
| 4 | 특정 값의 위치 찾기 | `if (arr[i] == target) index = i;` |
| 5 | 정렬하기 (버블 정렬 예시) | `for (int i = 0; i < n - 1; i++) { ... }` |

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

- 배열은 같은 타입의 데이터를 여러 개 저장하는 자료구조다.
- 인덱스는 0부터 시작한다.
- 배열의 크기는 고정이지만 값은 변경할 수 있다.
- for문과 함께 사용하면 효율적이다.
- 실무에서는 상황에 따라 `ArrayList`, 클래스 등을 함께 사용한다.

</details>

---

## 10일차 | 2026.10.23 (금) | Chapter 05. 참조타입 (문자열 배열), 정렬, 열거형

<details>
<summary><b>문자열 배열과 split()</b></summary>

<br>

```java
String[] names = {"홍길동", "이순신", "심청이", "박문수", "강감찬"};
//                 names[0]  [1]    [2]    [3]    [4]

String msg = "홍길동,이순신,심청이,박문수,강감찬";
String[] s = msg.split(",");        // 구분 문자로 잘라서 배열에 저장
for (String n : s)
{
    System.out.println(n);
}
```

- 문자열 여러 개는 `String[]`에 모은다. 인덱스로 접근하고 for-each로 출력한다.
- `split()`은 구분 문자를 기준으로 문자열을 잘라서 배열로 돌려준다. 7일차에 `substring`과 `indexOf`로 하나씩 자르던 일을 한 번에 한다.
- `+`, `*`, `|`, `^`, `?`, `.`는 정규식에서 쓰는 기호라서 구분 문자로 쓸 때 앞에 `\\`를 붙여야 한다. 예: `split("\\|")`
- 배열은 크기가 고정이라 크기를 바꿀 수 있는 `ArrayList<String>`은 컬렉션에서 배운다.

</details>

<details>
<summary><b>문자열 배열 활용 - 과일명 검색</b></summary>

<br>

과일 50개를 `"Apple-사과"` 형태(영문명-한글명)로 배열에 넣고, `f.substring(0, f.indexOf("-"))`로 영문명만 꺼내서 사용했다.

**가장 긴 이름, 가장 짧은 이름**
```java
int max = 0;
for (String f : 과일명)
{
    int len = f.substring(0, f.indexOf("-")).length();
    if (max < len)
        max = len;                        // 가장 긴 길이를 먼저 구한다
}
for (String f : 과일명)
{
    String ss = f.substring(0, f.indexOf("-"));
    if (ss.length() == max)               // 그 길이와 같은 이름을 모두 출력
        System.out.println(ss);
}
```
- 결과는 가장 긴 이름이 `Honeydewmelon`(13자), 가장 짧은 이름이 `Fig`(3자)다. 짧은 이름은 `min = 100`에서 시작해 같은 방식으로 구한다.
- 길이를 먼저 구한 뒤 같은 길이를 모두 찾으면 이름이 여러 개여도 놓치지 않는다.

**검색 세 가지**
| 방식 | 사용한 메소드 | 입력 | 결과 |
|---|---|---|---|
| 포함 검색 | `contains()`, 입력값과 과일명을 둘 다 `toLowerCase()`로 바꿔서 대소문자 구분 없이 | BER | Strawberry, Raspberry, Blueberry, Blackberry ... |
| 자동 완성 | `startsWith()`, 하나 찾을 때마다 `Thread.sleep(1000)` | pa | Papaya, Passionfruit, Pawpaw |
| 끝 문자 | `endsWith()`, 하나 찾으면 `break` | 과 | Apple |

- 검색어는 `scan.next()`로 받는다. 공백 앞까지만 읽는다.
- 7일차에 Jsoup 데이터로 하던 문자열 검색을 이번에는 배열에 넣은 데이터로 했다.

</details>

<details>
<summary><b>파일 데이터를 배열로 저장 - 영화 검색</b></summary>

<br>

```java
FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
StringBuffer sb = new StringBuffer();
int i = 0;
while ((i = fr.read()) != -1)              // 6일차에 배운 파일 읽기
{
    sb.append((char) i);
}
fr.close();

String[] movies = sb.toString().split("\n");     // 영화 한 편 = 한 줄
String[] rank = new String[1938];
String[] title = new String[1938];
String[] genre = new String[1938];
String[] actor = new String[1938];
String[] grade = new String[1938];
String[] director = new String[1938];

i = 0;
for (String movie : movies)
{
    String[] total = movie.split("\\|");         // 한 줄을 항목별로 자른다
    rank[i] = total[0];
    title[i] = total[1];
    genre[i] = total[2];
    actor[i] = total[4];                         // 3번(포스터 주소)은 쓰지 않는다
    grade[i] = total[6];                         // 5번(개봉일)은 쓰지 않는다
    director[i] = total[7];
    i++;
}
```

- 파일의 한 줄은 `순위|제목|장르|포스터 주소|출연진|개봉일|관람 등급|감독` 순서다. 필요 없는 항목은 배열에 저장하지 않는다.
- 먼저 줄 단위로 `split("\n")`을 하고, 그 줄을 다시 `split("\\|")`로 자른다. `split`을 두 번 쓴다.
- 데이터를 저장하는 방식은 두 가지다.

| 저장 방식 | 배열 | 사용 방법 |
|---|---|---|
| 항목별로 나눠서 저장 | 여러 개 | 같은 인덱스로 묶어서 사용, 일반 for |
| 한 덩어리로 저장 | 1개 | 문자열 검색, for-each |

**출연진으로 영화 찾기**
```java
String ac = scan.next();
int count = 0;
for (int j = 0; j < actor.length; j++)
{
    if (actor[j].contains(ac))
    {
        System.out.println(title[j]);          // 같은 인덱스의 제목
        count++;
    }
}
System.out.println("총 출연작은 " + count + "편입니다");
```
- 출연진 배열에서 찾은 위치(`j`)로 제목 배열을 읽는다. 두 배열의 인덱스가 같은 영화를 가리키기 때문이다.
- 페이지 나누기 코드(주석 처리)도 만들어 봤다. 총 페이지는 `(int)Math.ceil(title.length / 10.0)`이고, 1938편이면 193.8을 올림해서 194페이지다. 시작 위치는 `page * 10 - 10`이라서 1페이지는 0 ~ 9, 2페이지는 10 ~ 19다.
- `movie.txt`는 저장소에 올리지 않고 내 PC(`c:\javaDev`)에 두고 실행했다.

</details>

<details>
<summary><b>정렬 - 선택 정렬</b></summary>

<br>

```java
// 오름차순: 기준 칸(i)과 뒤의 모든 칸(j)을 비교해서 기준보다 작은 값이 오면 서로 바꾼다
for (int i = 0; i < arr.length - 1; i++)
{
    for (int j = i + 1; j < arr.length; j++)
    {
        if (arr[i] > arr[j])
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
```

```
30 20 50 10 40
10 30 50 20 40     1라운드 (i=0) : 가장 작은 값이 0번 칸으로
10 20 50 30 40     2라운드 (i=1)
10 20 30 50 40     3라운드 (i=2)
10 20 30 40 50     4라운드 (i=3)
```

- 한 라운드가 끝나면 기준 칸에 그 자리에 올 값이 정해진다. 바깥 for는 `0 ~ 길이 - 2`, 안쪽 for는 `i + 1 ~ 길이 - 1`이다.
- 값을 바꿀 때는 4일차에 배운 임시 변수(`temp`)를 쓴다.
- 파일의 실행 코드는 난수 알파벳 5개(`char[]`)를 `arr[i] < arr[j]`로 비교해서 내림차순으로 정렬한다. 예: `[F, J, O, P, N]` → `[P, O, N, J, F]`. 문자도 유니코드 숫자로 비교된다. 비교 방향(`>` / `<`)만 바꾸면 오름차순과 내림차순이 바뀐다.
- 라운드 출력(`Round:`)이 안쪽 for 안에 있어서 비교할 때마다 한 줄씩 출력된다.

</details>

<details>
<summary><b>정렬 - 버블 정렬</b></summary>

<br>

```java
for (int i = 0; i < arr.length - 1; i++)
{
    for (int j = 0; j < arr.length - 1 - i; j++)
    {
        if (arr[j] > arr[j + 1])               // 이웃한 두 값을 비교
        {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}
```

```
30 20 50 10 40
20 30 10 40 50     1바퀴 : 가장 큰 값 50이 맨 뒤로
20 10 30 40 50     2바퀴 : 40이 뒤에서 두 번째로
10 20 30 40 50     3바퀴
```

| 구분 | 선택 정렬 | 버블 정렬 |
|---|---|---|
| 비교 대상 | 기준 칸과 뒤의 모든 칸 | 이웃한 두 칸 |
| 한 라운드 결과 | 기준 칸의 값이 정해진다 | 가장 큰 값이 맨 뒤에 정해진다 |
| 안쪽 for 범위 | `j = i + 1` ~ 끝 | `j = 0` ~ `length - 1 - i` |

- 한 바퀴를 돌 때마다 맨 뒤 칸이 하나씩 고정되기 때문에 안쪽 for의 끝이 `length - 1 - i`로 줄어든다.
- 파일에는 직접 짠 코드를 주석으로 두고 실행 코드는 `Arrays.sort(arr)`로 정렬했다. 정렬 원리를 이해하려고 직접 짜 본 것이고, 웹 개발에서는 이중 for로 정렬하지 않고 라이브러리를 쓴다.

</details>

<details>
<summary><b>열거형 (enum)</b></summary>

<br>

```java
enum 전화국번
{
    서울("02"),
    경기도("031"),
    인천("032"),
    // ... 17개
    제주("064");

    String code;
    전화국번(String code)
    {
        this.code = code;
    }
    String getCode()
    {
        return code;
    }
}

for (전화국번 n : 전화국번.values())
{
    if (n.name().contains(loc))
        System.out.println(loc + "의 국번은 " + n.getCode());
}
```

- 열거형은 정해진 값 중 하나를 고를 때 쓰는 상수 모음이다. 요일, 주문 상태, 사용자 권한, 결제 상태, 서버 명령(`LOGIN`, `LOGOUT`, `MAKEROOM`, `ROOMIN`)이 예다.
- `values()`는 상수 전체를 배열로, `name()`은 상수 이름을 문자열로 돌려준다.
- 상수는 `==`로 비교한다. `Day today = Day.금요일;`을 출력하면 `금요일`이고, `today == Day.월요일`은 `false`다.
- 지역명에 "충청"을 입력하면 충청남도(041)와 충청북도(043)가 둘 다 나온다. 이름에 포함되는지로 찾기 때문이다.
- `System.out.println(032)`는 `32`가 아니라 `26`을 출력한다. 0으로 시작하는 정수는 8진수로 읽히기 때문이다(3일차 리터럴). 국번처럼 앞의 0이 필요한 값을 `int`로 저장하면 안 되고 문자열로 저장해야 하는 이유다.

</details>

<details>
<summary><b>1 ~ 4장 정리와 변수 선언 위치</b></summary>

<br>

| 단계 | 내용 |
|---|---|
| 변수 | 프로그램에 필요한 데이터 저장 |
| 연산자, 제어문 | 요청에 따라 데이터 처리 |
| 배열, 클래스 | 필요한 데이터를 묶어서 사용 |
| 메소드 | 관련된 명령어를 묶어서 사용 |
| 예외처리 | 비정상 종료와 에러를 미리 방지 |
| 라이브러리 | 컬렉션, 데이터베이스 연동 등 웹과 관련된 기능 |

- 이후 흐름: 데이터를 영구 저장하는 오라클, 화면을 만드는 HTML / CSS(정적)와 JavaScript(동적), 자바와 오라클을 연결하는 JSP, 형식을 통일하는 Spring과 MyBatis / JPA, 프런트의 JQuery → Vue → React, 배포의 DevOps(CI/CD, AWS).
- 지역변수는 메소드 안에 선언하고 Stack에 저장되어 자동으로 해제된다. 해제 시점은 선언한 `{}`가 끝날 때다.

**4 x 4 문자 출력 연습**
```java
for (int i = 1; i <= 4; i++)
{
    for (int j = 1; j <= 4; j++)
    {
        char c = 'A';                // 안쪽 for 안에 선언
        System.out.print(c++);
    }
    System.out.println();
}
```
- 목표는 `ABCD`를 네 줄 출력하거나, `ABCD / EFGH / IJKL / MNOP`를 출력하는 것이다.
- 문제: 현재 코드는 `AAAA`가 네 줄 나온다.
- 원인: `c`가 안쪽 `{}` 안에 선언되어서 반복할 때마다 새로 만들어지고 `'A'`로 초기화된다. `c++`로 올려도 그 회차가 끝나면 사라진다.
- 해결: 선언 위치를 옮긴다. 줄마다 `ABCD`가 나오게 하려면 `char c = 'A';`를 안쪽 for 앞(바깥 for 안)에 두고, `EFGH`로 이어지게 하려면 바깥 for 앞에 둔다. 두 경우 모두 실행해서 확인했다.

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| 문자열 배열 출력, `split(",")`로 잘라서 배열 만들기 |
| 과일명 50개에서 가장 긴 / 짧은 이름 찾기, `contains` / `startsWith` / `endsWith` 검색 |
| 파일에서 영화 데이터를 읽어 항목별 배열 6개에 저장, 출연진으로 영화 검색 |
| 난수 알파벳 5개를 선택 정렬(내림차순) |
| 버블 정렬 원리 정리, `Arrays.sort()`로 정렬 |
| 전화 국번 열거형, 지역명으로 국번 검색 |
| 요일 열거형 상수 출력과 비교 |
| 1 ~ 4장 정리, 4 x 4 문자 출력 연습 |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- 과일명 배열에 `Raspberry`와 `Persimmon`이 두 번씩 들어 있어서 검색하면 같은 이름이 두 번 나온다. 데이터를 한 번만 넣어야 한다.
- 영화 검색의 입력을 `next()`로 받아서 공백 앞까지만 읽는다. "팀 로빈스"를 입력하면 "팀"으로만 검색된다. 공백까지 받으려면 `nextLine()`을 써야 한다.
- 주석 처리한 영화명 검색은 첫 번째로 맞지 않는 영화를 만나면 "일치하는 영화가 없습니다"를 출력하고 `break`한다. 전부 비교한 뒤에 하나도 없을 때만 출력하도록 고쳐야 한다.
- 4 x 4 문자 출력은 위에 정리한 대로 `c`의 선언 위치를 옮겨서 두 가지 출력을 모두 코드로 남겨 둘 것.

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

- 문자열 여러 개는 `String[]`에 모으고, `split()`으로 한 번에 배열로 만든다.
- 파일에서 읽은 한 줄을 구분 문자로 잘라 항목별 배열에 저장하면 검색과 페이지 나누기에 쓸 수 있다.
- 선택 정렬은 기준 칸과 뒤의 칸들을, 버블 정렬은 이웃한 칸끼리 비교한다. 실제로는 `Arrays.sort()`를 쓴다.
- 정해진 값 중 하나를 고르는 상수는 enum으로 묶는다.
- 지역변수는 선언한 `{}` 안에서만 살아 있다.

</details>

---

## 11일차 | 2026.10.26 (월) | Chapter 05. 메소드

<details>
<summary><b>메소드의 개념과 구조</b></summary>

<br>

- 메소드는 한 가지 기능을 수행하는 명령문을 묶은 것이다. 클래스 안에 만들고, 메소드 안에 메소드를 만들 수는 없다.
- 장점: 반복되는 코드를 없애 재사용할 수 있고, 가독성과 유지보수가 좋아지고, 에러를 처리하기 쉽다.
- 기능을 나눌 때는 "어디까지가 한 가지 기능인지"를 먼저 정한다. main에서는 변수, 연산자, 제어문을 쓰지 않고 메소드를 호출해서 조립한다.

```java
리턴형 메소드명(매개변수...)       // 선언부
{
    요청 처리                      // 구현부
    return 값;                    // 리턴형과 같은 데이터형
}

int add(int a, int b)
{
    return a + b;
}
int c = add(10, 20);             // 호출
```

| 구분 | 설명 |
|---|---|
| 리턴형 | 사용자 요청을 처리한 결과값, 1개만 보낼 수 있다. 여러 개면 배열, 컬렉션, 클래스를 쓴다 |
| 매개변수 | 사용자가 보내는 요청값, 여러 개 가능 |
| 메소드명 | 변수 이름과 같은 규칙, 소문자로 시작 |
| void | 결과값이 없는 메소드. `return;`은 생략할 수 있고 컴파일할 때 자동으로 붙는다 |

**리턴형과 매개변수 유무에 따른 네 가지 유형**
| 리턴형 | 매개변수 | 예 |
|:-:|:-:|---|
| O | O | `String substring(int start)` |
| O | X | `double random()` |
| X | O | `void println(String s)` |
| X | X | `void println()` |

- 리턴형은 돌려줄 값과 같거나 더 큰 데이터형이어야 한다. `static long disp() { return 10; }`은 int 값을 long으로 자동 형변환해서 돌려준다.
- 메소드는 만들고(제작) 부르는(호출) 두 단계로 쓴다. 호출할 때마다 메소드의 처음부터 다시 시작한다.
- `static`이 붙은 메소드는 `클래스명.메소드()`로 호출한다. 붙지 않은 메소드(인스턴스 메소드)는 `new`로 객체를 만든 뒤 `객체명.메소드()`로 호출한다.

</details>

<details>
<summary><b>매개변수가 있고 리턴이 없는 메소드 - 구구단</b></summary>

<br>

```java
static void gugudan(int dan)
{
    for (int i = 1; i <= 9; i++)
    {
        System.out.println(dan + "*" + i + "=" + i * dan);
    }
}
static void process()
{
    Scanner scan = new Scanner(System.in);
    System.out.println("2~9까지 사이의 단 입력:");
    int dan = scan.nextInt();
    gugudan(dan);
}
public static void main(String[] args)
{
    process();
}
```

- 출력은 `gugudan()`이, 입력과 호출은 `process()`가 맡는다. main은 `process()`만 부른다. 이렇게 입력, 처리, 출력을 나누고 `process()`에서 조립하는 구조를 11일차 내내 썼다.
- 다른 클래스에서도 `메소드_1.process();`처럼 `클래스명.메소드()`로 호출해서 재사용할 수 있다.

</details>

<details>
<summary><b>리턴형이 있는 메소드 - 사칙연산, 로그인</b></summary>

<br>

**사칙연산**
```java
static int plus(int a, int b)  { return a + b; }
static int minus(int a, int b) { return a - b; }
static int gop(int a, int b)   { return a * b; }
static String div(int a, int b)
{
    if (b == 0)
        return "0으로 나눌 수 없다";
    else
        return String.valueOf(a / (double) b);
}
```
- 입력한 연산자는 `switch (scan.next())`로 나눠서 각 메소드를 호출한다. `10`, `4` 입력 시 `+` 14, `-` 6, `*` 40, `/` 2.5이고, 나누는 수가 0이면 "0으로 나눌 수 없다"가 나온다.
- `div()`만 `String`을 돌려준다. 결과가 숫자일 수도 있고 메시지일 수도 있어서, 숫자를 `String.valueOf()`로 문자열로 바꿔서 한 가지 리턴형으로 맞췄다.

**로그인**
```java
static boolean isLogin(String id, String pwd)
{
    final String MID = "Hong";
    final String PWD = "1234";
    boolean bCheck = false;
    if (id.equals(MID) && pwd.equals(PWD))
        bCheck = true;
    return bCheck;
}

static void process()
{
    // ID, PWD 입력
    boolean bCheck = isLogin(id, pwd);
    if (bCheck == true)
        System.out.println("(로그인 완료) Main Page로 이동!!");
    else
    {
        System.out.println("아이디나 비밀번호가 틀립니다!! 다시 입력 하세요");
        process();        // 자기 자신을 다시 호출 (재귀호출)
    }
}
```
- 맞는지 틀린지만 필요해서 리턴형을 `boolean`으로 했다. 문자열 비교는 4일차에 배운 대로 `equals()`를 쓰고, 두 조건은 `&&`로 묶는다.
- 메소드는 자기 자신을 안에서 다시 호출할 수 있다. 틀렸을 때 `process()`를 다시 불러 처음부터 입력받는다.

</details>

<details>
<summary><b>메소드 호출 순서와 지역변수</b></summary>

<br>

```java
static void display()
{
    System.out.println("display() 진입...4");
    System.out.println("사용자 요청 처리...5");
    System.out.println("사용자 요청에 대한 결과값을 넘겨준다...6");
}
static void process()
{
    System.out.println("display() 진입...2");
    System.out.println("사용자 요청 처리...3");
    display();
    System.out.println("사용자 요청에 대한 결과값을 넘겨준다...7");
}
public static void main(String[] args)
{
    System.out.println("main 시작 ...1");
    process();
    System.out.println("main 종료 ...8");
}
```

| 순서 | 위치 |
|:-:|---|
| 1 | main 시작 |
| 2, 3 | process() 실행 |
| 4, 5, 6 | process()에서 호출한 display() 실행 |
| 7 | display()가 끝나고 process()로 돌아와 나머지 실행 |
| 8 | process()가 끝나고 main으로 돌아와 종료 |

- 메소드는 `{}`가 끝나면 호출한 위치로 돌아온다. 프로그램은 main에서 시작하고 main이 끝나면 종료된다.
- 지역변수는 메소드를 호출할 때마다 새로 만들어진다. `int a = 10; print(a); a++;`을 하는 메소드를 세 번 호출하면 매번 10이 출력되고, 증가시킨 값은 다음 호출에 남지 않는다.

</details>

<details>
<summary><b>메소드 연습 - 오버로딩, 배열 주고받기</b></summary>

<br>

```java
static void print()          { /* 1 ~ 10 출력 */ }
static void alpha()          { /* A ~ Z 출력 */ }
static int sum()             { /* 1 ~ 10 합 */ }
static int sum(int n)        { /* 1 ~ n 합 */ }
static char change(char c)   { return (char)(c + 32); }
static void reverse(String msg)
{
    for (int i = msg.length() - 1; i >= 0; i--)
        System.out.print(msg.charAt(i));
}
```

- `sum()`과 `sum(int n)`처럼 이름이 같고 매개변수가 다르면 다른 메소드로 인식한다. 이것이 오버로딩이다. `sum()`은 55, `sum(100)`은 5050이다.
- `change('A')`는 `'a'`를 돌려준다. 대문자와 소문자의 유니코드 차이가 32이기 때문이다(3일차 형변환).
- `reverse("Hello Java")`는 `avaJ olleH`를 출력한다.

```java
static int max(int[] arr) { ... }              // 값 여러 개를 보내고 최댓값 하나를 받는다
static int[] sort(int[] arr)
{
    Arrays.sort(arr);
    return arr;                                // 결과가 여러 개면 배열로 돌려준다
}
```
- 값을 여러 개 보낼 때는 배열을 매개변수로, 결과가 여러 개일 때는 배열을 리턴형으로 쓴다.
- 배열은 참조형이라 메소드에 주소가 전달된다. 그래서 `sort(arr)`를 호출하면 메소드 안에서 정렬한 결과가 호출한 쪽의 `arr`에도 그대로 반영된다. 9일차 `b = a`와 같은 원리다.

</details>

<details>
<summary><b>숫자 야구 게임 - 메소드로 나누기</b></summary>

<br>

9일차에 규칙만 정리하고 멈췄던 숫자 야구를 완성했다. 처음에는 main 하나에 모두 작성했고, 이어서 기능별 메소드로 나눴다.

| 단계 | 메소드 | 리턴형 | 하는 일 |
|---|---|---|---|
| 1. 난수 발생 | `rand()` | `int[]` | 1 ~ 9 중복 없는 숫자 3개 생성 |
| 2. 사용자 입력 | `userInput()` | `int[]` | 세 자리 정수를 입력받아 자리별로 배열에 저장 |
| 3. 비교 | `compare(com, user)` | `int[]` | `{S, B}` 계산 |
| 4. 힌트 | `hint(com, user)` | `int` | 결과를 출력하고 S 개수 반환 |
| 5. 종료 여부 | `exit(s)` | `boolean` | S가 3이면 true |
| 조립 | `process()` | `void` | 위 메소드를 순서대로 호출 |

```java
static int[] compare(int[] com, int[] user)
{
    int s = 0, b = 0;
    for (int i = 0; i < com.length; i++)
    {
        for (int j = 0; j < user.length; j++)
        {
            if (com[i] == user[j])
            {
                if (i == j) s++;       // 같은 수, 같은 자리
                else        b++;       // 같은 수, 다른 자리
            }
        }
    }
    return new int[]{s, b};            // 값 두 개를 배열로 돌려준다
}
```

| 정답 | 입력 | 결과 |
|---|---|---|
| 1 2 3 | 2 3 5 | 0S-2B |
| 1 2 3 | 1 3 5 | 1S-1B |
| 1 2 3 | 3 2 1 | 1S-2B |
| 1 2 3 | 1 2 3 | 3S (종료) |

- 입력은 `while (true)`로 받고, 100 ~ 999가 아니거나 0이 들어 있거나 같은 수가 있으면 `continue`로 다시 입력받는다(7일차). 자리 분리는 4일차의 `/`와 `%`를 썼다.
- 난수는 8일차 로또처럼 같은 수가 나오면 `i--`로 다시 뽑는다.
- `compare()`는 S와 B 두 값을 돌려줘야 해서 `int[]`로 만들었다. 메소드는 리턴을 한 개만 할 수 있어서 배열로 묶는다.
- 정답을 맞히면 다시 할지 묻고, `y`면 `process()`를 다시 호출해 새 게임을 시작하고 아니면 `System.exit(0)`으로 프로그램을 끝낸다.
- 입력을 받는 `Scanner`는 메소드마다 만들지 않고 `static Scanner scan`으로 한 번만 만들어 모든 메소드가 같이 쓴다.

</details>

<details>
<summary><b>앞으로 배울 내용 (12일차부터)</b></summary>

<br>

- 객체 지향: SOLID, 특성, 객체와 객체의 연결
- 예외 처리
- 컬렉션, IO, 람다식
- 어노테이션, 리플렉션, JSON
- JUnit

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| 단을 입력받아 구구단 출력 (매개변수만 있는 메소드), 다른 클래스에서 호출 |
| 정수 두 개와 연산자를 입력받아 사칙연산 (메소드 4개) |
| 메소드 호출 순서 확인 (main → process → display) |
| ID, 비밀번호 확인 로그인 (boolean 리턴, 재귀호출) |
| 숫자 야구 게임 (main 하나로 작성) |
| 메소드 리턴형과 지역변수 생명주기 주석 정리 |
| 1 ~ 10 출력, A ~ Z 출력, 합계, 오버로딩, 대문자를 소문자로, 문자열 거꾸로 출력 |
| 배열을 보내고 최댓값 받기, 정렬해서 받기 |
| 숫자 야구 게임을 기능별 메소드로 분리 |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- `max(int[] arr)`는 `m = 0`에서 시작해서 음수만 들어 있는 배열이면 0을 돌려준다. 8일차처럼 `arr[0]`에서 시작해야 한다.
- 사칙연산에서 `+ - * /`가 아닌 연산자를 입력하면 `default`가 없어서 아무것도 출력되지 않는다.
- 숫자 야구의 힌트 출력 서식이 `%ds-%dB`라서 `1s-1B`처럼 S가 소문자로 나온다. `%dS`로 바꿔야 한다.
- 로그인과 숫자 야구의 "다시 하기"는 `process()`를 다시 호출하는 구조라 틀리거나 다시 할 때마다 호출이 쌓인다. 반복문으로 바꾸면 어떻게 달라지는가?

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

- 메소드는 선언부(리턴형, 메소드명, 매개변수)와 구현부로 만들고, 호출하면 끝난 뒤 호출한 위치로 돌아온다.
- 결과값은 리턴형으로 한 개만 보낸다. 여러 개를 보내야 하면 배열로 묶는다.
- 이름이 같아도 매개변수가 다르면 다른 메소드(오버로딩)다.
- 배열을 매개변수로 보내면 주소가 전달되어 메소드 안의 변경이 원본에 반영된다.
- 입력, 처리, 출력을 메소드로 나누고 `process()`에서 조립하면 main이 간단해진다.

</details>

---

## 12일차 | 2026.10.27 (화) | Chapter 05. 메소드 (배열 주고받기), 객체지향 (클래스)

<details>
<summary><b>배열을 매개변수로 받는 메소드</b></summary>

<br>

정수 10개가 든 배열을 보내서 기능별로 결과를 돌려받는다. 메소드 하나가 기능 하나를 맡는다.

| 메소드 | 매개변수 | 리턴형 | 하는 일 |
|---|---|---|---|
| `hap(int[] arr)` | `int[]` | `int` | 합계 |
| `max(int[] arr)` | `int[]` | `int` | 최댓값 |
| `min(int[] arr)` | `int[]` | `int` | 최솟값 |
| `avg(int[] arr)` | `int[]` | `double` | 평균 |
| `even(int[] arr)` | `int[]` | `int` | 짝수 개수 |
| `odd(int[] arr)` | `int[]` | `int` | 홀수 개수 |

```java
static int hap(int[] arr)
{
    int sum = 0;
    for (int i : arr)
    {
        sum += i;
    }
    return sum;
}

static int max(int[] arr)
{
    int max = 0;               // 가장 작은 값에서 시작
    for (int i : arr)
    {
        if (i > max)
            max = i;
    }
    return max;
}
```

```java
// main
int[] arr = new int[10];
for (int i = 0; i < arr.length; i++)
    arr[i] = (int)(Math.random() * 100) + 1;      // 1 ~ 100

int sum = hap(arr);
System.out.printf("평균:%.2f\n", avg(arr));
```

```
[82, 35, 88, 83, 35, 26, 3, 71, 42, 94]     실행 예
합:559  최댓값:94  최솟값:3  평균:55.90  짝수의 개수:5  홀수의 개수:5
```

- 11일차에 배운 "값 여러 개는 배열로 보낸다"를 그대로 적용했다. 합계, 개수는 `int`, 평균은 소수점이 필요해서 `double`로 돌려준다.
- `even(arr)`는 `even`이라는 이름의 메소드에 배열 `arr`를 보낸다는 뜻이다. 호출 결과는 변수에 담아도 되고 출력문 안에서 바로 써도 된다.
- 최댓값은 가장 작은 값에서, 최솟값은 가장 큰 값에서 시작한다. 난수가 1 ~ 100이라서 `max`는 0, `min`은 100으로 시작했다.
- `printf`는 서식 문자열과 값을 쉼표로 구분한다. `printf("평균:%.2f\n" + avg)`처럼 `+`로 이으면 값이 없는 서식이 되어 `MissingFormatArgumentException`이 난다.

</details>

<details>
<summary><b>배열을 돌려주는 메소드 - 이름 검색</b></summary>

<br>

```java
static String[] nameFind(String name)
{
    String[] names = {"홍길동", "이순신", "강감찬", "심청이", "춘향이"};
    int count = 0;
    for (String n : names)
    {
        if (n.contains(name))
            count++;                       // 1) 일치하는 개수를 먼저 센다
    }
    String[] nn = new String[count];       // 2) 그 크기로 배열을 만든다
    int i = 0;
    for (String n : names)
    {
        if (n.contains(name))
        {
            nn[i] = n;                     // 3) 다시 돌면서 채운다
            i++;
        }
    }
    return nn;
}
```

| 호출 | 결과 |
|---|---|
| `nameFind("홍길동")` | `[홍길동]` |
| `nameFind("이")` | `[이순신, 심청이, 춘향이]` |

- 검색 결과가 몇 개일지 모르는데 배열은 크기가 고정이다. 그래서 개수를 먼저 세고, 그 크기로 배열을 만든 뒤 한 번 더 돌면서 채운다.
- 결과가 여러 개이므로 리턴형을 `String[]`로 했다. 11일차에 정리한 "리턴은 한 개, 여러 개면 배열"이다.
- 이 방식은 반복문을 두 번 돈다. 크기가 바뀌는 데이터를 다루는 컬렉션(`ArrayList`)을 배우면 한 번에 처리할 수 있다.

</details>

<details>
<summary><b>리턴형을 정하는 기준과 boolean</b></summary>

<br>

```java
static boolean isLogin(String id, String pwd)
{
    if (id.equals("admin") && pwd.equals("1234"))
        return true;                       // 메소드 종료
    else
        return false;                      // 메소드 종료
}
```

| 결과의 종류 | 리턴형 | 예 |
|---|---|---|
| 두 가지 경우 | `boolean` | 로그인 여부 |
| 여러 가지 경우 | `String` | 결과 메시지 |
| 목록 | 배열, 컬렉션 | 검색 결과 목록 |
| 상세 보기 | 클래스 | 글 하나, 회원 한 명의 정보 |
| 그 밖의 값 | 기본형 | 페이지 번호는 `int` |
| 글쓰기, 회원가입 | 클래스 | 입력할 항목이 여러 개라 한 번에 묶어서 보낸다 |

- 메소드는 `return`을 만나는 곳에서 끝난다. `if`와 `else` 양쪽에 `return`이 있어서 어느 쪽으로 가도 메소드가 종료된다.
- 11일차에는 `bCheck` 변수에 true를 담았다가 마지막에 리턴했다. 이번에는 조건에서 바로 리턴해서 변수가 필요 없다.
- `admin`, `1234`를 입력하면 "로그인 되었습니다", 하나라도 틀리면 "로그인 실패하였습니다"가 나온다.

</details>

<details>
<summary><b>클래스의 개념과 구성</b></summary>

<br>

- 클래스는 객체를 만들기 위한 설계도다. 설계도대로 만든 것이 객체이고, 클래스는 사용자가 만드는 데이터형이다.
- `Scanner scan = new Scanner(System.in);`에서 `Scanner`가 클래스, `scan`이 클래스 변수, `new Scanner(...)`가 생성자다.

**클래스의 종류**
| 종류 | 가지고 있는 것 | 이름 붙이는 관례 |
|---|---|---|
| 데이터 클래스 | 데이터(변수)만 | `~VO`, `~DTO` |
| 액션 클래스 | 메소드만 | `~DAO`, `~Service`, `~Manager` |
| 혼합 | 데이터 + 메소드 | |

**클래스의 구성**
```java
class ClassName
{
    변수       // 인스턴스 변수, 정적(static) 변수
    생성자     // 변수 초기화
    메소드
}
```

**클래스 안에 선언한 변수의 기본값** (지역변수와 달리 자동으로 초기화된다)
| 데이터형 | 기본값 |
|---|---|
| int | 0 |
| long | 0L |
| double | 0.0 |
| float | 0.0F |
| boolean | false |
| String | null |

- 데이터를 모아서 관리하는 클래스가 "사용자 정의 데이터형"이다. 4일차에 정리한 "한 개는 변수, 같은 타입 여러 개는 배열, 다른 타입 여러 개는 클래스"가 이것이다.
- 생성자는 변수를 초기화하는 곳이다. 고정된 값을 넣을 때보다 파일이나 데이터베이스 같은 외부 데이터를 읽어서 초기화할 때 쓴다.

</details>

<details>
<summary><b>객체 생성과 메모리 구조</b></summary>

<br>

```java
class Student
{
    String name = "홍길동";
    int hakbun = 1;
    String sex = "남자";
    Student(String n, int h, String s)
    {
        name = n;
        hakbun = h;
        sex = s;
    }
}

Student hong = new Student("홍길동", 1, "남자");
Student shim = new Student("심청이", 2, "여자");
Student park = new Student("박문수", 1, "남자");

System.out.println(hong.name);      // 홍길동
System.out.println(hong);           // Student@... (주소)
```

```
stack                    heap
hong [ Student@2ff4acd0 ] ───▶ name    "홍길동"   ← hong.name
                                hakbun  1
                                sex     "남자"
shim [ Student@...      ] ───▶ name    "심청이"
                                ...
```

- `new`로 만들 때마다 Heap에 새 메모리가 생기고, 변수(`hong`)에는 그 주소가 저장된다. 객체 세 개가 각자 따로 `name`, `hakbun`, `sex`를 가진다.
- 객체 안의 변수는 `객체명.변수`로 접근한다. `.`은 주소를 따라가서 접근하는 연산자다.
- 객체를 그대로 출력하면 `Student@2ff4acd0`처럼 클래스 이름과 주소 값이 나온다. 8일차 배열을 그대로 출력했을 때 `[I@...`가 나온 것과 같은 참조형의 특징이다. 이 값은 실행할 때마다 달라진다.
- 변수에 `"홍길동"`, `1`, `"남자"`를 먼저 넣어 두었지만 생성자가 실행되면서 넘겨 준 값으로 바뀐다.

</details>

<details>
<summary><b>인스턴스 변수와 정적 변수</b></summary>

<br>

```java
class Card
{
    int no;
    String type;
    static int width;       // 정적 변수 : 메모리 1개를 모든 객체가 공유
    static int height;
}

Card a = new Card();  a.no = 2;  a.type = "♥";  a.width = 200;  a.height = 300;
Card b = new Card();  b.no = 3;  b.type = "◆";  b.width = 250;  b.height = 350;
Card c = new Card();  c.no = 4;  c.type = "♣";  c.width = 500;  c.height = 700;

Card.width = 1000;
Card.height = 2000;

System.out.println(a.width);     // 1000
System.out.println(a.height);    // 2000
System.out.println(a.type);      // ♥
```

| 구분 | 인스턴스 변수 | 정적 변수 (`static`) |
|---|---|---|
| 메모리 | 객체마다 따로 | 1개만 만들어서 공유 |
| 접근 | `객체명.변수` | `클래스명.변수` (객체명으로도 가능) |
| 유지 | 객체가 있는 동안 | 프로그램이 끝날 때까지 |
| 예 | `no`, `type` (카드마다 다름) | `width`, `height` (모든 카드가 같음) |

- `a`, `b`, `c`에 각각 다른 `width`를 넣었는데 `a.width`가 1000으로 나온 이유는 `width`가 한 개뿐이라서 마지막에 넣은 `Card.width = 1000`이 모든 객체에 적용되기 때문이다.
- `no`와 `type`은 객체마다 따로라서 `a.type`은 `♥` 그대로다.
- 정적 변수는 객체를 만들지 않아도 `Card.width`로 쓸 수 있다. 객체명으로 접근할 수도 있지만 공유 값이라는 것을 드러내려고 클래스명으로 쓴다.
- 11일차의 `static` 메소드도 같은 원리다. 객체 없이 `클래스명.메소드()`로 호출한다.

</details>

<details>
<summary><b>데이터 클래스 만들기 - Movie, food</b></summary>

<br>

```java
public class Movie
{
    int mno;
    String title;
    String genre;
    String poster;
    String actor;
    String regdate;
    String grade;
    String director;
}
```

- 10일차에 영화 데이터를 `rank`, `title`, `genre`, `actor`, `grade`, `director` 배열 6개로 나눠 저장했다. 이번에는 영화 한 편의 항목을 클래스 하나(`Movie`)로 묶었다. 영화 파일의 한 줄 항목 8개(번호, 제목, 장르, 포스터, 출연진, 개봉일, 등급, 감독)가 변수 8개와 대응한다.
- 배열 여러 개를 같은 인덱스로 맞추던 방식에서, 객체 하나가 영화 한 편을 통째로 가지는 방식으로 바뀐다. 이런 데이터 클래스가 `~VO`다.
- `food.java`도 같은 방식으로 맛집 정보(번호, 포스터, 이름, 종류, 전화번호, 주소, 평점, 영업시간, 휴무일, 좌석, 주류 판매, 흡연, 예약, 배달 등 20개 항목)와 레시피 정보(번호, 작성자, 제목, 재료, 조리 방법 등 8개 항목)를 변수로 선언했다. 재료와 순서처럼 여러 개인 항목은 `String[]`로 했다.

```java
public class MovieSystem
{
    static Movie[] movies = new Movie[1938];
    static
    {
        // 자동 호출 => 변수를 자동으로 메모리에 저장
        try
        {
        }
        catch (Exception ex) {}
    }
}
```
- `Movie[]`는 영화 객체를 담는 배열이다. 영화가 1938편이라 칸을 1938개 만들었다.
- `static { }` 블록은 클래스가 메모리에 올라갈 때 자동으로 실행된다. 목록이나 게시판처럼 프로그램이 시작할 때 미리 불러와야 하는 데이터를 이 블록에서 읽어서 `movies`에 채울 계획이다. 아직 블록 안은 비어 있다.

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| 정수 10개 배열을 보내서 합계, 최댓값, 최솟값, 평균, 짝수 개수, 홀수 개수를 메소드로 구하기 |
| 이름 목록에서 검색어가 들어간 이름만 찾아서 `String[]`로 돌려받기 |
| ID, 비밀번호를 확인해서 `boolean`을 돌려주는 로그인 메소드 |
| `Student` 클래스로 객체 3개를 만들어 변수 접근, 객체 출력 |
| `Card` 클래스로 인스턴스 변수와 정적 변수의 차이 확인 |
| 영화 정보를 담는 `Movie` 클래스, 영화 목록을 담는 `MovieSystem` 클래스 (진행 중) |
| 맛집, 레시피 정보를 담는 `food` 클래스 |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- `avg()`는 `sum / 10.0`으로 나누어서 배열이 10개일 때만 맞다. `arr.length`로 나누면 개수가 달라져도 쓸 수 있다.
- `max()`는 0, `min()`은 100에서 시작해서 값이 1 ~ 100일 때만 맞다. 범위를 모르는 배열은 8일차처럼 `arr[0]`에서 시작해야 한다.
- 정적 변수를 `a.width`처럼 객체명으로 접근하면 이클립스에 경고가 뜬다. `Card.width`로 쓰는 습관을 들일 것.
- `food` 클래스는 이름이 소문자로 시작하고(`Food`), `adress1`, `adress2`는 `address`, `Rating`은 `rating`이 관례다. 맛집 정보와 레시피 정보를 한 클래스에 같이 두었는데 둘로 나눌지도 정해야 한다.

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

- 값 여러 개는 배열로 보내고, 결과가 여러 개이면 배열을 돌려준다. 크기를 모르면 개수를 먼저 센 뒤 배열을 만든다.
- 리턴형은 결과의 종류로 정한다. 두 가지는 `boolean`, 목록은 배열, 상세 정보는 클래스다.
- 클래스는 설계도, 객체는 그 설계도로 `new`해서 Heap에 만든 것이다. 변수에는 주소가 들어 있다.
- 인스턴스 변수는 객체마다 따로, `static` 변수는 하나를 공유한다.
- 관련된 데이터를 항목별 배열 여러 개로 나누는 대신 데이터 클래스 하나로 묶어서 관리한다.

</details>

---

## 13일차 | 2026.10.28 (수) | Chapter 06. 객체지향 프로그램 (클래스 구성요소, 생성자)

<details>
<summary><b>클래스의 구성요소와 변수 종류</b></summary>

<br>

```
클래스 = 설계 : 데이터(변수) / 기능(메소드) / 저장(생성자)
객체   = 실제 동작 : 어떤 데이터를 쓰는지(변수), 어떻게 움직이는지(메소드)
```

| 구성요소 | 종류 | 설명 |
|---|---|---|
| 변수 | 정적 변수 (`static`) | 공통으로 쓰는 공유 변수 |
| 변수 | 인스턴스 변수 | 객체마다 따로 쓰는 변수 |
| 생성자 | | 변수 초기화, 시작과 동시에 처리할 기능 |
| 메소드 | 정적 메소드 (`static`) | 공유하는 기능 |
| 메소드 | 인스턴스 메소드 | 객체마다 따라 수행하는 기능 |

**변수 종류 비교**
| 구분 | 선언 위치 | 사라지는 시점 | 저장 영역 |
|---|---|---|---|
| 지역변수 | 메소드 안 | 메소드가 끝나면 | Stack |
| 정적 변수 | 클래스 안, `static` | 프로그램이 끝날 때 (컴파일할 때 자동 생성) | Method Area |
| 인스턴스 변수 | 클래스 안 | 객체가 사라질 때 (`new`로 생성) | Heap |

- 변수와 메소드는 선언하는 방법이 같고, 데이터형은 기본형, 클래스(사용자 정의, 라이브러리), 배열, 상수와 열거형을 모두 쓸 수 있다.
- 메소드는 다른 클래스와 연결할 때 쓴다. 사용은 변수를 활용해서 한다.

</details>

<details>
<summary><b>객체의 생명 주기와 메모리 구조</b></summary>

<br>

```
객체 생성          객체 활용        객체 소멸      메모리 해제
A a = new A();     a.display()      a = null       System.gc()
```

| 메모리 영역 | 저장 내용 | 관리 |
|---|---|---|
| Method Area | 클래스 정보(메소드), static 변수 | |
| Stack | 지역변수, 매개변수, 객체 변수(주소) | `{}`가 끝나면 자동 회수 |
| Heap | `new`로 만든 실제 데이터 (배열, 객체) | 가비지 컬렉션(GC)이 관리 |

```java
class A
{
    int a;            // 인스턴스 변수
    static int b;     // 정적 변수
    void display() {}
}
A aa = new A();
A bb = new A();
```

```
stack            heap
aa [0x100] ───▶  0x100 : a = 0              aa.a, aa.display()
bb [0x200] ───▶  0x200 : a = 0              bb.a, bb.display()

Method Area
b = 0     ◀── aa.b, bb.b, A.b 모두 같은 하나
```

- `new`를 할 때마다 Heap에 새 공간이 생기고 변수에는 그 주소가 저장된다. 인스턴스 변수 `a`는 객체마다 따로 있고, 정적 변수 `b`는 하나를 공유한다.
- 12일차에 확인한 `Card`의 `width`, `height`가 이 구조 때문에 모든 객체에서 같은 값이 나온 것이다.

</details>

<details>
<summary><b>지역변수 우선, this, static 규칙</b></summary>

<br>

```java
class A
{
    static int a = 10;
    int b = 100;

    static void display()
    {
        int a = 20;                        // 지역변수
        System.out.println(a + A.a);       // 20 + 10 = 30
    }
    void aaa()
    {
        a = 100;                           // 정적 변수
        this.b = 200;                      // 이 객체의 인스턴스 변수
    }
}

A.display();           // 30
A.a = 100;
A aa = new A();        // this = aa
A bb = new A();        // this = bb
bb.a = 1000;           // 객체명으로 접근했지만 정적 변수 하나를 바꾼다
```

- 같은 이름의 지역변수가 있으면 지역변수가 먼저 쓰인다. 정적 변수는 `A.a`처럼 클래스명을 붙여서 구분한다. 실행하면 `30`이 출력된다.
- `this`는 객체 자신의 주소다. `aa.aaa()`를 호출하면 `this`는 `aa`이고, `bb.aaa()`를 호출하면 `bb`다. 생성자 안에서 `this`를 출력해 보면 `new`로 만든 변수의 주소와 같은 값이 나온다.
- `static` 메소드와 `static` 블록 안에서는 인스턴스 변수를 쓸 수 없다. 인스턴스 변수는 객체가 있어야 만들어지는데 `static`은 객체 없이 실행되기 때문이다.
- 인스턴스 변수는 `객체 변수`, 정적 변수는 `클래스 변수`라고도 부른다.

</details>

<details>
<summary><b>생성자의 역할과 특징</b></summary>

<br>

```java
class Student
{
    int hakbun;                  // 0
    String name;                 // null
    int kor, eng, math;
    static String schoolName;

    Student()                    // 매개변수가 없는 생성자
    {
        System.out.println("변수의 초기화 담당");
        System.out.println("처음 실행시 기능이 필요한 경우...");
        System.out.println("this=" + this);
    }
    Student(int hakbun, String name, int kor, int eng, int math)
    {
        this.hakbun = hakbun;    // 매개변수와 변수 이름이 같을 때 this로 구분
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

Student std = new Student();                              // 안내 문구 3줄 출력
Student s1 = new Student(1, "홍길동", 90, 90, 90);
Student s2 = new Student(2, "심청이", 70, 70, 70);
Student s3 = new Student(3, "박문수", 80, 80, 80);
```

- 생성자는 객체를 만들 때 한 번 호출되는 메소드다. 변수를 초기화하거나 시작과 동시에 처리할 기능(자동 로그인, 서버 연결, 데이터베이스 연결)에 쓴다. 호출할 때는 반드시 `new`와 함께 쓴다.
- 반드시 존재해야 하는 메소드라서 직접 만들지 않으면 매개변수가 없는 디폴트 생성자를 컴파일러가 자동으로 만든다.
- `new Student()`를 두 번 하면 안내 문구가 두 번 출력된다. 객체를 만들 때마다 생성자가 실행된다.
- 매개변수가 있는 생성자는 객체마다 초기값을 다르게 줄 때 쓴다. `s1`, `s2`, `s3`가 각자 다른 학번, 이름, 점수를 가진다.
- 13일차 `클래스_1.java`에서는 `Student`에 매개변수 없는 생성자와 3개짜리 생성자를 둘 다 만들었고, `sex`에는 초기값을 주지 않아 기본값 `null`이다.

**생성자의 특징**
| 특징 | 설명 |
|---|---|
| 이름 | 클래스명과 같다 (대소문자 구분) |
| 리턴형 | 없다. `void`도 리턴형이라 `void A()`는 생성자가 아니라 일반 메소드다 |
| 개수 | 여러 개 가능 (매개변수 개수나 데이터형이 다르면 오버로딩) |

</details>

<details>
<summary><b>변수의 초기화 방법</b></summary>

<br>

```java
class A
{
    int a = 100;              // 1) 명시적 초기화
    static int b = 200;

    {                         // 2) 인스턴스 초기화 블록
        a = 200;
        b = 300;
    }
    static                    // 2) static 초기화 블록
    {
        b = 1000;             // a = 500; 은 오류 (인스턴스 변수 사용 불가)
    }
    A()                       // 3) 생성자
    {
        a = 300;
        b = 400;
    }
}
```

| 방법 | 형태 |
|---|---|
| 명시적 초기화 | `int a = 100;` |
| 초기화 블록 | `{ }` (인스턴스), `static { }` (정적) |
| 생성자 | `A() { }` |

- 클래스 영역에는 선언만 할 수 있다. `int a;`를 쓰고 다음 줄에 `a = 100;`을 쓰는 것은 오류이고, 값은 선언할 때 같이 넣거나 블록, 생성자 안에서 넣는다.
- 클래스 영역에 `for`문 같은 실행문도 쓸 수 없다.
- `static` 블록에서는 인스턴스 변수를 쓸 수 없다. 인스턴스 변수는 인스턴스 블록이나 생성자에서 초기화한다.

</details>

<details>
<summary><b>접근지정어, 객체지향 3대 특성 미리보기</b></summary>

<br>

| 구분 | 종류 |
|---|---|
| 접근지정어 | `public`, `protected`, `default`, `private` |
| 제어어 | `static`, `final`, `abstract` |

| 객체지향 3대 특성 | 내용 | 관련 문법 |
|---|---|---|
| 캡슐화 | 데이터를 보호한다 | Getter(읽기) / Setter(쓰기), Lombok |
| 상속 | 부모의 기능을 재사용하고 확장한다 | `extends` |
| 다형성 | 새로운 기능을 추가하거나 기존 기능을 변경한다 | 오버로딩, 오버라이딩 |

```java
class A { int a = 200, b, c, d, e, f; }
class B extends A { }

B b = new B();
// b 안에는 부모 A의 변수 a ~ f (super 영역)와 B 자신의 영역(this)이 함께 만들어진다
```

- 상속은 `extends`로 한다. 상속을 내려 주는 클래스는 재사용되고 상속받는 클래스는 기능이 확장된다. 상속 대신 다른 클래스를 변수로 가지는 포함 관계도 있다.
- 다른 클래스와 연결하는 방법으로 추상 클래스, 인터페이스, 내부 클래스를 배운다.
- 에러를 미리 막고 비정상 종료를 방지하는 것이 예외처리다. 컴파일 에러는 반드시 예외처리를 해야 하고 실행 중 에러는 상황에 따라 처리한다.
- 이후에는 `java.lang`(10장), `java.util`(11장), 컬렉션, IO, 데이터베이스, 쓰레드와 네트워크를 배운다.

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| 클래스의 구성요소, 객체 생명 주기, 메모리 영역(Stack, Heap, Method Area) 정리 |
| 지역변수와 정적 변수 이름이 같을 때 결과 확인 (`20 + 10 = 30`), `this` 정리 |
| 매개변수 없는 생성자와 5개짜리 생성자로 `Student` 객체 생성, 학생 3명 정보 출력 |
| `Student` 클래스에 생성자 2개를 만들어 홍길동, 심청이, 박문수 객체 생성, 객체 주소 출력 |
| `Card` 클래스로 정적 변수 공유 확인 (12일차 코드 재작성) |
| 영화 정보 `Movie` 클래스, 영화 목록 `MovieSystem` 클래스 (비어 있음) |
| 12일차 `food` 클래스를 `Food`, `Recipe` 클래스로 분리 (내용은 아직 비어 있음) |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- `클래스_1.java` 주석에 `int`의 기본값이 `100`으로 적혀 있다. 맞는 값은 `0`이다.
- 인스턴스 초기화 블록, `static` 블록, 생성자 중 어느 것이 먼저 실행되는지는 주석 예시만 있고 코드로 출력해 확인하지 않았다. 직접 출력해서 순서를 확인할 것.
- `Food`, `Recipe` 클래스가 비어 있다. 12일차 `food`에 있던 맛집 변수와 레시피 변수를 나눠 옮겨야 한다.

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

- 클래스는 변수, 생성자, 메소드로 이루어지고 변수와 메소드는 각각 정적과 인스턴스로 나뉜다.
- 인스턴스 변수는 `new`할 때마다 Heap에 따로 생기고, 정적 변수는 Method Area에 하나만 있다.
- 지역변수는 같은 이름의 정적 변수보다 우선하고, `this`는 객체 자신이다.
- 생성자는 클래스명과 같고 리턴형이 없다. 객체를 만들 때 한 번 실행되어 변수를 초기화한다.
- 클래스 영역에는 선언과 초기화만 가능하다.

</details>

---

## 14일차 | 2026.10.29 (목) | Chapter 06. 객체지향 프로그램 (생성자 오버로딩, 캡슐화, 영화 시스템)

<details>
<summary><b>생성자 오버로딩</b></summary>

<br>

```java
class Sawon
{
    private int sabun;
    private String name;
    private String dept;

    public Sawon()
    {
        sabun = 1;
        name = "홍길동";
        dept = "개발부";
    }
    public Sawon(int sabun, String name)
    {
        this.sabun = sabun;
        this.name = name;
    }
    public Sawon(String name, String dept)
    {
        this.name = name;
        this.dept = dept;
    }
    public Sawon(int sabun, String name, String dept)
    {
        this(name, dept);          // 같은 클래스의 다른 생성자 호출
        this.sabun = sabun;
    }
    public void display() { /* 사번, 이름, 부서 출력 */ }
}
```

| 객체 생성 | 출력 (사번 / 이름 / 부서) |
|---|---|
| `new Sawon()` | 1 / 홍길동 / 개발부 |
| `new Sawon(2, "심청이")` | 2 / 심청이 / null |
| `new Sawon("박문수", "영업부")` | 0 / 박문수 / 영업부 |

- 생성자는 인스턴스 변수와 static 변수를 초기화하는 메소드다. 객체를 만들 때마다 다른 데이터로 초기화할 때 쓰고, 필요할 때만 만든다. 생성자가 하나도 없으면 매개변수 없는 디폴트 생성자가 자동으로 하나 추가된다.
- 생성자를 직접 하나라도 만들면 디폴트 생성자는 추가되지 않는다. 매개변수 없는 생성자가 필요하면 직접 만들어야 한다.
- 생성자 호출은 `new 생성자()`로만 한다. 단독으로 호출할 수 없다.
- 값을 넣지 않은 변수는 기본값으로 남는다. `new Sawon(2, "심청이")`의 `dept`는 `null`, `new Sawon("박문수", "영업부")`의 `sabun`은 `0`이다.
- `this(name, dept)`는 같은 클래스의 다른 생성자를 호출한다. 생성자 안에서 쓰고 첫 줄에 둔다.

**오버로딩 조건**
| 번호 | 조건 |
|:-:|---|
| 1 | 메소드 이름이 같다 |
| 2 | 같은 클래스 안에 만든다 |
| 3 | 매개변수의 개수나 데이터형이 다르다 |
| 4 | 리턴형은 관계없다 |

</details>

<details>
<summary><b>캡슐화와 접근 지정어</b></summary>

<br>

캡슐화는 데이터를 보호할 목적으로 쓴다. 변수는 감추고(`private`), 필요한 만큼만 메소드로 열어 준다.

| 접근 지정어 | 자신의 클래스 | 같은 패키지 | 다른 패키지의 상속 클래스 | 모든 클래스 |
|---|:-:|:-:|:-:|:-:|
| `private` | O | | | |
| `default` | O | O | | |
| `protected` | O | O | O | |
| `public` | O | O | O | O |

- 관례: 인스턴스 변수는 `private`, 생성자, 메소드, 클래스는 `public`으로 한다. 윈도우의 `Button`, `TextField`처럼 `public`으로 열어 두고 쓰는 경우도 있다.

| 대상 | 형식 | 제어어 |
|---|---|---|
| 변수 | `접근지정어 데이터형 변수명` | `static`(공통), `final`(마지막, 값을 바꿀 수 없음) |
| 메소드 | `접근지정어 리턴형 메소드명(매개변수)` | `static`, `final`, `abstract`(구현 없이 선언만) |
| 생성자 | `접근지정어 클래스명()` | |
| 클래스 | `접근지정어 class ClassName` | `final`, `abstract`, `static` |

```java
import lombok.*;

@Data
class Sawon
{
    private int sabun;           // 클래스 밖에서 직접 접근 불가
    private String name;
    protected String job;
    String dept;
    public int pay;
}

Sawon s = new Sawon();
s.job = "과장";                   // 같은 패키지라서 직접 접근 가능
s.dept = "개발부";
s.pay = 4500;
s.setSabun(1);                    // private 변수는 Setter로 쓴다
s.setName("홍길동");
System.out.println(s.getName());  // Getter로 읽는다
```

- `private` 변수는 같은 클래스 밖에서 `s.sabun`처럼 접근할 수 없다. 읽기는 Getter(`getSabun()`), 쓰기는 Setter(`setSabun()`)로 한다.
- Getter, Setter를 변수마다 직접 만들면 코드가 길어져서 Lombok의 `@Data`를 썼다. 변수마다 붙이던 `@Getter`, `@Setter`(주석 처리해 둠)를 클래스에 `@Data` 하나로 대신한다.
- Lombok은 `lombok-1.18.48.jar`를 프로젝트 라이브러리로 추가해서 쓴다.

</details>

<details>
<summary><b>영화 시스템 - Movie, MovieSystem, Main</b></summary>

<br>

12일차에 만들기 시작한 영화 목록을 클래스 세 개로 나눠 완성했다.

| 클래스 | 역할 | 종류 |
|---|---|---|
| `Movie` | 영화 한 편의 정보 (번호, 제목, 장르, 포스터, 출연진, 개봉일, 등급, 감독) | 데이터 클래스 |
| `MovieSystem` | 파일 읽기, 목록 / 상세 / 검색 기능 | 액션 클래스 |
| `Main` | 메뉴 입력과 결과 출력 | 실행 클래스 |

```java
@Data
public class Movie
{
    private int mno;
    private String title;
    private String genre;
    private String poster;
    private String actor;
    private String regdate;
    private String grade;
    private String director;
    // 생성자는 자동 추가
}
```

**MovieSystem - 파일 읽기**
```java
private static Movie[] movies = new Movie[1938];
static
{
    try
    {
        FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while ((i = fr.read()) != -1)
        {
            sb.append((char) i);
        }
        fr.close();

        String[] movie = sb.toString().split("\n");     // 영화 한 편 = 한 줄
        i = 0;
        for (String m : movie)
        {
            String[] info = m.split("\\|");
            movies[i] = new Movie();
            movies[i].setMno(Integer.parseInt(info[0]));
            movies[i].setTitle(info[1]);
            movies[i].setGenre(info[2]);
            movies[i].setActor(info[4]);
            movies[i].setRegdate(info[5]);
            movies[i].setGrade(info[6]);
            movies[i].setDirector(info[7]);
            i++;
        }
    }
    catch (Exception ex)
    {
        System.out.println(ex.getMessage());
        ex.printStackTrace();
    }
}
```

- 12일차에 비어 있던 `static` 블록을 채웠다. 10일차에 배열 6개로 나눠 저장하던 데이터를 이번에는 `Movie` 객체 하나에 담아 `Movie[]`에 저장한다.
- `static` 블록은 클래스가 메모리에 올라갈 때 호출 없이 자동으로 실행된다. static 변수는 여기서 초기화하고, 인스턴스 변수는 생성자에서 초기화한다.
- 문자열을 `+`로 이으면 결합할 때마다 메모리가 바뀐다. 그래서 글자를 읽을 때마다 `StringBuffer`에 모아 두고 한 번에 처리한다.
- `info[0]`은 문자열이라서 `Integer.parseInt()`로 정수로 바꿔 `mno`에 저장한다.
- 파일을 읽을 때는 예외가 날 수 있어서 `try ~ catch`로 감쌌다. 예외 처리 방법은 복구(`try ~ catch`), 회피(`throws`, 메소드 뒤에 붙임), 발생(`throw`) 세 가지다. 여기서는 오류 메시지를 출력하는 복구를 썼다.
- `movies`는 `private static`이라 밖에서 직접 쓸 수 없고, 아래 `public` 메소드로만 가져간다. 캡슐화를 적용한 것이다.

**MovieSystem - 기능 세 가지**
| 기능 | 메소드 | 리턴형 | 동작 |
|---|---|---|---|
| 목록 | `movieListData()` | `Movie[]` | `movies` 전체를 돌려준다 |
| 상세 보기 | `movieDetailData(int mno)` | `Movie` | `movies[mno - 1]` (번호는 1부터, 인덱스는 0부터) |
| 검색 | `movieFindData(String fd)` | `Movie[]` | 제목에 `fd`가 들어간 영화만 |

```java
public Movie[] movieFindData(String fd)
{
    int count = 0;
    for (Movie m : movies)
    {
        if (m.getTitle().contains(fd))
            count++;                         // 개수를 먼저 센다
    }
    Movie[] m = new Movie[count];
    int i = 0;
    for (Movie mm : movies)
    {
        if (mm.getTitle().contains(fd))
        {
            m[i] = mm;
            i++;
        }
    }
    return m;
}
```

- 리턴형은 결과의 종류로 정한다. 영화 한 편이면 `Movie`, 여러 편이면 `Movie[]`다. 12일차 이름 검색과 같이 개수를 먼저 세고 그 크기로 배열을 만든다.
- 목록과 검색은 여러 개라서 `Movie[]`, 상세 보기는 하나라서 `Movie`다.

**Main - 메뉴**
```java
MovieSystem ms = new MovieSystem();
Scanner scan = new Scanner(System.in);
while (true)
{
    // 1. 영화 전체 목록  2. 영화 상세 보기  3. 영화 검색  4. 종료
    int menu = scan.nextInt();
    if (menu == 4) { System.out.println("프로그램 종료"); break; }
    else if (menu == 1)
    {
        Movie[] movie = ms.movieListData();
        for (Movie m : movie)
            System.out.println(m.getMno() + "." + m.getTitle());
    }
    // 2: ms.movieDetailData(mno), 3: ms.movieFindData(fd)
}
```

- `Main`은 입력과 출력만 맡고 데이터 처리는 `MovieSystem`의 메소드를 호출한다. 11일차에 정리한 입력, 처리, 출력을 나누는 구조를 클래스 단위로 확대한 것이다.
- 메뉴 반복은 6일차 `while (true)`와 `break`, 메뉴 분기는 5일차 `else if`다.
- 검색을 선택하면 `검색된 영화 개수:` 뒤에 개수가 나오고, 이어서 `번호.제목` 목록이 출력된다.
- `getMno()`, `getTitle()`처럼 Getter로 읽는다. `Movie`의 변수가 `private`이기 때문이다.

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| 사원 클래스에 생성자 4개를 만들어 `new Sawon()`, `new Sawon(2, "심청이")`, `new Sawon("박문수", "영업부")`로 객체 생성 (생성자 오버로딩) |
| 접근 지정어별 변수를 가진 `Sawon` 클래스, Lombok `@Data`로 Getter, Setter 사용 |
| 영화 정보를 담는 `Movie` 클래스 (`@Data`) |
| 영화 파일을 읽어 `Movie[]`에 저장하고 목록, 상세, 검색 기능을 만든 `MovieSystem` |
| 메뉴로 영화 목록, 상세 보기, 검색을 실행하는 `Main` |
| `User` 클래스 (아직 비어 있음) |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- `생성자_오버로딩.java`의 네 번째 생성자에 `Srting` 오타가 있어서 컴파일 오류가 난다. `String`으로 고쳐야 한다. 이 생성자는 `this(name, dept)`로 값을 넣은 뒤 `this.name`, `this.dept`를 다시 대입해서 중복이고, `main`에서는 한 번도 호출하지 않았다.
- `Movie`와 `데이터보호_캡슐화`는 Lombok에 의존한다. 프로젝트 `.classpath`에 `C:/javaDev/lombok-1.18.48.jar`라는 내 PC의 절대 경로로 등록되어 있고 저장소에는 jar가 없어서, 다른 PC에서 내려받으면 빌드 오류가 난다.
- 영화 개수 `1938`이 코드에 고정되어 있다. 파일 줄 수가 모자라면 목록과 검색에서 `NullPointerException`이 난다. 상세 보기도 번호 범위 검사가 없어서 `0`이나 `1939`를 입력하면 `ArrayIndexOutOfBoundsException`이 난다. 7일차에 배운 입력값 검사를 붙이면 된다.
- `static` 블록 안의 `System.out.println(sb.toString())`이 프로그램을 시작할 때마다 파일 전체를 출력한다. 읽어 온 데이터를 확인하려고 둔 것이라면 지워야 한다.
- 파일의 네 번째 항목(포스터 주소)을 `setPoster()`로 저장하지 않아서 `getPoster()`는 항상 `null`이다.

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

- 생성자는 매개변수의 개수와 데이터형을 다르게 해서 여러 개 만들 수 있고, 객체를 만들 때 넘긴 값에 따라 초기화가 달라진다.
- 변수는 `private`으로 감추고 Getter, Setter로 접근한다. 반복되는 Getter, Setter는 Lombok `@Data`로 줄인다.
- 데이터는 `Movie`, 기능은 `MovieSystem`, 입출력은 `Main`으로 클래스를 나누면 역할이 분명해진다.
- 결과가 한 개이면 클래스, 여러 개이면 클래스 배열을 돌려준다.
- 파일 읽기처럼 예외가 날 수 있는 코드는 `try ~ catch`로 감싼다.

</details>

---

## 15일차 | 2026.10.30 (금) | Chapter 06. 객체지향 프로그램 (상속, 오버라이딩, 음악 순위 시스템)

<details>
<summary><b>자바 프로그램의 구조와 객체지향 큰 그림</b></summary>

<br>

| 구성 | 내용 |
|---|---|
| package | 폴더 구조. 관련된 클래스를 쉽게 찾으려고 모아 둔다. 다른 패키지에서 쓰려면 접근지정어가 필요하다 |
| import | 패키지가 다른 클래스를 가져온다. 여러 개 쓸 수 있고, 3개 이상이면 `java.util.*`처럼 묶는다 |
| 클래스 | 변수 영역(인스턴스 / 정적) → 생성자 → 메소드. 순서는 상관없다 |

- 접근지정어 관례: 클래스, 메소드, 생성자는 모든 패키지에서 쓰도록 `public`, 변수는 감추는 `private`으로 하고 읽기(Getter)와 쓰기(Setter) 메소드만 `public`으로 연다. 객체와 객체는 메소드로 통신한다.
- 생성자는 여러 개 만들 수 있고, 없으면 디폴트 생성자가 자동으로 만들어진다.
- 메소드는 변수를 이용해서 처리하는 객체 관련 기능과, 독립적인 기능(`static`)으로 나뉜다.
- 변수, 메소드, 클래스는 모두 메모리에 저장한 뒤에 쓴다. 참조형은 주소를 저장해서 리모컨처럼 제어한다. `new 생성자()`로 저장하고, `static`은 자동으로 저장된다. 스프링이 클래스 정보를 읽어서 메모리를 할당하는 방식이 리플렉션이다.

| 객체지향에서 해결하려는 것 | 방법 |
|---|---|
| 공통으로 쓰는 기능을 모아서 재사용 (반복 제거, 확장, 유지보수, 가독성) | 상속, 포함 |
| 필요할 때 기능을 변경하거나 추가 | 다형성 (오버라이딩, 오버로딩) |
| 관련된 클래스를 하나로 묶어서 제어 | 추상화 (인터페이스, 추상 클래스) |
| 클래스끼리 공통으로 쓰는 변수와 메소드 | 내부 클래스 |
| 종료되지 않는 프로그램 | 예외처리 |

</details>

<details>
<summary><b>상속 (extends)</b></summary>

<br>

```java
class A extends B
// B : 상속을 내리는 클래스 (부모, super 클래스)
// A : 상속을 받는 클래스 (자식, sub 클래스, 파생 클래스)
```

```
사람            이름, 성별, 나이
학생 extends 사람     학번, 전공
회사원 extends 사람   사번, 부서
```

- 공통으로 쓰는 변수와 메소드를 부모에 모아 두고 자식은 필요한 것만 추가한다. 학생, 회사원에 이름, 성별, 나이를 각각 만들지 않아도 되고, 수정할 때 부모 한 곳만 고친다.
- 게시판도 같다. 답변형 게시판은 게시판의 목록, 글쓰기, 상세보기, 수정, 삭제, 검색을 그대로 쓰고 `답변하기()`만 추가한다. 댓글 게시판은 `댓글` 기능만 추가한다. 소스가 간결해지고 분석과 가독성이 좋아진다.
- 자바는 **단일 상속**만 가능하다. 부모를 하나만 가질 수 있다.
- 생성자와 초기화 블록은 자식에게 상속되지 않는다. `static`은 객체마다 따로 만들어지는 것이 아니라 공통으로 쓰는 것이라서, 자식 클래스에서도 부모의 `static` 변수를 이름으로 바로 쓸 수 있다. (아래 음악 시스템에서 `MelonMusic`이 `Music`의 `musics`를 그대로 쓴다)
- `private`은 상속은 되지만 자식에서 쓸 수 없다. 자식까지 쓰게 하려면 `protected`를 쓴다.
- 단점: 부모 메모리와 자식 메모리가 둘 다 만들어져서 메모리가 커지고 실행 속도가 느려질 수 있다. 그래서 상속은 꼭 필요할 때만 쓴다.

```java
class Super { int a; public void display() {} }
class Sub extends Super { int b; public void bbb() {} }

Sub sub = new Sub();
```

```
stack              heap
sub [100] ───▶  100 ┌ super 영역 : a, display()   ← 부모에게 받은 것
                    └ this  영역 : b, bbb()       ← 자식이 추가한 것
```

- 자식 객체를 만들면 Heap에 부모 영역(`super`)과 자식 영역(`this`)이 함께 만들어진다. 13일차에 정리한 "b 안에 super와 this가 함께 있다"가 이 구조다.

</details>

<details>
<summary><b>오버라이딩</b></summary>

<br>

```java
class Animal
{
    int age = 10;
    public void eat() { System.out.println("먹는다"); }
    public void run() { System.out.println("걷는다"); }
}
class Pig extends Animal
{
    int age;
    public Pig() { age = 5; }
    public void eat() { System.out.println("돼지처럼 먹는다"); }   // 재정의
    public void run() { System.out.println("돼지처럼 걷는다"); }
}
// Dog, Horse도 같은 방식 (age 3, 7)

Animal pig = new Pig();
System.out.println("나이:" + pig.age);
pig.eat();
pig.run();
```

```
나이:10
돼지처럼 먹는다
돼지처럼 걷는다
나이:10          ← dog
개처럼 먹는다
개처럼 걷는다
나이:10          ← horse
말처럼 먹는다
말처럼 걷는다
```

- 오버라이딩은 상속받은 메소드를 자식 클래스에서 다시 정의해서 기능을 바꾸는 것이다.

| 오버라이딩 조건 |
|---|
| 상속을 받은 클래스에서 한다 |
| 메소드 이름이 같다 |
| 매개변수가 같다 |
| 리턴형이 같다 |
| 접근 지정어는 넓히는 것만 가능하고 좁힐 수 없다 (`private` < `default` < `protected` < `public`) |

| 구분 | 오버로딩 | 오버라이딩 |
|---|---|---|
| 위치 | 같은 클래스 | 상속받은 클래스 |
| 메소드 이름 | 같다 | 같다 |
| 매개변수 | 다르다 | 같다 |
| 리턴형 | 관계없다 | 같다 |
| 목적 | 새로운 기능 추가 | 기존 기능 변경 |

- 부모 타입 변수 `Animal`에 자식 객체(`new Pig()`)를 넣을 수 있다. 같은 `eat()`를 호출해도 만든 객체에 따라 돼지, 개, 말의 결과가 다르게 나온다.
- 실행해 보면 메소드는 실제 객체(`Pig`)의 것이 실행되지만 `age`는 `Animal`의 10이 나온다. 변수는 오버라이딩되지 않고 변수의 타입(`Animal`)을 기준으로 읽기 때문이다. 자식에서 `int age;`를 다시 선언하면 부모의 `age`와 이름만 같은 별개의 변수가 된다.

</details>

<details>
<summary><b>음악 순위 시스템 - 클래스 구성</b></summary>

<br>

14일차 영화 시스템은 `Movie`, `MovieSystem`, `Main` 세 개였다. 이번에는 같은 구조에 상속을 적용했다. 멜론과 지니는 데이터를 가져오는 방법만 다르고, 목록과 검색 기능은 같다.

| 클래스 | 역할 | 종류 |
|---|---|---|
| `MusicVO` | 곡 한 개의 정보 (순위, 포스터, 곡명, 가수명, 앨범, 등락 상태, 등락 폭) | 데이터 클래스 |
| `Music` | 목록, 곡명 검색, 가수명 검색 | 상속을 내리는 부모 클래스 |
| `MelonMusic` | 멜론 차트에서 데이터를 읽어 저장 | `Music`을 상속 |
| `GenieMusic` | 지니 차트에서 데이터를 읽어 저장 | `Music`을 상속 |
| `UserMain` | 콘솔에서 목록과 검색 실행 | 실행 클래스 |
| `MusicList` | 윈도우 화면 | `JFrame` 상속 |

```java
public class Music                                   // 상속을 내리는 클래스
{
    public static MusicVO[] musics = new MusicVO[50];    // 곡 50개를 저장

    public MusicVO[] musicListData()                 // 1. 목록
    {
        return musics;
    }
    public MusicVO[] musicSearchTitle(String title)  // 2. 곡명 검색
    {
        int count = 0;
        for (MusicVO vo : musics)
        {
            if (vo.getTitle().contains(title))
                count++;
        }
        MusicVO[] music = new MusicVO[count];
        int i = 0;
        for (MusicVO vo : musics)
        {
            if (vo.getTitle().contains(title))
            {
                music[i] = vo;
                i++;
            }
        }
        return music;
    }
    // musicSearchSinger()는 getSinger()로 같은 방식
}
```

```java
public class MelonMusic extends Music
{
    public MelonMusic()                              // 객체를 만들 때 데이터를 읽어서 저장
    {
        Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
        Elements title = doc.select("tr#lst50 div.rank01 a");
        // singer, album, poster, etc도 같은 방식
        for (int i = 0; i < title.size(); i++)
        {
            musics[i] = new MusicVO();
            musics[i].setTitle(title.get(i).text());
            musics[i].setRank(i + 1);
            // ...
        }
    }
}
```

| 가져올 정보 | 멜론 | 지니 |
|---|---|---|
| 곡명 | `tr#lst50 div.rank01 a` | `table.list-wrap a.title` |
| 가수명 | `tr#lst50 div.rank02 span.checkEllipsis` | `table.list-wrap a.artist` |
| 앨범 | `tr#lst50 div.rank03 a` | `table.list-wrap a.albumtitle` |
| 포스터 | `tr#lst50 div.wrap img` (`src`) | `table.list-wrap a.cover img` (`src`) |
| 등락 | `tr#lst50 div.wrap span.rank_wrap` | `table.list-wrap span.rank` |

- 4일차, 7일차에 맛본 Jsoup 크롤링을 클래스 구조 안에 넣었다. 4일차에는 `main`에서 바로 출력했고 이번에는 읽은 값을 `MusicVO` 객체에 담아 배열에 저장한다.
- 순위는 사이트의 순위 칸을 읽지 않고 반복 인덱스에 1을 더해서(`i + 1`) 정한다.
- 목록과 검색은 부모 `Music`에 한 번만 만들고, 멜론과 지니는 생성자에서 데이터를 채우는 일만 한다. 이것이 상속으로 재사용하는 구조다.
- `musics`는 부모의 `static` 배열이다. `new GenieMusic()`을 하면 같은 배열이 지니 데이터로 다시 채워진다.
- `MusicVO`는 변수를 `private`으로 감추고 Lombok `@Data`로 Getter, Setter를 만든다. 캡슐화를 적용한 데이터 클래스다.

**등락 상태 나누기**
```java
String temp = etc.get(i).text();
if (temp.equals("유지"))                  // 멜론은 "순위 동일"
{
    id = 0;
    state = "유지";
}
else
{
    id = Integer.parseInt(temp.replaceAll("[^0-9]", ""));   // 숫자만 남긴다
    state = temp.replaceAll("[^가-힣]", "");                 // 한글만 남긴다
}
```
- 7일차에 배운 `replaceAll` 정규식을 응용했다. 예를 들어 `순위 상승 3`이면 숫자는 `3`, 한글은 `순위상승`이 된다. 한 문자열에서 숫자와 글자를 따로 뽑아 `idcrement`와 `state`에 저장한다.

</details>

<details>
<summary><b>음악 순위 시스템 - 콘솔과 화면</b></summary>

<br>

**콘솔 (UserMain)**
```java
Music music = new MelonMusic();                  // 부모 타입 변수에 자식 객체
MusicVO[] list = music.musicListData();
for (MusicVO vo : list)
{
    System.out.println(vo.getRank() + "." + vo.getTitle());
}
list = music.musicSearchTitle(title);            // 곡명 검색
System.out.println("총 검색:" + list.length + "건");
list = music.musicSearchSinger(singer);          // 가수명 검색
```
- 변수 타입이 `Music`이라서 `new MelonMusic()`을 `new GenieMusic()`으로 바꿔도 나머지 코드는 그대로 쓴다. 14일차에 `Main`이 `MovieSystem`의 메소드만 불러서 입력과 출력을 맡던 구조와 같다.

**화면 (MusicList)**
```java
public class MusicList extends JFrame implements ActionListener
{
    JTable table;
    DefaultTableModel model;
    JButton b1, b2;
    Music music = new MelonMusic();                  // 처음에는 멜론 순위

    public void print()
    {
        for (int i = model.getRowCount() - 1; i >= 0; i--)
            model.removeRow(i);                      // 기존 행을 모두 지운다

        MusicVO[] m = music.musicListData();
        for (MusicVO vo : m)
        {
            String[] data = {String.valueOf(vo.getRank()), vo.getTitle(), vo.getSinger(), vo.getAlbum()};
            model.addRow(data);
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b1)
        {
            music = new GenieMusic();                // 지니뮤직 버튼
            print();
        }
        if (e.getSource() == b2)
        {
            music = new MelonMusic();                // 멜론 버튼
            print();
        }
    }
}
```
- 8일차에 따라 쳐 보기만 했던 `extends JFrame`이 이번에 배운 상속이다. `JFrame`의 창 기능을 그대로 물려받고 버튼과 표를 붙였다.
- `implements ActionListener`는 인터페이스라서 아직 배우지 않았다. 버튼을 눌렀을 때 `actionPerformed()`가 실행되고, `e.getSource() == b1`로 어느 버튼인지 구분한다.
- 표는 `DefaultTableModel`에 행을 넣는 방식이다. 갱신할 때는 기존 행을 지우고 다시 채운다. 앞에서부터 지우면 인덱스가 밀리기 때문에 뒤에서부터 지운다.
- 버튼을 누르면 부모 타입 변수 `music`에 다른 자식 객체를 넣고 `print()`를 부른다. `print()`는 어느 자식인지 몰라도 `music.musicListData()` 한 줄로 목록을 가져온다.

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| 자바 프로그램 구조, 상속, 오버라이딩 개념 정리 |
| `Animal`을 상속받는 `Pig`, `Dog`, `Horse`에서 `eat()`, `run()` 오버라이딩, 부모 타입 변수로 호출 |
| 곡 한 개를 담는 `MusicVO` 클래스 (`@Data`) |
| 목록, 곡명 검색, 가수명 검색을 가진 부모 클래스 `Music` |
| 멜론, 지니 차트를 Jsoup으로 읽어 `MusicVO[]`에 저장하는 `MelonMusic`, `GenieMusic` (`Music` 상속) |
| 콘솔에서 목록, 곡명 검색, 가수명 검색을 실행하는 `UserMain` |
| 지니뮤직, 멜론 버튼으로 순위표를 바꿔 보여 주는 Swing 화면 `MusicList` |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- `Pig`, `Dog`, `Horse`에서 `int age;`를 다시 선언해서 `Animal` 타입 변수로 읽으면 자식 값(5, 3, 7)이 아니라 부모의 10이 나온다. 자식 값을 쓰려면 다시 선언하지 말고 부모의 `age`를 생성자에서 바꾸어야 한다.
- `musics`가 50칸으로 고정이다. 사이트에서 읽은 곡이 50개보다 적으면 빈 칸이 `null`이라서 검색할 때 `NullPointerException`이 난다. 등락 문자열에 숫자가 없는 곡이 있으면 `Integer.parseInt("")`에서 예외가 나서 그 뒤의 곡이 저장되지 않을 수도 있다.
- 곡명, 가수명 입력을 `scan.next()`로 받아서 공백이 있는 이름은 앞부분만 검색된다. 10일차 영화 검색과 같은 문제라서 `nextLine()`을 써야 한다.
- `MelonMusic`, `GenieMusic`에 확인용 `System.out.println`이 남아 있어서 객체를 만들 때마다 곡 정보가 콘솔에 출력된다.
- `MusicList`에는 창을 닫을 때 프로그램을 끝내는 `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)`가 없어서 창을 닫아도 프로그램이 끝나지 않을 수 있다.
- `idcrement`는 `increment`의 오타로 보인다. 이름을 바꾸면 `getIdcrement()` 같은 Getter, Setter 이름도 함께 바뀐다.
- `.classpath`에 Lombok, jsoup, JTattoo가 모두 내 PC의 절대 경로(`C:/javaDev`, `C:/Users/.../Downloads`)로 등록되어 있고 저장소에는 jar가 없다. 다른 PC에서는 빌드 오류가 나므로 프로젝트 안에 `lib` 폴더를 만들어 상대 경로로 두는 방법을 알아볼 것. JTattoo는 등록만 되어 있고 코드에서는 아직 쓰지 않았다.

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

- 공통 기능은 부모 클래스에 한 번만 만들고 `extends`로 물려받아 재사용한다. 자바는 부모를 하나만 가질 수 있다.
- 자식 객체에는 부모 영역(`super`)과 자식 영역(`this`)이 함께 만들어진다.
- 오버라이딩은 이름, 매개변수, 리턴형이 같은 메소드를 자식에서 다시 정의해 기능을 바꾸는 것이고, 접근 지정어는 좁힐 수 없다.
- 부모 타입 변수에 자식 객체를 넣으면 메소드는 실제 객체 것이 실행되고 변수는 변수 타입을 기준으로 읽힌다.
- 데이터 클래스, 기능 클래스, 실행 클래스로 나누고, 데이터를 가져오는 부분만 자식으로 분리하면 멜론과 지니처럼 같은 기능을 쉽게 바꿔 쓸 수 있다.

</details>

---

## 16일차 | 2026.11.02 (월) | Chapter 07. 클래스의 종류 (다형성, 추상 클래스)

<details>
<summary><b>생성자 정리와 super(), this()</b></summary>

<br>

```java
class Human
{
    String name, sex, address, phone;
    public Human(String name, String sex, String address, String phone)
    {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }
}
class Student extends Human
{
    int hakbun;
    String subject;
    public Student(String name, String sex, String address, String phone)
    {
        super(name, sex, address, phone);      // 부모 생성자 호출
    }
}
```

| 구분 | `super` / `super()` | `this` / `this()` |
|---|---|---|
| 변수로 쓸 때 | 상속을 내린 클래스의 객체 | 자신의 객체 |
| 생성자 호출 | 상속을 내린 클래스의 생성자 | 자신이 가진 다른 생성자 |

- `super()`와 `this()`는 생성자 안에서만, 첫 줄에서만 호출한다.
- 부모의 매개변수 없는 생성자는 자식 생성자 첫 줄에서 `super()`로 자동 호출된다. 부모에 매개변수가 있는 생성자만 있으면 자식에서 `super(값...)`을 직접 불러야 하고, 부르지 않으면 `constructor Human in class Human cannot be applied to given types` 오류가 난다.
- 자식 객체를 만들면 부모 생성자가 먼저 실행된다. `class B extends A`에서 `new B()`를 하면 `A() call...`이 먼저, `B() call...`이 그다음에 출력된다.
- 생성자는 객체를 만들 때 호출되고, 변수를 초기화한다. 클래스명과 같고 리턴형이 없으며 여러 개 만들 수 있다(오버로딩). 생성자가 없으면 매개변수 없는 생성자가 자동으로 만들어진다.

**1 ~ 10장 정리**
| 번호 | 내용 |
|:-:|---|
| 1 | 클래스는 객체의 설계도 |
| 2 | 클래스의 구성요소: 변수, 생성자, 메소드 |
| 3 | 객체 생성은 `new 생성자()` |
| 4 | 생성자는 필요할 때만 만든다 |
| 5 | 접근 지정어: 메소드, 클래스, 인터페이스, 생성자는 `public`, 변수는 `private`으로 감추고 Getter, Setter로 읽기와 쓰기 |
| 6 | 제어어: `static`(공유), `abstract`(공통, 구현은 자식에서), `final`(재정의 안 됨) |
| 7 | 변수, 메소드 종류: `static`(공통), 인스턴스(객체마다 따로) |
| 8 | 상속은 재사용이고 필요하면 정의를 바꿔서 쓴다. 모든 클래스는 `Object`를 상속받는다 |
| 9 | 오버로딩, 오버라이딩(기존 메소드의 기능을 변경) |
| 10 | 추상 클래스는 공통 부분을 모아 상속을 내리고 구현해서 사용. 보완이 인터페이스 |

</details>

<details>
<summary><b>상속 정리 - 재사용 기법, 장단점, 상위 클래스 규칙</b></summary>

<br>

**재사용 기법 두 가지**
| 방식 | 관계 | 설명 |
|---|---|---|
| 변경 없이 재사용 | 포함 (has-a) | 만들어진 클래스를 변수로 가져다 쓴다. 웹에서 많이 쓴다 |
| 변경 후 재사용 | 상속 (is-a) | 상속받아서 필요한 부분을 재정의한다. 추상 클래스, 인터페이스도 여기에 속한다 |

```java
public class 재사용기법 /* extends JFrame */
{
    JFrame f = new JFrame();           // 포함: JFrame을 변수로 가지고 있다
    public 재사용기법()
    {
        f.setSize(640, 400);
        f.setVisible(true);
    }
}
```
- 15일차 `MusicList`는 `extends JFrame`으로 창의 기능을 물려받았다. 이번에는 같은 `JFrame`을 변수로 가지는 포함 방식으로 창을 띄웠다. 상속 코드는 주석(`setSize()`, `setVisible()`)으로 남겨 비교했다.

**상속의 장점과 단점**
| 구분 | 내용 |
|---|---|
| 장점 | 유지보수가 쉽다, 이미 쓰이고 있는 클래스라 신뢰성이 높다, 소스가 간결하다 |
| 단점 | 속도가 느리다(최적화 문제), 메모리가 커진다(부모와 자식 둘 다 할당), 가독성이 떨어진다(메소드나 변수가 어디서 왔는지 모른다), 결합성이 높아진다(클래스 하나를 고치면 다른 클래스에 영향) |

- 자바 클래스는 단일 상속만 가능하다. `class C extends A, B`는 오류이고, `A → B → C`처럼 단계적으로 상속하는 것은 가능하다. 단일 상속을 보완하는 것이 인터페이스다.
- 생성자는 상속되지 않는다. `private`은 상속은 되지만 접근할 수 없어서 `protected`나 Getter, Setter를 쓴다.

**상위 클래스 변수 사용 규칙**
```
인간
 ├ 남자      인간 a = new 남자();   가능
 └ 여자      인간 a = new 여자();   가능
             남자 a = new 여자();   불가능 (형제 클래스끼리는 크기가 같아서 담을 수 없다)
```
- 상속 관계에서는 위로 올라갈수록 크기가 커진다. 큰 쪽 변수에 작은 쪽 객체를 담을 수 있다. 3일차에 `double d = 10`처럼 값보다 크거나 같은 데이터형에 담던 규칙이 클래스에도 적용된다. 형제 클래스끼리 담으면 `incompatible types` 오류가 난다.
- 상위 클래스 변수로 객체를 쓸 때 변수는 변수의 클래스 타입 기준, 메소드는 `new`로 만든 생성자 타입 기준으로 호출된다. 15일차에 `나이:10`이 나온 이유다.
- 상속을 내린 클래스는 상속받은 클래스에 접근할 수 없고(`this`만 가능), 상속받은 클래스는 `this`와 `super` 둘 다 쓸 수 있다.

**변수 초기화 방법 고르기**
| 순서 | 방법 | 대상 |
|:-:|---|---|
| 1 | 명시적 초기화 `private int age = 10;` | 가장 먼저 가능한지 본다 |
| 2 | `static { }` | static 변수 |
| 3 | 인스턴스 블록 `{ }` | 인스턴스 변수 |
| 4 | 생성자 | 인스턴스 변수 |

- 명시적 초기화가 안 될 때 2, 3, 4번을 쓴다. 블록 안에서는 파일 읽기, 웹 연결, 윈도우 UI, 제어문, 연산자를 쓸 수 있다.
- `static` 블록과 `static` 메소드 안에서는 인스턴스 변수를 쓸 수 없다. `this`, `super`도 마찬가지다.

</details>

<details>
<summary><b>상위 클래스로 여러 클래스 제어 - 다형성</b></summary>

<br>

```java
class 동물 { public void run() { System.out.println("달린다"); } }
class 개 extends 동물 { public void run() { System.out.println("개가 달린다"); } }
class 소 extends 동물 { public void run() { System.out.println("소가 달린다"); } }
class 말 extends 동물 { public void run() { System.out.println("말이 달린다"); } }

동물 animal = null;                  // 주소가 없는 상태
switch (ani)                         // 입력받은 동물 이름
{
case "개": animal = new 개(); break;
case "말": animal = new 말(); break;
case "소": animal = new 소(); break;
}
animal.run();                        // 개가 달린다 (입력에 따라 달라진다)
```

- 모든 클래스(라이브러리, 사용자 정의)는 `Object`를 상속받는다. `Object`가 가장 위에 있는 클래스다.
- 개, 소, 말처럼 관련된 여러 클래스를 하나로 모아서 처리할 때 상위 클래스(동물) 변수를 쓴다. 입력에 따라 만드는 객체가 달라지고, 변수가 가리키는 주소도 실행할 때마다 바뀐다(동적 바인딩). 같은 `run()`을 호출해도 객체에 따라 결과가 다르다.
- 클래스 변수는 `new`를 하기 전에는 `null`이다. 개, 말, 소가 아닌 값을 입력하면 `animal`이 `null`인 채로 `run()`을 호출해서 `NullPointerException`이 난다.

| 객체지향 4대 특성 | 내용 |
|---|---|
| 캡슐화 | 데이터를 보호한다 |
| 상속 | 서로 다른 클래스를 한 클래스로 묶어서 관리한다. 기존 클래스의 변수와 메소드를 가져오고, 바꿔서 쓸 수 있다(오버라이딩) |
| 다형성 | 오버로딩(메소드 추가), 오버라이딩(메소드 내용 변경) |
| 추상화 | 공통적인 클래스를 묶어서 관리한다. 인터페이스 |

- 13일차에 3대 특성으로 정리했던 것에 추상화가 더해져 4대 특성이 되었다.

</details>

<details>
<summary><b>추상 클래스</b></summary>

<br>

```java
abstract class 도형
{
    String color = "검정색";
    abstract void setColor(String color);        // 구현하지 않은 메소드
    abstract void draw();                        // 도형마다 다르게 구현
    void tick()                                  // 구현한 메소드 (선택사항)
    {
        System.out.println("두께: 5mm");
    }
}
class 선 extends 도형
{
    void draw() { System.out.println("선을 그린다: 색상은" + color); }
    void setColor(String color) { this.color = color; }
}
// 네모, 세모도 같은 방식
class 원 extends 도형
{
    void draw() { System.out.println("원을 그린다: 색상은" + color); }
    void setColor(String color) { this.color = color; }
    void tick() { System.out.println("두께: 10mm"); }    // 필요한 것만 재정의
}

도형 a = new 선();
a.draw();
a.tick();
a = new 원();
a.draw();
a.tick();
```

```
선을 그린다: 색상은검정색
두께: 5mm
...
원을 그린다: 색상은검정색
두께: 10mm
```

- 추상 클래스는 구현하지 않은 메소드(추상 메소드)를 가진 미완성 클래스다. `new`로 직접 만들 수 없고, 상속받은 클래스에서 추상 메소드를 구현한 뒤 그 클래스로 만든다. 자식은 추상 메소드를 반드시 구현해야 한다.
- 형식은 `public abstract class ClassName`, 추상 메소드는 `public abstract 리턴형 메소드(매개변수...);`다. 프로그램마다 구현이 다른 것은 추상 메소드로, 공통으로 쓰는 것은 구현해 둔다.
- 변수, 생성자, 구현한 메소드도 가질 수 있다. 서로 다른 클래스를 모아 한 이름으로 제어하고, 결합성이 낮은 프로그램을 만들 수 있다.
  - 예: `DriverManager` 하나로 오라클, MySQL, MSSQL, PostgreSQL, MariaDB 등을 같은 방법으로 쓴다.
  - 예: 뮤직 추상 클래스 아래에 지니뮤직, 멜론, Mnet.
- 단점은 단일 상속이라 제약이 많고, 기능을 추가하면 상속받은 다른 클래스에 영향을 준다. 그래서 실제로는 인터페이스를 더 많이 쓴다.
- 클래스를 쓸 때 `new`로 만들 수 있으면 일반 클래스(`Scanner`), 만들 수 없으면 추상 클래스나 인터페이스다. `Calendar`는 추상 클래스라서 `new Calendar()`가 아니라 `Calendar.getInstance()`로 객체를 받는다.

**클래스 재사용 세 가지** (객체지향 프로그램은 부품을 조립하는 CBD, 부품이 클래스다)
| 방식 | 문법 |
|---|---|
| 있는 그대로 사용 | 포함 클래스 |
| 변경해서 사용 | 상속(오버라이딩) |
| 새로운 기능 추가 | 오버로딩 |

- 추상 클래스는 `extends`(단일 상속), 인터페이스는 `implements`(다중 구현)다. 라이브러리에서는 인터페이스를 주로 지원한다. 메소드의 기능 이름은 같고 구현이 다를 때 쓴다. 예를 들어 버튼의 `click()`은 로그인, 계산기, 회원가입, 페이지 버튼마다 하는 일이 다르다.
- 이미 쓰이는 프로그램을 재사용하면 검증을 거쳐서 신뢰성이 좋다. 대규모 프로젝트(예: 시청 시스템을 다른 시청에 재사용)에서 중요하다.

</details>

<details>
<summary><b>추상 클래스로 음악 시스템 만들기</b></summary>

<br>

15일차 음악 시스템에 추상 클래스를 적용했다. 사이트마다 달라지는 것(데이터 수집)과 같은 것(목록, 상세 보기, 검색)을 나눠서, 다른 것만 추상 메소드로 남겼다.

| 클래스 | 역할 | 종류 |
|---|---|---|
| `Music` | 곡 한 개의 정보 (번호, 곡명, 가수명, 앨범, 등락 상태, 등락 폭) | 데이터 클래스 (`@Data`) |
| `MusicSystem` | 목록, 상세 보기, 검색 + 데이터 수집 | 추상 클래스 |
| `MelonMusic`, `GenieMusic` | 데이터 수집을 구현 | `MusicSystem` 상속 |
| `UserMain` | 실행 | |

```java
public abstract class MusicSystem
{
    private static Music[] musics = new Music[50];       // 감춘 변수

    public Music[] musicList() { return musics; }                     // 구현
    public Music musicDetail(int mno) { return musics[mno - 1]; }     // 구현
    public Music[] musicFindData(String title) { /* 개수 세고 배열 생성 */ }

    public static Music[] getMusics() { return musics; }             // 자식에게 열어 주는 Getter

    public abstract void dataCollection();                           // 구현하지 않은 메소드
}
```

```java
public class MelonMusic extends MusicSystem
{
    @Override
    public void dataCollection()
    {
        Music[] musics = getMusics();                  // 부모의 Getter로 받아서
        // Jsoup으로 멜론 차트를 읽어 musics[i]에 저장
    }
}

MusicSystem ms = new GenieMusic();
ms.dataCollection();
Music[] musics = ms.musicList();           // 지니 순위 출력
ms = new MelonMusic();
ms.dataCollection();
musics = ms.musicList();                   // 멜론 순위 출력
```

- 15일차에서는 `Music`(부모)의 생성자에서 크롤링했는데, 이번에는 크롤링을 `dataCollection()` 메소드로 분리했다. 객체를 만든 뒤 필요할 때 부른다.
- `musics`를 15일차에는 `public static`으로 열어 두었지만 이번에는 `private static`으로 감추고 `getMusics()`로만 꺼내 쓴다. `private`은 상속은 되어도 자식에서 직접 접근할 수 없기 때문에 Getter가 필요하다. 캡슐화를 적용한 것이다.
- 부모(추상 클래스) 타입 변수 `ms`에 `new GenieMusic()`과 `new MelonMusic()`을 바꿔 넣으면서 같은 코드로 두 사이트의 순위를 처리한다.
- 상세 보기(`musicDetail`)는 14일차 영화 시스템처럼 번호에서 1을 뺀 인덱스로 꺼낸다.
- 주석에 적은 게시판 예시도 같은 구조다. 게시판은 글쓰기, 목록, 상세 보기, 검색, 수정, 삭제가 공통이고, 답변형 게시판은 답변이, 댓글형 게시판은 댓글이 추가된다. 구현한 것은 부모에 두고 달라지는 것만 자식에서 구현하거나 추가한다.

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| 부모 클래스 `Human`을 상속받는 `Student`, `Sawon`에서 `super()`로 부모 생성자 호출 (`main`은 비어 있음) |
| 상속 장단점, 변수 초기화 방법, 상위 클래스 규칙 정리 (주석) |
| `JFrame`을 변수로 가지는 포함 방식으로 창 띄우기 |
| `동물`을 상속받는 `개`, `소`, `말`을 입력에 따라 만들어 `run()` 호출 |
| 추상 클래스 `도형`과 `선`, `네모`, `세모`, `원`, 추상 메소드 구현과 `tick()` 재정의 |
| 클래스 재사용 방법(포함, 상속, 오버로딩), 추상 클래스와 인터페이스 정리 (주석) |
| 추상 클래스 `MusicSystem`과 `MelonMusic`, `GenieMusic`으로 음악 순위 시스템 작성 |
| 1 ~ 10장 정리 (주석) |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- `다형성_3`은 개, 말, 소 이외의 값을 입력하면 `animal`이 `null`이라 `NullPointerException`이 난다. `switch`에 `default`를 두거나 `null` 검사가 필요하다.
- 상속되는 것에 대한 주석이 서로 다르다. `정리_67`에는 "생성자, 초기화 블록, static은 상속이 불가능", `다형성_1`에는 "생성자 / static은 사용이 가능하게"라고 적혀 있다. 15일차에 확인한 대로 생성자와 초기화 블록은 상속되지 않고, `static`은 자식에서 이름으로 쓸 수 있다. 주석을 하나로 정리해야 한다.
- `MusicSystem`도 `musics`가 50칸 고정이고, 읽은 곡이 50개보다 적으면 검색에서 `NullPointerException`이 난다. `dataCollection()`에는 확인용 `System.out.println`이 남아 있다. 15일차에 적은 문제와 같다.
- 음악 시스템은 Lombok과 jsoup이 `.classpath`에 `C:/javaDev`, `C:/Users/.../Downloads` 절대 경로로 등록되어 있어서 저장소만으로는 빌드되지 않는다.

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

- 자식 생성자에서 부모 생성자를 `super()`로 부르고, 부모가 먼저 실행된다. 부모에 매개변수 있는 생성자만 있으면 `super(값)`을 직접 써야 한다.
- 재사용은 변경 없이 쓰는 포함(has-a)과 바꿔서 쓰는 상속(is-a)이 있다. 상속은 편하지만 결합성이 높아지는 단점이 있다.
- 상위 클래스 변수 하나로 여러 자식 객체를 다룰 수 있고, 같은 메소드를 호출해도 객체에 따라 결과가 다르다. 객체지향의 4대 특성은 캡슐화, 상속, 다형성, 추상화다.
- 추상 클래스는 구현하지 않은 메소드를 포함한 미완성 클래스이고, 자식이 반드시 구현한다. `new`로 직접 만들 수 없다.
- 달라지는 부분만 추상 메소드로 남기고 공통 기능은 부모에 구현해 두면 멜론, 지니처럼 같은 일을 하는 클래스를 한 변수로 바꿔 가며 쓸 수 있다.

</details>

---

## 17일차 | 2026.11.03 (화) | Chapter 08. 인터페이스, Chapter 11. 예외처리 (시작)

<details>
<summary><b>인터페이스의 개념과 구성요소</b></summary>

<br>

- 인터페이스는 연결하는 리모컨이다. 추상 클래스의 일종이고, 클래스와 같이 취급한다.
- 서로 다른 클래스 여러 개를 묶어 한 이름으로 관리한다. 예를 들어 `List` 아래에 `ArrayList`, `LinkedList`, `Vector`가 있고, `List list`에 `new ArrayList()`, `new LinkedList()`, `new Vector()`를 바꿔 넣어 쓸 수 있다.
- 추상 클래스는 단일 상속이지만 인터페이스는 다중 상속이 가능하다. 서로 다른 클래스를 묶어서 결합성이 낮은 프로그램을 만들 수 있고, 유지보수에 좋다.

```java
interface 인터페이스명
{
    int MAX = 100;                  // 상수 (public static final 생략 가능, 반드시 초기화)
    void display();                 // 추상 메소드 (public abstract 생략 가능)
    default void aaa() { }          // default 메소드 : 구현한 메소드
    static void bbb() { }           // static 메소드 : 구현한 메소드
    private void ccc() { }          // private 메소드 : 인터페이스 안에서만 사용, 거의 쓰지 않는다
}
```

| 구성요소 | 설명 |
|---|---|
| 상수 | 변수는 없고 상수만 있다. `int MAX;`처럼 초기화하지 않으면 오류가 난다 |
| 추상 메소드 | 구현하지 않은 메소드. `public abstract`는 자동으로 붙는다 |
| `default` 메소드 | 구현한 메소드. 기능을 추가할 때 쓴다 |
| `static` 메소드 | 구현한 메소드 |
| `private` 메소드 | 구현한 메소드 (JDK 9부터), 사용 빈도가 거의 없다 |

- 인터페이스의 멤버는 `public`만 있다. 그래서 구현하는 클래스의 메소드도 `public`이어야 한다. `public` 없이 쓰면 `display() in Impl cannot implement display() in Ia` 오류가 난다. 오버라이딩 조건에서 접근 지정어는 같거나 넓어야 하는 규칙이다.
- 인터페이스를 수정하면 구현한 클래스가 모두 오류가 난다. 그래서 고정해서 쓰고, 최근에는 `default` 메소드로 기능을 추가한다.

**인터페이스 연결 방법**
| 관계 | 키워드 | 예 |
|---|---|---|
| 인터페이스 → 인터페이스 | `extends` | `interface C extends A, B` (쉼표로 여러 개) |
| 인터페이스 → 클래스 | `implements` | `class C implements A, B` |
| 클래스 → 인터페이스 | 불가능 | |
| 상속과 구현을 함께 | `extends` + `implements` | `class D extends C implements A, B` |

- `Ic extends Ia, Ib`를 만들고 `Impl implements Ic`로 구현해서 `display()`, `bbb()`, `default` 메소드, `static` 메소드, 상수가 모두 동작하는 것을 확인했다. 상수는 `Ia.MAX`와 `Impl.MAX`로 모두 읽힌다.
- 인터페이스는 윈도우 이벤트, 쓰레드, 데이터베이스, 웹과 앱 연동에 쓴다.

</details>

<details>
<summary><b>인터페이스 만들기와 사용</b></summary>

<br>

```java
public interface HelloInter
{
    public void seyHello(String name);
}
public class Hello implements HelloInter
{
    public void seyHello(String name)
    {
        System.out.println(name + "님 환영합니다!!");
    }
}

HelloInter hello = new Hello();       // 인터페이스 타입 변수에 구현 클래스 객체
hello.seyHello("홍길동");              // 홍길동님 환영합니다!!
```

```java
public interface Execute
{
    public void execute();
    public default void display() {}
}
public class 게시판 implements Execute { public void execute() { System.out.println("게시판 처리!"); } }
// 회원가입, 로그인, 맛집목록, 맛집상세보기도 같은 방식 (각각 다른 메시지 출력)
```

```java
Map map = new HashMap();
map.put("1", new 게시판());
map.put("2", new 회원가입());
map.put("3", new 로그인());
map.put("4", new 맛집목록());
map.put("5", new 맛집상세보기());

Execute e = (Execute) map.get(String.valueOf(menu));    // 번호로 클래스를 꺼낸다
```

- 서로 다른 다섯 개의 클래스가 `execute()`라는 같은 메소드를 가지도록 `Execute`로 묶었다. 메뉴 번호에 맞는 클래스를 꺼내 `e.execute()` 한 줄로 실행할 수 있어서 조건문이 필요 없다. 메뉴를 선택하면 `3`은 `로그인 처리!`, `5`는 `맛집상세보기 출력!`이 나온다.
- `Map`은 키와 값을 한꺼번에 저장하는 컬렉션이다. 아직 배우지 않았고 `"1"`이라는 키로 객체를 찾는 용도로 먼저 써 보았다.
- `HelloInter`에는 메소드 원형(설계)만 있고, 실제 동작은 구현 클래스 `Hello`가 정한다.

</details>

<details>
<summary><b>인터페이스와 추상 클래스 비교</b></summary>

<br>

| 구분 | 추상 클래스 | 인터페이스 |
|---|---|---|
| 선언 | `abstract class` | `interface` |
| 가질 수 있는 것 | 변수(인스턴스, 정적), 생성자, 구현한 메소드, 구현하지 않은 메소드 | 상수, 추상 메소드, `default`, `static`, `private` 메소드 |
| 접근 지정어 | 제한 없음 | `public`만 (`private` 메소드 제외) |
| 연결 | `extends` (단일 상속) | `implements` (다중 구현) |
| 객체 생성 | `new` 불가, 상속받은 클래스로 간접 생성 | `new` 불가, 구현한 클래스로 생성 |
| 용도 | 공통 기능을 모아서 재사용, 일부 메소드는 강제 구현 | 기능 설계, 표준화 |

**인터페이스의 장점**
- 코드가 표준화된다. 개발자들이 같은 메소드를 쓴다.
- 설계만 되어 있어서 프로그램에 맞게 구현해서 쓴다.
- 다른 클래스와 연결하기 편하고 결합성이 낮다.
- 다중 상속이 가능하고, 독립적으로 쓸 수 있다(`Socket`, `ServerSocket`).
- 소스가 통일되어 분석이 쉽다. 프레임워크(jQuery, Vue, React)도 같은 이유다. 스프링도 표준화를 위해 인터페이스를 쓴다.

```java
public interface Board
{
    public void write();
    public void list();
    public void detail();
    public void update();
    public void delete();                  // 게시판마다 다르다 (댓글, 자료실은 파일 삭제까지)
    public default void paging() { }       // 모든 게시판이 같은 경우 구현
}
```
- 모든 게시판이 같은 기능은 `default` 메소드로 구현해 두고, 게시판마다 다른 기능은 선언만 해서 프로그램별로 구현한다. 새로운 기능을 추가할 때 `default`로 넣으면 구현 클래스를 수정하지 않아도 된다.

**컬렉션 인터페이스 미리보기**
| 인터페이스 | 특징 | 구현 클래스 |
|---|---|---|
| `List` | 순서가 있고 중복 데이터를 저장할 수 있다 | `ArrayList`, `LinkedList` |
| `Set` | 순서가 없고 중복 데이터를 허용하지 않는다 | `HashSet`, `TreeSet` |
| `Map` | 키와 값을 동시에 저장한다 | `HashMap`, `Hashtable` |

</details>

<details>
<summary><b>인터페이스로 만든 화면 - 이벤트와 퍼즐 게임</b></summary>

<br>

```java
public class 인터페이스_1 extends JFrame implements MouseListener, WindowListener
{
    public void mouseClicked(MouseEvent e) { }
    public void mousePressed(MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    // WindowListener의 windowOpened ~ windowDeactivated 7개도 모두 구현
}
```
- 인터페이스를 `implements`하면 안의 추상 메소드를 모두 구현해야 한다. 쓰지 않는 이벤트도 빈 본문으로 만들어야 하고, 마우스 이벤트 5개와 윈도우 이벤트 7개를 전부 만들었다.
- 쉼표로 여러 인터페이스를 구현할 수 있다. 15일차에 설명 없이 썼던 `implements ActionListener`가 이 문법이다.

**퍼즐 게임 (3 x 3)**
```java
public class 퍼즐게임 extends JFrame implements ActionListener, MouseListener
{
    JButton[] btns = new JButton[9];           // 퍼즐 칸
    JButton b1, b2;                            // 시작, 종료
    int[] panCount = new int[9];               // 칸마다 들어갈 숫자
    int last = 0;                              // 빈칸 위치

    public void getRand()
    {
        for (int i = 0; i < 9; i++)
        {
            panCount[i] = (int)(Math.random() * 9);       // 0 ~ 8
            for (int j = 0; j < i; j++)
            {
                if (panCount[i] == panCount[j])
                {
                    i--;                                   // 중복이면 다시 뽑는다
                    break;
                }
            }
        }
    }
    public boolean isEnd()
    {
        for (int i = 0; i < 9; i++)
            if (panCount[i] != i) return false;           // 0 ~ 8 순서면 완성
        return true;
    }
}
```
- 화면은 `GridLayout(3, 3, 5, 5)`로 버튼 9개를 배치하고, 시작과 종료 버튼은 `setBounds()`로 좌표를 직접 정해서 붙였다(`setLayout(null)`).
- 8일차 로또에서 쓴 중복 없는 난수(`i--`와 `break`)로 0 ~ 8을 섞는다. 8번이 빈칸이고 `last`가 빈칸의 위치다. 화면에는 `panCount[i] + 1`을 글자로 보여 주고 빈칸은 `""`다(`String.valueOf`).
- 칸을 누르면 그 칸의 숫자가 빈칸으로 옮겨 가고 빈칸 위치가 그 칸으로 바뀐다. `isEnd()`가 true면 `JOptionPane.showConfirmDialog()`로 종료할지 묻고, 아니오를 누르면 다시 섞는다. 종료 버튼은 `showMessageDialog()` 뒤에 `System.exit(0)`이다.
- `MouseListener`의 `mouseEntered()`, `mouseExited()`로 시작과 종료 버튼에 마우스를 올리면 초록색, 벗어나면 흰색이 되게 했다. 나머지 이벤트 메소드는 빈 본문이다.
- 한 이벤트 처리 메소드(`actionPerformed`)에서 `e.getSource() == b1`처럼 어느 버튼인지 구분하는 방식은 15일차 `MusicList`와 같다.

</details>

<details>
<summary><b>예외처리 시작 - 1 ~ 10장 총정리와 가변 매개변수</b></summary>

<br>

| 구분 | 내용 |
|---|---|
| 전역변수 | 클래스 전체에서 쓰는 변수. 객체가 같이 쓰는 `static`, 객체마다 따로 있는 인스턴스 변수 |
| 지역변수 | 메소드 안에서만 쓰는 변수 (매개변수 포함) |
| 기본형 | 정수(`int`, `long`, `byte`), 실수(`double`), 문자(`char`), 논리(`boolean`) |
| 참조형 | 배열, 클래스. Stack에는 주소, 데이터는 Heap에 저장 |
| 영구 저장 | 파일, RDBMS |
| 묶는 단위 | 연산, 제어문 → 메소드 / 변수 + 메소드 → 클래스 / 클래스 여러 개 → 패키지 / 관련된 클래스를 제어 → 인터페이스 |

- 데이터형 크기는 `byte < char < int < long < double`이고, 변수에는 값보다 크거나 같은 데이터형을 쓴다. 클래스는 상속을 내린 클래스가 상속받은 클래스보다 크다.

```java
class A { }
class B extends A { }

A a = new B();            // 가능 (A가 더 크다)
B b = (B) new A();        // 컴파일은 되지만 실행하면 ClassCastException
```
- 관련 없는 두 클래스는 `A a = new B()`가 안 된다. 상속 관계가 있어야 크기가 정해진다.
- 작은 쪽 변수에 큰 쪽 객체를 담는 것은 `(B)`처럼 강제로 형변환해야 컴파일되지만, 실제 객체가 `A`라면 실행할 때 `ClassCastException`이 난다. 3일차 `(int) 10.5` 같은 형변환과 달리 클래스는 실행해 봐야 맞는지 안다.

**가변 매개변수**
```java
public static void display(int... a) { }

display(10);
display(10, 20);
display(10, 20, 30);
```
- `int... a`는 같은 데이터형의 값을 개수와 관계없이 받는 매개변수다. 안에서는 배열로 취급해서 `a.length`가 각각 1, 2, 3이다.
- 8일차에 쓴 `String.join("/", "2026", "10", "21")`이 가변 매개변수로 만든 메소드다.
- 예외처리 폴더인데 이번 파일에는 `try ~ catch` 같은 예외처리 코드는 아직 없다. 14일차 영화 시스템에서 `try ~ catch`와 `throws`를 맛봤고, 예외처리는 다음 시간에 이어서 배운다.

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| 인터페이스의 구성요소, 연결 방법(`extends`, `implements`) 정리 (주석) |
| `HelloInter` 인터페이스와 `Hello` 구현 클래스, 인터페이스 타입 변수로 호출 |
| `Execute` 인터페이스를 구현한 클래스 5개(게시판, 회원가입, 로그인, 맛집목록, 맛집상세보기)와 `Map`으로 번호에 맞는 클래스 호출 |
| `JFrame`에 마우스, 윈도우 이벤트 인터페이스를 구현한 클래스 (이벤트 메소드 12개) |
| 인터페이스와 추상 클래스 비교, 컬렉션 인터페이스 정리 (주석) |
| `Board` 인터페이스에 `default` 메소드 `paging()` 추가 |
| 3 x 3 퍼즐 게임 (`ActionListener`, `MouseListener` 구현) |
| 1 ~ 10장 총정리, 가변 매개변수 `int... a` |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- `UserMain`은 `Execute e`를 꺼내 놓고 쓰지 않은 채 `if`를 다섯 개 써서 같은 일을 한다. `e.execute()` 한 줄이면 된다. 메뉴가 1 ~ 5가 아니면 `e`가 `null`이라서 검사가 필요하다. `Map map = new HashMap();`은 타입을 지정하지 않은 형태라 컴파일 때 경고가 나온다.
- 인터페이스 메소드 이름이 `seyHello`로 오타다. `sayHello`로 바꾸면 인터페이스를 구현한 `Hello`도 같이 바꿔야 한다. 인터페이스를 수정하면 구현 클래스가 모두 영향을 받는다는 노트 내용 그대로다.
- 퍼즐 게임은 눌린 칸이 빈칸과 이웃한지 검사하지 않아서, 어느 숫자를 눌러도 빈칸과 자리가 바뀐다. 이웃한 칸만 움직이게 하려면 `last`와 눌린 칸의 위치 차이를 검사해야 한다. 시작 버튼을 누르기 전에도 칸을 누를 수 있다.

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

- 인터페이스는 상수와 추상 메소드, `default`, `static`, `private` 메소드로 이루어진다. 구현하는 클래스는 추상 메소드를 모두 `public`으로 구현해야 한다.
- 클래스는 `implements`로 여러 인터페이스를 구현할 수 있고, 인터페이스끼리는 `extends`로 연결한다.
- 서로 다른 클래스를 인터페이스 하나로 묶으면 같은 메소드로 호출할 수 있고, 클래스 사이의 결합성이 낮아진다.
- 추상 클래스는 공통 기능을 모아서 재사용하고, 인터페이스는 기능을 설계하고 표준화한다.
- 클래스 변수에 상속 관계가 있는 객체만 담을 수 있다. 위로 올라가는 것은 자동이고, 내려가는 형변환은 실행할 때 오류가 날 수 있다.
- 가변 매개변수 `int... a`는 개수가 정해지지 않은 값을 배열로 받는다.

</details>

---

## 18일차 | 2026.11.04 (수) | Chapter 11. 예외처리

<details>
<summary><b>예외처리 개념 - 에러와 예외</b></summary>

<br>

- 예외처리는 프로그램을 실행하는 중에 생길 수 있는 에러에 대비하는 코드다. 비정상 종료를 막아서 프로그램의 정상 상태를 유지하는 것이 목적이다.
- 에러는 두 가지로 나뉜다. `Error`는 메모리 부족이나 윈도우 종료처럼 코드로 어쩔 수 없는 심각한 에러이고, `Exception`은 파일명, 경로, 서버 IP / PORT를 잘못 쓴 것처럼 소스에서 처리할 수 있는 가벼운 에러다.
- 예외처리를 한다고 에러가 저절로 고쳐지는 것은 아니다. 에러가 난 부분을 건너뛰고 프로그램을 계속 진행시키는 것이고, `if`로 미리 막는 것과 비슷하다.
- 2일차에 배운 컴파일(`javac`)과 실행(`java`) 두 단계 중 어디서 걸리는지로 예외의 종류가 나뉜다. 컴파일할 때 예외처리가 되어 있는지 확인하는 것이 CheckedException이고, 실행할 때 나는 것이 UnCheckedException이다.

**예외 처리 방법 (노트 정리)**
| 방법 | 형태 | 설명 |
|---|---|---|
| 예외 복구 (직접 처리) | `try ~ catch ~ finally` | 에러가 나면 catch에서 처리하고 finally에서 자원을 정리한다 |
| 예외 회피 (간접 처리) | 메소드 뒤에 `throws 예외클래스` | 처리를 호출한 쪽에 넘긴다 |
| 예외 발생 | `throw new 예외클래스()` | 테스트할 때나 사용자 정의 예외를 직접 발생시킨다 |
| 사용자 정의 | `class MyException extends Exception` | 직접 만든 예외 클래스 |

- 14일차에 이름만 적고 지나간 복구, 회피, 발생이 이 세 가지다. 이날 코드로 쓴 것은 복구(`try ~ catch ~ finally`)이고, 나머지는 다음 시간에 이어진다.

```java
for (int i = 1; i <= 10; i++)
{
    try
    {
        int a = (int)(Math.random() * 3);        // 0 ~ 2
        int val = i / a;
        System.out.println(i + ":" + val);
    }
    catch (Exception e) {}
}
```
- `a`가 0이면 `i / a`에서 `ArithmeticException`이 나고, catch로 이동해서 아무것도 하지 않고 다음 `i`로 넘어간다. try가 for 안에 있어서 한 번 실패해도 반복은 계속된다.
- 세 번 실행했더니 출력이 빠진 번호가 `1 2 3 8`, `2 7 9`, `3 7 9`로 매번 달랐다. `a`가 난수라서 어느 번호에서 0이 나올지 모른다. `7:3`처럼 정수끼리 나눈 결과는 몫만 나온다.

</details>

<details>
<summary><b>예외의 종류와 계층 구조</b></summary>

<br>

| 구분 | CheckedException | UnCheckedException |
|---|---|---|
| 확인 시점 | 컴파일할 때 예외처리가 되어 있는지 확인한다 | 확인하지 않는다 |
| 처리 | 반드시 한다 (`try ~ catch` 또는 `throws`) | 필요할 때만 한다 |
| 원인 | 개발자 실수. 파일 경로, 파일명, URL, IP / PORT를 잘못 쓴 경우 | 사용자 입력. 자주 에러가 나는 부분 |
| 패키지 | `java.io`, `java.net`, `java.sql` | `RuntimeException`의 자식들 |

| 예외 | 분류 | 언제 나는가 |
|---|---|---|
| `IOException` | Checked | 입출력. 파일 읽기, 쓰기, 네트워크 |
| `InterruptedException` | Checked | 쓰레드 (`Thread.sleep()` 등) |
| `MalformedURLException` | Checked | URL, 크롤링 |
| `ClassNotFoundException` | Checked | 리플렉션 (클래스 이름으로 제어) |
| `SQLException` | Checked | 데이터베이스 연동 |
| `ArrayIndexOutOfBoundsException` | UnChecked | 배열 범위 초과 |
| `NumberFormatException` | UnChecked | 문자열을 숫자로 바꿀 수 없을 때 |
| `ClassCastException` | UnChecked | 클래스 형변환 |
| `NullPointerException` | UnChecked | 메모리 할당 없이 사용 |
| `ArithmeticException` | UnChecked | 0으로 나눴을 때 |

```
Object
  Throwable                       예외처리의 최상위 클래스
    Error                         심각한 에러
    Exception
      (Checked)    IOException, InterruptedException, MalformedURLException, ...
      (UnChecked)  RuntimeException
                     ArrayIndexOutOfBoundsException, NumberFormatException,
                     ClassCastException, NullPointerException, ArithmeticException
```
- 6일차에 `Thread.sleep(1000)` 때문에 main에 `throws Exception`을 붙인 이유가 `InterruptedException`이 Checked라서다.
- UnChecked는 예외처리 없이도 컴파일이 된다. 그래서 노트에 "우선 `if`로 유효성 검사, 그다음 `try ~ catch`"라고 적었다.

</details>

<details>
<summary><b>예외를 직접 일으켜 보기 - 다섯 가지 UnChecked 예외</b></summary>

<br>

```java
public static void aaa(int a, int b)
{
    try
    {
        System.out.println(a / b);
    }
    catch (ArithmeticException ex)
    {
        ex.printStackTrace();
    }
}
// bbb(null), ccc(" 20"), ddd(), eee()도 같은 모양으로 try ~ catch
```

| 메소드 | try 안의 코드 | 결과 |
|---|---|---|
| `aaa(10, 0)` | `a / b` | `ArithmeticException`, 메시지 `/ by zero` |
| `bbb(null)` | `data.length()` | `NullPointerException`, `String.length()`를 호출할 수 없다는 메시지 |
| `ccc(" 20")` | `Integer.parseInt(num)` | `NumberFormatException`, 메시지 `For input string: " 20"` |
| `ddd()` | `int[] arr = new int[2]; arr[2] = 200;` | `ArrayIndexOutOfBoundsException`, 메시지 `Index 2 out of bounds for length 2` |
| `eee()` | `A a = new B(); B b = (B) a;` | 예외가 나지 않는다 |

- `printStackTrace()`는 예외 종류와 메시지, 에러가 난 위치를 `예외처리종류.java:41`처럼 줄 번호까지 보여 준다. `getMessage()`는 에러 문장만 돌려준다. 코드에는 `getMessage()`를 주석으로 남기고 `printStackTrace()`를 썼다.
- `ccc(" 20")`은 숫자 앞에 공백이 있어서 변환이 안 된다. 노트에 `"10" => " 10"(X)`로 적은 경우다. 입력값을 숫자로 바꾸는 일은 웹에서 한 번도 빠지지 않고 나온다고 노트에 적었다.
- `eee()`는 `ClassCastException`을 일으키려고 만든 메소드인데 `A a = new B();`로 실제 객체가 `B`라서 형변환이 성공한다. 주석 처리된 `A a = new A();`로 바꾸면 `class A cannot be cast to class B`가 난다. 17일차에 쓴 `B b = (B) new A();`와 같은 경우다.
- `fff() throws Exception`(Checked)과 `ggg() throws RuntimeException`(UnChecked)은 선언만 했다. main에서 `ggg()`는 try 없이 호출해도 컴파일된다.

</details>

<details>
<summary><b>try ~ catch ~ finally 실행 순서</b></summary>

<br>

```java
System.out.println("1");
System.out.println("2");
System.out.println("3");
try
{
    System.out.println("4");
    System.out.println("5");
    System.out.println(10 / 0);          // 여기서 에러
    System.out.println("7");             // 실행되지 않는다
}
catch (Exception ex)
{
    System.out.println("0으로 나눌 수 없습니다");
}
finally
{
    System.out.println("프로그램 정상 수행");
}
System.out.println("10");
System.out.println("프로그램 종료");
```
실행 결과
```
1
2
3
4
5
0으로 나눌 수 없습니다
프로그램 정상 수행
10
프로그램 종료
```
- `println(10 / 0)`은 출력하기 전에 값을 계산하다가 에러가 난다. 그래서 `5` 다음에 아무것도 찍히지 않고 바로 catch로 이동하고, 그 아래에 있는 `7`은 실행되지 않는다.
- catch가 끝나면 finally가 실행되고, 그다음 try 문 밖의 `10`과 `프로그램 종료`가 이어진다. 에러가 났어도 프로그램은 정상 종료한다.
- try로 감싸지 않으면 에러가 난 줄에서 프로그램이 멈춘다. 이 코드는 항상 0으로 나눠서 에러가 나는 경우만 확인했다. 에러가 나지 않을 때는 catch를 건너뛰고 finally가 실행된다고 노트에 적었다.

| 블록 | 역할 |
|---|---|
| `try` | 정상으로 수행하는 문장. 실수나 입력 문제로 에러가 날 수 있는 코드 |
| `catch (예외클래스 e)` | 에러가 났을 때 확인하고 복구한다. `printStackTrace()`로 에러 위치, `getMessage()`로 에러 문장 |
| `finally` | 에러가 나든 안 나든 무조건 실행한다. 파일, 서버, 데이터베이스 닫기 같은 자원 관리. 필요 없으면 생략한다 |

- try ~ catch는 코드 전체에 쓸 수도 있고 일부분에만 쓸 수도 있다.

</details>

<details>
<summary><b>다중 catch</b></summary>

<br>

```java
Scanner scan = new Scanner(System.in);
System.out.print("첫번째 문자 입력:");
String first = scan.next();
System.out.print("두번째 문자 입력:");
String second = scan.next();

int[] arr = new int[2];
try
{
    arr[0] = Integer.parseInt(first);
    arr[1] = Integer.parseInt(second);
    System.out.println(arr[0] / arr[1]);
}
catch (NumberFormatException e)
{
    System.out.println("정수 변환에 실패하였습니다");
}
catch (ArrayIndexOutOfBoundsException e)
{
    System.out.println("배열 범위 초과");
}
catch (Exception e)
{
    System.out.println(e.getMessage());
}
System.out.println("프로그램 종료");
```

| 입력 | 출력 | 잡은 catch |
|---|---|---|
| `10`, `2` | `5` | 없음 |
| `abc`, `2` | 정수 변환에 실패하였습니다 | `NumberFormatException` |
| `10`, `xyz` | 정수 변환에 실패하였습니다 | `NumberFormatException` |
| `3.5`, `2` | 정수 변환에 실패하였습니다 | `NumberFormatException` |
| `10`, `0` | `/ by zero` | `Exception` |

- 의심되는 에러가 여러 개일 때 쓴다. 이 코드는 문자열을 정수로 바꾸고, 배열에 저장하고, 나누는 세 곳이 의심된다.
- `3.5`도 `Integer.parseInt()`로는 바꿀 수 없어서 문자와 같은 결과가 나온다.
- `10`, `0`의 `ArithmeticException`은 앞의 두 catch에 해당하지 않아서 마지막 `Exception`이 받는다. 어느 경우든 catch는 하나만 실행되고, 마지막의 `프로그램 종료`는 항상 출력된다.
- 예외 클래스도 상속 관계라서 `Exception`이 부모다. 노트에 catch는 크기가 작은 것부터 쓴다고 적었다. 그래서 구체적인 예외를 먼저 쓰고 `Exception`은 맨 마지막에 둔다.

</details>

<details>
<summary><b>finally와 자원 관리 - 파일 읽기</b></summary>

<br>

```java
FileReader fr = null;
try
{
    fr = new FileReader("파일 경로");
    int i = 0;
    while ((i = fr.read()) != -1)         // -1 => EOF (파일의 끝)
    {
        System.out.print((char) i);
    }
}
catch (Exception ex)
{
    System.out.println(ex.getMessage());
}
finally
{
    try
    {
        if (fr != null)
            fr.close();
    }
    catch (Exception ex) {}
}
```
- 6일차에 배운 파일 읽기(`while ((i = fr.read()) != -1)`)에 예외처리를 붙인 코드다. 파일을 여는 `FileReader`는 Checked 예외라서 try ~ catch가 반드시 필요하다. 파일이 없을 수도 있고 경로를 잘못 쓸 수도 있기 때문이다.
- `FileReader fr`를 try 안에서 선언하면 finally에서 쓸 수 없다. 그래서 try 위에서 `null`로 만들어 두고 try 안에서 값을 넣는다.
- 파일이 없으면 `new FileReader()`에서 실패하고 `fr`은 `null`인 채로 finally에 온다. `fr.close()`를 바로 부르면 `NullPointerException`이라서 `if (fr != null)`로 검사한다. close도 예외가 날 수 있어서 try ~ catch를 한 번 더 감쌌다.
- 경로가 `C:\Users\sist33\...`로 되어 있다. 이 경로가 없는 컴퓨터에서 실행하면 catch로 가서 에러 메시지를 출력하고 끝난다. 실제 있는 파일 경로로 바꿔서 실행하면 파일 내용이 그대로 출력된다.

</details>

<details>
<summary><b>try-with-resources - finally 없이 자동으로 닫기</b></summary>

<br>

```java
try (FileReader fr = new FileReader("파일 경로"))
{
    int i = 0;
    while ((i = fr.read()) != -1)
    {
        System.out.print((char) i);
    }
    // fr.close() 필요 없음
}
catch (Exception ex)
{
    ex.printStackTrace();
}
```

| 구분 | finally 방식 | try-with-resources |
|---|---|---|
| 변수 선언 | try 위에서 `null`로 선언 | try 괄호 안에서 선언 |
| 닫기 | finally에서 `null` 검사 후 `close()` | 블록이 끝나면 자동으로 닫힌다 |
| 코드 양 | 길다 | 짧다 |

- 두 코드가 같은 파일을 읽어서, 읽은 내용이 원본 파일과 같게 출력되는 것을 확인했다. 파일 경로를 잘못 쓰면 `FileNotFoundException`이 `printStackTrace()`로 출력된다.
- 노트에는 "finally 없이 자동 닫기 => 파일에서 가능"이라고만 적었다. 파일 말고 어떤 것에 쓸 수 있는지는 아직 모른다.

</details>

<details>
<summary><b>숫자야구 게임 - 예외처리를 쓴 화면 프로그램</b></summary>

<br>

```java
public class 숫자야구게임 extends JFrame implements ActionListener
{
    JButton b1, b2, b3;               // 시작, 전송, 종료
    JTextField tf;                    // 숫자 입력 (한 줄)
    JTextArea ta;                     // 결과 기록
    private int[] com = new int[3];   // 컴퓨터가 정한 숫자
    private int[] user = new int[3];  // 사용자가 입력한 숫자
    int s, b;                         // 스트라이크, 볼
}
```
- 17일차 인터페이스에서 배운 `ActionListener`를 구현한 화면이다. 결과를 보여 주는 `JTextArea`는 `JScrollPane`에 넣어 가운데에 붙이고, 입력 칸과 버튼은 `JPanel`에 담아 아래에 붙였다. `ta.setEditable(false)`로 직접 수정은 막았고, 시작을 누르기 전에는 `tf.setEnabled(false)`로 입력도 막아 둔다.
- 변수 `com`, `user`는 `private`으로 감췄다. 14일차 캡슐화다.

**게임 흐름**
- 시작 버튼: `getRand()`로 컴퓨터 숫자 3개(1 ~ 9, 중복 없음)를 만들고, 입력 칸을 켜고, 시작 버튼은 끈다. 중복 없는 난수를 만드는 `i--`와 `break`는 8일차 로또, 17일차 퍼즐 게임과 같은 방식이다.
- 전송 버튼이나 입력 칸에서 엔터: 텍스트 필드에 `tf.addActionListener(this)`도 등록하고 `e.getSource() == tf || e.getSource() == b2`로 묶어서 엔터와 전송 버튼을 같게 처리한다.
- 종료 버튼: `dispose()`는 창의 메모리를 회수하고 `System.exit(0)`이 프로그램을 실제로 끝낸다.

**입력값 검사 (위에서부터 차례로)**
| 순서 | 검사 | 메시지 |
|---|---|---|
| 1 | `temp.trim().length() != 3` | 세자리 정수를 입력해야 됩니다 |
| 2 | `Integer.parseInt(temp)`에서 예외 | 잘못된 입력입니다 |
| 3 | 세 자리 중 같은 숫자가 있다 | 중복된 수는 사용할 수 없습니다 |
| 4 | 0이 들어 있다 | 0은 사용할 수 없습니다 |

```java
int input = 0;
try
{
    input = Integer.parseInt(temp);
}
catch (Exception ex)
{
    sendMessage("잘못된 입력입니다!!\n정수만 입력해야 됩니다");
    return;                                 // 예외 복구 : 처음으로 돌아간다
}
user[0] = input / 100;
user[1] = (input % 100) / 10;
user[2] = input % 10;
```
- `input`을 try 안에서 선언하면 try 밖에서 못 쓴다. 그래서 `0`으로 먼저 초기화한다. 주석에 "지역변수는 반드시 초기화"라고 적었다. 파일 읽기에서 `fr = null`로 둔 것과 같은 이유다.
- `return;`으로 메소드를 끝내면 그 아래의 판정은 실행되지 않는다. 입력이 잘못되면 메시지를 띄우고 다시 입력받는 구조다.
- 세 자리를 나누는 식은 4일차에 배운 자릿수 분리(`won / 100`, `(won % 100) / 10`, `won % 10`)와 같다.
- 메시지를 띄우고, 입력 칸을 비우고, 커서를 돌려 놓는 세 줄이 반복되어서 `sendMessage(String msg)` 메소드로 뺐다. 11일차에 배운 반복 제거다.

**스트라이크와 볼 판정**
```java
for (int i = 0; i < 3; i++)
{
    for (int j = 0; j < 3; j++)
    {
        if (com[i] == user[j])
        {
            if (i == j) s++;       // 같은 숫자, 같은 자리
            else        b++;       // 같은 숫자, 다른 자리
        }
    }
}
String msg = String.format("Input Number:%d,Result:%dS-%dB\n", input, s, b);
ta.append(msg);
```
정답이 `123`일 때 코드의 판정식으로 확인한 결과
| 입력 | 결과 |
|---|---|
| `123` | 3S-0B |
| `321` | 1S-2B |
| `134` | 1S-1B |
| `231` | 0S-3B |
| `456` | 0S-0B |

- `s == 3`이면 `showConfirmDialog()`로 종료할지 묻는다. 예는 `dispose()`와 `System.exit(0)`, 아니오는 기록과 입력 칸을 비우고 `getRand()`로 새 숫자를 만든다. 17일차 퍼즐 게임과 같은 방식이다.
- `getRand()`를 20만 번 호출해서 같은 숫자가 나온 경우도 1 ~ 9 밖의 숫자가 나온 경우도 없는 것을 확인했다.

**이벤트 인터페이스 정리 (주석)**
| 인터페이스 | 쓰는 곳 | 메소드 |
|---|---|---|
| `ActionListener` | 버튼, 메뉴, 텍스트 필드 | `actionPerformed()` |
| `MouseListener` | 테이블, 트리, 이미지 | `mouseClicked()`, `mousePressed()`, `mouseReleased()`, `mouseEntered()`, `mouseExited()` |
| `KeyListener` | 키보드 | `keyTyped()`, `keyPressed()`, `keyReleased()` |
| `ItemListener` | 콤보박스, 리스트 | `itemStateChanged()` |

- 주석에 리턴형과 매개변수 유무에 따른 네 가지 메소드 유형, 호출 흐름도 정리해 두었다. 11일차 내용과 같다.

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| 예외처리 개념, 에러와 예외, 처리 방법 네 가지, 예외 계층 구조 정리 (주석) |
| 0으로 나누는 for문을 try 안에 넣고 빈 catch로 건너뛰기 (3번 실행해서 비교) |
| `ArithmeticException`, `NullPointerException`, `NumberFormatException`, `ArrayIndexOutOfBoundsException`, `ClassCastException`을 메소드 하나씩 만들어 try ~ catch |
| Checked, UnChecked 선언 메소드 `fff()`, `ggg()` |
| try, catch, finally가 실행되는 순서를 번호를 찍어서 확인 |
| 두 수를 입력받아 나누기, 다중 catch 세 개 |
| `FileReader`로 파일을 읽고 finally에서 닫기 |
| try-with-resources로 같은 파일 읽기 |
| 숫자야구 게임 (`JFrame`, `ActionListener`, 입력값 검사, 스트라이크와 볼 판정) |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- `예외처리종류.java`의 `eee()`는 `A a = new B();`라서 `ClassCastException`이 나지 않는다. `//A a=new A();`의 주석을 풀고 `new B()` 줄을 막아야 예외가 난다.
- `예외처리종류.java`에서 Checked 예외를 던지는 `fff()`는 선언만 하고 호출하지 않았다. 호출하면서 `try ~ catch`나 `throws`를 쓰지 않으면 어떤 컴파일 오류가 나는지 확인할 것.
- `예외처리_다중처리.java`의 `ArrayIndexOutOfBoundsException` catch는 배열 길이가 2이고 인덱스 0, 1만 써서 실행될 일이 없다. 이 예외를 일으키려면 배열 크기나 인덱스를 바꿔야 한다.
- `예외처리_개념.java`는 catch가 `{}`로 비어 있어서 어느 `i`에서 0으로 나눴는지 알 수 없다. `e.getMessage()`를 출력하면 `/ by zero`를 볼 수 있다.
- `예외처리_finally_사용.java`, `예외처리_자원자동화처리.java`는 파일 경로가 학원 PC의 `C:\Users\sist33\...`로 고정되어 있다. 다른 컴퓨터에서는 파일을 찾지 못한다. 6일차에 적은 문제와 같다. 상대 경로나 프로젝트 안의 파일로 바꿀 것.
- `숫자야구게임.java`는 길이 검사에는 `temp.trim()`을 쓰고 `Integer.parseInt(temp)`에는 `trim()`하지 않은 값을 넣는다. 앞이나 뒤에 공백이 있는 ` 123`은 길이 검사는 통과하고 `parseInt`에서 `NumberFormatException`이 나서 "잘못된 입력입니다"가 뜬다. `예외처리종류.java`의 `ccc(" 20")`과 같은 경우이고, `Integer.parseInt(temp.trim())`으로 바꾸면 된다.
- `숫자야구게임.java` 주석에 초기화 순서가 `기본 => 명시적 => static {} => {} => 생성자`로 적혀 있다. 이 파일에는 초기화 블록이 없어서 순서를 실행으로 확인하지 못했다. 13일차에 남긴 초기화 순서 확인과 같은 질문이다.
- 14일차 README에 적은 `MovieSystem`의 `static` 블록은 `fr.close()`가 try 안에 있다. 읽는 도중에 예외가 나면 close를 건너뛴다. 이번에 배운 finally나 try-with-resources로 바꿀 수 있는지 확인할 것.

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

- 예외처리는 비정상 종료를 막기 위한 것이다. 에러를 고쳐 주는 것이 아니라 에러가 난 부분을 건너뛰고 프로그램을 계속 진행시킨다.
- `Error`는 코드로 처리하기 어려운 심각한 에러, `Exception`은 처리할 수 있는 가벼운 에러다. 컴파일 때 처리 여부를 확인하는 Checked 예외는 반드시 처리하고, 실행 중에 나는 UnChecked 예외(`RuntimeException`)는 필요할 때 처리한다. UnChecked는 `if`로 먼저 막고 안 되면 `try ~ catch`를 쓴다.
- `try`에는 에러가 날 수 있는 코드를, `catch`에는 에러 확인과 복구(`printStackTrace()`, `getMessage()`)를, `finally`에는 에러와 상관없이 실행할 자원 정리를 쓴다.
- 에러가 나면 try 안의 나머지 문장은 건너뛰고 catch, finally, try 밖의 순서로 이어진다.
- catch는 여러 개 쓸 수 있고, 구체적인 예외를 먼저, 부모인 `Exception`은 마지막에 쓴다. 하나가 잡히면 나머지는 건너뛴다.
- 파일처럼 닫아야 하는 자원은 try 밖에서 `null`로 선언하고 finally에서 `null`을 검사한 뒤 닫거나, try-with-resources로 자동으로 닫는다.
- `Integer.parseInt()`처럼 입력값을 바꾸는 코드는 try ~ catch로 감싸서 잘못된 입력에서 처음으로 돌아가게 만든다. 숫자야구 게임이 그 예다.

</details>

---

## 19일차 | 2026.11.05 (목) | Chapter 10. 중첩 클래스, Chapter 11. 예외처리 (throws, throw), 1권 정리

<details>
<summary><b>중첩 클래스 개념과 종류</b></summary>

<br>

- 클래스 안에 클래스를 만드는 것이 중첩 클래스다. 두 클래스가 변수와 메소드를 공통으로 쓰는 경우에 쓴다. 노트에는 네트워크, 쓰레드, 윈도우에서 쓰고 웹에서는 사용 빈도가 없다고 적었다.
- 장점은 다른 클래스와 연결해서 쓰기 쉽고 코드의 복잡성이 줄어드는 것이다. 단점은 객체 생성이 어렵다는 것이다.
- 서버와 클라이언트가 예다. `Server` 안에 접속자 정보를 저장하는 변수가 있고, 통신을 맡는 `Client extends Thread`를 안에 둔다. 윈도우도 `JFrame` 안에 게임을 돌리는 `Thread` 클래스를 둔다.

| 종류 | 위치 | 설명 |
|---|---|---|
| 인스턴스 멤버 클래스 | 클래스 안, 메소드 밖 | 바깥 클래스의 변수, 메소드를 마음대로 쓴다. 바깥 객체를 만들고 나서 만든다 |
| 정적(static) 멤버 클래스 | 클래스 안, 메소드 밖, `static` | 바깥 객체 없이 만든다 |
| 지역 클래스 | 메소드 안 | 그 메소드 안에서만 쓴다. 사용 빈도가 거의 없다 (노트에 콜백, 람다식이라고 적음) |
| 익명 클래스 | 변수에 객체를 넣는 자리 | 이름 없이, 상속 없이 오버라이딩한다 |

```java
Outer p = new Outer();
Outer.Inner c = p.new Inner();           // 인스턴스 멤버 : 바깥 객체 p가 있어야 한다

Outer2.Inner c1 = new Outer2.Inner();    // 정적 멤버 : 바깥 객체 없이 만든다
```

</details>

<details>
<summary><b>중첩 클래스 다섯 가지 직접 만들기</b></summary>

<br>

```java
class Outer                               // 인스턴스 멤버
{
    private String name = "홍길동";
    class Inner
    {
        int a = 10;
        public void print() { System.out.println(a + ":" + name); }
    }
}
class Outer2                              // 정적 멤버
{
    static class Inner
    {
        public void print() { System.out.println("static Inner:print() Call..."); }
    }
}
class Outer3                              // 지역 클래스
{
    public void print()
    {
        class Inner
        {
            public void print() { System.out.println("지역클래스:Inner:print() Call..."); }
        }
        Inner i = new Inner();
        i.print();
    }
}
class Inner                               // 익명 클래스에서 부모가 되는 클래스
{
    public void print() { System.out.println("Inner:print() Call..."); }
}
class Outer4                              // 익명 클래스
{
    Inner in = new Inner()
    {
        public void print() { System.out.println("Outer4에서 print() 오버라이딩됨"); }
    };
}
```
실행 결과
```
****======= 인스턴스 멤버 ======
10:홍길동
======= 정적 멤버 ========
static Inner:print() Call...
======= 지역 클래스 ========
지역클래스:Inner:print() Call...
****======= 익명의 클래스 ======
Inner:print() Call...
Outer4에서 print() 오버라이딩됨
value=30
value=20
value=10
```
- 인스턴스 멤버 `Outer.Inner`는 `private`인 `name`을 `Inner`가 바로 읽는다. 14일차에 `private` 변수는 같은 클래스 밖에서 접근할 수 없다고 배웠는데, 안쪽 클래스는 바깥 클래스 안에 있어서 읽힌다.
- 정적 멤버는 `new Outer2.Inner()`처럼 바깥 객체 없이 만든다. 바깥 객체가 필요한 인스턴스 멤버의 `p.new Inner()`와 다르다.
- 익명 클래스는 `Inner`를 상속한 클래스를 따로 만들지 않고, 변수에 넣는 자리에서 `print()`를 바로 오버라이딩한다. 15일차 오버라이딩에서 `extends`로 자식 클래스를 만들던 것을 이름 없이 한 자리에서 하는 것이다. `Outer4`의 `in.print()`는 `Inner`가 아니라 오버라이딩한 메소드가 실행된다.
- 같은 이름 `Inner`가 여러 개 있다. `Outer5` 안에서 `new Inner()`는 `Outer5` 안의 `Inner`를 가리켜서 컴파일되고 `method()`도 호출된다.
- 컴파일하면 안쪽 클래스도 따로 `.class` 파일이 만들어진다. `Outer$Inner.class`, `Outer2$Inner.class`, 지역 클래스는 `Outer3$1Inner.class`, 익명 클래스는 `Outer4$1.class`다.

**이름이 같은 변수 세 개 (Outer5)**
```java
class Outer5
{
    int value = 10;
    public void display() { Inner i = new Inner(); i.method(); }
    class Inner
    {
        int value = 20;
        public void method()
        {
            int value = 30;
            System.out.println("value=" + value);                // 30
            System.out.println("value=" + this.value);           // 20
            System.out.println("value=" + Outer5.this.value);    // 10
        }
    }
}
```
- 13일차에 배운 "지역변수가 우선, `this`는 자기 객체의 변수" 규칙에 하나가 더 붙었다. 바깥 클래스의 변수는 `Outer5.this.value`로 읽는다.

</details>

<details>
<summary><b>화면에서 쓴 중첩 클래스 - 익명 클래스와 멤버 클래스</b></summary>

<br>

**익명 클래스 - 수정할 수 없는 표**
```java
model = new DefaultTableModel(row, col)
{
    @Override
    public boolean isCellEditable(int row, int column)
    {
        return false;                    // 셀을 직접 수정하지 못하게 한다
    }
};
table = new JTable(model);
```
- 15일차에 `MusicList`에서 쓴 `JTable`과 `DefaultTableModel`이다. `DefaultTableModel`의 `isCellEditable()` 하나만 바꾸려고 자식 클래스를 따로 만들지 않고 `new` 하는 자리에서 오버라이딩했다. 한 번만 쓰니까 일회성이라 익명 클래스를 쓴다. 메소드를 추가하는 것도 된다고 주석에 적었다.
- 열은 아이디, 이름, 성별이고, `new String[0][3]`으로 빈 표를 만들고 `model.addRow(arr)`로 `admin / 홍길동 / 남자` 한 줄을 넣었다.
- 컴파일하면 익명 클래스 파일 `중첩클래스$1.class`가 만들어진다. 화면은 실행하지 못했고 코드를 읽고 쓴 설명이다.

**멤버 클래스 - 막대가 차오르는 화면**
```java
public class 중첩클래스_2 extends JFrame implements ActionListener
{
    JProgressBar[] bar = new JProgressBar[5];

    public void go()
    {
        for (int n = 0; n < bar.length; n++)
        {
            for (int i = 0; i <= 100; i++)
            {
                bar[n].setValue(i);
                try { Thread.sleep(100); } catch (Exception e) {}
            }
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b1)
        {
            BarThread b = new BarThread();
            b.start();
        }
    }

    class BarThread extends Thread
    {
        public void run() { go(); }
    }
}
```
- `BarThread`가 `중첩클래스_2` 안에 있는 멤버 클래스다. 그래서 바깥 클래스의 `go()`를 `run()`에서 바로 부른다. 노트에 쓴 "쓰레드 + 윈도우" 조합이 이 모양이다. 컴파일하면 `중첩클래스_2$BarThread.class`가 만들어진다.
- 시작 버튼을 누르면 `BarThread`를 만들어 `start()`를 부르고, `run()` 안에서 `go()`를 호출한다. 쓰레드의 동작 원리는 아직 배우지 않아서 이 코드는 노트와 형태만 따라 썼다.
- `Thread.sleep(100)`은 `InterruptedException`(Checked)이라서 try ~ catch로 감쌌다. 6일차에는 main에 `throws Exception`을 붙여서 넘겼는데 이번에는 직접 처리했다.
- `go()`는 바깥 for가 막대를 하나씩 돌아서 5개가 동시에 차는 것이 아니라 차례로 찬다. 막대 하나가 `sleep(100)`을 101번 해서 약 10초, 전체 약 50초다. 이 화면도 실행하지 못했고 코드를 읽고 쓴 설명이다.

</details>

<details>
<summary><b>예외 회피 throws와 예외 발생 throw</b></summary>

<br>

**throws - 예외를 넘긴다**
```java
void method() throws IOException { }

void method1()
{
    try { method(); }
    catch (IOException i) { }            // 직접 처리한다
}

void method2() throws IOException
{
    method();                            // 처리하지 않고 다시 넘긴다
}
```
- `throws`는 예외를 처리하는 것이 아니라 "이 메소드는 예외가 발생할 수 있다"고 알려 주고 처리를 호출한 쪽에 넘기는 것이다. 복구가 불가능하면 건너뛴다. 예외 떠넘기기라고 노트에 적었다.
- 형식은 `method() throws 예외클래스, 예외클래스...`이고 순서는 상관없다. Checked 예외를 선언한 메소드를 쓰려면 `try ~ catch`로 처리하거나 자기도 `throws`로 다시 넘겨야 한다.
- 라이브러리 메소드에 주로 나온다. `Thread.sleep(long m) throws InterruptedException`이 그 예다. 6일차에 main에 붙인 `throws Exception`이 바로 이 회피이고, main이 넘긴 예외는 JVM이 받는다.
- 노트에는 소스가 복잡한 경우나 이미 만들어진 소스에서 쓴다고 적었고, 가장 많이 쓰는 예외처리는 `try ~ catch`로 에러를 복구하는 것이라고 적었다.
- UnChecked 예외인 `throws RuntimeException`은 호출하는 쪽에서 처리하지 않아도 된다.

**throw - 예외를 일부러 발생시킨다**
```java
public static void main(String[] args) throws Exception
{
    Scanner s = new Scanner(System.in);
    System.out.print("정수 입력:");
    int a = s.nextInt();
    try
    {
        if (a % 2 == 0)
        {
            System.out.println("예외를 임의의로 발생");
            throw new Exception("홀수만");
        }
    }
    catch (Exception ex)
    {
        System.out.println(ex.getMessage());
    }
}
```

| 입력 | 출력 |
|---|---|
| `4`, `0`, `-2` | `예외를 임의의로 발생` 다음 줄에 `홀수만` |
| `3`, `-3`, `7` | 아무것도 출력되지 않는다 |
| `abc` | `InputMismatchException`이 출력되고 프로그램이 끝난다 |

- `throw new Exception("홀수만")`을 만나면 바로 catch로 이동하고, `ex.getMessage()`가 생성자에 넣은 `홀수만`을 꺼낸다. 에러가 실제로 나지 않아도 일부러 예외를 만들어서 catch를 테스트할 수 있다. 짝수를 에러로 취급하는 코드다. `-3 % 2`는 `-1`이라서 `0`이 아니다. 4일차에 배운 나머지의 부호 규칙이다.
- `abc`는 `s.nextInt()`에서 나는 `InputMismatchException`이다. 이 줄이 try 밖에 있어서 catch가 잡지 못하고, 예외가 JVM까지 올라가서 프로그램이 끝난다.
- 사용자 정의 예외는 JVM이 알지 못해서 `throw`로 직접 던져야 한다. 노트에는 `class MyException extends Exception { public MyException(String msg) { super(msg); } }` 형태만 주석으로 적었고 실제 클래스는 만들지 않았다.
- `display()`는 `throws Throwable, IOException, ClassNotFoundException, InterruptedException`으로 선언만 하고 호출은 주석 처리했다. `RuntimeException < Exception < Throwable`, `IOException < Exception < Throwable`라고 주석에 적었다.

| 키워드 | 역할 |
|---|---|
| `try` | 예외가 발생할 수 있는 코드를 넣는다 |
| `catch` | 발생한 예외를 처리한다 |
| `finally` | 자원을 정리한다 (닫기) |
| `throw` | 예외를 직접 발생시킨다 |
| `throws` | 예외 처리를 호출한 곳에 넘긴다 |

</details>

<details>
<summary><b>예외처리 정리 - 에러 원인과 처리 기준</b></summary>

<br>

- 에러가 나는 원인은 두 가지다. 프로그래머의 실수(초기값이 없는 상태, 배열 인덱스 오류, 무한 루프, 파일명 / URL / IP)와 사용자 오류(입력, 유효성 검사)다. 예외처리를 하면 비정상 종료를 막고 견고한 프로그램이 된다.
- 처리할 때는 `if`문을 먼저 생각한다. 멤버 변수는 명시적 초기화로 값을 먼저 넣고, `if`로 처리할 수 없을 때 예외처리를 쓴다.
- 예외는 프로그램에 돌발적으로 생기는 의도하지 않은 상황이다. 사전에 막아서 정상으로 수행하게 하는 것이 목적이다.
- 노트에 try 안에 for를 넣는 경우와 for 안에 try를 넣는 경우를 나란히 적었다. 18일차 `i / a` 코드가 for 안에 try를 둔 경우여서, 한 번 실패해도 다음 반복으로 넘어갔다.
- catch를 여러 개 쓸 때는 크기가 작은 것부터 쓴다. 18일차 다중 catch 내용과 같다.

</details>

<details>
<summary><b>1권 정리 - 이것이 자바다 1 ~ 11장</b></summary>

<br>

**자바 코딩의 구성 (1장)**
```java
package 패키지명;            // 자신의 저장 위치
import 클래스;               // 다른 클래스를 쓰려고 불러온다. 여러 개 가능
public class ClassName
{
    변수 (static, instance)
    생성자
    메소드
    main()                   // 프로그램의 시작점
}
```
- 한 파일에 클래스를 여러 개 쓸 수 있고, `public` 클래스는 하나만 쓴다. 자바 파일명과 `public` 클래스 이름은 같아야 한다. 이번에 쓴 중첩클래스 파일처럼 한 파일에 클래스가 여러 개 있고 `public`은 파일 이름과 같은 하나뿐이다.
- 실행은 `A.java`를 `javac`로 컴파일해서 `A.class`를 만들고, `java`(인터프리터)가 JVM에서 실행한다. 2일차 내용과 같다.
- 주의점: 필요한 곳에 주석을 쓴다, 명령문이 끝나면 `;`을 찍되 제어문 뒤에는 찍지 않는다, 변수와 메소드는 소문자로 시작하고 클래스, 인터페이스, 추상 클래스, enum은 대문자로 시작하고 상수는 모두 대문자로 쓴다, 단어가 두 개면 두 번째 단어의 첫 글자를 대문자로 쓴다(`fileName`), 들여쓰기를 한다, JDK는 21 버전을 설치한다.

**데이터형과 변수 (2장)**
- 변수는 한 개의 데이터를 저장하는 메모리 공간의 이름이다. 데이터형은 메모리 크기를 정한다.
- 정수 `byte` / `int` / `long`, 실수 `float` / `double`, 문자 `char`, 논리 `boolean`이다. 크기는 `byte < char < int < long < double`이다. 17일차 총정리에 쓴 내용과 같다.

**장별로 정리한 일차 (README 제목의 Chapter 기준)**
| 이것이 자바다 | 내용 | 정리한 일차 |
|---|---|---|
| 1장 | 자바 실행 과정, 코딩 구성 | 2일차 |
| 2장 | 데이터형, 변수 | 3일차 |
| 3장 | 연산자 | 4일차 |
| 4장 | 제어문 | 5 ~ 7일차 |
| 5장 | 참조타입 (문자열, 배열), 메소드 | 7 ~ 12일차 |
| 6장 | 객체지향 프로그램 (클래스, 생성자, 상속) | 13 ~ 15일차 |
| 7장 | 클래스의 종류 (다형성, 추상 클래스) | 16일차 |
| 8장 | 인터페이스 | 17일차 |
| 9장 | 모듈 | 노트에 (X)로 적음 |
| 10장 | 중첩 클래스 | 19일차 |
| 11장 | 예외처리 | 17 ~ 19일차 |

**2권 계획 (노트)**
- 자바 라이브러리: `java.lang`, `java.util`, `java.io`, `java.net`, `java.sql`, `java.text`, `java.lang.reflect`, `java.util.regex`
- 컬렉션, 람다식, 입출력, SQL 순서다. 17일차에 컬렉션 인터페이스 `List`, `Set`, `Map`을 미리 봤다.

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| 중첩 클래스 개념, 종류, 장단점 정리 (주석) |
| 인스턴스 멤버, 정적 멤버, 지역, 익명 클래스를 하나씩 만들고 출력 |
| `Outer5`로 지역변수, `this.value`, `Outer5.this.value` 구분 |
| `DefaultTableModel`을 익명 클래스로 만들어 셀 수정 막기, 표에 한 줄 추가 |
| `JProgressBar` 5개와 `Thread`를 상속한 멤버 클래스 `BarThread`로 막대 채우기 |
| `throws` 선언 메소드와 `main throws Exception` |
| `throw new Exception("홀수만")`으로 짝수 입력 시 예외를 일부러 발생 |
| throws, throw, try, catch, finally 역할 정리 (주석) |
| 이것이 자바다 1권 1 ~ 11장 정리 (1장, 2장 상세, 3 ~ 11장 목차) |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- `중첩클래스_2.java`는 시작 버튼을 누른 뒤에도 `b1`을 끄지 않는다. 다시 누르면 `BarThread`가 하나 더 시작되어 같은 막대를 두 쓰레드가 채울 것으로 보인다. 18일차 `숫자야구게임.java`의 `b1.setEnabled(false)`처럼 끄는 방법을 쓸 것. 코드를 읽고 쓴 것이고 화면은 실행하지 못했다.
- `중첩클래스_2.java`의 `go()`는 막대 5개를 차례로 채운다. 동시에 채우려면 막대마다 쓰레드가 필요한지는 아직 모른다. `Thread.sleep(100)`의 catch는 `Exception`으로 비어 있다.
- `예외처리_1.java`의 `MyException`은 주석 안에만 있다. 직접 클래스를 만들고 `throw new MyException("...")`으로 던져서 catch가 받는지 확인할 것.
- `예외처리_1.java`는 `s.nextInt()`가 try 밖에 있어서 `abc`를 입력하면 `InputMismatchException`으로 프로그램이 끝난다. try 안으로 옮기고 18일차 다중 catch처럼 `InputMismatchException` catch를 추가할 것.
- `예외처리_1.java`에서 홀수를 입력하면 아무것도 출력되지 않아 입력이 통과했는지 알 수 없다.
- `예외처리_1.java`의 `display()` 호출은 주석 처리되어 있다. `Throwable`을 던진다고 선언한 메소드를 `main throws Exception`만으로 호출해도 되는지, 주석의 `catch(Throwable e)`가 필요한지 주석을 풀어 확인할 것. 출력 문구 `예외를 임의의로 발생`도 오타다.
- `자바_1장.java`는 1장과 2장만 자세히 정리했고 3 ~ 11장은 목차 한 줄씩이다. 장별로 이어서 채울지 정할 것.

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

- 중첩 클래스는 클래스 안의 클래스이고 바깥 클래스의 변수, 메소드를 같이 쓸 때 편하다. 인스턴스 멤버는 `바깥객체.new Inner()`, 정적 멤버는 `new Outer.Inner()`로 만든다.
- 익명 클래스는 상속 없이 만드는 자리에서 바로 오버라이딩한다. 한 번만 쓰는 클래스에 맞다.
- 이름이 같은 변수가 겹치면 지역변수, `this.value`, `Outer.this.value` 순서로 구분해서 읽는다.
- `throws`는 예외를 처리하지 않고 호출한 쪽에 넘기는 선언이다. `Thread.sleep()` 같은 라이브러리 메소드는 `throws InterruptedException`을 달고 있어서 `try ~ catch`로 감싸거나 다시 `throws`로 넘긴다.
- `throw`는 예외를 일부러 발생시켜서 catch로 보내는 것이고, 사용자 정의 예외는 `throw`로 직접 던진다.
- 예외처리를 쓰기 전에 `if`로 막을 수 있는지 먼저 생각한다. 가장 많이 쓰는 방식은 `try ~ catch`로 복구하는 것이다.
- 1권은 1장 자바 실행 과정부터 11장 예외처리까지 한 번 훑었다. 2권은 라이브러리, 컬렉션, 람다식, 입출력, SQL 순서로 노트에 적어 두었다.

</details>

---

## 20일차 | 2026.11.06 (금) | Chapter 12. 라이브러리 (java.lang, Object 클래스)

<details>
<summary><b>라이브러리와 java.lang</b></summary>

<br>

- 라이브러리는 자바가 미리 만들어서 제공하는 클래스 모음이다. 모든 개발자가 같은 방식으로 쓰도록 표준화되어 있다.
- 라이브러리를 볼 때는 아래 여섯 가지를 확인한다. 이 여섯 가지가 모인 것이 메소드 원형이다.

| 확인할 것 | 내용 |
|---|---|
| 패키지 | 어느 패키지에 있는가 |
| 클래스명 | 무슨 역할을 하는 클래스인가 |
| 메소드명 | 무슨 기능인가 |
| 리턴형 | 결과값이 무엇인가 |
| 매개변수 | 어떤 값을 줘야 하는가 |
| 예외처리 | 반드시 예외처리해야 하는가 |

- `java.lang`은 프로그램에서 가장 많이 쓰는 기본 클래스 모음이고 `import`를 생략할 수 있다.

| 클래스 | 역할 |
|---|---|
| `Object` | 모든 클래스의 최상위 클래스 |
| `String` | 문자열 저장, 문자열 제어 (`char[]`을 다룬다) |
| `StringBuffer`, `StringBuilder` | 문자열을 빠르게 만드는 클래스 (비동기 / 동기화 차이) |
| Wrapper | 기본형을 클래스로 만든 것 (`int`는 `Integer`, `long`은 `Long`, `double`은 `Double`, `float`는 `Float`, `boolean`은 `Boolean`) |
| `Math` | 수학 관련 |
| `System` | 화면 출력, 키보드 읽기, 동작 시간, 가비지 컬렉션 |

- 다른 패키지도 노트에 적어 두었다. `java.util`, `java.text`, `java.io`, `java.net`, `java.sql`까지가 J2SE(기본 라이브러리)이고, J2EE는 웹 사이트용, Spring은 그 위의 라이브러리다.

</details>

<details>
<summary><b>Object 클래스와 주요 메소드</b></summary>

<br>

- 모든 클래스는 `Object`를 상속받는다. `extends Object`를 쓰지 않아도 상속받는 것으로 노트에 적었다. 그래서 `Object`가 가진 메소드를 어떤 클래스에서든 쓸 수 있다. 16일차에 정리한 "모든 클래스는 `Object`를 상속받는다"가 이 내용이다.

| 메소드 | 역할 |
|---|---|
| `finalize()` | 소멸자. 객체 메모리를 해제한다 |
| `clone()` | 객체 복제. 같은 값을 가진 새 메모리를 만든다 |
| `toString()` | 객체를 문자열로 바꾼다. 오버라이딩을 가장 많이 하고 생략할 수 있다 |
| `getClass()` | 객체의 클래스 정보를 얻는다 |
| `equals()` | 객체를 비교한다 |
| `hashCode()` | 객체 구분자 |

```java
class A
{
    String name;
    public A(String name)
    {
        this.name = name;
    }
}

A a = new A("홍길동");
A b = new A("홍길동");
System.out.println(a.hashCode() + "," + a);
System.out.println(b.hashCode() + "," + b);
if (a.equals(b)) System.out.println("같다");
else System.out.println("다르다");
```

```
366712642,com.sist.lang.A@15db9742
644117698,com.sist.lang.A@266474c2
다르다
```

- 이름이 같아도 `new`를 두 번 했으니 서로 다른 메모리에 만들어진다. `hashCode()` 값이 다르고 `equals()`는 `다르다`가 나온다. 오버라이딩하기 전의 `equals()`는 주소를 비교한다.
- `toString()`을 오버라이딩하지 않으면 `클래스명@해시값`이 나온다. `15db9742`는 `hashCode()` 값 `366712642`를 16진수로 바꾼 것이다. 12일차에 객체를 그대로 출력했을 때 `Student@2ff4acd0`이 나온 것도 같은 이유다.
- `hashCode()` 값과 주소는 실행할 때마다 달라질 수 있어서 위 숫자는 한 번 실행한 결과다.

</details>

<details>
<summary><b>소멸자 finalize()와 gc()</b></summary>

<br>

```
객체 생성        객체 활용         주소 삭제        소멸 확인
new Main(100)    m.display()       m = null         finalize()
```

```java
class Main
{
    private int a = 10;
    public Main(int a)
    {
        this.a = a;
        System.out.println("Main클래스 메모리 할당...(객체 생성)");
    }
    public void display()
    {
        System.out.println("Main:display() Call.. 객체활용");
    }
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Main 객체 메모리 해제 : 객체 소멸");
    }
}

Main m = new Main(100);
m.display();
m = null;
System.gc();
```

```
Main클래스 메모리 할당...(객체 생성)
Main:display() Call.. 객체활용
Main 객체 메모리 해제 : 객체 소멸
```

- 12일차에 정리한 객체 생성, 활용, 소멸, 메모리 해제 순서를 `finalize()`로 눈으로 확인한 것이다.
- `m = null`로 주소 값을 지우면 `Main` 객체를 가리키는 변수가 없어진다. `System.gc()`로 가비지 컬렉션을 부르면 `finalize()`가 호출되고 마지막 줄이 출력된다.
- 노트에는 생성자 `A()`의 반대가 소멸자 `~A()`이고, 자바에서는 이것이 `finalize()`라고 적었다.

</details>

<details>
<summary><b>객체 복제 clone()</b></summary>

<br>

```java
class Sawon implements Cloneable
{
    private int sabun;
    private String name;
    private String dept;
    // Getter, Setter, print() 생략

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public static void main(String[] args) throws Exception
{
    Sawon hong = new Sawon();
    hong.setSabun(1);
    hong.setName("홍길동");
    hong.setDept("개발부");

    Sawon shim = (Sawon) hong.clone();   // 복제
    Sawon kim = shim;                    // 대입

    kim.setName("김두한");
    kim.setDept("총무부");
    kim.setSabun(2);
    kim.print();
    shim.print();
}
```

- 복제하는 순서는 세 단계다. 클래스에 `implements Cloneable`을 붙이고, `clone()`을 오버라이딩해서 `super.clone()`을 돌려주고, 쓰는 쪽에서 `(Sawon)`으로 형변환한다.
- `clone()`은 반환형이 `Object`라서 형변환이 필요하고, `CloneNotSupportedException`을 던진다고 선언되어 있어서 `main throws Exception`으로 넘겼다. 19일차에 배운 `throws`다.
- 출력으로 확인한 것은 아래 세 가지다.

| 비교 | 결과 |
|---|---|
| `hong`과 `shim` (복제) | 값은 같고 주소는 다르다 |
| `shim`과 `kim` (대입) | 주소가 같다 |
| `kim`의 값을 바꾼 뒤 `shim`을 출력 | `shim`도 `2 / 김두한 / 총무부`로 바뀐다 |

- 복제는 새 메모리를 만들고, 대입(`kim = shim`)은 같은 메모리에 이름을 하나 더 붙이는 것이다.
- 노트에 스프링의 `prototype`이 객체를 복제하는 방식이라고 적었다.

</details>

<details>
<summary><b>참조형을 메소드에 넘길 때</b></summary>

<br>

```java
class Member
{
    // mno, name, address, Getter, Setter, print() 생략
    public void memberUpdate(Member m)   // Member m = mm
    {
        m.setMno(1);
        m.setName("홍길동");
        m.setAddress("서울시 마포구");
    }
}

public static void arrayUpdate(int[] arr)   // arr = a
{
    for (int i = 0; i < arr.length; i++)
    {
        arr[i] = (int) (Math.random() * 100) + 1;
    }
    for (int i : arr) System.out.print(i + " ");
}

Member mm = new Member();
mm.memberUpdate(mm);
mm.print();

int[] a = new int[5];
arrayUpdate(a);
for (int i : a) System.out.print(i + " ");
```

```
======= 회원 정보 ======
회원번호:1
이름:홍길동
주소:서울시 마포구
100 88 34 52 97 
=============
100 88 34 52 97
```

- 배열과 클래스는 변수에 값이 아니라 주소가 들어 있다. 메소드에 넘기면 그 주소가 매개변수로 복사된다(`Member m = mm`, `int[] arr = a`). 그래서 메소드 안에서 바꾼 값이 호출한 쪽에도 그대로 남는다.
- 위 숫자는 `Math.random()`이라서 실행할 때마다 달라진다. 메소드 안에서 출력한 값과 밖에서 다시 출력한 값이 같은 것이 포인트다.
- 노트에는 이 두 가지를 "메모리 주소 => 배열 / 클래스 => 참조 데이터형"으로 묶어 적었다.

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| `A` 객체 두 개의 `hashCode()`, `toString()` 출력과 `equals()` 비교 |
| `Main` 객체를 만들고 `null`로 지운 뒤 `System.gc()`로 `finalize()` 호출 확인 |
| `Sawon implements Cloneable`로 `clone()` 복제, 복제(`shim`)와 대입(`kim`)의 차이 확인 |
| `Member` 객체와 `int[]` 배열을 메소드에 넘겨서 값 바꾸기 |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- `라이브러리_2.java`는 컴파일할 때 `finalize()`에 `[removal]` 경고가 나온다(Java 21에서 확인). 삭제 예정 메소드라는 표시다. 대신 쓰는 방법은 아직 모른다.
- `라이브러리_2.java`는 `System.gc()` 직후에 `finalize()`가 항상 호출되는지 모른다. 한 번 실행했을 때는 출력되었다.
- `라이브러리_3.java`는 노트에 `clone()`을 깊은 복사라고 적었다. `Sawon`의 변수는 `int`와 `String`뿐이라 차이가 드러나지 않는다. `int[]` 변수를 가진 클래스를 따로 만들어 `clone()`한 뒤 복제본의 배열 값을 바꿨더니 원본 배열 값도 같이 바뀌었다(배열 주소가 같았다). `clone()`은 변수를 그대로 복사하는 방식이라 참조형 변수는 주소만 복사된다. 배열이나 객체를 가진 클래스를 복제할 때 어떻게 해야 하는지는 아직 모른다.
- `라이브러리_3.java`는 `kim`을 바꾼 뒤 `hong`을 다시 출력하지 않는다. `hong`이 그대로인지 코드로 확인하지 않았다.
- `라이브러리_3.java`에서 `implements Cloneable`을 빼면 어떻게 되는지 확인하지 않았다.
- `라이브러리_4.java`는 `mm.memberUpdate(mm)`처럼 자기 자신을 넘긴다. 다른 `Member` 객체를 인자로 넘겨서 그 객체만 바뀌는 경우는 확인하지 않았다.
- `라이브러리_1.java`의 `equals()`는 `다르다`가 나왔다. 값이 같으면 `같다`가 나오게 하는 방법은 21일차 `Object_3.java`에서 다룬다.

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

- 라이브러리는 패키지, 클래스명, 메소드명, 리턴형, 매개변수, 예외처리 여부로 읽는다.
- `java.lang`은 `import` 없이 쓴다. `Object`, `String`, `StringBuffer`, Wrapper, `Math`, `System`이 들어 있다.
- `Object`는 모든 클래스의 최상위이고 `finalize()`, `clone()`, `toString()`, `getClass()`, `equals()`, `hashCode()`를 가지고 있다.
- 오버라이딩하기 전의 `equals()`는 주소 비교이고 `toString()`은 `클래스명@해시값`이다.
- 객체는 `new`로 만들고, `null`로 주소를 지우고, `gc()`로 회수하면 `finalize()`가 호출된다.
- 복제(`clone()`)는 새 메모리를 만들고, 대입은 같은 메모리를 같이 쓴다.
- 배열과 객체를 메소드에 넘기면 주소가 넘어가서 메소드 안에서 바꾼 값이 원본에 반영된다.

</details>

---

## 21일차 | 2026.11.09 (월) | Chapter 12. 라이브러리 (Object, System, 문자열 정리)

<details>
<summary><b>Object 변수와 상속 변수의 접근 범위</b></summary>

<br>

- `Object`는 가장 큰 데이터형이라서 기본형, 참조형 상관없이 모든 값을 받을 수 있다. 노트에는 `Object o = 10`, `o = 0.5`, `o = true`, `o = "Hello"`, `Object o = new A()`로 적었다.
- `Object`는 메소드만 제공하고 변수는 제공하지 않는다.
- 상위 클래스 변수로는 하위 클래스에 새로 추가된 변수와 메소드를 쓸 수 없다.

```java
class A { int a; void display() {} }
class B extends A { int b; void bbb() {} }
```

| 선언 | 쓸 수 있는 것 |
|---|---|
| `B bb = new B()` | `a`, `b`, `display()`, `bbb()` |
| `A aa = new A()` | `a`, `display()` |
| `A cc = new B()` | `a`, `display()` (오버라이딩한 메소드면 `B`의 것이 호출된다) |

- 노트에는 `=` 왼쪽(변수의 클래스)이 쓸 수 있는 범위를 정하고, 오른쪽(생성자)이 오버라이딩한 메소드를 호출하는 쪽을 정한다고 적었다. 16일차 다형성에서 본 것과 이어진다.
- 라이브러리 메소드는 대부분 `Object`를 돌려줘서 형변환이 필요하다. `Object_1.java`의 `JComboBox`가 예다.

```java
JComboBox box = new JComboBox();
box.addItem("홍길동");          // addItem(Object o)
// ...

public void itemStateChanged(ItemEvent e)
{
    if (e.getSource() == box)
    {
        // String name = (String) box.getSelectedItem();
        String name = box.getSelectedItem().toString();
        la.setText(name);
    }
}
```

- `getSelectedItem()`이 `Object`를 돌려주기 때문에 `(String)`으로 형변환하거나 `toString()`을 쓴다.
- 노트에는 이렇게 `Object`로 받는 문제를 줄이려고 제네릭으로 데이터형을 통일한다고 적었다. 제네릭에는 `<int>`, `<double>`을 못 쓰고 `<Integer>`, `<Double>`처럼 클래스를 쓴다.

</details>

<details>
<summary><b>toString()과 equals() 오버라이딩</b></summary>

<br>

```java
class Member
{
    private String name;
    private String sex;
    // Getter, Setter 생략

    @Override
    public String toString()
    {
        // return super.toString();    // 주소값
        return "이름:" + name + ",성별:" + sex;
    }
}

System.out.println("m1 주소:" + m1);            // .toString() 생략
System.out.println("m1 주소:" + m1.toString());
```

```
m1 주소:이름:홍길동,성별:남자
m1 주소:이름:홍길동,성별:남자
```

- `println()`에 객체를 넣으면 `toString()`이 자동으로 호출된다. 그래서 `m1`만 써도 `m1.toString()`과 결과가 같다.
- `super.toString()`은 주소 값이고, 오버라이딩하면 객체가 가진 실제 값을 출력한다.

```java
class Human
{
    private String name, sex;
    // Getter, Setter, 생성자 생략

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Human)       // 객체 비교 연산자
        {
            Human s = (Human) obj;
            return name.equals(s.name) && sex.equals(s.sex);
        }
        return false;
    }
}

Human h1 = new Human("홍길동", "남자");
Human h2 = new Human("홍길동", "남자");
if (h1.equals(h2)) System.out.println(h1 + "==" + h2);
else System.out.println(h1 + "!=" + h2);
```

```
com.sist.lang.Human@15db9742==com.sist.lang.Human@7f31245a
```

- `equals(Object obj)`는 매개변수가 `Object`라서 `instanceof`로 `Human`인지 먼저 확인하고 `(Human)`으로 형변환한 다음 이름과 성별을 비교한다. `Human`이 아니면 `false`다.
- `String`은 `==`가 주소 비교이고 `equals()`가 실제 문자열 비교다. `String`의 `equals()`도 이렇게 오버라이딩해서 값을 비교하게 만들어 둔 것이다.
- 이름과 성별이 같아서 `==` 쪽이 출력되었다. 출력된 `Human@...` 두 주소는 서로 다르다. `Human`에는 `toString()`을 오버라이딩하지 않았기 때문이다.
- 노트에는 이름이 겹칠 때 우선순위를 지역변수, 매개변수, `static` 변수, 인스턴스 변수 순으로 적었다. 충돌하면 `this.`(인스턴스)나 `클래스명.`(`static`)으로 구분한다.

</details>

<details>
<summary><b>hashCode()와 getClass()</b></summary>

<br>

```java
class Sawon
{
    private int sabun;
    private String name;
    // Getter, Setter, 생성자 생략

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Sawon)
        {
            Sawon s = (Sawon) obj;
            return sabun == s.sabun && name.equals(s.name);
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(sabun, name);
    }
}

Sawon s1 = new Sawon(1, "박문수");
Sawon s2 = new Sawon(1, "박문수");
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());

Set<Sawon> set = new HashSet<Sawon>();
set.add(s1);
set.add(s2);
for (Sawon s : set)
{
    System.out.println(s.getSabun());
    System.out.println(s.getName());
}
```

```
47807637
47807637
1
박문수
```

- `hashCode()`는 객체 구분자이고 `equals()`는 값 비교다. 값이 같은 두 객체의 `hashCode()`가 같아지게 `Objects.hash(sabun, name)`으로 만들었다.
- `HashSet`에 `s1`, `s2`를 넣었는데 한 명만 출력되었다. 같은 객체로 보고 중복을 하나로 합친 것이다.
- `hashCode()`를 지우고 `equals()`만 오버라이딩한 `HashSet` 예제를 따로 만들어 돌렸더니 크기가 2가 되었다. `equals()`만으로는 부족하고 `hashCode()`도 같이 오버라이딩해야 한다.

```java
Food f = new Food();
System.out.println(f.getClass());
String s = "";
System.out.println(s.getClass());
```

```
class com.sist.lang.Food
class java.lang.String
```

- `getClass()`는 객체의 데이터형(패키지를 포함한 클래스명)을 돌려준다. 클래스도 참조형 데이터형이다.

</details>

<details>
<summary><b>System 클래스</b></summary>

<br>

| 기능 | 메소드 | 설명 |
|---|---|---|
| 프로그램 종료 | `System.exit(int code)` | `0`은 정상 종료, `0`이 아니면 비정상 종료 |
| 표준 입력 | `System.in` | 키보드 입력값. `read()`로 읽는다 |
| 표준 출력 | `System.out` | `print()` 가로, `println()` 세로(`\n` 포함), `printf()` 형식 출력 |
| 메모리 회수 | `System.gc()` | heap의 메모리를 회수한다 |
| 시간 측정 | `System.currentTimeMillis()` | 1/1000초 단위 |
| 시스템 정보 | `System.getProperty()` | 운영체제, 자바 정보 |

- 모두 `static` 메소드다. `printf()`의 형식은 `%d` 정수, `%s` 문자열, `%f` 실수, `%c` 문자다.

```java
int a = 5;
for (int i = 1; i <= 10; i++)
{
    if (i == a)
    {
        System.out.println("프로그램 종료");
        System.exit(0);         // break면 for문만 종료
    }
    System.out.println("i=" + i);
}
System.out.println("시작");
System.out.println("GO");
```

```
i=1
i=2
i=3
i=4
프로그램 종료
```

- `exit(0)`은 프로그램 전체를 끝내서 `시작`, `GO`가 출력되지 않는다. `break`였다면 `for`문만 끝나고 `시작`, `GO`가 출력된다. 웹에서는 쓰지 않는다고 적었다(브라우저가 종료되기 때문).

```java
System.out.print("정수 입력:");
int num1 = System.in.read();         // '1' => 49
System.out.println("num1=" + (num1 - '0'));
System.in.read();                    // enter

System.out.print("정수 입력:");
int num2 = System.in.read();
System.in.read();
System.out.println("num2=" + num2);
```

```
정수 입력:num1=1
정수 입력:num2=53
```

- `System.in.read()`는 글자 하나를 읽어서 문자 코드로 돌려준다. `'1'`은 `49`, `'0'`은 `48`이라서 `'0'`을 빼야 숫자가 된다. 예외처리가 필수라서 `try ~ catch`로 감쌌다. `1`, `5`를 한 줄씩 입력했을 때의 결과다. 사용 빈도가 거의 없어서 `Scanner`를 쓴다고 적었다.
- `num2`는 `'0'`을 빼지 않아서 `5`를 입력하면 `53`이 출력된다.

```java
long start = System.currentTimeMillis();
for (int i = 1; i <= 100000000; i++)
{
    System.out.println(i);
}
long end = System.currentTimeMillis();
System.out.println("걸린 시간:" + (end - start));
```

- 반복 전후의 시간을 빼서 걸린 시간을 구한다. 노트에는 웹에서 로그 파일에 쓴다고 적었다. 1억 번 출력이라 실행하지 않았다.

```java
System.getProperty("os.name");
System.getProperty("user.name");
System.getProperty("user.home");
System.getProperty("java.version");
```

- 운영체제 이름, 사용자 이름, 사용자 홈 폴더, 자바 버전을 읽는다. 노트에는 자바 버전을 확인하는 이유를 CI/CD와 docker에서 버전을 맞추기 위해서라고 적었다.

</details>

<details>
<summary><b>문자열 자르기와 비교 정리</b></summary>

<br>

- 7일차, 8일차에 배운 `substring`, `indexOf`, `lastIndexOf`, `equals`, `contains`, `startsWith`, `endsWith`를 지니 주소 문자열에 적용했다.

```java
String categroy = "https://www.genie.co.kr/chart/genre";
String s = categroy.substring(categroy.lastIndexOf("/") + 1);
System.out.println(s);                                          // genre
s = categroy.substring(0, categroy.indexOf(":"));
System.out.println(s);                                          // https
s = categroy.substring(categroy.indexOf("/") + 2);              // www.genie.co.kr/chart/genre
String s1 = s.substring(0, s.indexOf("/"));
System.out.println(s1);                                         // www.genie.co.kr
```

| 코드 | 결과 |
|---|---|
| 마지막 `/` 뒤부터 끝까지 | `genre` |
| 처음부터 `:` 앞까지 | `https` |
| 첫 `/`에서 2칸 뒤부터 (`//` 건너뛰기) 다시 첫 `/` 앞까지 | `www.genie.co.kr` |

```java
String msg1 = "Hello Java";
String msg2 = "HELLO JAVA";
if (msg1.equalsIgnoreCase(msg2)) System.out.println("같다");
else System.out.println("다르다");

String msg = "Hello Java";
if (msg.contains("Java")) System.out.println("포함됨");
if (msg.startsWith("Hello")) System.out.println("Hello로 시작됨");
if (msg.endsWith("Java")) System.out.println("Java로 끝남");
```

```
같다
포함됨
Hello로 시작됨
Java로 끝남
```

| 메소드 | 쓰는 곳 (노트) |
|---|---|
| `equals()` | 대소문자 구분. 로그인 |
| `equalsIgnoreCase()` | 대소문자 구분 없음. 검색 |
| `contains()` | 검색 |
| `startsWith()` | 자동 완성기 |
| `endsWith()` | 확장자 |

- 문자열은 `==`를 쓰지 않고 `equals()`로 비교한다.
- `문자열_정리.java`에는 `String` 메소드를 메소드 원형(리턴형, 매개변수)으로 다시 적었다. `main`은 비어 있고 주석만 있다. 그중 일부는 아래와 같다.

| 메소드 | 원형 | 설명 |
|---|---|---|
| `length()` | `int length()` | 문자 개수 |
| `trim()` | `String trim()` | 앞뒤 공백 제거 |
| `valueOf()` | `static String valueOf(기본형)` | 모든 데이터형을 문자열로 |
| `replace()` | `String replace(char, char)`, `String replace(String, String)` | 문자, 문자열 변경 |
| `replaceAll()` | `String replaceAll(String regex, String s)` | 정규식으로 변경 (`[A-Za-z]`, `[0-9]`, `[가-힣]`) |
| `concat()` | `String concat(String s)` | 문자열 결합. `s += "Java"`와 같은 결과 |

- `String`은 `final`이라서 오버라이딩할 수 없다. 라이브러리가 제공하는 기능만 쓴다.

</details>

<details>
<summary><b>문자열 나누기 - split과 StringTokenizer</b></summary>

<br>

```java
String data = "계란,새송이버섯,대파,참기름,통깨,물,굵은소금,식초,진간장,맛술,설탕,올리고당,다진 마늘";

String[] datas = data.split(",");
for (String s : datas) System.out.println(s);

StringTokenizer st = new StringTokenizer(data, ",");
System.out.println("분리된 재료:" + st.countTokens());
while (st.hasMoreTokens())
{
    System.out.println(st.nextToken());
}
```

- 두 방법 모두 재료 13개가 같은 순서로 출력되었고 `countTokens()`는 `13`이었다. `다진 마늘`처럼 안에 공백이 있는 항목은 `,` 기준이라서 한 덩어리로 나온다.

| | `split()` | `StringTokenizer` |
|---|---|---|
| 패키지 | `java.lang` (`String`) | `java.util` (`import` 필요) |
| 결과 | `String[]` 배열 | 하나씩 꺼내 읽는다 |
| 구분 기호 | 정규식 | 글자 그대로 |
| 개수 | `length` | `countTokens()` |
| 읽기 | 반복문으로 배열 접근 | `hasMoreTokens()`와 `nextToken()` |

- `StringTokenizer`의 메소드는 `countTokens()`(분리된 단어 개수), `hasMoreTokens()`(남은 단어가 있는 동안), `nextToken()`(단어를 하나씩 읽기)다. 노트에는 웹과 네트워크에서 많이 쓰고 크롤링한 데이터를 데이터베이스에 넣을 때 쓴다고 적었다.
- 단점으로 노트에 빈 문자열(공백, null)이 있는 경우 문제가 생긴다고 적었다. `"a,,b"`로 따로 실행하니 `split(",")`는 3개(가운데가 빈 문자열), `StringTokenizer`는 2개였다. 빈 칸이 사라진다.

```java
String color = "red|green|blue|black|white";
String[] colors = color.split("\\|");               // String regex
StringTokenizer st = new StringTokenizer(color, "|");
```

- `|`는 정규식에서 "선택"이라는 뜻이라서 `split`에는 `\\|`로 써야 하고, `StringTokenizer`는 그대로 `"|"`를 쓴다. 10일차에 정리한 `+`, `*`, `|` 앞에 `\\`를 붙이는 규칙이다. 두 방법 모두 5개 색이 같은 순서로 출력되었다.

| 정규식 기호 | 뜻 |
|---|---|
| `^` | 제외 |
| `\|` | 선택 |
| `?` | 0개 또는 1개 |
| `+` | 1개 이상 |
| `*` | 0개 이상 |
| `.` | 임의의 한 글자 |

- `문자열_1.java`는 `main`이 비어 있고 주석만 있다. 주석에는 `String`을 `String 변수명 = "";`(기본형처럼, 표준)과 `new String("")`(참조형)으로 만들 수 있고, `String`은 값만 전송하는 Call By Value만 쓸 수 있다고 적었다. 문자열을 빠르게 결합하는 `StringBuffer`, `StringBuilder`(`append()`)도 `java.lang`에 있다고 적었다.
- `문자열_1.java`에 주석 처리된 한 줄 `Object[] arr = {10, 'A', 10.5, "홍길동", 10L, 10.5F};`는 따로 풀어서 돌려 보니 `Integer Character Double String Long Float`로 들어갔다. `Object` 배열이라서 데이터형이 다른 값을 한 배열에 담을 수 있다.

</details>

<details>
<summary><b>지니 음악 프로그램 - GenieMusic, MusicVO, UserMain</b></summary>

<br>

- 15일차 음악 순위 시스템과 같은 지니 차트를 읽는다. 15일차에는 `Music`을 상속받은 `GenieMusic`이 생성자에서 한 번 읽었고, 이번에는 카테고리를 고를 때마다 다시 읽도록 `getData(int cno)` 메소드로 만들었다. 노트에는 생성자나 `static {}`은 한 번만 호출되어 재호출이 안 되기 때문에 사용자가 요청할 때마다 호출하는 메소드로 만든다고 적었다.

| 클래스 | 역할 |
|---|---|
| `MusicVO` | 곡 한 개의 정보 (`mno`, `title`, `singer`, `album`, `state`, `idcrement`, `poster`). Lombok `@Data` |
| `GenieMusic` | 카테고리 주소 7개를 가지고 Jsoup으로 읽어서 `MusicVO[50]`에 저장한다 |
| `UserMain` | 메뉴를 출력하고 번호를 받아 `gm.getData(cno - 1)`을 호출한다. `9`는 종료 |

```java
private static MusicVO[] musics = new MusicVO[50];
private static String[] category = {
    "https://www.genie.co.kr/chart/top200",
    "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20261108&genrecode=M0100",
    // 장르 코드만 다른 주소 5개 더
};

public void getData(int cno)
{
    try
    {
        Document doc = Jsoup.connect(category[cno]).get();
        Elements title = doc.select("table.list-wrap a.title");
        // singer, album, poster, etc도 같은 방식
        for (int i = 0; i < title.size(); i++)
        {
            musics[i] = new MusicVO();
            musics[i].setMno(i + 1);
            musics[i].setTitle(title.get(i).text());
            // ...
        }
    } catch (Exception ex) {}

    for (MusicVO vo : musics)
    {
        System.out.println(vo.getMno() + "." + vo.getTitle());
    }
}
```

- 등락 칸은 15일차와 같은 방식으로 `replaceAll`로 나눈다. `유지`면 `state`가 `유지`, `id`가 `0`이고, 아니면 `temp.replaceAll("[^가-힣]", "")`로 한글만 `state`에, `temp.replaceAll("[^0-9]", "")`로 숫자만 `Integer.parseInt()`로 바꿔서 `id`에 넣는다. `^`는 `[ ]` 안에서 "제외"라는 뜻이라서 `[^가-힣]`은 한글이 아닌 것을 지운다.
- `Jsoup.connect().get()`은 반드시 예외처리해야 하는 Checked 예외가 따른다. 노트에는 파일은 `IOException`, 네트워크는 `MalformedURLException`, 데이터베이스는 `SQLException`, 쓰레드는 `InterruptedException`, 클래스는 `ClassNotFoundException`이라고 적었다. 18일차에 정리한 Checked 예외 구분과 이어진다.
- `UserMain`은 `while (true)`로 메뉴를 반복하다가 `9`를 입력하면 `System.exit(0)`으로 끝낸다. 방금 배운 `System.exit()`가 여기에 쓰였다.
- Jsoup, Lombok jar와 인터넷 연결이 필요해서 실행하지 못했다. 코드를 읽고 쓴 것이다.

</details>

<details>
<summary><b>실습</b></summary>

<br>

| 한 일 |
|---|
| `JComboBox`에 `addItem()`으로 이름을 넣고 `getSelectedItem().toString()`으로 선택한 이름을 라벨에 표시 (`Object_1`) |
| `Member`에 `toString()`을 오버라이딩해서 객체를 그대로 출력하면 값이 나오게 하기 |
| `Human`의 `equals()`를 오버라이딩해서 이름과 성별이 같으면 같은 객체로 비교 |
| `Sawon`의 `equals()`, `hashCode()`를 오버라이딩하고 `HashSet`에 넣어 중복 제거 확인 |
| `getClass()`로 `Food`, `String`의 클래스 정보 출력 |
| `System.exit(0)`, `System.in.read()`, `currentTimeMillis()`, `getProperty()` 연습 |
| `substring`, `indexOf`, `lastIndexOf`로 주소 문자열 자르기, `equals`, `equalsIgnoreCase`, `contains`, `startsWith`, `endsWith` 비교 |
| `split()`과 `StringTokenizer`로 재료 문자열과 색 문자열 나누기 |
| 지니 차트 카테고리 7개를 고르는 `GenieMusic`, `MusicVO`, `UserMain` 작성 |

</details>

<details>
<summary><b>더 알아볼 것</b></summary>

<br>

- `Object_1.java`는 화면(Swing)이라 실행하지 못했다. 콤보박스를 바꿀 때 `itemStateChanged()`가 몇 번 호출되는지 모른다.
- `Object_1.java` 주석에 "`Object`를 제외하고 다른 클래스는 `final`"이라고 적었는데 코드로 확인하니 `String`, `Integer`는 `final`이고 `Thread`는 `final`이 아니었다. 19일차 `BarThread extends Thread`가 `Thread`를 상속받은 것과 맞다. `final`인 클래스가 어디까지인지 정리할 것.
- `Object_3.java`의 `if (h1.equals(h2)) // 주소` 주석은 코드와 다르다. `equals()`를 오버라이딩했으니 주소가 아니라 이름과 성별을 비교한다. 코드를 기준으로 하면 `==` 쪽이 출력된다. `Human`에 `Object_2.java`처럼 `toString()`을 오버라이딩하면 출력도 값으로 나온다.
- `Object_3.java`의 `h3 = h1`, `static String n`은 쓰지 않는다. 생성자에서 `name = n`처럼 매개변수와 이름이 다른 변수만 써서 `this.`와 `Human.n` 구분이 필요한 상황이 없다.
- `Object_3.java`, `Object_4.java`의 `equals()`는 `name`이 `null`이면 `name.equals(...)`에서 `NullPointerException`이 난다. 코드를 읽고 쓴 것이고 실행하지 않았다. `null`을 비교하는 방법을 알아볼 것.
- `Object_5.java` 주석에 오타가 있다. `toLpwerCase`는 `toLowerCase`이고 비교 메소드는 `compare()`가 아니라 `compareTo()`다. `main`은 `getClass()` 두 줄뿐이고 긴 주석은 `java.lang` 클래스 요약이다.
- `System_2.java`는 입력 바이트를 따로 흉내 내서 확인했다(Eclipse 콘솔에서 실행한 것은 아니다). 한 글자만 읽어서 `10`을 입력하면 `num1=1`, `0`이 enter 자리로 소비되고 `num2`는 입력을 기다리지 않고 `10`이 된다. Windows는 enter가 `\r\n` 두 글자라서(주석의 `enter => 13`) 첫 입력 뒤에 enter를 한 번만 읽으면 `\n`이 남아 `num2=10`이 되었다. `catch (Exception ex) {}`가 비어 있다.
- `System_3.java`는 1억 번 `println()`이라 실행하지 않았다. 시간 대부분이 출력일 것으로 보이니 출력 없는 반복과 비교해서 확인할 것.
- `System_4.java` 주석에 `user.name`을 컴퓨터명이라고 적었다. 리눅스 환경에서 따로 실행하니 컴퓨터 이름(`vm`)이 아니라 로그인 계정 이름(`root`)이 나왔다. 학원 PC에서 직접 찍어서 어느 쪽인지 확인할 것.
- `문자열_2.java`의 변수명 `categroy`는 `category` 오타다. `문자열_정리.java`의 `endWith`도 `endsWith`가 맞다.
- `문자열_4.java`의 정규식 표에는 `^`가 "제외"라고만 적혀 있다. `[^가-힣]`처럼 `[ ]` 안에서 쓸 때의 뜻이다.
- `GenieMusic.java`의 `catch (Exception ex) {}`가 비어 있어서 접속 실패, 선택자 불일치, 인덱스 범위 초과가 모두 조용히 지나간다. 그 뒤 `for (MusicVO vo : musics)`가 `vo.getMno()`를 호출하니 `musics`가 한 번도 채워지지 않았다면 `NullPointerException`이 날 것으로 보인다.
- `UserMain.java`에 `0`, `8`, `10` 같은 범위 밖 번호를 넣으면 `category[cno - 1]`에서 `ArrayIndexOutOfBoundsException`이 나고, 위의 빈 `catch`가 삼킨 뒤 이전 카테고리 목록을 다시 출력할 것으로 보인다. 메뉴에는 `8`이 없다. 문자를 입력하면 `scan.nextInt()`에서 `InputMismatchException`으로 끝난다. 18일차 다중 catch를 쓸 것.
- `GenieMusic.java`의 `musics`는 `static`이라 카테고리를 바꿀 때 `title.size()`가 50보다 작으면 뒤쪽에 이전 카테고리 곡이 남는다. 읽은 개수만큼만 출력하도록 고칠 것.
- `GenieMusic.java`의 `ymd=20261108` 날짜가 주소에 고정되어 있다. 날짜를 바꾸는 방법을 알아볼 것. `getData()`가 읽기와 출력을 같이 하는 것도 나눌 수 있다.
- `UserMain.java` 메뉴의 `ZAZZ`는 `JAZZ` 오타로 보인다. `MusicVO`의 변수 `idcrement`도 `increment`가 맞다. 변수명을 바꾸면 Lombok Getter, Setter 이름과 `GenieMusic`의 호출도 같이 바꿔야 한다.
- `.classpath`에 jsoup, Lombok, JTattoo가 `C:/Users/sist33/Downloads`, `C:/javaDev` 절대 경로로 등록되어 있어서 다른 PC에서 열면 라이브러리를 못 찾는다.

</details>

<details>
<summary><b>오늘 정리</b></summary>

<br>

- `Object` 변수는 모든 값을 받지만, 상위 클래스 변수로는 하위 클래스에 추가된 변수와 메소드를 쓸 수 없다. 라이브러리가 `Object`를 돌려주면 형변환이나 `toString()`이 필요하다.
- `toString()`은 객체를 값으로 출력하게 오버라이딩하고, `equals()`는 값 비교로 오버라이딩한다.
- `equals()`와 `hashCode()`는 같이 오버라이딩해야 `HashSet`이 값이 같은 객체를 중복으로 본다.
- `getClass()`는 패키지를 포함한 클래스명을 돌려준다.
- `System.exit(0)`은 프로그램 전체를 끝낸다. `System.in.read()`는 글자 하나의 문자 코드를 읽어서 쓰기 불편하고, 실제로는 `Scanner`를 쓴다.
- `currentTimeMillis()`는 시작과 끝 시간을 빼서 걸린 시간을 구하고, `getProperty()`는 운영체제와 자바 정보를 읽는다.
- 문자열은 `substring`, `indexOf`, `lastIndexOf`로 자르고, `equals`, `equalsIgnoreCase`, `contains`, `startsWith`, `endsWith`로 비교한다.
- `split()`은 정규식 기준이고 빈 값도 남긴다. `StringTokenizer`는 글자 그대로 나누고 빈 값이 사라진다.
- 지니 차트 프로그램은 `getData()` 메소드로 만들어서 카테고리를 고를 때마다 다시 읽는다. 빈 `catch`와 범위 밖 번호는 고쳐야 할 곳이다.

</details>
