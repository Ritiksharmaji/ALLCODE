package internet_project_nptl;
import java.net.*;
public class URLclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL u=new URL("https://nptl.ac.in/course.php");
			System.out.println("protocol:"+u.getProtocol());
			System.out.println("host name:"+u.getHost());
			System.out.println("port number:"+u.getPort());
			System.out.println("file name="+u.getFile());
			
		}catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

}
