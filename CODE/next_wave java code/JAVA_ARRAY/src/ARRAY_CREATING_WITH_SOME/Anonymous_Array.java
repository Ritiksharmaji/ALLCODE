package ARRAY_CREATING_WITH_SOME;

public class Anonymous_Array {
	
	public static void person(int a[])
	{
		for(int i : a)
		{
			System.out.println(i);
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * this is anonymous arry
		 */
		person(new int[] {10,20,30,40,50});

	}

}
