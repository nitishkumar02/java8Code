import java.io.*;

class Student implements Cloneable, Serializable
{
    int a;
    int b;

    public Student(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
public class CloneImple
{
    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        Student student = new Student(2,3);
        System.out.println(student.hashCode());

        Student student1=(Student)student.clone();
        System.out.println(student1.hashCode());
      
        Student student2=(Student)student1.clone();
       System.out.println(student2.hashCode());
    }
}

