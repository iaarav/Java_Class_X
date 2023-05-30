package String_Assignment;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch1 = sc.next().charAt(0);
        System.out.println("Enter second character: ");
        char ch2 = sc.next().charAt(0);

        int sum= ch1+ch2;
        int diff= ch1 - ch2;

        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+diff);
    }
}
