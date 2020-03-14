interface interf
{
	default void m1()
	{
		System.out.println("Default Method");
	}
}

class DefaultMethodInterface1 implements interf
{
	public void m1()
	{
		System.out.println("Default Method Overrideen");
	}
	public static void main(String[] args)
	{
        DefaultMethodInterface1 obj = new DefaultMethodInterface1();
        obj.m1();
	}
}