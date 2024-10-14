package Project_Four;

import java.util.Scanner;

public class Circumference_of_Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("enter a diameter : ");
        int diameter = scanner.nextInt();

        double circumference = PI * diameter;

        System.out.println("Circumference of Circle is : " + circumference);
        System.out.println("Circumference of Circle is : " + String.format("%.2f", circumference));

        switch (diameter) {
            case 1:
                System.out.println("three");
                break;
            case 2:
                System.out.println("six");
                break;
            case 3:
                System.out.println("nine");
                break;
            case 4:
                System.out.println("twelve");
                break;
            default:
                System.out.println("number is invalid");
                break;
        }

        scanner.close();
    }
}
