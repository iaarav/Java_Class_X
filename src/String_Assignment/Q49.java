package String_Assignment;

import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        System.out.println("Required String: "+s.replace('0','O'));
    }
}