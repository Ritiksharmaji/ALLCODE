package mathmatics;
import mathmatics.Addition;
import java.util.*;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		String z;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a data");
		x=sc.nextInt();
		System.out.println("enter second data");
		y=sc.nextInt();
		System.out.println("enter operaterr(either sum,sub,mul,dev");
		z=sc.next();
		
		Addition obj=new Addition();
		obj.math(x,y,z);

	}

}
