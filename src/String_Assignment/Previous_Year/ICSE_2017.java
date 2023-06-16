package String_Assignment.Previous_Year;

import java.util.Scanner;

public class ICSE_2017 {
    public static void main(String[] args) {

        /* WAP to accept a word. Check and print whether the word is a palindrome or only special word
         (Hint: Pallindrome words are those words which read the same from left to right and vice versa.
          eg- malayalam, madam, level, rotator,civic


          Special Words are those words which starts and ends with same letter. eg: existence, comic, window)

          All pallindrome are special words but all special words are not pallindrome )

         [ICSE 2016]
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = sc.next();

        char ch;
        String q = "";

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            q = ch + q;
        }

        if (q.equalsIgnoreCase(s)) {
            System.out.println("Palindrome Number");
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            System.out.println("Special Number");
        } else {
            System.out.println("Ordinary Number! Not a special number or a palindrome number.");
        }
    }
}
