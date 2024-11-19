package ArrayList_pack;

import java.util.ArrayList;
import java.util.Arrays;

public class class3 {

	public static void main(String[] args) {
		
		
		String s[]= { "ritik","bihari","boy"};
		for(int i=0;i<s.length;i++)
		{
		System.out.print(s[i]+" ");
		}
		System.out.println();

// to convert array into arrayList
		ArrayList al=new ArrayList(Arrays.asList(s));
		
		System.out.print(al);

	}

}
