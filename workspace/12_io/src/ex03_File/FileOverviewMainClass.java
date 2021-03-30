package ex03_File;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/*
 	file클래스
 	1.파일을 조작하는클래스
 	2.파일생성, 삭제,파일명,크기,수정날짜 등의 확인이 가능
 
 */
public class FileOverviewMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("C:\\MyTemp"); // 경로구분 \\ == File.separator
		//File dir = new File("C:" + File.separator+"MyTemp");// linux와 window 호환용
		System.out.println(dir.exists());//존재하는 경로면 true
		
		if(dir.exists()==false) {
			dir.mkdir();
			System.out.println("디렉토리생성");
		}/*
		if(dir.exists()==true) { // if(dir.exist()); 주석쿄드가 더나음

			dir.delete();
			System.out.println("디렉토리 삭제");
			
		}*/
		File file = new File("C:\\MyTemp\\MyFile.txt");
		//File file = new File("C:\\MyTemp","MyFile.txt");
		//File file = new File(dir,"MyFile.txt");
		System.out.println(file.exists());
		
			try {
				if(file.exists()==false) {
				file.createNewFile();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(file.getAbsolutePath());//C:\MyTemp\MyFile.txt
			System.out.println(file.getPath());//C:\MyTemp\MyFile.txt
			System.out.println(file.getParent());//C:\MyTemp
			System.out.println(file.getName());//MyFile.txt
			System.out.println(file.lastModified());//1616978478788
			System.out.println(file.length());//0
			Date date = new Date(file.lastModified());
			String pattern = "yyyy-MM-dd a h : mm";
			SimpleDateFormat sdf= new SimpleDateFormat(pattern);
			System.out.println(sdf.format(date));
			
			File javaDir = new File("C:\\Program Files\\Java\\jdk1.8.0_202");
			SimpleDateFormat sdf2= new SimpleDateFormat("yyyy-MM-dd a hh:mm");

			File[] files = javaDir.listFiles();
			for(File f : files) {
				System.out.println(new Date(f.lastModified())+" ");
				if(f.isDirectory()) {
					System.out.println("<DIR>");
				}else {
					System.out.println("           "+new DecimalFormat("#,##0").format(f.length()));
				}
				System.out.println(f.getName());
			}
		}
	}

