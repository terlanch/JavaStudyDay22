package cn.tedu.practice;

import java.io.FileWriter;
import java.io.IOException;

public class Demo05 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\Hello.txt");
		fw.write("HelloJavaWorldƒ„∫√ ¿ΩÁ");
		fw.flush();
		fw.close();
		
	}
}
