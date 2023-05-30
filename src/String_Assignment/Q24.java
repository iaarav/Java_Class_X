package String_Assignment;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);


        if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
            System.out.println("Alphabet");
        }
        else if (ch>=0 && ch<=9){
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }

    }
}
