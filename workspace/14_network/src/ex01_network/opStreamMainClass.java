package ex01_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class opStreamMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		URL url = null;
		HttpURLConnection con =null;
		InputStreamReader isr = null;
		BufferedReader br =null;
		StringBuilder sb =new StringBuilder();
		try {
			url=new URL("https://m.naver.com/");
			con = (HttpURLConnection)url.openConnection();
			isr = new InputStreamReader(con.getInputStream());
			br = new BufferedReader(isr);
			
			while(true) {
				
				String line = br.readLine();
				if(line==null) {
					break;
				}
				System.out.println();
				sb.append(line).append("\n");
			}
			System.out.println("글자수 : " + sb.toString().length());
			
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {
						if(br!=null) {br.close();}
						if(con!=null) {con.disconnect();}
						
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
