package Project_Two;

import java.util.Scanner;

public class How_Many_Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a yera for check :");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            System.out.println("leap year");
        }else if (year % 100 == 0){
            if (year % 400 == 0) {
                System.out.println("leap year");
            }
        }else {
            System.out.println("normal year");
        }
    }
}
