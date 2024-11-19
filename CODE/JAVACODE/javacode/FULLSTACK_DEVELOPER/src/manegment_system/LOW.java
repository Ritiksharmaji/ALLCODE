package manegment_system;

//import java.util.Scanner;

public class LOW extends main_class {
	
	public void low_method()
	{
		
		System.out.println("enter the name of HOD_of low");
		name_hod=sc.nextLine();
		System.out.println("enter the id of HOD");
		id_hod=sc.nextLine();
		System.out.println("enter the name of facality");
		name_facality=sc.nextLine();
		System.out.println("enter the id of FACALITY");
		id_facality=sc.nextLine();
		System.out.println("enter the name of student");
		name=sc.nextLine();
		System.out.println("enter the id of STUDENT");
		id_name=sc.nextLine();
		System.out.println("---------------------------");
		
	}
	public void low_display()
	{
		System.out.println("---------------------------");
		System.out.println("name of hod of low="+name_hod+" "+"id of hod="+id_hod);
		System.out.println("name of facality of low="+name_facality+" "+"id of facality="+id_facality);
		System.out.println("name of student of low="+name+" "+"id of student="+id_name);
		System.out.println("-----------low details over----------------");
		
		
	}

}
