package String_Assignment;

import java.util.Scanner;

public class Q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        String s=Integer.toString(n);
        String ch;
        String q="";

        for (int i=0; i<s.length();i++){
            ch=s.substring(i,i+1);
            q=ch+q;
        }
        System.out.println("Original number: "+s);
        System.out.println("Required New Number: "+q);
    }
}
