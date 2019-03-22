package cn.tedu.practice;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Demo08 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\a.txt");
		HashMap<Character,Integer> m = new HashMap<>();
		
		
		int count = 0;
		int len;
		
		while((len = fr.read()) != -1){
			
			Character c = (char) len;
			if(!m.containsKey(c)){
				m.put(c, 1);
			}else{
				count = m.get(c);
				m.put(c, count+1);
				}
		}
		fr.close();
		//±éÀú
		Iterator<Entry<Character,Integer>> it = m.entrySet().iterator();
		while(it.hasNext()){
			Entry<Character,Integer> entry =it.next();
			System.out.println(entry.getKey()+"("+entry.getValue()+")");
		}
	}
}
