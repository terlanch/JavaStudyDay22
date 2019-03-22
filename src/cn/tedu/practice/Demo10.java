package cn.tedu.practice;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo10 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\a.txt");
		RandomAccessFile raf = new RandomAccessFile("D:\\a.txt", "rw");
		
		
		for(long i = file.length()-1;i>=0;i--){
			raf.seek(i);
			char c = (char) raf.read();
			System.out.print(c);
		}
		raf.close();
	}
}
