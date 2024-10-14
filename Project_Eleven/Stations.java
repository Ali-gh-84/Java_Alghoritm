package Project_Eleven;

import java.util.*;

public class Stations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> name_station = new ArrayList<>();
        ArrayList<Integer> x_home = new ArrayList<>();
        ArrayList<Integer> y_home = new ArrayList<>();
        Map<String, Double> distance_map = new HashMap<>();

        System.out.print("enter size of station: ");
        int size_station = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        for (int i = 0; i < size_station; i++) {
            System.out.print("enter name of station " + (i + 1) + ": ");
            String name = scanner.nextLine();
            name_station.add(name);

            System.out.print("enter number of x home " + (i + 1) + ": ");
            int x = scanner.nextInt();
            x_home.add(x);
            if (x > 100 || x < 0) {
                System.out.println("your location was not true!");
                break;
            }

            System.out.print("enter number of y home " + (i + 1) + ": ");
            int y = scanner.nextInt();
            y_home.add(y);
            if (y > 100 || y < 0) {
                System.out.println("your location was not true!");
                break;
            }
            System.out.println();
            scanner.nextLine();
        }

        System.out.println();
        System.out.print("enter your location x: ");
        int x_location = scanner.nextInt();
        if (x_location > 100 || x_location < 0) {
            System.out.println("your location was not true!");
        }

        System.out.print("enter your location y: ");
        int y_location = scanner.nextInt();
        if (y_location > 100 || y_location < 0) {
            System.out.println("your location was not true!");
        }

        System.out.println();

        for (int i = 0; i < size_station; i++) {
            double distance = Math
                    .sqrt(Math.pow(x_home.get(i) - x_location, 2) + Math.pow(y_home.get(i) - y_location, 2));
            distance_map.put(name_station.get(i), distance);
        }

        for (Map.Entry<String, Double> show_all : distance_map.entrySet()) {
            System.out.println("station : " + show_all.getKey() + " | and distance : "
                    + String.format("%.2f", show_all.getValue()));
        }

        System.out.println();

        List<Map.Entry<String, Double>> sorted_list = new ArrayList<>(distance_map.entrySet());
        sorted_list.sort(Map.Entry.comparingByValue());
        System.out.println();

        for (Map.Entry<String, Double> show_sorted : sorted_list) {
            System.out.println(
                    "near Station: " + show_sorted.getKey() + " with distance: "
                            + String.format("%.2f", show_sorted.getValue()));
        }
    }
}


