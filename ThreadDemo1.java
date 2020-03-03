class myThread extends Thread
{
	public void run()
	{
		for( int i= 0; i<10; i++)
		{
			System.out.println("Child Thread");  //whole myThread .. Defining a thread
			                                     //by  part inside run ...Job of the thread.
			                                      // executed Child Thread
		}
	}
}

class ThreadDemo1
{
	public static void main(String[] args)
	{
		myThread t = new myThread();// Thread Instantiation, only main Thread

		t.start();//two threads from here ..main and Child..

       
        //Executed by main Thread
		for(int i =0; i<10; i++)              
		{
			System.out.println("Main Thread");
		}
	}
}