package String_Assignment;

import java.util.Scanner;

public class Q89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "ABCDE";
        for (int i=s.length(); i>=0; i--){
            System.out.println(s.substring(0,i));
        }
    }
}
