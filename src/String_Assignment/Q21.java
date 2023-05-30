package String_Assignment;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int l = s.length();
        char ch;
        String q="";


        for (int i = 0; i < l; i++) {
            ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                continue;
            }
            else
                q=q+ch;

        }
        System.out.println("Old String: "+s);
        System.out.println("Old Number of alphabets: "+(s.length()));
        System.out.println();
        System.out.println("New String: "+q);
        System.out.println("New Number of Alphabets: "+(q.length()));
    }
}
