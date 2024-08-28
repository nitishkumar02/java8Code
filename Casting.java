package com.Casting;

public class Contact
{
    public String name;

    /*
     * current object(this) who is calling like here contact1 , contact2
     */
    public String toString()
    {
        String temp = "";
        if(this instanceof Friend)
        {
            temp= " Friend Name: " + name + ", phoneNumber: " + ((Friend)this).phoneNumber;
        }
        else if(this instanceof Work)
        {
            temp= " Work Name: " + name + ", Email: " + ((Work)this).email;
        }
        return temp;
    }

}
class Friend extends Contact
{
    public String phoneNumber;

//    public String toString()
//    {
//        return "phoneNumberl " + this.phoneNumber + " Name " + this.name;
//    }

}
class Work extends Contact
{
    public String email;

    // to string
//    public String toString()
//    {
//        return "Email " + this.email + " Name " + this.name;
//    }

}

class TestContact
{
    public static void main(String[] args)
    {
        Friend cont = new Friend();
        cont.name ="Jai";
        cont.phoneNumber ="12345678";

        Work workobj = new Work();
        workobj.email="abc@gmail.com";
        workobj.name ="Sharma";

//
//        System.out.println(cont);
//        System.out.println(workobj);

        /*
         * Friend contact1 = new Friend();
         * use Superclass obj = new Subclass()
         */
        Contact contact1 = new Friend();
        contact1.name = "Alex";
        //contact1.phoneNumber = "555"; // can not access directly ,since Contact has no access
      ((Friend)contact1).phoneNumber = "555";


        //Work contact2 = new Work();
        Contact contact2 = new Work();
        contact2.name="Sara";
        //contact2.email;
        ((Work)contact2).email ="666@";

        /*
         * toString is called when we print the object
         */

        System.out.println(contact1);
        System.out.println(contact2);

    }


}
