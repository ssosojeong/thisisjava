package sec06.exam01_inetaddress;

import java.net.*;

public class InetAddressExample {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소: " + local.getHostAddress());
		
			//도메인 활용
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP 주소: " + remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
