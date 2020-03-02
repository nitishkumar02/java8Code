interface Interf
{
	public void add(int a, int b);
}

class SmplClassSumWithLamda
{
	public static void main(String[] args)
	{
		Interf i = (a,b)->System.out.println("The Sum By Lamda implemntaion: "+ (a+b));;
		i.add(10,20);
		i.add(900,600);
	}
}