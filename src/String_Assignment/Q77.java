package String_Assignment;

import java.util.Scanner;

public class Q77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int n = sc.nextInt();
        char ch;
        String s = Integer.toString(n);

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if(ch == '0'){
                System.out.print("Zero ");
            }
            if(ch == '1'){
                System.out.print("One ");
            }
            if(ch == '2'){
                System.out.print("Two ");
            }
            if(ch == '3'){
                System.out.print("Three ");
            }
            if(ch == '4'){
                System.out.print("Four ");
            }
            if(ch == '5'){
                System.out.print("Five ");
            }
            if(ch == '6'){
                System.out.print("Six ");
            }
            if(ch == '7'){
                System.out.print("Seven ");
            }
            if(ch == '8'){
                System.out.print("Eight ");
            }
            if(ch == '9'){
                System.out.print("Nine ");
            }
        }

    }
}