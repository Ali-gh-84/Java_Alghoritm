package Term;

import Klass.Klass;
import Student.Student;

import java.util.*;


public class Term {

    public int getyear() {
        return year;
    }

    public int gethalfYear() {
        return halfYear;
    }

    private Scanner scanner = new Scanner(System.in);
    private int year;
    private int halfYear;
    private ArrayList<Klass> lessons = new ArrayList<>();
    public int searchName;
    public ArrayList<String> classess = new ArrayList<>();
    public ArrayList<Integer> unitsLesson = new ArrayList<>();
    public int totalUnit = 0;


    // for get and save information term*
    public void getInfoTerm() {

        System.out.print("\tEnter Year of Education: ");
        year = scanner.nextInt();

        System.out.print("\tEnter Half Year of Education: ");
        halfYear = scanner.nextInt();

        boolean again = true;
        while (again) {


            Klass klass = new Klass();

            klass.getInfoKlass();
            lessons.add(klass);
            classess.add(klass.getKlassName());
            unitsLesson.add(klass.getcountUnit());

            System.out.println();

            System.out.print("\tDo Yoy Want Add lessons in this Term ? (y/n) : ");
            String answer = scanner.next();
            if (answer.equals("n")) {
                again = false;
            }
        }
    }

    // for show details term classess*
    public void klassTerms() {

        System.out.println("\tClasses in this Term -> Year " + getyear() + " in Half Year " + gethalfYear() + " :");
        for (Klass e : lessons) {
            System.out.println("\t -> " + e.getKlassName() + " untits : " + e.getcountUnit() + " in : " + e.getklassPlace() + " at : " + e.getklassDay() + " at : " + e.getklassClock() + " Duration : " + e.getklassDuration() + " min.");
        }
    }

    // for get lesson by student
    public void getlessons(Student student) {

        boolean again = true;

        while (again) {

            validStudent(student);

            System.out.println();
            System.out.print("\tChoose lessons : ");
            String chooseLesson = scanner.next();

            // get selected klass*
            Klass selectedKlass = null;
            for (Klass klass : lessons) {
                if (klass.getKlassName().equals(chooseLesson)) {
                    selectedKlass = klass;
                    break;
                }
            }

            if (selectedKlass != null) {
                if (!student.getLellonses.contains(chooseLesson)) {
                    int unit = selectedKlass.getcountUnit();

                    if ((totalUnit + unit) < 20) {
                        student.getLellonses.add(chooseLesson);
                        student.getunit.add(unit);
                        totalUnit += unit;
                        System.out.println("\t" + student.getfullName() + " Choose -> " + chooseLesson + " (Units: " + unit + ")");
                    } else {
                        System.out.println("\tTotal units exceed 20. You cannot choose this lesson.");
                    }
                } else {
                    System.out.println("\tYou have already selected this lesson!");
                }
            } else {
                System.out.println("\tLesson not found!");
            }

            System.out.print("\tDo you want to add another lesson (y/n) : ");
            String answer = scanner.next();

            if (answer.equals("n")) {
                again = false;
            }
        }
    }


    // for validation student
    public int validStudent(Student student) {

        boolean find = true;

        while (find) {

            System.out.print("\tEnter ID Of Studen For Search : ");
            searchName = scanner.nextInt();

            if (searchName == student.getId()) {
                System.out.println("\t Student Finded : " + student.getfullName());
                find = false;
            } else {
                System.out.println("\tStudent Not Found !");
                break;
            }
        }
        return searchName;
    }
}

