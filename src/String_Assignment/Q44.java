package String_Assignment;

import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        String q = "";
        s=s.toLowerCase();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (s.indexOf(ch)==i){
                q=q+ch;
            }
        }
        System.out.println("New String: "+q);
    }
}