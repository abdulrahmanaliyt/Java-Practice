//Synchronization
//1. Synchronized Method

class Data 
{
	int data;
	public Data(int data) 
	{
		this.data = data;
	}
	//Synchronized Method - Used below here
	//synchronized  void displayData(String threadName)
	void displayData(String threadName) 
	{
		System.out.println(threadName + " Start");
		System.out.println(threadName + " data = " + data);
		System.out.println(threadName + " End");
	}
}
class DataAccess implements Runnable 
{
	Data dataObj;
	DataAccess(Data dataObj) 
	{
		this.dataObj = dataObj;
	}
	public void run() 
	{
		//synchronized block - Used below
		synchronized (dataObj )
		{
			dataObj.displayData(Thread.currentThread().getName());
		}
	}
}
public class Synchronized_Thread
{
	public static void main(String[] args) 
	{
		Data data1 = new Data(10);
		
		Thread thread1 = new Thread(new DataAccess(data1), "FIRST THREAD");
		Thread thread2 = new Thread(new DataAccess(data1), "SECOND THREAD");

		thread1.start();
		thread2.start();
	}
}