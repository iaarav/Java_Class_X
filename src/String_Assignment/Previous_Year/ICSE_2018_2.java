package String_Assignment.Previous_Year;

import java.util.Scanner;

public class ICSE_2018_2 {
    public static void main(String[] args) {

        /* WAP a program in java to ACCEPT A STRING IN LOWERCASE AND CHANGE THE FIRST LETTER OF EVERY WORD TO UPPERCASE. Display the NEW STRING

            Sample Input: we are in cyber world
            Sample Output: We Are In Cyber World

           [ICSE 2018] (also do for numbers to be un altered)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String s = sc.nextLine();

        s=s+" ";

        if (s.equals(s.toLowerCase())) {

            char ch;
            String q = "", r = "";

            for (int i = 0; i < s.length(); i++) {
                ch = s.charAt(i);

                if (ch == ' ') {
                    if (q.charAt(0) >= 97 && q.charAt(0) <= 122) {
                        q = q.replace(q.charAt(0), (char) (q.charAt(0) - 32));
                    }

                    r = r + q+" ";
                    q = "";

                } else {
                    q = q + ch;
                }
            }
            System.out.println("Required Output: " + r);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
