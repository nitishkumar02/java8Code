import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class TestComparator2
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(3);
		l.add(23);
		l.add(25);
		System.out.println("Befor Sorting"+l);
		Collections.sort(l,(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
		System.out.println("After Sorting"+l);
	}
}