package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"abc","xyz","bch"};

		ArrayList<String> list1=new ArrayList<String>();
		//add data
		list1.add("neha");
		list1.add("raja");
		list1.add("pinky");
		System.out.println(list1);

		//Access the data at 3rd position
		System.out.println("the data at 3rd position is:"+list1.get(2));

		//Remove data
		list1.remove(0);
		System.out.println(list1);

		//Access the data at 0 position
		System.out.println("the data at 1st postion is :" +list1.get(0));

		list1.add("puja");
		list1.add("rani");
		list1.add("pankaj");
		System.out.println(list1);

		//For print last data in list size()is used.
		System.out.println("Last name is: " +list1.get(list1.size()-1));


		//change the value at 3rd position i want to rename that to sarita
		//With the use of set()function i can change puja to savita.
		list1.set(2, "savita");
		System.out.println(list1);
		list1.add("ankita");
		System.out.println(list1);
		//Iterate through the list
		for( int i=0; i<list1.size(); i++) {
			//System.out.println("value of index" + i + " "+list1.get(i));
			//find direct savita in table

			if(list1.get(i).equals("savita")) {
				System.out.println("value of savita is"+i );
			}
		}

		for(String name:list1) {
			System.out.println(name);
		}

		//Sorting the data in ascending order
		Collections.sort(list1);
		System.out.println(list1);
		
		// Sorting data in Descending order data
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);
	}
}



