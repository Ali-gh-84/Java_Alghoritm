package Project_Twoelve.Student;

import java.util.*;

import Project_Twoelve.Classess.University_Class;

public class universityStudent {

    private University_Class clas2;

    public universityStudent(University_Class clas2) {
        this.clas2 = clas2;
    }

    Scanner scanner = new Scanner(System.in);

    private ArrayList<String> full_name_student = new ArrayList<>();
    private HashMap<String, Integer> name_id_student = new HashMap<>();
    private ArrayList<String> term1 = new ArrayList<>();
    private ArrayList<String> term2 = new ArrayList<>();
    private HashMap<String, ArrayList<String>> set_unit1 = new HashMap<>();
    private HashMap<String, ArrayList<String>> set_unit2 = new HashMap<>();
    private ArrayList<String> unit = new ArrayList<>() {
        {
            add("Mathes");
            add("Persian");
            add("English");
            add("PE");
            add("IT");
            add("Phisic");
            add("Chemist");
            add("History");
            add("Holy Qoran");
            add("Arabic");
        }
    };

    public ArrayList<String> get_full_name_student() {
        return full_name_student;
    }

    public HashMap<String, Integer> get_name_id_student() {
        return name_id_student;
    }

    public HashMap<String, ArrayList<String>> get_set_unit1() {
        return set_unit1;
    }

    public HashMap<String, ArrayList<String>> get_set_unit2() {
        return set_unit2;
    }

    public int chooseTerm;

    public void get_name_student() {

        if (clas2.get_classess_name().isEmpty()) {
            System.out.println("\tPlease First Enter a University!");
            return;
        }

        System.out.print("\tPlease Choose Years of Education (now = 2024) :");
        int year_edu = scanner.nextInt();
        scanner.nextLine();

        if (year_edu < 2024) {
            System.out.println("\tYour school year is over!");
            return;
        }
        if (year_edu > 2024) {
            System.out.println("\tYour Years is Largest than now!");
            return;
        }

        System.out.println("\tPlease Enter Your Term :");
        System.out.print("\t-> 1) Term1 " + "-> 2) Term2 : ");
        chooseTerm = scanner.nextInt();

        if (chooseTerm != 1 && chooseTerm != 2) {
            System.out.println("\tPleasse Enter True Number !");
            return;
        }
        scanner.nextLine();

        clas2.show_name_class();
        System.out.println();

        System.out.print("\tPlease Choose Your Name Of University : ");
        String choose_university = scanner.nextLine();

        if (clas2.get_classess_name().contains(choose_university)) {
            ArrayList<String> students = clas2.get_student_university().getOrDefault(choose_university, new ArrayList<>());

            System.out.print("\t Please Enter Full Name : ");
            String name_student = scanner.nextLine();

            if (full_name_student.contains(name_student)) {
                System.out.println("\t This Name is Repeat!");
                return;
            }

            int id_student = (int) (Math.random() * 101);
            System.out.println("\tYour Unique Student Number is : " + id_student);

            name_id_student.put(name_student, id_student);
            full_name_student.add(name_student);
            students.add(name_student);
            clas2.get_student_university().put(choose_university, students);

            if (chooseTerm == 1) {
                term1.add(name_student);
            } else if (chooseTerm == 2) {
                term2.add(name_student);
            }


            System.out.println("\tStudent added successfully");
        } else {
            System.out.println("\tThis university Not Found!");
        }
    }


    public void show_name_student() {

        int count1 = 1;
        System.out.println("\tList Student and ID as follows :");
        for (Map.Entry<String, Integer> show_all_students : name_id_student.entrySet()) {
            System.out
                    .println("\t" + count1 + ") " + show_all_students.getKey() + " Uniqe ID : "
                            + show_all_students.getValue() + " .");
            count1 += 1;
        }
    }

    public void show_terms() {

        System.out.println("\tName Lessons and Unit : ");
        for (String all : unit) {
            System.out.println("\t -> " + all + " : " + "this lesson 5 unit.");
        }
    }

