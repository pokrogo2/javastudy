package ex01_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebCrawling {

	public static void main(String[] args) {
		
		URL url = null;
		HttpURLConnection con =null;
		BufferedReader br =null;
		
		try {
			url = new URL("https://www.daum.net/");
			con = (HttpURLConnection)url.openConnection();
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String line =null;
			while((line = br.readLine())!=null) {
				//line:
			if(line.contains("link_favorsch @")) {
				//System.out.println(line);
				
				//String[] temp = line.split(">");
				//System.out.println(temp[1]);
				//line.split(">")[1] :
				String temp = line.split(">")[1].split("<")[0];
				System.out.println(temp);
			}
			
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) {br.close();}
				if(con!=null) {con.disconnect();}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
