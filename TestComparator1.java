import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


class myComparator implements Comparator<Integer>
{
	public int compare(Integer i1, Integer i2)
	{
		if(i1>i2)
		{
			return -1;
		}
		else if(i1<i2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
public class TestComparator1
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
		Collections.sort(l,new myComparator());
		System.out.println("After Sorting"+l);
	}
}

		
