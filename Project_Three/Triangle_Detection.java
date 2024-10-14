package Project_Three;

import java.util.Scanner;

public class Triangle_Detection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter three sides :");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("equalateral tringle");
            } else if ((side1 == side2 && side3 != side1) || (side1 == side3 && side2 != side1)
                    || (side2 == side3 && side1 != side2)) {
                System.out.println("isosceles triangle");
            } else if ((side1 * side1 + side2 * side2 == side3 * side3 || side1 * side1 + side3 * side3 == side2 * side2
                    || side2 * side2 + side3 * side3 == side1 * side1)) {
                System.out.println("right tringle");
            } else if (side1 != side2 && side2 != side3) {
                System.out.println("scalene tringle");
            }
        } else {
            System.out.println("invalid");
        }
    }
}
