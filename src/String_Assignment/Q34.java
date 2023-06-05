package String_Assignment;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name with the first name and the sur name separated by a space: ");
        String s = sc.nextLine();

        char ch;
        String q = "", r="";
        String s2=" "+s;

        for (int i = s2.length() - 1; i>=0; i--) {
            ch=s2.charAt(i);

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

        // or do this (alt. method)

        System.out.println("Second Method: ");

        System.out.println("Enter a Name with the first name and the sur name separated by a space: ");
        String s1 = sc.nextLine();

        String surname = s1.substring(s1.indexOf(" ")+1);
        String firstname = s1.substring(0,s1.indexOf(" "));

        System.out.println("Required String: "+ (surname +" "+ firstname));
    }
}
