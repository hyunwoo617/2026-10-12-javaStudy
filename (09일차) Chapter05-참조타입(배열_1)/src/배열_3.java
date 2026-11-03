// 정수 입력 => 양수만 => 32767 => 16bit
//  | ===> 2진법 출력
// 10 => 0000 0000 0000 1010
// => 저장 위치 
// index=15	index--
// index=0  index++
import java.util.*;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16];
		// 뒤에부터
		int index=15;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		int input=scan.nextInt();
		
		while(true)
		{
			binary[index]=input%2;
			input/=2;
			if(input==0)
				break;
			index--;
		}
		
		// 결과값 출력
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}

	}

}
