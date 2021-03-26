package quiz01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BufferedInputStream bis =null;
		BufferedOutputStream bos =null;
		try {
			bis = new BufferedInputStream(new FileInputStream("waterfall.mp4"));//원본
			bos = new BufferedOutputStream(new FileOutputStream("waterfall2.mp4"));//복사본
			
			byte[] b = new byte[1024];//1kb
			while(true) {
				int readByte = bis.read(b);//영상저장은 b에, 실제 읽은 바이트 수는 readbyte에
				if (readByte==-1) {
					break;
				}
				bos.write(b, 0, readByte);;
			}
			System.out.println("파일이 복사되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				if(bos!=null)bos.close();
				if(bis!=null)bis.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
