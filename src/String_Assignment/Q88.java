package String_Assignment;

import java.util.Scanner;

public class Q88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int ch=65;

        System.out.println("Printing part 1....");

        for (int i=0; i<s.length(); i++){
            System.out.println(s.substring(i));
        }

        System.out.println("Printing part 2....");

        for (int i=0; i<=4; i++){
            for (int j=0;j<=i; j++){
                System.out.print((char)(ch));
                ch+=1;
            }
            System.out.println();
        }

        System.out.println("Printing part 3....");

        for (int i=0; i<s.length();i++){
            System.out.println(s.substring(i,s.length())+s.substring(0,i));
        }
    }
}
