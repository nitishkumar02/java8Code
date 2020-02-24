import java.util.TreeSet;
class TreeSetComparator
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t = new TreeSet<Integer>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
		t.add(10);
		t.add(45);
		t.add(23);
		t.add(78);
		t.add(63);
		t.add(96);
		t.add(12);
		System.out.println(t);
		
	}
}