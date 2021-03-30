package ex03_File;

import java.io.File;

public class FileDeleteMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//C:\\MyTemp삭제
		File myTemp = new File("C:\\MyTemp");
		if(myTemp.exists()) {
			File[] files = myTemp.listFiles();
			for(File file : files) {
				if(file.isFile()) {
				System.out.println(file.getName()+"파일삭제");
				}else {
					System.out.println(file.getName()+"디렉토리삭제");
				}
				file.delete();
			}
			System.out.println(myTemp.getName()+" 삭제");
			myTemp.delete();
		}
	}

}
