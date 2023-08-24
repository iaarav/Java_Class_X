package String_Assignment;

import java.util.Scanner;

public class Q90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println("Enter 1 or 2 ");
        char ch = sc.next().charAt(0);

        char ch1;
        String q = "";
        s = s + " ";

        if (ch == '1') {
            for (int i = 0; i < s.length(); i++) {
                ch1 = s.charAt(i);
                if (ch1 == ' ') {
                    System.out.println(q.charAt(0));
                    q = "";
                } else {
                    q = q + ch1;
                }
            }
        } else if (ch == '2') {
            for (int i = 0; i < s.length(); i++) {
                ch1 = s.charAt(i);
                if (ch1 == ' ') {
                    System.out.println(q.charAt(q.length()-1));
                    q = "";
                } else {
                    q = q + ch1;
                }
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
