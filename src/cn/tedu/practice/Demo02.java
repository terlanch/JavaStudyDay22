package cn.tedu.practice;

import java.io.File;

public class Demo02 {
	public static void main(String[] args) {
		File file = new File("D:\\±Ê¼Ç");
		search(file);
	}
	public static void search(File file){
		if(file.isDirectory()){
			
			File[] files = file.listFiles();
			for (File file2 : files) {
				System.out.println(file2.getName());
				search(file2);
			}
		}
		
	}
	
}
