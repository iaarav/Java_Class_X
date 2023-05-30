package String_Assignment;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        int l = s.length();
        int c = 0;
        char ch;
        int a=0,e=0,i=0,o=0,u=0;


        for (int j = 0; j < l; j++) {
            ch = s.charAt(j);
            if (ch == 'a') {
                a++;
            }
            if (ch == 'e') {
                e++;
            }
            if (ch == 'i') {
                i++;
            }
            if (ch == 'o') {
                o++;
            }
            if (ch == 'u') {
                u++;
            }

            else {
                continue;
            }
        }

        System.out.println("a: "+a+" times");
        System.out.println("e: "+e+" times");
        System.out.println("i: "+i+" times");
        System.out.println("o: "+o+" times");
        System.out.println("u: "+u+" times");
    }
}
