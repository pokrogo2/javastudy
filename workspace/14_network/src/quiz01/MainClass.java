package quiz01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://m.naver.com/의 소스코드를
		//c:\mnaver.html 파일로 저장
		
		URL url = null;
		URLConnection con =null;
		StringBuilder sb = new StringBuilder();
		BufferedReader br =null;
		File  file =null;
		BufferedWriter bw =null;
		try {
			url = new URL("https://m.naver.com/");
			con = (HttpURLConnection)url.openConnection();
			
			br= new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			file = new File("C:\\mnaver.html");
			bw = new BufferedWriter(new FileWriter(file));
			
			String line =null;
			while((line = br.readLine())!=null) {
				bw.write(line + "\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw!=null) {bw.close();}
				if(br!=null) {br.close();}
			
				
				}
			catch(Exception e) {
				e.printStackTrace();
		}
		}
	}
}
	


