package String_Assignment;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int l = s.length();
        char ch;

        for (int i = 0; i < l; i++) {
            ch=s.charAt(i);
            System.out.println("\'"+ch+"\' ASCII VALUE -> "+(int)(ch));
        }
    }
}
