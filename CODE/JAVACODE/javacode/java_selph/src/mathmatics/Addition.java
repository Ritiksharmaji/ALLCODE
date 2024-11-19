package mathmatics;

public class Addition {
	int x,y;
	String z;
	public void math(int x,int y,String z) {
		this.x=x;
		this.y=y;
		this.z=z;
		if(z=="add")
		{
			System.out.println("addition="+(x+y));
		}
		else if(z=="sub")
		{
			System.out.println("subtraction="+(x-y));
			
		}
		else if(z=="mul")
		{
			System.out.println("multiple="+(x*y));
			
		}
		else if(z=="dev")
		{
			System.out.println("devisitn="+(x/y));
		}
		else {
			System.out.println("invalid math operater");
		}
		
	}

}
