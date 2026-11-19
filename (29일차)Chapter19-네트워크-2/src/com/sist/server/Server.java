package com.sist.server;
import java.io.*;
import java.net.*;
import java.util.Vector;
public class Server implements Runnable{
	private Vector<Client> waitVc=
			new Vector<Client>();
	private final int PORT=3355;
	// 1. 서버 구동
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT); // bind => ip/port
			// 대기 => listen
			System.out.println("Server Start...");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	// 접속시 처리
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Client extends Thread
	{
		
	}
}
