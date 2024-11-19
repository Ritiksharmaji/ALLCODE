package student;

import manegment_system.BCA;
import manegment_system.CSC;
import manegment_system.LOW;

public class student2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCA obj=new BCA();
		CSC obj1=new CSC();
		LOW obj2=new LOW();
		obj.BCA_method();
		obj1.CSC_method();
		obj2.low_method();
		// for displaying the details of above
		obj.bca_display();
		obj1.csc_display();
		obj2.low_display();

	}

}
