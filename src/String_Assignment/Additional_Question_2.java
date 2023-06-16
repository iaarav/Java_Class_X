package String_Assignment;

import java.util.Scanner;

public class Additional_Question_2 {
    public static void main(String[] args) {
        // Sample Input1: BALL
        // Sample Input2: WORD
        // Sample output: BWAOLRLD             [ICSE 2022]

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String s = sc.nextLine();
        System.out.println("Enter Second String: ");
        String s1 = sc.nextLine();

        char ch,ch1;
        String q="";

        if (s.length() == s1.length()) {
            for (int i = 0; i < s.length(); i++) {
                ch = s.charAt(i);
                ch1 = s1.charAt(i);

                q = q + ch + ch1;
            }

            System.out.println("Required String: " + q);
        }
        else {
            System.out.println("Error! Both Strings must be of same length.");
            System.exit(0);
        }
    }
}
