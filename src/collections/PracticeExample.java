package collections;

import java.util.HashMap;
import java.util.Map;

public class PracticeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find out each occurrence of each word in the string using hashmap;
		String str1="clean world green world happy world";

		Map<Character,Integer> map=new HashMap();

		char[] chars = str1.toCharArray();
		for( char ch:chars) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}
			else
			{
				int value=	map.get(ch);
				map.put(ch,value+1);

			}
		}
		System.out.println(map);
	}

}


