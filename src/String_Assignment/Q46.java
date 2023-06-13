package String_Assignment;

import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        s = s + " ";
        char ch1, ch2;
        String s1 = s.toUpperCase(), q = "";
        String r = "";

        for (int i = 0; i < s1.length(); i++) {
            ch1 = s1.charAt(i);

            if (ch1 == ' ') {
                int c = 0;
                for (int j = 0; j < q.length(); j++) {
                    ch2 = q.charAt(j);

                    if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' || ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U') {
                        c++;
                    }

                }
                System.out.println("Number of vowels in \"" + q + "\" are: " + c);
                q = "";
            } else {
                q = q + ch1;
            }
        }
    }
}