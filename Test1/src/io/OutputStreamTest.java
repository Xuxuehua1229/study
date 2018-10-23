package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest {
	public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
        	fos = new FileOutputStream(new File("ioTest4.txt"));
			fos.write(new String("ABCDEFGHIJ").getBytes());
		} catch (IOException e) {
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
		}
        
	}
}
