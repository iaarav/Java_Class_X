package String_Assignment.Previous_Year;

import java.util.Scanner;

public class ICSE_2019 {
    public static void main(String[] args) {

        /* WAP to enter a sentence and convert it into upper case and count and display the total number of words starting with a letter 'A'

        Sample Input: Advancement and application of Information Technology are ever-changing
        Sample Output: Total number of words starting with letter 'A': 4

           [ICSE 2019]
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();

        s = s.toUpperCase();
        s = s + " ";
        int c = 0;

        char ch;
        String q = "";
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if (ch == ' ') {
                if (q.startsWith("A")) {
                    c++;
                }
                q = "";
            } else {
                q = q + ch;
            }
        }
        System.out.println("Total number of words starting with letter \'A\': "+c);
    }
}
