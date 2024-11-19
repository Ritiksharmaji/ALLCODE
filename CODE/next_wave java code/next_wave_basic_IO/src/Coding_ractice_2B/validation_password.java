package Coding_ractice_2B;

import java.util.Scanner;

// Write a program to check if the given string is a valid password or not.
//A string is considered as a valid password if the number of characters present is greater than 7.
public class validation_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the password");
		String s= sc.next();
		
		if(s.length() >=7)
		{
			System.out.println("password is correct");
		}
		else {
			System.out.println("password is wrong");
		}

	}

}
