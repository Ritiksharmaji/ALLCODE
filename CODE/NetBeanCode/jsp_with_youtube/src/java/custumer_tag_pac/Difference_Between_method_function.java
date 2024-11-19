/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package custumer_tag_pac;

/**
 *
 * @author RITIK SHARMA
 */
// a normal class 
class person{
    
    int x,y,z;
    public int add(int x,int y)
    {
        this.x=x;
        this.y=y;
        
        z = x+y;
        return z;
        
    }
}
// main class
public class Difference_Between_method_function {  
    public static void main(String args[])
    {
        
        person obj = new person();
        int x = obj.add(50, 50);
        System.out.println("addition of two number by method:"+x);
        
       int y = add(20,60);
       
        System.out.println("addition of two number by function:"+y);
    }
    public static int add(int x,int y)
    {
        int a , b, c;
        a = x;
        b = y;
        c = a+b;
        return c;
    }   
}
