package Student;

import java.util.*;

import Klass.Klass;
import Term.Term;
import java.lang.*;

public class Student {

    private String firstName;
    private String lastName;
    private int id;
    public static ArrayList<Student> allStudents = new ArrayList<>();
    public HashMap<Integer, String> getLellonses = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    // for return id*
    public int getId() {
        return id;
    }

    // for return first name*
    public String getFirstName() {
        return firstName;
    }

    // for return last name*
    public String getLastName() {
        return lastName;
    }

    // for return full name*
    public String getfullName() {
        return firstName + " " + lastName;
    }


    // for get and save student with name and id*
    public void getName_Id() {
        System.out.print("\tEnter Your First Name: ");
        firstName = scanner.next();
        System.out.print("\tEnter Your Last Name: ");
        lastName = scanner.next();

        id = (int) (Math.random() * 101);
        System.out.println("\tYour Unique Student Number is: " + id);

        System.out.println("\tAdded Student.");
        allStudents.add(this);
    }

    // for show student and them lessons
    public void showStudent_Lessons (Term term , Student student , Klass klass){

        term.validStudent(student);

        System.out.println("\t -> " + getfullName() + " in year : " + term.getyear() + " in HalfYear : " + term.gethalfYear() + " " + term.classess);
    }
}
