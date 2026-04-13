//No Thread

class MyThread
{
	String threadName;
	MyThread(String threadName)
	{
		this.threadName = threadName;
	}

	public void run () 
	{
		
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
class NoThread
{
	public static void main (String [ ] args ) throws InterruptedException
	{
		System.out.println("Main Starts");
		MyThread obj1 = new MyThread ("Thread 1" );
		MyThread obj2 = new MyThread ("Thread 2");


		obj1.run( );
		obj2.run( );
			
		System.out.println("Main Ends");
	}
}			