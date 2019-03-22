package cn.tedu.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo06 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\kbzm.png");
		FileOutputStream fos = new FileOutputStream("D:\\abc\\kbzm.png");
		byte[] bys = new byte[1024];
		int len;
		while((len = fis.read(bys)) != -1){
			fos.write(bys, 0, len);
		}
		fos.close();
		fis.close();
	}
}
