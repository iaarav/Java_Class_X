package String_Assignment;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        if (ch >= 65 && ch <= 90 ) {
            System.out.println("New Character: " + (char) (ch + 32));
        } else if (ch>=97 && ch<= 122) {
            System.out.println("New Character: " + (char) (ch - 32));
        } else {
            System.out.println("Invalid Input. Enter a character");
        }
    }
}