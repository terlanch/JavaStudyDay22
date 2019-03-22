package cn.tedu.practice;

import java.io.File;

/*
 * 列出当前工程下的所有.java文件
 */
public class Demo03 {
	public static void main(String[] args) {
		File file = new File("D:\\Users\\TEDU\\workspace");
		javafile(file);
	
	}
	public static void javafile(File file){
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for (File file2 : files) {
				javafile(file2);
			}
				
		}else if(file.getName().endsWith(".java")){
			System.out.println(file.getName());
		}
		
	}
}
