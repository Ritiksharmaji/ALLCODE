package Coding_ractice_2B;
import java.util.*;
public class compare_sum_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the two digit numbers");
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		// for the finding the numbers of element in string
		int total=s.length();
		
		// this is for the first digit.
		char first=s.charAt(0);
		int a=Character.getNumericValue(first); 
		
		// this is for the second digit
		char last=s.charAt(1);
		int b=Character.getNumericValue(last);
		
		int c= a + b;
		System.out.println(c);
		
				

	}

}
