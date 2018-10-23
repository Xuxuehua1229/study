package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			
			fis = new FileInputStream(new File("ioTest3.txt"));
			fos = new FileOutputStream(new File("ioFileTest1.txt"));
			//fis = new FileInputStream(new File("C:\\Users\\BrainLiu\\Desktop\\water.jpg"));
			//fos = new FileOutputStream(new File("water2.jpg"));
			//fis = new FileInputStream(new File("C:\\Users\\BrainLiu\\Desktop\\context.txt"));
			//fos = new FileOutputStream(new File("context1.txt"));
			int b;
			while ((b=fis.read())!=-1) {
				fos.write(b);
			}
			
			/*byte[] b = new byte[5];
			int len;
			while ((len = fis.read(b))!=-1) {
				fos.write(b,0,len);
			}*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
