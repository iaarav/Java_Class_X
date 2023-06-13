package String_Assignment;

import java.util.Scanner;

public class Q12_ii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int l = s.length();

        // Without substring
        for (int i = l-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }

        // Without nesting (using substring)
        for (int i=s.length()-1; i>=0 ; i--){
            System.out.println(s.substring(0,i+1));
        }
    }
}
