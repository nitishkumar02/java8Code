interface Interf
{
	public void m1();
}

class Demo implements Interf
{
	public void m1()
	{
		System.out.println("Normal implemntaion");
	}
}

class SmplClassWithoutLamda
{
	public static void main(String[] args)
	{
		Interf i = new Demo();
		i.m1();
	}
}