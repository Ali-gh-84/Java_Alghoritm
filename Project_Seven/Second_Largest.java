package Project_Seven;

import java.util.*;
import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max_a = 0;
        int max_b = 0;
        int min_a = 1000;
        int min_b = 1000;

        System.out.print("enter size of number :");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("size is invalid !");
        } else {

            int[] arr = new int[n];
            Set<Integer> repate = new HashSet<>();

            for (int i = 0; i < arr.length; i++) {
                int num = (int) (Math.random() * 1000);
                // int num = 50;

                if (repate.contains(num)) {
                    System.out.println("number is repate");
                    break;
                } else {
                    arr[i] = num;
                    repate.add(num);
                }
            }

            System.out.print("number is : ");
            for (int s : arr) {
                System.out.print(s + "  ");
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max_a) {
                    max_b = max_a;
                    max_a = arr[i];
                } else if (arr[i] > max_b && arr[i] != max_a) {
                    max_b = arr[i];
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min_a) {
                    min_b = min_a;
                    min_a = arr[i];
                } else if (arr[i] < min_b && arr[i] != min_a) {
                    min_b = arr[i];
                }
            }

            System.out.println("\nmax : " + max_a + "\tmax 2 : " + max_b);
            System.out.println("min : " + min_a + "\tmin 2 : " + min_b);

        }
    }
}