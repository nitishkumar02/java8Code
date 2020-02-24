import java.util.TreeMap;
class TreeMapComparator
{
	public static void main(String[] args)
	{
		//TreeMap<Integer,String> t = new TreeMap<Integer, String>();//1st
		TreeMap<Integer,String> t = new TreeMap<Integer, String>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);//2nd
		t.put(10, "Rohit");
		t.put(20,"Amit");
		t.put(30,"Megha");
		t.put(5,"Annu");
		t.put(95,"Nitesh");
		t.put(80,"Money");
		t.put(25,"Sahil");
		t.put(65,"Sangam");
		System.out.println(t);
	}
}