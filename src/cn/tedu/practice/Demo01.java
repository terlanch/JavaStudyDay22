package cn.tedu.practice;

import java.io.File;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		//创建文件
		File file = new File("D:\\HelloWorld.txt");
		file.createNewFile();
		if(file.isDirectory()){
			System.out.println("HelloWorld.txt是目录");
		}
		if(file.isFile()){
			System.out.println("HelloWorld.txt是文件");
		}
		
		File file1 = new File("D:\\IOTest");
		//创建目录
		file1.mkdirs();
		//移动文件
		file.renameTo(new File("D:\\IOTest\\HelloWorld.txt"));
		//遍历IOTest下的文件
		File[] files = file1.listFiles();
		for (File f : files) {
			System.out.println(f.getName());
		}
	}
}
