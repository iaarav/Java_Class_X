package String_Assignment;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int l = s.length();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) + " " + s.charAt(l - i - 1));
        }
    }
}
