package String_Assignment;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        int l=s.length();
        int c=0;


        for (int i= 0 ; i<l-1 ; i++){
            if (s.charAt(i) == 'a' && s.charAt(i+1)=='n'){
                c++;
            }
        }

        System.out.println("a is followed by n "+c+" times");
    }
}
