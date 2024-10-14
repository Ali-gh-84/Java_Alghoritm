package Project_Eight;

import java.util.Scanner;

public class Even_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int even = 0;
        int odd = 0;
        int even2 = 0;
        int odd2 = 0;
        int count = 0;

        System.out.print("enter size of array : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        if (n <= 0) {

            System.out.println("size of invalid !");
        } else if (n == 1) {

            for (int i = 0; i < arr.length; i++) {
                System.out.print("enter a number : ");
                arr[i] = scanner.nextInt();

                if (arr[i] % 2 == 0) {
                    System.out.println("array is even");
                } else {
                    System.out.println("array is not even");
                }
            }
        } else if (n % 2 != 0 && n > 1) {

            for (int i = 0; i < arr.length; i++) {
                System.out.print("enter a number : ");
                arr[i] = scanner.nextInt();

                if (i % 2 == 0) {
                    even += 1;
                } else {
                    odd += 1;
                }
                if (arr[i] % 2 == 0) {
                    even2 += 1;
                } else {
                    odd2 += 1;
                }
            }
            if (even == even2 && odd == odd2) {  
                for (int i = 0; i < arr.length; i++) {
                    // System.out.println(arr[i]);
                    if (i % 2 != arr[i] % 2) { 
                        count += 1;  
                    } 
                }if (count == 0) {
                    System.out.println("array is even");
                }else{
                    System.out.println("change count is :" + (count-1));
                }
            } else {  
                System.out.println("Array is not changed !");  
            }  
        
        }  
    
        else if (n % 2 == 0 && n > 0) {

            for (int i = 0; i < arr.length; i++) {
                System.out.print("enter a number : ");
                arr[i] = scanner.nextInt();

                if (i % 2 == 0 && arr[i] % 2 != 0) {
                    even += 1;
                } else if (i % 2 != 0 && arr[i] % 2 == 0) {
                    odd += 1;
                }
            }
            if (even == 0 && odd == 0) {
                System.out.println("array is even");
            } else if (even == odd) {
                count = even;
                System.out.println("count of change is : " + count);
            } else {
                System.out.println("Array is not changed !");
            }

        }
    }
}

// arr = [5,6,7]
// i : 0 , 1 , 2
// arr[i] : 5 , 6 , 7