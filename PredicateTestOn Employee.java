package com.java8;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
    String name;
    String designation;
    double salary;
    String city;

    public Employee(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }
    @Override
    public String toString()
    {
        String s = String.format("[%s,%s,%.2f,%s]",this.name,this.designation,this.salary,this.city);
        return s;
    }
}
public class PredicateTest03 {
    public static void main(String[] args) {
        // make list of employee
        ArrayList<Employee> list = new ArrayList<>();

        // Add Employee
        populate(list);

        // who is manager
        Predicate<Employee> mgr = eobj1-> eobj1.designation.equals("Manager");
        System.out.println("Employee who is manager : ");
        //diplay those
        diplay(mgr,list);

        //banglore
        Predicate<Employee> bgr = eobj1-> eobj1.city.equals("Bangalore");
        System.out.println("Employee who Lives in Bangalore : ");
        //diplay those
        diplay(bgr ,list);

        // salary <20000
        Predicate<Employee> slalesstwnty = eobj1-> eobj1.salary <20000;
        System.out.println(" Employees whose slaray <20000 : ");
        //diplay those
        diplay(slalesstwnty ,list);

        // all mangers from bangalore city
        System.out.println(" All Managers from Bangalore city for Pink Slip : ");
        diplay(mgr.and(bgr),list);

        //println("Employees Information who are either Managers or salary <2000
        System.out.println("Employees Information who are either Managers or salary <20000");
        diplay(mgr.or(slalesstwnty),list);
        System.out.println("All Employees Information who are not managers:");
        diplay(mgr.negate(),list);

    }

    public static void populate(ArrayList<Employee> employeeList)
    {
        // add employee
        employeeList.add(new Employee("Nitish","CEO",30000,"Hyderabad"));
        employeeList.add(new Employee("sunny","Manager",20000,"Hyderabad"));
        employeeList.add(new Employee("Mallika","Manager",20000,"Bangalore"));
        employeeList.add(new Employee("Kareena","Lead",15000,"Bangalore"));
        employeeList.add(new Employee("Katrina","Lead",120000,"Ranchi"));
    }

    public static void diplay (Predicate<Employee> pt, ArrayList<Employee> list)
    {
        //for each object
        //test
        for (Employee e1:list) {
            //check for
            if(pt.test(e1))
            {
                System.out.println(e1);
            }
        }
    }
}
