package Project_Twoelve.Classess;

import java.util.*;

public class University_Class {

    Scanner scanner = new Scanner(System.in);

    private ArrayList<String> classess_name = new ArrayList<>(); 
    private HashMap<String, String> place_classes = new HashMap<>();
    private HashMap<String, String> day_classes = new HashMap<>();
    private HashMap<String, Integer> time_classes = new HashMap<>();
    private HashMap<String, ArrayList<String>> student_university = new HashMap<>();

    public ArrayList<String> get_classess_name(){
        return classess_name;
    }

    public HashMap<String, ArrayList<String>> get_student_university(){
        return student_university;
    }

    int count1 = 1;
    int count2 = 1;
    int count3 = 1;

    public void get_name_class() {

        scanner.nextLine();

        System.out.print("\t Please Enter Name Of University : ");
        String name_class = scanner.nextLine();

        System.out.print("\t Please Enter Please Of University : ");
        String place_class = scanner.nextLine();

        System.out.print("\t Please Enter Time (Day) Of University : ");
        String day_class = scanner.nextLine();

        System.out.print("\t Please Enter Time (min) Of Class : ");
        int time_class = scanner.nextInt();

        System.out.println();
        System.out.println("\tClass added successfully");

        // classess_name.add(name_class);
        get_classess_name().add(name_class);
        place_classes.put(name_class, place_class);
        day_classes.put(name_class, day_class);
        time_classes.put(name_class, time_class);
    }

    public void show_name_class() {

        System.out.println("\tList Classes as follows :");
        for (int i = 0; i < classess_name.size(); i++) {
            System.out.println("\t" + (i + 1) + ") " + classess_name.get(i) + " University.");
        }
    }

    public void show_place_class() {

        System.out.println("\tList Classes and Please as follows :");
        for (Map.Entry<String, String> show_all_place : place_classes.entrySet()) {
            System.out.println("\t" + count1 + ") " + show_all_place.getKey() + " in : " + show_all_place.getValue());
            count1 += 1;
        }
    }

    public void show_day_class() {

        System.out.println("\tList Classes and Time as follows :");
        for (Map.Entry<String, String> show_all_day_class : day_classes.entrySet()) {
            System.out.println(
                    "\t" + count2 + ") " + show_all_day_class.getKey() + " at : " + show_all_day_class.getValue());
            count2 += 1;
        }
    }

    public void show_time_class() {

        System.out.println("\tList Classes and Durations as follows :");
        for (Map.Entry<String, Integer> show_all_durations_class : time_classes.entrySet()) {
            System.out.println(
                    "\t" + count3 + ") " + show_all_durations_class.getKey() + " : "
                            + show_all_durations_class.getValue() + " min.");
            count3 += 1;
        }
    }
}

