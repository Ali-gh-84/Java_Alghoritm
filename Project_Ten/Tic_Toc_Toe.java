// package Project_Ten;  

// import java.util.Scanner;  

// public class Tic_Toc_Toe {  

//     Scanner scanner = new Scanner(System.in);  
//     char[] number_home = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};  
//     int nobat = 0;  

//     String name_player_one;  
//     String name_player_two;  

//     public char nubat_player() {  
//         return (nobat % 2 == 0) ? 'X' : 'O';  
//     }  

//     public void show_game() {  
//         System.out.print("\tplayer 1 : " + name_player_one + " (X)");  
//         System.out.print("\tplayer 2 : " + name_player_two + " (O)");  
//         System.out.println("\n\t-------\t-------\t-------");  
//         for (int i = 0; i < 3; i++) {  
//             System.out.print("\t");  
//             for (int j = 0; j < 3; j++) {  
//                 System.out.print("|   " + number_home[i * 3 + j] + "   ");  
//             }  
//             System.out.println("|\n\t-------\t-------\t-------");  
//         }  
//     }  

//     public void get_input() {  
//         System.out.print("\n\tenter a number between 1-9: ");  
//         char input = scanner.next().charAt(0);  
//         int index = input - '1';  
//         if (index >= 0 && index < 9 && number_home[index] != 'X' && number_home[index] != 'O') {  
//             number_home[index] = nubat_player();  
//             nobat++;  
//         } else {  
//             System.out.println("\tyour number is wrong or already taken!");  
//         }  
//     }  

//     public boolean iswin() {  
//         return (number_home[0] == number_home[1] && number_home[1] == number_home[2]) ||  
//                (number_home[3] == number_home[4] && number_home[4] == number_home[5]) ||  
//                (number_home[6] == number_home[7] && number_home[7] == number_home[8]) ||  
//                (number_home[0] == number_home[3] && number_home[3] == number_home[6]) ||  
//                (number_home[1] == number_home[4] && number_home[4] == number_home[7]) ||  
//                (number_home[2] == number_home[5] && number_home[5] == number_home[8]) ||  
//                (number_home[0] == number_home[4] && number_home[4] == number_home[8]) ||  
//                (number_home[2] == number_home[4] && number_home[4] == number_home[6]);  
//     }  

//     public boolean isfull() {  
//         for (char cell : number_home) {  
//             if (cell != 'X' && cell != 'O') {  
//                 return false;  
//             }  
//         }  
//         return true;  
//     }  

//     public boolean isnotend() {  
//         return !(isfull() || iswin());  
//     }  

//     public String show_winner() {  
//         if (nubat_player() == 'X') {  
//             return name_player_one;  
//         } else {  
//             return name_player_two;  
//         }  
//     }  

//     public void whowin() {  
//         if (isfull() && !iswin()) {  
//             System.out.println("\tNooo, it's a draw :(");  
//         } else {  
//             System.out.println("\tYessss, " + show_winner() + " wins! :)");  
//         }  
//     }  

//     public static void main(String[] args) {  
//         Tic_Toc_Toe game = new Tic_Toc_Toe();  
        
//         System.out.print("\t Enter your name player one: ");  
//         game.name_player_one = new Scanner(System.in).nextLine();  

//         System.out.print("\t Enter your name player two: ");  
//         game.name_player_two = new Scanner(System.in).nextLine();  
//         System.out.println();  

//         while (game.isnotend()) {  
//             game.show_game();  
//             game.get_input();  
//         }  
//         game.whowin();  
//     }  
// }


package Project_Ten;

import java.util.Scanner;

public class Tic_Toc_Toe {

    public static void main(String[] args) {
        
    }
}