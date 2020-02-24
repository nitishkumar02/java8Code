import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Employee
{
	int eno;
	String name;
	Employee(int eno, String name)
	{
		this.eno =eno;
		this.name = name;
	}
	public String toString()
	{
		return eno+":"+name;
	}
}//class Employee

class OwnObject
{
	public static void main(String[] args)
	{
		//Employee e1 = new Employee(10,"Sahil");
		//System.out.println(e1);//comment the tostring in 1st case
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(12,"Aman"));
		l.add(new Employee(18,"Rohit"));
		l.add(new Employee(16,"Sangam"));
		l.add(new Employee(19,"Shivam"));
		l.add(new Employee(15,"Pranav"));
		l.add(new Employee(14,"Sahil"));
		System.out.println("Before Sorting");
		System.out.println(l);
		Collections.sort(l, (e1,e2)->(e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0);
		System.out.println("After Customized Sorting");
		System.out.println(l);
	}
}