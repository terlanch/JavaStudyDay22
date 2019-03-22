package cn.tedu.practice;

import java.io.FileReader;
import java.io.IOException;

public class Demo04 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\123.txt");
		char[] chs = new char[6];
		int len ;
		while((len = fr.read(chs)) != -1){
			System.out.println(new String(chs,0,len));
		}
		fr.close();
	}
}
