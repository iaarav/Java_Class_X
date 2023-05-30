package String_Assignment;

import java.util.Scanner;

public class Q12_iii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int l = s.length();
        String q = "";

        for (int i = l-1; i >= 0; i--) {
            q=(s.charAt(i))+q;
            System.out.println(q);
        }
    }
}
