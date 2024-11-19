package method_with_variable_listOf_parameter;

public class Example_2_9 {
	
	public static void general(Object ...v)
	{
		System.out.println("the total number of elements:"+v.length);
		
		for(Object a:v)
		{
			// to print the data
			System.out.println(a);
		}
	}
	/*
	 * for the generic method 
	 */
	
	public static <T> void generalGeneric(T ...v)
	{
		System.out.println("the total number of elements:"+v.length);
		
		for(T a:v)
		{
			// to print the data
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		Object a[] = {10,20,30,"ritik"};
		Object b[] = {40,50,34.5,'S'};
		int c[] = {};
		System.out.println("object type with array");
		general(a);
		general(b);
		general(c);
		System.out.println("object type with direct method call");
		general("ushri","hasanpura",23.45,841236,"DJ",true,"Flase");
		
		// for the generic data .....
	/*	int aa[] = {12,13,14,15,16};
	 * ------------------------------------- 
	 *  then we need to must be use only int parameter method 
	  	not generic like wise for float and double also
	 */
		Integer aa[] = {12,13,14,15,16};
		String bb[] = {"ritik shram","ankit sharma","pk sharma"};
		Double cc[] = {20.09,1.2,34.3,11.34};
		System.out.println("-----------------------");
		System.out.println("this is for generic method");
		generalGeneric(aa);
		generalGeneric(bb);
		generalGeneric(cc);
		
		
		

	}


}