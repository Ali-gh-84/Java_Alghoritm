import Klass.Klass;
import Term.Term;
import Student.Student;

import java.util.*;

public class Manage {
    public static void main(String[] args) {

        Term term = new Term();
        Klass klass = new Klass();
        Student student = new Student();


        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("\t* WELCOME TO THE MANAGE UNIVERSITY APP *");
        System.out.println();

        boolean again = true;
        while (again) {
            System.out.println();
            System.out.println("\t 1) Add Term");
            System.out.println("\t 2) Show List Classes in Term");
            System.out.println("\t 3) Add Student");
            System.out.println("\t 4) Show All Student");
            System.out.println("\t 5) Get Lesson"); // showStudent_Lessons
            System.out.println("\t 6) Show Student and Lessons with Unit");
            System.out.println("\t 7) Exit");
            System.out.println();

            System.out.print("\tEnter an option between 1-7 : ");
            int option = scanner.nextInt();
            System.out.println();


            switch (option) {
                case 1:
                    term.getInfoTerm();
                    break;
                case 2:
                    term.klassTerms();
                    break;
                case 3:
                    student = new Student();
                    student.getName_Id();
                    break;
                case 4:
                    Student.allStudents.forEach(s ->
                            System.out.println("\t -> " + s.getFirstName() + " " + s.getLastName() + " ID: " + s.getId()));
                    break;
                case 5:
                    term.getlessons(student);
                    break;
                case 6:
                    student.showStudent_Lessons(term , student , klass);
                    break;
                case 7:
                    System.out.println("\tThanks For Using Our App !");
                    again = false;
                    break;
                default:
                    System.out.println("\tThe Option is not correct !");
                    break;
            }
        }
    }
}
