package String_Assignment;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        int l = s.length();
        int c=0;

        for (int i = 0 ; i<l ; i++){
            if (s.charAt(i)=='a'){
                c++;
            }
            else {
                continue;
            }
        }
        System.out.println("'a' is repeated "+c+ " times");
    }
}
