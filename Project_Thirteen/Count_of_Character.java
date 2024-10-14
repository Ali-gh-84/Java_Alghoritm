package Project_Thirteen;

import java.util.*;

public class Count_of_Character {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.print("enter a number : ");
        int n = scanner.nextInt();

        while (n > 0) {
            n = n / 10;
            count += 1;
        }
        System.out.print("count of number : " + count);
    }
}

