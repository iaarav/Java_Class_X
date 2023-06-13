package String_Assignment;

import java.util.Scanner;

public class Q12_iii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int l = s.length();
        String q = "";

        //without using nesting and substring
        for (int i = l - 1; i >= 0; i--) {
            q = (s.charAt(i)) + q;
            System.out.println(q);
        }

        System.out.println();

        // using nesting
        for (int i = l-1 ; i >=0; i--) {
            for (int j=i; j<l ; j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }

        System.out.println();

        //using substring
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.substring(i));
        }
    }
}
