interface interf
{
	default void m1()
	{
		System.out.println("Default Method");
	}
}

class DefaultMethodInterface implements interf
{
	public static void main(String[] args)
	{
        DefaultMethodInterface obj = new DefaultMethodInterface();
        obj.m1();
	}
}