class Thread_Class
{
	public static void main(String args [ ])
	{
		Thread thread = Thread.currentThread( ); 
		System.out.println("Parent Name :"+thread.getName());

		//renaming thread
		thread.setName("MyCoolThread");
		System.out.println("Rename :"+thread.getName());

		//setting Priority
		System.out.println("Default Priority: "+thread.getPriority());
		thread.setPriority(7);
		System.out.println("Set Priority: "+thread.getPriority());

		//Java Priority constent
		System.out.println("MIN_PRIORITY: "+Thread.MIN_PRIORITY);
		System.out.println("NORM_PRIORITY: "+Thread.NORM_PRIORITY);
		System.out.println("Max_PRIORITY: "+Thread.MAX_PRIORITY);
	
		System.out.println("main Thread Sleeping !");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		System.out.println("Current State:  "+thread.getState());
		System.out.println("Is Current State Alive:  "+thread.isAlive());
		System.out.println("main Thread Sleep Over!");
	}
}