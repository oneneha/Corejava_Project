package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> map1=new HashMap<String,Integer>();
		//Use for add the value
		map1.put("Item1", 80);
		map1.put("Item2", 100);
		map1.put("Item3", 50);
		map1.put("Item4", 100);	
		map1.put("Item5", 200);

		System.out.println(map1);
		//Order is not mentained

		//Here i try to put another value
		//Update the Item of existing value
		map1.put("Item3", 300);
		System.out.println(map1);

		//key cannot duplicate in a Hashmap
		//we cannot put Duplicate value in Hashmap

		//Find the price of item4 from  map
		System.out.println("price of item4 is:" + map1.get("Item4"));

		//Remove the item2 from the map
		map1.remove("Item2");
		System.out.println(map1);

		//how can be iterate through a map
		for(int value:map1.values()){
		System.out.println(value);
		}
		//How to find key 
		for(String key:map1.keySet()) {
			System.out.println("The key is:"+key);
			System.out.println("The value is:" + map1.get(key));
		}
		//Find out each occurence of each word in the string using hashmap;
		String str1="clean world green world happy world";
	}

}
