package String_Assignment;

import java.util.Scanner;

public class Q12_i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int l = s.length();
        String q = "";

        for (int i = 0; i < l; i++) {
            q=q+(s.charAt(i));
            System.out.println(q);
        }
    }
}
