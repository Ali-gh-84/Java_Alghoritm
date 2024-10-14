package Project_Nine;

import java.util.*;

public class FindـOut {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String reverse = "";

        System.out.print("enter pattern title : ");
        String title = scanner.nextLine(); // .toLowerCase()

        System.out.print("enter size of text : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter line " + (i + 1) + ": ");
            lines.add(scanner.nextLine()); // .toLowerCase()
        }

        for (int i = 0; i < title.length(); i++) {
            reverse = title.charAt(i) + reverse;
        }

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            boolean found = false;

            int index = line.indexOf(title);
            while (index != -1) {
                found = true;
                System.out.println((i + 1) + "  " + index);
                index = line.indexOf(title, index + 1);
            }

            index = line.indexOf(reverse);
            while (index != -1) {
                found = true;
                System.out.println((i + 1) + "  " + index);
                index = line.indexOf(reverse, index + 1);
            }

            if (!found) {
                System.out.println("substring not found");
            }
        }
    }
}
