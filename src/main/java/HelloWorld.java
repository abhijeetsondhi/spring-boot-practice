import java.util.*;
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 
class Patient 
{
    private int time;
    
    public Patient(int id)
    {
        this.time = id;
    }
    public int getTime()
    {
        return this.time;
    }
}

class Notify implements Runnable
{
    Patient pat;
    public Notify(Patient x)
    {
        this.pat = x;
    }
    public void run()
    {
        try{
            while(true)
            {
                System.out.println("Dawaai de de abhi" + pat.getTime());
                Thread.sleep(pat.getTime());
            }
        }
        catch(InterruptedException e) 
        { 
            e.printStackTrace(); 
        } 
    }
}
public class HelloWorld {
    public static void main(String []args){
        System.out.println("Hello World");
        Patient n1 = new Patient(7200);
        Patient n2 = new Patient(9400);
        Patient n3 = new Patient(4000);
        
          Runnable r1 = new Notify(n1); 
        Runnable r2 = new Notify(n2); 
        Runnable r3 = new Notify(n3); 
      
          
        ExecutorService pool = Executors.newFixedThreadPool(10);   
         
        pool.execute(r1); 
        pool.execute(r2); 
        pool.execute(r3); 
        
        pool.shutdown();
     }
}
