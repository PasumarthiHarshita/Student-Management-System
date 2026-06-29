import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StudentDAO dao=new StudentDAO();

        System.out.print("Enter Name: ");
        String name=sc.nextLine();

        System.out.print("Enter Department: ");
        String dept=sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks=sc.nextInt();

        Student s=new Student(0,name,dept,marks);
        dao.addStudent(s);

        sc.close();
    }
}
