package String_Assignment;

import java.util.Scanner;

public class Q12_i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int l = s.length();
        String q = "";

        // Without using nesting and substring
        for (int i = 0; i < l; i++) {
            q = q + (s.charAt(i));
            System.out.println(q);
        }

        System.out.println();

        // Using Substring
        for (int i = 0; i < l; i++) {
            System.out.println(s.substring(0, i + 1));
        }

        System.out.println();

        // using nesting
        for (int i = 0; i < l; i++) {
            for (int j=0; j<=i ; j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
