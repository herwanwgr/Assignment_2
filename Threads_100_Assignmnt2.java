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

class Hi extends Thread
{
    public void run()
    {
            for(int i=1;i<=100;i++)
            {
                System.out.println("Hi");
                try {Thread.sleep(1000); } catch(Exception e){}
            }
    }
}
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

public class Threads_100_Assignmnt2 {
    
    public static void main(String[] args)
    {
       Hi obj1 = new Hi();
       Hello obj2 = new Hello();
       
       obj1.start();
       try {Thread.sleep(100); } catch(Exception e){}
       obj2.start();
       
               
    }
    
    
}
