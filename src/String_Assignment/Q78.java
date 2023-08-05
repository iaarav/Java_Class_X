package String_Assignment;

import java.util.Scanner;

public class Q78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        String s = Integer.toString(n);

        System.out.println("Required number: " + s.replace('2', '5'));
        
    }
}
