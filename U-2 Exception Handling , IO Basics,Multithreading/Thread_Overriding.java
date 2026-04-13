//Extending Main thread Thread Using 'Runnable' interface

class MyThread extends Thread
{
	MyThread(String threadName)
	{
		super(threadName);
	}
	@Override
	public void run () 
	{
		
		String threadName = getName ( );
		System.out.println("Current Thread Name : "+threadName+" statarts -- ");
		int i;
		for (i =0; i<5;i++) 
		{
			try {
				Thread.sleep(500);
				System.out.println(threadName+" is Sleeping "+i+"ns" );
			}
			catch (InterruptedException ie) 
			{
			ie.printStackTrace ( );
			}
		}
		//System.out.println("i = "+i);
		System.out.println("-- "+threadName+" ends.");
	}
}
class Thread_Overriding
{
	public static void main (String [ ] args ) throws InterruptedException
	{
		System.out.println("Main Starts");
		MyThread obj1 = new MyThread ("Thread 1" );
		MyThread obj2 = new MyThread ("Thread 2");


		obj1.start( );
		obj2.start( );
		
		obj1.join(); // Matches the object names above
		obj2.join();
		System.out.println("Main Ends");
	}
}			