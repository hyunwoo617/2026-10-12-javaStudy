package com.sist.map;
import java.util.*;
public class Map_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String, String>();
		map.put("BoardList", "SELECT * FROM board");
		map.put("BoardDetail", "SELECT * FROM board WHERE no=1");
		map.put("BoardInsert", "INSERT INTO board VALUES(?,?,?,?,?)");
		map.put("BoardUpdate", "UPDATE board SET name=''");
		map.put("BoardDelete", "DELETE FROM board WHERE no=1");
		// MyBatis => XML
		Set<String> set=map.keySet();
		for(String key:set)
		{
			System.out.println(key+":"+map.get(key));
		}
		
	}

}
