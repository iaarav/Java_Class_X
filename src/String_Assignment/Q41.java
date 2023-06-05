package String_Assignment;

import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();


        char ch;
        String q = "";
        String r = "" ;

        for (int i=0 ; i<=s.lastIndexOf(" "); i++){
            ch = s.charAt(i);

            if (ch == ' ') {
                r=r+q.charAt(0)+".";
                q="";
            } else {
                q = q + ch;
            }
        }
        String surname= s.substring(s.lastIndexOf(" ")+1);

        System.out.println("Required String: "+r+" "+surname);
    }
}