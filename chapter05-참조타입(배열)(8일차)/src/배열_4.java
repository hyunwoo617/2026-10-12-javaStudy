
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[10]; // 선언
		//초기화
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((Math.random()*26)+65); // 알파벳 전체가 26개니까 0~25까지이고 +65 하면은 문자로 변경되는것
		}
		for(char c:alpha)
		{
			System.out.print(c+" ");
		}
	}

}
