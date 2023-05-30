package String_Assignment;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String in upper case : ");
        String s = sc.nextLine();

        String p = s.toUpperCase();
        char ch;
        String q = "";

        if (s.equals(p)) {
            for (int i =0; i<s.length();i++ ){
                ch=s.charAt(i);
                if ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    q=q+"*";
                }
                else {
                    q=q+ch;
                }
            }
            System.out.println("New String: "+q);
        } else {
            System.out.println("The string is not in UPPER CASE. try again.");
        }
    }
}

