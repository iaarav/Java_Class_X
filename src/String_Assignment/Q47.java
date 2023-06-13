package String_Assignment;

import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();

        String q = "";
        char ch;

        for (int i=0; i<s.length();i++){
            ch=s.charAt(i);
            q=ch+q;
        }

        if (q.equalsIgnoreCase(s)){
            System.out.println("Palindrome Word");
        }
        else {
            System.out.println("Not a Palindrome Word");
        }
    }
}