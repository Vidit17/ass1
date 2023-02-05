/*Q1. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign
the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.*/

class Student{
    String name;
    int roll_no;
}

public class ass1{
    public static void main(String[] args) {
        Student vidit = new Student();
        vidit.name="VIDIT KADIYAN";
        vidit.roll_no=575;
        System.out.println(vidit.name);
        System.out.println(vidit.roll_no);
    }
}