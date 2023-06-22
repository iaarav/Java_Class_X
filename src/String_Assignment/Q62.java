package String_Assignment;

import java.util.Scanner;

public class Q62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);


        char ch1;
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            ch1 = s.charAt(i);
            if (ch1 == ch) {
                c++;
            }
            else {
                continue;
            }
        }
        System.out.println("Frequency of \'"+ch+"\' is: "+c);
    }
}
