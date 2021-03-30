package ex03_File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FileInputStream fis = null;
		//복사본  C:\\mytemp\\Windmill.mp4
		//경로 지정을 위해 file클래스 사용,fileoutputStraem
		//속도 높이려고 bufferedInputStream사용
		BufferedInputStream bis =null;
		BufferedOutputStream bos =null;
		File cpy = new File("C:\\MyTemp","waterfall.mp4");
		//FileOutputStream fos =null;
		try {
			bis = new BufferedInputStream(new FileInputStream("waterfall.mp4"));
			bos = new BufferedOutputStream(new FileOutputStream(cpy));
			
			long start = System.currentTimeMillis();
			
			byte[] b = new byte[10];
			int length = 0;
			while((length =bis.read(b))!=-1) {
				bos.write(b,0,length);
			}
			long end = System.currentTimeMillis();
			System.out.println(cpy.getAbsolutePath()+ "파일이 복사디었습니다.");
			System.out.println("복사소요시간 : " + ((end-start)*0.001)+"초");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos!= null) {bos.close();}
				if(bis!=null) {bis.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
