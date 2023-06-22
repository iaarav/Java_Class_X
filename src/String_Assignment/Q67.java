package String_Assignment;

import java.util.Scanner;

public class Q67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Enter the word to be replaced: ");
        String p = sc.next();
        System.out.println("Enter the new word: ");
        String q= sc.next();

        System.out.println("Modified String: "+s.replace(p,q));
    }
}
