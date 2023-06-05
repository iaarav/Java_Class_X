package String_Assignment;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        char ch;


        String q = "";
        String s1=" "+s;

        for (int i = s1.length() - 1; i>=0; i--) {
            ch=s1.charAt(i);

            if (ch==' '){
                System.out.print(q+ " ");
                q="";
            }
            else {
                q=ch+q;
            }
        }
    }
}