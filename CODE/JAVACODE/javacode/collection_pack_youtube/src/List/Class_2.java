package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * converting array to list 
 */
public class Class_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] = {"ritik","golu","ankit"}; // String type array
		
		// printing the array elements
		System.out.println("elements of arrays:");
		for(String s: a)
		{
			System.out.println(s);
			
		}
		List<String> obj = new ArrayList<String>();
		obj.add(a[0]);
		obj.add(a[2]);
		
		// printing the list
		System.out.println("list elements :"+obj);
		
		Iterator it = obj.iterator();
		System.out.println("list elemets by iterator:");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		

	}

}
