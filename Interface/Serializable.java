package com;

import java.io.*;

class Student implements Cloneable, Serializable {
    int a;
    transient int b; // Will not be serialized

    public Student(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneImple {
    private static final String FILE_PATH = "C:\\Users\\kumnit04\\Downloads\\nk.txt";

    public static void main(String[] args) {
        Student student = new Student(2, 3);

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH)))
        {
            oos.writeObject(student);
            System.out.println("Object created successfully");
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH)))
        {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println(deserializedStudent.a + " " + deserializedStudent.b);
            System.out.println("Deserialized");
        } catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
