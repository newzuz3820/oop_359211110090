package ooplab9;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Sakkrin","1234567890119",
                new Address("20/126 M.5","NST","80000"),
                new Job("private business","30000"));


        System.out.println(person.toString());
        person.getJob().setsalary("500000");

        System.out.println(person.getJob());

    }//main

}//class