package List;
/*
 * to access the indivisual elements
 */
import java.util.ArrayList;
import java.util.List;

public class class_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating a List  
		 List<String> list=new ArrayList<String>();  
		 //Adding elements in the List  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		 //accessing the element 
		// System.out.println(list[2]); error
		 
		 
		 System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0  
		 //changing the element  
		 list.set(1,"Dates");  
		 //Iterating the List element using for-each loop  
		 for(String fruit:list)  
		  System.out.println(fruit);  

	}

}
