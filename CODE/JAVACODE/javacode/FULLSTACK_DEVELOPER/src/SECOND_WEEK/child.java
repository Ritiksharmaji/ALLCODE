package SECOND_WEEK;

public class child extends parent implements first_one,second_one {
	
	 public void childdisplay() {
	  System.out.println("Hello I am Child");
	 }
	 public void add() 
	 {
		 System.out.println("i am implimentation of add");
	 }
	 public void add(int i, int j)
	 {
		 int k = i+j;
		 System.out.println("i am implimentation of add with 2 values:   " + k);
	 }
	 public void add(int i, int j, int k)
	 {
		 int sum = i+j+k;
		 System.out.println("i am implimentation of add with 3 values:   " + sum);
	 }
	 
	 public void substraction() {
		 System.out.println("i am implimentation of substraction ");
		 }
		public void substraction(int i, int j) {

			 int k = i-j;
			 System.out.println("i am implimentation of substraction with 2 values:   " + k);
		 
		}
		public void substraction(int i, int j, int k) {
			 int substraction = i-j-k;
			 System.out.println("i am implimentation of substraction with 3 values:   " + substraction);
		 }
	 
	}

