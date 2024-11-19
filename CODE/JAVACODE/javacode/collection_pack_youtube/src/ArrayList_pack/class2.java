package ArrayList_pack;

import java.util.ArrayList;
import java.util.Collections;

public class class2 {

	public static void main(String[] args) {
		
// creating a homogenious ArrayList
		ArrayList <String> str=new ArrayList();
// adding data into it
		str.add("hello");
		str.add("how are you");
		str.add("Ritik");
		str.add("sharma");
		str.add("ankit");
		//str.add(12); erroe
//printing fist arrayList
		System.out.println("this is first ArrayList");
		System.out.print(str);
		System.out.println();
		System.out.println(".............");
		System.out.println();

		
// creating another ArrayList
		ArrayList al=new ArrayList();
// adding data into it.
		al.add(21);
		al.add("abhi");
		al.add("Golu");
// printing second arrayList
		System.out.println("this second Arraylist");
		System.out.print(al);
		System.out.println();
		System.out.println(".............");
		System.out.println();
		Collections.sort(str);
		System.out.println("After sorting second Arraylist");
		System.out.print(al);
		System.out.println();

// adding one ArrayList object into another ArrayList object
		al.addAll(str);
//printing data from Arraylist
		System.out.println("After combine both ArrayList into second ArrayList");
		System.out.println(al);
		System.out.println(".............");
		System.out.println();
//sorting the combination ArrayList		
		Collections.sort(str);
		System.out.println("After sorting combination of both Arraylist");
		System.out.print(al);
		System.out.println(".............");
		System.out.println();
//to sorting we are using the Collections class which is having the sort() method
		Collections.sort(str);
		System.out.println("After sorting first Arraylist");
		System.out.print(str);
		System.out.println("...............");
		System.out.println();


// to sort the reverse order
		
		Collections.sort(str,Collections.reverseOrder());
		System.out.println("After sorting reverse order first Arraylist");
		System.out.print(str);
		System.out.println();


// to suffling 
	Collections.shuffle(str);
	System.out.print("after suffling the first arraylist:");
	System.out.print(str);



	}

}
