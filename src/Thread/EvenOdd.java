package Thread;

public class EvenOdd {

	int range=20;
	int i=0;
	
	public static void main(String[] args) {
		final EvenOdd evenOdd=new EvenOdd();
		Thread th1=new Thread(new Even(evenOdd));
		Thread th2=new Thread(new Odd(evenOdd));
		//th1.start();
		//th2.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				//EvenOdd evenOdd=new EvenOdd().evenOdd;
				while(evenOdd.i <=evenOdd.range)
				{
					synchronized (evenOdd) {
						if(evenOdd.i%2==0)
						{
							System.out.println(evenOdd.i);
							try {
								Thread.sleep(500);
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
		}).start();
		
new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(evenOdd.i <=evenOdd.range)
				{
					synchronized (evenOdd) {
						if(evenOdd.i%2!=0)
						{
							System.out.println(evenOdd.i);
							
							try {
								Thread.sleep(500);
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
		}).start();
	}
}
