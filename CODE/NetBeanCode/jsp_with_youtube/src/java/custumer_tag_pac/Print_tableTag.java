/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package custumer_tag_pac;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author RITIK SHARMA
 */
public class Print_tableTag  extends TagSupport{
    
    
	public int number;
	//settert
	public void setNumber(int number)
	{
		this.number=number;
	}
	
	public int doStartTag()throws JspException
	{
		//PRINT TABLE
		//1-10 lop
		
		
		
		try {
			JspWriter out=pageContext.getOut();
		for(int i=1;i<=10;i++)
		{
			out.println((i*number)+"<br>");
			
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
            return 0;
	}

    
}
