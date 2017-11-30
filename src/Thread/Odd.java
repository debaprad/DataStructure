package Thread;

public class Odd implements Runnable{

	EvenOdd evenOdd;
	public Odd(EvenOdd evenOdd)
	{
		this.evenOdd=evenOdd;
	}
	@Override
	public void run() {
		while(evenOdd.i <=evenOdd.range)
		{
			synchronized (evenOdd) {
				if(evenOdd.i%2!=0)
				{
					System.out.println(evenOdd.i);
					
					try {
						//Thread.sleep(500);
						evenOdd.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{
					evenOdd.i=evenOdd.i+1;
						evenOdd.notify();	
				}
			}
		}
			
	}
}
