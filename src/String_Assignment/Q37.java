package String_Assignment;

import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        String s1=s+" ", q="",lword="";
        int lw=0;

        char ch;
        for (int i = 0; i<s1.length(); i++) {
            ch=s1.charAt(i);

            if (ch==' '){
                if (q.length()>lw){
                    lword =q;
                    lw=q.length();
                }
                q="";

            }
            else {
                q=q+ch;

            }
        }

        System.out.println("Original String: "+s);
        System.out.println("Longest Word: "+lword);
        System.out.println("Number of characters: "+lw);
    }
}