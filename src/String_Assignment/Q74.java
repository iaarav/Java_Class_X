package String_Assignment;

import java.util.Scanner;

public class Q74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        int alpha = 0, num = 0, spChar = 0;
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if(ch>=65 && ch <= 90 || ch>=97 && ch<=122) {
                alpha++;
            }
            else if(ch>=48 && ch <= 57) {
                num++;
            }
            else {
                spChar++;
            }
        }

        System.out.println("The number of alphabets in the entered string are: "+alpha);
        System.out.println("The number of numbers in the entered string are: "+num);
        System.out.println("The number of special characters in the entered string are: "+spChar);
    }
}
