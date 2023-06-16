package String_Assignment;

import java.util.Scanner;

public class Q82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        String sq = Integer.toString(n * n);
        String s = Integer.toString(n);

        int SqLength = sq.length();
        int SLength = s.length();
        if (s.equals(sq.substring(SqLength - SLength))) {
            System.out.println("Automorphic number");
        } else {
            System.out.println("Not an Automorphic number");
        }
    }
}
