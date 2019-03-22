package cn.tedu.practice;
/*
 * 统计字母a和A出现的总次数
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
		System.out.println("a和A出现的总次数为:"+c);
		
		
	}
}
