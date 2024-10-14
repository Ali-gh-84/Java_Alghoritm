package Project_Twoelve;

import java.util.*;

import Project_Twoelve.Classess.University_Class;
import Project_Twoelve.Semester.universitySemester;
import Project_Twoelve.Student.universityStudent;


public class Manage_University {

    public static void main(String[] args) {

        University_Class clas2 = new University_Class();
        universityStudent clas = new universityStudent(clas2);
        universitySemester term = new universitySemester(clas);

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print("\t* WELCOME TO THE MANAGE UNIVERSITY APP *");

        System.out.println();

        boolean again = true;
        while (again) {

            System.out.println();

            System.out.println("\t 1) Add Class");
            System.out.println("\t 2) Show List Classess");
            System.out.println("\t 3) Add Student");
            System.out.println("\t 4) Show List Students and ID");
            System.out.println("\t 5) Show List Classes and Pleasses");
            System.out.println("\t 6) Show List Classes and Day of Event");
            System.out.println("\t 7) Show List Classes and Durations");
            System.out.println("\t 8) Show List Terms");
            System.out.println("\t 9) Choose Unit of Terms");
            System.out.println("\t 10) Show List Student and Unit");
            System.out.println("\t 11) Display and Calculate the Total Grade");
            System.out.println("\t 12) Show List Sudent and Average");
            System.out.println("\t 13) Exit");

            System.out.println();

            System.out.print("\tEnter an option between 1-13 : ");
            int option = scanner.nextInt();

            System.out.println();

            switch (option) {
                case 1:
                    clas2.get_name_class();
                    break;
                case 2:
                    clas2.show_name_class();
                    break;
                case 3:
                    clas.get_name_student();
                    break;
                case 4:
                    clas.show_name_student();
                    break;
                case 5:
                    clas2.show_place_class();
                    break;
                case 6:
                    clas2.show_day_class();
                    break;
                case 7:
                    clas2.show_time_class();
                    break;
                case 8:
                    clas.show_terms();
                    break;
                case 9:
                    clas.get_terms();
                    break;
                case 10:
                    clas.show_stuednt_unit();
                    break;
                case 11:
                    term.average_students();
                    break;
                case 12:
                    term.show_student_average();
                    break;
                case 13:
                    System.out.println("\tThanks For Use Our App !");
                    again = false;
                    break;
                default:
                    System.out.println("\tThe Option is not correct !");
                    break;
            }
        }
    }
}