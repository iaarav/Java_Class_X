package String_Assignment;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        int l = s.length();
        int c = 0;
        char ch;


        for (int i = 0; i < l; i++) {
            ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                continue;
            }
            else {
                c++;
            }
        }
        System.out.println("Number of consonants is: "+c);
    }
}
