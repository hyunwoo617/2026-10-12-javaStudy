/*
 * 		=> ***1. trim() : 좌우 공백 제거
 * 		=> ***2. valueOf() : 모든 데이터형을 문자열로 변환시에 사용
 * 		=> ***3. split() : 단어(토큰)별로 나눠서 배열에 저장
 * 		=> 4. join() : 문자를 묶어서 한개의 문자로 변환
 * 		=> 5. format() : 문자열 변환
 * 			  -------- printf()
 * 		--------------------------------------------------
 * 		라이브러리 => 자바에서 만든 클래스
 *			|= 메소드 (기능)
 *		
 *		메소드 : 특정 기능을 수행하는 명령문의 집합
 *		메소드의 구성요소
 *			리턴형(결과값) 메소드명(매개변수...)
 *			----------
 *			{
 *				기능 수행 (요청 처리)
 *				return 값
 *					   -- 데이터형이 동일
 *			}
 *
 *			리턴형 / 메소드명 / 매개변수
 *			--------------------
 *			=> 호출시에는 리턴형을 제외한다
 *
 *			int add(int a,int b) => 원형
 *			{
 *				return a+b;
 *			}
 *			
 *			=> int c=add(10,20)
 *				   | ----------
 *				   |  |
 *				   ----
 * 			1. 어떤 클래스인지 확인
 * 			2. 어떤 기능이 필요한지 확인
 * 			3. 매개변수 값이 뭔지 확인
 * 			4. 리턴형
 * 			5. 어떻게 호출 할 것인지
 * 			**주의** 결과값이 없는 경우도 있다 => 리턴형이 void
 * 												---- 
 * 			trim() : 좌우 공백 제거
 * 			 => 원형 : String trim()
 * 					 -------
 * 			String valueOf(int) : 모든 데이터형을 문자열로 변경 
 * 			  10 => "10"
 * 			  10.5 => "10.5"
 * 			  true => "true"
 * 			  String valueOf(long)
 * 			  String valueOf(boolean)
 * 			  ..
 * 			  ..
 * 			  String valueOf(char[])
 * 			  ----------------------- 오버로딩
 */
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println();
		String msg=" Hello Java "; // 인스턴스 (객체)
		System.out.println("문자 갯수:"+msg.length());
		System.out.println("msg="+msg);
		msg=msg.trim();
		System.out.println("문자 갯수:"+msg.length());
		System.out.println("msg="+msg);
		// trim() => 검색어 , 사용자 입력 (ID,PWD)
		// 공백 => space 문자 하나가 들어가는것
		int a=100;
		int b=200;
		System.out.println(a+b);
		// 공유 메소드 => static
		System.out.println(String.valueOf(a)+b); //100200
		                   // "100"+200 => 100200
		
		// => 가변형 매개변수
		String s=String.join("/","2026","10","21");
		System.out.println(s);
		
		
		s=String.format("%d %d %d %d %.2f", 90,90,80,260,260/3.0);
		System.out.println(s);
		
	}

}
