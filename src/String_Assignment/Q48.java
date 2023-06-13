package String_Assignment;

import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        s = s + " ";
        String q = "", p = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if (ch == ' ') {

                if (q.equalsIgnoreCase(p)) {
                    System.out.println("\"" + q + "\" is palindrome");
                } else {
                    System.out.println("\"" + q + "\" is not palindrome");
                }

                q = "";
                p = "";
            } else {
                q = q + ch;
                p = ch + p;
            }
        }

    }
}