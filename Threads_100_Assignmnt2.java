/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads_100_assignmnt2;

/**
 *
 * @author herwan
 */

class Hello extends Thread
{
    public void run()
    {
            for(int i=1;i<=100;i++)
            {
                System.out.println("Hello");
                try {Thread.sleep(1000); } catch(Exception e){}
            }
    }
}
class Welcome extends Thread
{
public void run()
    {
            for(int i=1;i<=100;i++)
            {
                System.out.println("Welcome");
                try {Thread.sleep(1000); } catch(Exception e){}
            }
    }
}

public class Threads_100_Assignmnt2 {
    
    public static void main(String[] args)
    {
       Hello obj1 = new Hello();
       Welcome obj2 = new Welcome();
       
       obj1.start();
       try {Thread.sleep(100); } catch(Exception e){}
       obj2.start();
       
               
    }
    
    
}
