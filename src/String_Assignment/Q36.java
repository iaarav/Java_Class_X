package String_Assignment;

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Enter the word to be replaced ");
        String ow= sc.next();
        System.out.println("Enter the new word");
        String nw= sc.next();

        System.out.println("Original String: "+s );
        System.out.println("New String: "+s.replace(ow,nw));
    }
}