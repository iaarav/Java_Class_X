package String_Assignment;

import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        s = s + " ";
        char ch;
        String s1 = s.toUpperCase(), q = "";
        String r = "" ;

        for (int i = 0; i < s1.length(); i++) {
            ch = s1.charAt(i);

            if (ch == ' ') {
                r=r+q.charAt(0);
                q="";
            } else {
                q = q + ch;
            }
        }

        System.out.println("Original String: "+s);
        System.out.println("Required String: "+r);
    }
}