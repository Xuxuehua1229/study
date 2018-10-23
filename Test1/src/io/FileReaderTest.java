package io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			File file = new File("C:\\Users\\BrainLiu\\Desktop\\context.txt");
			fr = new FileReader(file);
			char[] c = new char[1024];
			int len;
			while ((len = fr.read(c)) != -1) {
				String str = new String(c,0,len);
				System.out.println(str);
			}
			/*int len;
			while ((len = fr.read()) != -1) {
				System.out.println((char)fr.read());
			}*/
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

