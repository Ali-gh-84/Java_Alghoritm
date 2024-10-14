package Project_Six;

import java.util.Scanner;
import java.util.*;

public class Chance_Range {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number : ");
        int max_a = scanner.nextInt();

        System.out.print("enter a number : ");
        int max_b = scanner.nextInt();

        if (max_a == max_b) {
            System.out.println("wrong!");
            System.exit(1);
        }
            

        float max_number = max_b;
        for (int i = 1; i <= 5; i++) {
            if (max_a < max_b)
                max_number = max_a;
            float random_number = (float) (Math.random() * (max_a - max_b) + max_number);
            System.out.println("random number is : " + random_number);
        }

        // if (max_a > max_b) {

        //     for (int i = 1; i <= 5; i++) {
        //         float random_number = (float) (Math.random() * (max_a - max_b) + max_b);
        //         System.out.println("random number is : " + random_number);
        //     }
        // } else if (max_a < max_b){
            
        //     for (int i = 1; i <= 5; i++) {
        //         float random_number = (float) (Math.random() * (max_b - max_a) + max_a);
        //         System.out.println("random number is : " + random_number);
        //     }
        // }else {
        //     System.out.print("wrong !!");
        // }
    }
}
