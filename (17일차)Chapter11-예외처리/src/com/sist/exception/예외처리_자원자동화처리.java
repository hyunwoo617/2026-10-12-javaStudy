package com.sist.exception;
import java.io.*;
public class 예외처리_자원자동화처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// try - with - resource
		// finally 없이 자동 닫기 => 파일에서 가능
		try(FileReader fr=new FileReader("C:\\Users\\sist33\\git\\java-study\\java-study\\(17일차)Chapter11-예외처리\\src\\com\\sist\\exception\\숫자야구게임.java"))
		{
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			// fr.close()
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
