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


    // for get and save information term*
    public void getInfoTerm() {

        System.out.print("\tEnter Year of Education: ");
        year = scanner.nextInt();

        System.out.print("\tEnter Half Year of Education: ");
        halfYear = scanner.nextInt();

        boolean again = true;
        while (again){


            Klass klass = new Klass();

            klass.getInfoKlass();
            lessons.add(klass);
            classess.add(klass.getKlassName());

            System.out.println();

            System.out.print("\tDo Yoy Want Add lessons in this Term ? (y/n) : ");
            String answer = scanner.next();
            if (answer.equals("n")){
                again = false;
            }
        }
    }

    // for show details term classess*
    public void klassTerms (){

        System.out.println("\tClasses in this Term -> Year " + getyear() + " in Half Year " + gethalfYear() + " :");
        for (Klass e : lessons) {
            System.out.println("\t -> " + e.getKlassName() + " untits : " + e.getcountUnit() + " in : " + e.getklassPlace() + " at : " + e.getklassDay() + " at : " + e.getklassClock() + " Duration : " + e.getklassDuration() + " min.");
        }
    }

    // for get lesson by student
    public void getlessons(Student student){

        boolean again = true;

            while (again) {
                validStudent(student);

                System.out.println();

                System.out.print("\tChoose lessons : ");
                String chooseLesson = scanner.next();

                Klass klass = new Klass();
                if (classess.contains(chooseLesson)) {
                    if (!student.getLellonses.containsValue(chooseLesson)) {
                        student.getLellonses.put(searchName, chooseLesson);
                        System.out.println("\t" + student.getfullName() + " Choose -> " + chooseLesson);
                    }else{
                        System.out.println("\t You Cannot Choose Them!");
                    }
                }else{
                    System.out.println("\t Lesson not Found !");
                }
                System.out.print("\tYou want to add a another lesson (y/n) : ");
                String answer = scanner.next();

                if (answer.equals("n")){
                    again = false;
                }
            }
        }

    // for validation student
    public int validStudent(Student student){

        boolean find = true;

        while (find){

            System.out.print("\tEnter ID Of Studen For Search : ");
            searchName = scanner.nextInt();

                if (searchName == student.getId()){
                    System.out.println("\t Student Finded : " + student.getfullName());
                    find = false;
                }else {
                    System.out.println("\tStudent Not Found !");
                    break;
                }
            }
            return searchName;
        }

}
