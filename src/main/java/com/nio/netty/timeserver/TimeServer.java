package com.nio.netty.timeserver;

public class TimeServer {

	public static void main(String ...s){
		int port = 8080;
		if(s != null && s.length > 0){
			try{
				port = Integer.valueOf(s[0]);
			}catch(NumberFormatException e){
				e.printStackTrace();
				System.exit(1);
			}
		}
		MultiplexerTimeServer timeServer = new MultiplexerTimeServer(port);
		new Thread(timeServer, "NIO-MultiplexerTimeServer-001").start();
	}
}
