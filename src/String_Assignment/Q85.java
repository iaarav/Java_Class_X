package String_Assignment;

import java.util.Scanner;

public class Q85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        char ch;
        String q = "", r = "";

        s = s.toLowerCase();
        s = s + " ";

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if (ch == ' ') {
                r = r + q.replace(q.charAt(0), Character.toUpperCase(q.charAt(0))) + " ";
                q = "";
            } else {
                q = q + ch;
            }
        }
        System.out.println(r);
    }
}
