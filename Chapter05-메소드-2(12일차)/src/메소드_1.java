/*
 *  	메소드는 사용자 요청 처리하기 위한 명령문의 집합
 *  							 ===== ;
 *  							 int a=10;
 *  							 a 메모리를 만들어서 10을 저장
 *  		  ------------ 특정 작업(기능)
 *  	=> 코드 재사용 / 기능 분리 (분업 처리)
 *  	=> 개발 (x) => 유지보수 목적
 *  	-------------------------------------------------
 *  	매개변수 : 사용자가 요청 값
 *  	리턴형 : 요청처리 결과값
 *  	----- 권장 (동일) => 클수도 있다
 *  	결과값을 넘겨주는 경우 : return 갑
 *  							 --
 *  
 *  	=> 정수 10개 => 합을 구해서 반환
 *  	   -------
 *  	    매개변수 : int[]
 *  		리턴형 : int
 *  		return 합계값
 */
import java.util.*;
public class 메소드_1 {
	static int hap(int[] arr)
	{
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		return sum;
	}
	// 최댓값
	static int max(int[] arr)
	{
		int max=0; // *** max 할 때는 가장 큰 값!!!
		for(int i:arr)
		{
			if(i>max)
				max=i;
		}
		return max;
	}
	// 최솟값
	static int min(int[] arr)
	{
		int min=100; // ***min 할 때는 가장 작은 값!!!(여기서는 100정도로 함)
		for(int i:arr)
		{
			if(i<min)
				min=i;
		}
		return min;
	}
	// 평균을 구하는 메소드만들기
	static double avg(int[] arr)
	{
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		return sum/10.0;
	}
	// 짝수의 개수
	static int even(int[] arr)
	{
		int count=0;
		for(int i:arr)
		{
			if(i%2==0)
				count++;
		}
		return count;
	}
	// 홀수의 개수
	static int odd(int[] arr)
	{
		int count=0;
		for(int i:arr)
		{
			if(i%2!=0)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1; // 1~100
			// 배열 초기화
		}
		
		int sum=hap(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("합:"+sum);
		int max=max(arr);
		System.out.println("최댓값:"+max);
		int min=min(arr);
		System.out.println("최솟값:"+min);
		double avg=avg(arr);
		System.out.printf("평균:%.2f\n",avg); // printf 할 때 출력란에 꼭 + 아니고 , 찍어야함!  "평균:%.2f\n",avg (O) "평균:%.2f\n"+avg (X)
		int even=even(arr);
		System.out.println("짝수의 개수:"+even);
		int odd=odd(arr);
		System.out.println("홀수의 개수:"+odd); // System.out.printf("홀수의 개수:"+odd); 이거 대신에
											 // System.out.printf("홀수의 개수:"+odd(arr)); 이런식으로 쓸 수 있다.
											 // even(arr) ==> even이름을 가진 메소드의 배열(arr)을 쓴다 이런느낌

	}

}
