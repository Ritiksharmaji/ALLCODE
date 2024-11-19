import java.io.*;
class for_list
{
public static void main(String[] args)throws Exception
{
int count=0;
File f=new File("E:");
String[] s=f.list();
for(String s1:s)
{
count++;
//System.out.println(f.exists());
System.out.println(s1);
}
System.out.println("total number of file"+count);

}


}
