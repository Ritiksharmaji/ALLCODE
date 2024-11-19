package internet_project_nptl;
import java.io.*;
import java.net.*;
public class URLConnectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		URL u=new URL("https://nptl.ac.in/course.php");
		URLConnection uc=u.openConnection();
		InputStream st=uc.getInputStream();
		
		int b;
		while((b=st.read())!=-1)
		{
			System.out.print((char)b);
		}
	}catch(Exception e)
		{
		System.out.println(e);
		}
	}
}
