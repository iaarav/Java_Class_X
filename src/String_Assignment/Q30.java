package String_Assignment;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        char ch;


        String q = "";
        String s1=s+" ";

        for (int i = 0; i<s1.length(); i++) {
            ch=s1.charAt(i);

            if (ch==' '){
                System.out.println(q);
                q="";
            }
            else {
                q=q+ch;
            }
        }
    }
}
