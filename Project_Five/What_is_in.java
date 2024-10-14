package Project_Five;

public class What_is_in {

    public static void main(String[] args) {

        int x = 1, y = 0;

        x++;  // value is : 2

        y = ++x;  // value is : 3

        y += ++x + x++;  // value is : 11

        y += ++y + x++;   // value is : 28

        int a = 30, b = 18;

        int c = a | b;  // value is : 30

        int d = a & b;  // value is 18

        int e = c ^ d;  // value is : 12

        int f = e >> 2;  // value is : 3

        double z = f * 5.2; // value is : 15.6

    }
}