interface Interf
{
	public void add(int a, int b);
}

class Demo implements Interf
{
	public void add(int a, int b)
	{
		System.out.println("The Sum By Normal implemntaion: "+ (a+b));
	}
}

class SmplClassSumWithoutLamda
{
	public static void main(String[] args)
	{
		Interf i = new Demo();
		i.add(10,20);
	}
}