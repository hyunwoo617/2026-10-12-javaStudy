/*
 * 
 */
public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int 사과 = 10;
//		int 먹은사과 = 5;
//		System.out.println("남은 사과 개수:"+(사과-먹은사과));
		// byte
		byte byteValue=127;
		int intValue=10;
		long longValue=10L;
		float floatValue=10.5F;
		double doubleValue=10.56D; //D는 생략 가능하다.
		boolean booleanValue=true;
		char charValue='A';
		
		System.out.println("byteValue="+byteValue);
		System.out.println("intValue="+intValue);
		System.out.println("longValue="+longValue);
		
		// 작은 값 지정
		double d=100; //자동 형 변환
		System.out.println("d="+d);
		
		int a=97; // A = 65 , a = 97
		System.out.println((char)a);
		char c='0'; // '0' => 48
		// 저장 => 문자(X) , 문자에 해당되는 숫자가 저장 => 유니코드
		System.out.println((int)c);
		
		// 예외 : boolean은 적용이 안된다 => 숫자 (char 는 정수)
		// 메모리에 한개의 데이터만 저장
		/*
		 * 		정수 : int
		 * 		실수 : double
		 *		존재 : boolean
		 *		-------------
		 *		long : AI , 데이터가 많은 경우
		 *		전송 (네트워크) => byte
		 *
		 *		형변환 => 데이터형을 변경
		 *		자동 형변환 : UpCasting
		 *		  작은 데이터를 큰데이터에 저장
		 *		  long a=10
		 *				--- long으로 변경
		 *		  double d=10L
		 *				--- double로 변경 10.0
		 *		강제 형변환 => DownCasting
		 *		  int a=10.5
		 *				---- (int)10.5 ==> a=10
		 *					 -----
		 *		byte < char < int < long < float < double
		 */

	}

}
