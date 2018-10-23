package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FileInputStreamTest {
	public static void main(String[] args) {
        FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("ioTest3.txt"));
			//read():��ȡ�ļ���һ���ֽڡ���ִ�е���βʱ������-1
			/*int b = fis.read();
	        while (b!=-1) {
				System.out.print((char)b);
				b = fis.read();
			}*/
			/*int b;
			while ((b = fis.read())!=-1) {
				System.out.print((char)b);
			}*/
			//����ȡ��������д�������У���ѭ����ӡ
			byte[] b = new byte[5];
			int len;
			while ((len = fis.read(b))!=-1) {
				//��һ�ִ�ӡ��ʽ
				/*for (int i = 0; i < len; i++) {
					System.out.print((char)b[i]);
				}*/
				//�ڶ��ִ�ӡ��ʽ
				System.out.print(new String(b,0,len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fis != null){
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
