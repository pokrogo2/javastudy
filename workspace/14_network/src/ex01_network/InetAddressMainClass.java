package ex01_network;

import java.net.InetAddress;
import java.util.Arrays;

public class InetAddressMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String host = "www.naver.com";
		InetAddress ia =null;
		try {
			ia = InetAddress.getByName(host);//없는주소일수도있어서 trycatch필요

			System.out.println(ia);
			System.out.println(ia.getHostName());
			System.out.println(ia.getHostAddress());
			
			InetAddress[] ias = InetAddress.getAllByName(host);
			for(InetAddress iaa : ias) {
				System.out.println(iaa.getHostName() +"의 주소 : " +iaa.getHostAddress());
			}
			byte[] byteIP = ia.getAddress();
			System.out.println(Arrays.toString(byteIP));
			short[] ip = new short[byteIP.length];
		
			for(int i=0;i<ip.length;i++) {
				ip[i] = (short) (byteIP[i]<0?byteIP[i]+256:byteIP[i]);
			}
			System.out.println(Arrays.toString(ip));
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
