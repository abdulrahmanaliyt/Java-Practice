//Creating Thread Using 'Runnable' interface

class MyThread implements Runnable 
{
	public void run () 
	{
		//System.out.println("Thread Starts .. ");
		String threadName = Thread.currentThread( ).getName ( );
		System.out.println("Current Thread Name : "+threadName+" statarts -- ");
		int i;
		for (i =0; i<5;i++) 
		{
			try {
				Thread.sleep(500);
				System.out.println("Thread IS Sleeping"+threadName+"s i = "+i);
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
class Thread_Creation_Using_Runnable_Upadated
{
	public static void main (String [ ] args )
	{
		System.out.println("Main Starts");
		MyThread obj1 = new MyThread ( );
		MyThread obj2 = new MyThread ( );

		Thread thread1 = new Thread ( obj1,"Thread 1");
		Thread thread2 = new Thread ( obj2,"Thread 2");

		thread1.start( );
		thread2.start( );

		System.out.println("Main Ends");
	}
}			