package Project_Fourteen;

import java.util.*;

public class Reverse_number {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int total = 0;
        System.out.print("enter a number : ");
        int n = scanner.nextInt();
        int number = n;

        while (n > 0) {
            n = n / 10;
            count += 1;
        }
        System.out.println("count of number is : " + count);

        count --; 

        for (int i = count ; i > -1 ; i--) { 
            int l = number % 10;
            total  = (total * 10) + l; 
            number = number / 10; 
        }
        System.out.print("reverse number is : " + total);
    }
}

        // while (count > -1) {
            // int l = number % 10;
            // total += (l*Math.pow(10,count-1));
            // number = number / 10;
            // count -= 1;
        // }

