package cn.tedu.practice;

import java.io.File;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		//�����ļ�
		File file = new File("D:\\HelloWorld.txt");
		file.createNewFile();
		if(file.isDirectory()){
			System.out.println("HelloWorld.txt��Ŀ¼");
		}
		if(file.isFile()){
			System.out.println("HelloWorld.txt���ļ�");
		}
		
		File file1 = new File("D:\\IOTest");
		//����Ŀ¼
		file1.mkdirs();
		//�ƶ��ļ�
		file.renameTo(new File("D:\\IOTest\\HelloWorld.txt"));
		//����IOTest�µ��ļ�
		File[] files = file1.listFiles();
		for (File f : files) {
			System.out.println(f.getName());
		}
	}
}
