package String_Assignment;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name with the first name and the sur name separated by a space: ");
        String s = sc.nextLine();

        char ch;
        String q = "", r="";
        String s1=" "+s;

        for (int i = s1.length() - 1; i>=0; i--) {
            ch=s1.charAt(i);

            if (ch==' '){
                r=r + q + " ";
                q="";
            }
            else {
                q=ch+q;
            }
        }
        System.out.println("Original Name: "+s);
        System.out.println("Reversed NAME: "+r);
    }
}
