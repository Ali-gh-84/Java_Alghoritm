package Project_Twoelve.Semester;

import java.util.*;

import Project_Twoelve.Student.universityStudent;


public class universitySemester {

    private universityStudent clas;

    public universitySemester(universityStudent clas) {
        this.clas = clas;
    }

    Scanner scanner = new Scanner(System.in);
    HashMap<String, Integer> average_student1 = new HashMap<>();
    HashMap<String, Integer> average_student2 = new HashMap<>();
    ArrayList<Integer> score = new ArrayList<>();

    public void average_students() {

        boolean again = false;
        String find_name = null;

        System.out.print("\tPlese Choose any Way For Search Student -> 1) by Name 2) by ID : ");
        int choose_way = scanner.nextInt();
        scanner.nextLine();

        if (choose_way == 1) {

            System.out.print("\tPlese Enter Your Name For Search : ");
            String search_name = scanner.nextLine();

            for (Map.Entry<String, Integer> loop_name : clas.get_name_id_student().entrySet()) {
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

            for (Map.Entry<String, Integer> loop_id : clas.get_name_id_student().entrySet()) {
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
            System.out.println("\tNumber isnot True!");
        }

        clas.show_stuednt_unit();
        System.out.println();

        System.out.print("\tYou There is Which Term ? -> 1) Term One  2) Term Two : ");
        int choose_t = scanner.nextInt();

        if (choose_t == 1) {
            for (Map.Entry<String, ArrayList<String>> size_value : clas.get_set_unit1().entrySet()) {
                int size = size_value.getValue().size();
                for (int i = 0; i < size; i++) {
                    System.out.print("\tEnter Score of Lesson : ");
                    score.add(scanner.nextInt());
                }
            }

            double sum = 0;
            for (double s : score) {
                sum += s;
            }

            for (Map.Entry<String, ArrayList<String>> av_student : clas.get_set_unit1().entrySet()) {
                double a = av_student.getValue().size();

                double average = sum / a;

                average_student1.put(find_name, (int) average);

                if (average > 14) {
                    System.out.println("\t* Well Done * You Pass The Exam");
                    score.removeAll(score);
                    return;
                } else {
                    System.out.println("\t* Sorry * You Failded The Exam!");
                    score.removeAll(score);
                    return;
                }
            }
        }
        if ((choose_t == 2)) {
            for (Map.Entry<String, ArrayList<String>> size_value : clas.get_set_unit2().entrySet()) {
                int size = size_value.getValue().size();
                for (int i = 0; i < size; i++) {
                    System.out.print("\tEnter Score of Lesson : ");
                    score.add(scanner.nextInt());
                }
            }

            double sum = 0;
            for (double s : score) {
                sum += s;
            }

            for (Map.Entry<String, ArrayList<String>> av_student : clas.get_set_unit2().entrySet()) {
                double a = av_student.getValue().size();

                double average = sum / a;

                average_student2.put(find_name, (int) average);

                if (average > 14) {
                    System.out.println();
                    System.out.println("\t* Well Done * You Pass The Exam");
                    score.removeAll(score);
                    return;
                } else {
                    System.out.println();
                    System.out.println("\t* Sorry * You Failded The Exam!");
                    score.removeAll(score);
                    return;
                }
            }
        }
    }

    public void show_student_average() {

        int count = 1;

        System.out.print("\tYou There is Which Term ? -> 1) Term One  2) Term Two : ");
        int choose_t = scanner.nextInt();

        if (choose_t == 1) {
            System.out.println("\tList Student and Average as follows :");

            for (Map.Entry<String, Integer> show_all_stuent_average : average_student1.entrySet()) {
                System.out.println("\t" + count + ") " + show_all_stuent_average.getKey() + " average is : " + show_all_stuent_average.getValue());
                count += 1;
            }
        }
        if (choose_t == 2) {
            System.out.println("\tList Student and Average as follows :");

            for (Map.Entry<String, Integer> show_all_stuent_average : average_student2.entrySet()) {
                System.out.println("\t" + count + ") " + show_all_stuent_average.getKey() + " average is : " + show_all_stuent_average.getValue());
                count += 1;
            }
        }


    }
}
