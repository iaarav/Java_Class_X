
package String_Assignment;

import java.util.Scanner;

public class Q12_iv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int l = s.length();
        String q = "";

        for ( int i = 0 ; i<l ; i++ ){
            for ( int j = 0; j <= i ; j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        for (int i = l-2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }

        System.out.println();

        // Using Substring
        for (int i = 0; i < l; i++) {
            System.out.println(s.substring(0, i + 1));
        }
        for (int i=s.length()-1; i>=0 ; i--){
            System.out.println(s.substring(0,i));
        }

    }
}
