package ex03_File;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\MyTemp\\text.txt");
		try(FileReader fr = new FileReader(file)){

			int ch =0;
			while((ch=fr.read())!=-1) {
					System.out.print((char)ch);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
