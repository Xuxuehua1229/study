package io;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
       /*File file = new File("D:\\io1\\ioTest.txt");
       System.out.println(file.getName());
       System.out.println(file.getAbsolutePath());
       System.out.println(file.getPath());
       System.out.println(file.getParent());
       System.out.println(file.getAbsoluteFile());
       System.out.println();*/
       File file1 = new File("testFiles/ioTest2.txt");
       System.out.println(file1.getName());
       System.out.println(file1.getAbsolutePath());
       System.out.println(file1.getPath());
       System.out.println(file1.getParent());
       System.out.println(file1.getAbsoluteFile());
       System.out.println();
       //file1.renameTo(file2):file1������Ϊfile2��Ҫ��file1һ�����ڣ�file2һ��������(�����������ļ���ʧ�������µ��������ļ�)
       /*File file2 = new File("ioTest3.txt");
       boolean b = file.renameTo(file2);
       System.out.println(b);
       File file3 = new File("D:\\io1\\ioTest1.txt");
       boolean b1 = file.renameTo(file3);
       System.out.println(b1);
       File file4 = new File("ioTest4.txt");
       boolean b2 = file1.renameTo(file4);//file1��ioTest2.txt����ʧ��file4��ioTest4.txt������
       System.out.println(b2);*/
	}
}
