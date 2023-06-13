package String_Assignment;

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Enter the word to be replaced ");
        String ow = sc.next();
        System.out.println("Enter the new word");
        String nw = sc.next();

        s = s + " ";
        String q = "", r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if (ch == ' ') {
                if (q.equalsIgnoreCase(ow)) {
                    r = r + nw + " ";
                }
                else {
                    r = r + q + " ";
                }
                q = "";
            } else {
                q = q + ch;
            }
        }
        System.out.println("New String: " + r);
    }
}