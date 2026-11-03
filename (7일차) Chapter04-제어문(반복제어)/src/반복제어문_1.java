/*  10.20 7일차 배우는 내용
 * 	1.  반복제어문
 * 		반복문 안에서 사용 (제외: break => switch)
 * 
 * 		break : 반복문을 중단할 때 사용
 * 		continue : 반복문에서 특정 부분을 제외할 때 (건너뛰고 싶을 때)
 * 
 * 		주의점)
 * 			break,continue => 이 밑에는 소스코딩을 할 수 없다
 * 
 * 			for()
 * 			{
 * 				if()
 * 				{
 * 					break;
 * 					System.out.println() => 오류( 밑에는 소스코딩 불가)
 * 				}
 * 			
 * 				여기는 소스코딩 가능
 * 			}
 * 			-----------------------------------------------------
 * 			자신의 반복문만 제어가 가능 (한블럭씩만 해당하는 느낌)
 * 			=> 웹 => 일차 for / while / break / 일차 배열
 * 					--------------------------------
 * 					데이터베이스 : ArrayList
 * 
 * 			   => FileUpload
 * 
 * 			for()
 * 			{
 * 				for()
 * 				{
 * 					break;
 * 				}
 * 				break;
 * 			}
 */
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====== break ======");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break; // i가 5가되면 종료해라
			}
			System.out.println(i+" ");
		}
		System.out.println("\n===== continue ======");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue; // i가 5가되면 건너뛰고 실행(즉, 5를 제외하고 실행)
			}
			System.out.println(i+" ");
		}
		// continue => for (증가식) / while,do~while(조건식) => 무한 루프
//		int i=1;
//		while(i<=10)
//		{
//			if(i==5)
//				continue;
//			System.out.println(i+" ");
//			i++;
//		}
		System.out.println("\n===== continue =====");
		int i=1;
		do
		{
			System.out.println(i+" ");
			if(i==5)
				continue;
			System.out.println(i+" ");
			i++;
		}while(i<=10);
	}

}
