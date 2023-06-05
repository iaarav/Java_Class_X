package String_Assignment;

import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Enter a word ");
        String w= sc.next();

        String q= "";
        char ch;
        int c=0;

        for (int i = 0; i<s.length(); i++) {
            ch=s.charAt(i);

            if (ch==' '){
                if (q.equals(w))
                    c++;
                q="";
            }
            else {
                q=q+ch;
            }
        }

        System.out.println("The frequency of the word \""+w+"\" is "+c);
    }
}