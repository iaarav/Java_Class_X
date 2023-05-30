package String_Assignment;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
            if (ch == 'z') {
                System.out.println("Next Character: a");
            }
            if (ch == 'Z') {
                System.out.println("Next Character: A");
            } else {
                System.out.println("Next Character: " + (char) (ch + 1));
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
