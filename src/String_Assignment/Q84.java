package String_Assignment;

import java.util.Scanner;

public class Q84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        s=s.toUpperCase();
        String q = "";

        for (int j = 0; j < s.length(); j++) {
            char x;
            char ch = s.charAt(j);
            if (ch >= 65 && ch <= 90 ) {
                if (ch == 'A') {
                    x='Y';
                } else if (ch == 'B') {
                    x='Z';
                } else {
                    x= (char) (ch - 2);
                }
                q=q+x;
            }
            else {
                q=q+ch;
            }
        }


        System.out.println("Decoded String: " + q);
    }
}
