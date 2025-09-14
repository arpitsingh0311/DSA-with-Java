package M23_OOPS;

public class practicalOOPS {

    //Classes creation 
    //creating a new data type with diff attributes

    public static class Student{
        String name;
        int rollNo;
        double percent;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Arpit";
        s1.rollNo = 14;
        s1.percent = 95.20;
        System.out.println(s1.name);

        Student s2 = new Student();
        s2.name = "Himanshu";
        s2.rollNo = 45;
        s2.percent = 93.25;
        System.out.println(s2.name);



    }




}
