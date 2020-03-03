class ThreadDemo3WithLamda
{
	public static void main(String[] args)
	{
		Runnable r = ()->{
			for(int i=0; i<10 ;i++)
		   {
			System.out.println("Child Thread");
		  }
		}
		Thread t = new Thread(r); // upto here only main Thread

		t.start();// main Thread and Child Thread....
		for(int i=0; i<10 ;i++)
		{
			System.out.println("Main Thread");
		}
	}
}