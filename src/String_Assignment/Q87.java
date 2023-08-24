package String_Assignment;

import java.util.Scanner;

public class Q87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        System.out.println("Printing part 1....");

        for (int i=s.length(); i>=0; i--){
            System.out.println(s.substring(0,i));
        }

        System.out.println("Printing part 2....");

        for (int i = s.length()-1 ; i>=0 ; i--){
            for (int j=0; j<=i; j++){
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }

        System.out.println("Printing part 3....");

        for (int i=0; i<s.length(); i++){
            System.out.println(s.substring(i));
        }
    }
}
