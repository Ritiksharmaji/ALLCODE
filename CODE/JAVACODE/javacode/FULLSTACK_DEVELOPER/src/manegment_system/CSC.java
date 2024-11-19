package manegment_system;

//import java.util.Scanner;

public class CSC extends main_class{
	public void CSC_method()
	{
		
		System.out.println("enter the name of HOD_of csc");
		name_hod=sc.nextLine();
		System.out.println("enter the id of HOd");
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
	public void csc_display()
	{
		System.out.println("---------------------------");
		System.out.println("name of hod of csc="+name_hod+" "+"id of hod="+id_hod);
		System.out.println("name of facality of csc="+name_facality+" "+"id of facality="+id_facality);
		System.out.println("name of student of csc="+name+" "+"id of student="+id_name);
		
		System.out.println("---------csc detail over------------------");
	}
	


}
