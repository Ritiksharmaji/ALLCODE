package ArrayList_pack;

import java.util.ArrayList;
import java.util.List;

public class class1 {

	public static void main(String[] args) {
/*        there are three way to creat the ArrayList object
		    1) creating the homogenious arrayList
	        2) creating the hetrogenious arrayList.
		    3)creating ArrayList object by refrence variable of interface
*/
		
		// 2) creating the ArrayList which is holding the all types of data.
		/* way of creating the arraylist
				 * 1 way 
						 * ArrayList li new ArrayList();
				 * 2 way 
						 * ArrayList<String> li=new ArrayList();
				 * 3 way
						 * ArrayList <String> li=new ArrayList <String>();
				 * 4th way
						 * List li=ArrayList();
				* 5th way 
						 * List li=ArrayList<String>();
						 */
		ArrayList al=new ArrayList();
	
		// adding the items
		al.add("ritik");
		al.add("sharma");
		al.add(21);
		al.add(459.909);
		
		//printing Arraylist
		System.out.println(al);
		
		//Reading data from ArrayList
		
		for(Object e:al)
		{
			System.out.print(e);
		}
		System.out.println();

// adding the data in particular location in ArrayList
		
		al.add(0, true);
		al.add(2, "Ankit");
//printing arrayList
		System.out.println(al);

		
		// creating ArrayList object by refrence variable of interface
		
		List l=new ArrayList();
		//

	}

}




