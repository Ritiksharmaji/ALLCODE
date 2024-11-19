package internet_project_nptl;
import java.io.*;
import java.net.*;
public class HttpURLconnectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			URL u=new URL("https://nptl.ac.in/courses.php");
			HttpURLConnection co=(HttpURLConnection)u.openConnection();
			for(int i=1;i<=8;i++)
			{
				System.out.println(co.getHeaderFieldKey(i)+" ="+co.getHeaderField(i));
			}
			co.dis
			
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
