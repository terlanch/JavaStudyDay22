package cn.tedu.practice;
/*
 * ͳ����ĸa��A���ֵ��ܴ���
 */
import java.io.FileReader;
import java.io.IOException;

public class Demo07 {
	static int c = 0;
	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\a.txt");
		int len;
		while((len = fr.read()) != -1){
			if(len == 'a'|| len == 'A'){
				c++;
			}
			
		}
		fr.close();
		System.out.println("a��A���ֵ��ܴ���Ϊ:"+c);
		
		
	}
}
