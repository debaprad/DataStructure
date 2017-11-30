package jpmorgan;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*Write a Java Program in which a class takes four integer arguments as input(a, b, c and d). 
Do addition of (a+b) on one thread, 
addition of (c+d) on another thread and multiplication of(a+b) * (c+d)) on main thread.*/
public class Q1 {
	final static CountDownLatch cdl = new CountDownLatch(2);
    final static int a=10;
    final static int b=20;
    final static int c=30;
    final static int d=40;




    public static void main(String args[]){
       
        ExecutorService executor = Executors.newFixedThreadPool(2);
       
        //Create MyCallable instance
        int i=5;
        final int k;
        Callable<Integer> cl1= ()-> {

            
            cdl.countDown();
            return a+b;
        };
        Callable<Integer> cl2= ()-> {

            
            cdl.countDown();
            return c+d;
        };

            Future<Integer> future1 = executor.submit(cl1);
        Future<Integer> future2 = executor.submit(cl2);

        try {
            cdl.await();
            System.out.print(future1.get()*future2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (ExecutionException e) {
            e.printStackTrace();
        }

        //shut down the executor service now
        executor.shutdown();
    }


}
