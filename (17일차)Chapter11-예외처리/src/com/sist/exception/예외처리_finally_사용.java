package com.sist.exception;
/*
 * 	try
 * 	{
 * 		정상으로 수행하는 문장 => 실수하거나 /입력을 잘못할 경우 : 오류발생의 문제 ==> 비정상 종료
 * 	}catch(Exception ex)
 * 	{
 * 		오류가 난 경우에 처리하는 문장 => 에러메세지 볼 수 있다
 * 									복구 => return
 * 	}
 * 	finally ==> 자원 관리가 없는 경우 => 생략
 * 	{
 * 		정상수행이나 / 오류가 나더라도 => 무조건 수행된다
 * 		=> 닫기 (파일, 오라클, 서버 닫기)
 * 	}
 */
import java.io.*;
public class 예외처리_finally_사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try
		{
			// fr 파일리더를 만들었는데 이건 finally절에서 fr가져와서 못 쓴다. 
			// 그래서 try 위에 메인절에 fr을 하나 만들고 값이 없으니까 null 값을 적는다.
			fr=new FileReader("C:\\Users\\sist33\\git\\java-study\\java-study\\(17일차)Chapter11-예외처리\\src\\com\\sist\\exception\\숫자야구게임.java"); // 파일읽기는 무조건 예외처리 해야함(안넣을수도있고 잘못넣을수도있고 이러니까)
			int i=0;
			while((i=fr.read())!=-1) // -1 => EOF (문장이 끝날때까지)
			{
				System.out.print((char)i);
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			// 에러 메세지 확인
		}
		finally
		{
			try
			{
				if(fr!=null)
					fr.close();
			}catch(Exception ex) {}
		}

	}

}
