package List;

import java.util.ArrayList;
import java.util.List;
/*
 * convert list into array...
 */
public class Class_3 {

	public static void main(String[] args) {
		List<String> obj = new ArrayList();
		// adding elements
		obj.add("ushri");
		obj.add("hasanpura");
		obj.add("siwan");
		
		// covert it into array
		int x = obj.size();
		int i=0;
		
		String a[] = new String[x];
		for(String y : obj)
		{
			a[i]=y;
			i++;
		}
		
		// printing the array elements
		for(String s:a)
		{
			System.out.print(s+" ");
		}
	}

}
