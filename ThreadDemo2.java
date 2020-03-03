class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=0; i<10; i++);
	}
}

class ThreadDemo2
{
	public static void main(String[] args)
	{
		Runnable r = new Runnable();
		Thread t = new Thread(r); // upto here only main Thread

		t.start();// main Thread and Child Thread....
		for(int i=0; i<10 ;i++)
		{
			System.out.println("Main Thread");
		}
	}
}