    public void get_terms() {

        show_terms();
        System.out.println();

        String find_name = null;
        boolean again = false;

        System.out.print("\tPlease Choose any Way For Search Student  ->  1) With Name  2) With ID : ");
        int choose_way = scanner.nextInt();
        scanner.nextLine();

        if (choose_way == 1) {

            System.out.print("\tEnter Name Of Student For Search : ");
            String search_name = scanner.nextLine();

            for (Map.Entry<String, Integer> loop_name : name_id_student.entrySet()) {
                if (loop_name.getKey().equals(search_name)) {
                    find_name = search_name;
                    again = true;
                    break;
                }
            }
            if (!again) {
                System.out.println("\tStudnet Not Found!");
                return;
            }

        } else if (choose_way == 2) {
            System.out.print("\tEnter ID Of Student For Search : ");
            int search_id = scanner.nextInt();
            scanner.nextLine();

            for (Map.Entry<String, Integer> loop_id : name_id_student.entrySet()) {
                if (loop_id.getValue().equals(search_id)) {
                    find_name = loop_id.getKey();
                    again = true;
                    break;
                }
            }
            if (!again) {
                System.out.println("\tStudent Not Found!");
                return;
            }
        } else {
            System.out.println("\tPlease Enter True Option !");
            return;
        }

        if (chooseTerm == 1) {

            ArrayList<String> lessons = set_unit1.getOrDefault(find_name, new ArrayList<>());

            while (lessons.size() < 4) {
                System.out.print("\tPlease Enter Name Of Lessons For Choose Unit : ");
                String choose_lesson = scanner.nextLine();

                if (unit.contains(choose_lesson)) {
                    if (!lessons.contains(choose_lesson)) {
                        lessons.add(choose_lesson);
                        set_unit1.put(find_name, lessons);
                        System.out.println("\tYou Choose " + choose_lesson + " lesson.");
                        return;
                    } else {
                        System.out.println("\tYou Can Not Choose Them!");
                    }
                } else {
                    System.out.println("\tThis Lesson Isnot True!");
                }
                if (lessons.size() == 4) {
                    System.out.println("\tYour Choose is Full!");
                    return;
                }
            }
        }
        if (chooseTerm == 2) {

            ArrayList<String> lessons = set_unit2.getOrDefault(find_name, new ArrayList<>());

            while (lessons.size() < 4) {
                System.out.print("\tPlease Enter Name Of Lessons For Choose Unit : ");
                String choose_lesson = scanner.nextLine();

                if (unit.contains(choose_lesson)) {
                    if (!lessons.contains(choose_lesson)) {
                        lessons.add(choose_lesson);
                        set_unit2.put(find_name, lessons);
                        System.out.println("\tYou Choose " + choose_lesson + " lesson.");
                        return;
                    } else {
                        System.out.println("\tYou Can Not Choose Them!");
                    }
                } else {
                    System.out.println("\tThis Lesson Isnot True!");
                }
                if (lessons.size() == 4) {
                    System.out.println("\tYour Choose is Full!");
                    return;
                }
            }
        }
    }

    public void show_stuednt_unit() {

        int count1 = 1;
        int count2 = 1;
        int count3 = 1;

        System.out.println("\tPlease Choose Term For See Student and Unit");
        System.out.print("\t-> 1) Term1" + " -> 2) Term2 : ");
        int chooseT = scanner.nextInt();

        System.out.println();

        if (chooseT != 1 && chooseT != 2) {
            System.out.println("\tPleasse Enter True Number !");
            return;
        }

        System.out.println();

        if (chooseT == 1) {
            System.out.println("\tList Student Term One Is :");
            for (String t1 : term1) {
                System.out.println("\t" + count1 + ") " + t1 + " in Term One.");
                System.out.println();
                System.out.println("\tList Student and Unit as follows :");

                for (Map.Entry<String, ArrayList<String>> show_all_students_unit : set_unit1.entrySet()) {
                    System.out
                            .print("\t" + count1 + ") " + show_all_students_unit.getKey() + " Unit : ");
                    for (var all_lessons : show_all_students_unit.getValue()) {
                        System.out.print(
                                all_lessons + " . ");
                    }
                    System.out.println();
                    count1 += 1;
                }
                for (Map.Entry<String, ArrayList<String>> size_lesson : set_unit1.entrySet()) {
                    int size = size_lesson.getValue().size();
                    System.out.println("\t" + count3 + ") " + "You Have " + (size * 5) + " Units.");
                }
            }
        }
        if (chooseT == 2) {
            System.out.println("\tList Student Term One Is :");
            for (String t2 : term2) {
                System.out.println("\t" + count2 + ") " + t2 + " in Term Two.");
                System.out.println();
                System.out.println("\tList Student and Unit as follows :");

                for (Map.Entry<String, ArrayList<String>> show_all_students_unit : set_unit2.entrySet()) {
                    System.out
                            .print("\t" + count2 + ") " + show_all_students_unit.getKey() + " Unit : ");
                    for (var all_lessons : show_all_students_unit.getValue()) {
                        System.out.print(
                                all_lessons + " . ");
                    }
                    System.out.println();
                    count2 += 1;
                }
                for (Map.Entry<String, ArrayList<String>> size_lesson : set_unit2.entrySet()) {
                    int size = size_lesson.getValue().size();
                    System.out.println("\t" + count3 + ") " + "You Have " + (size * 5) + " Units.");
                }
            }
        }
    }
}

