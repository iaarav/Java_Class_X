package String_Assignment;

import java.util.Scanner;

public class Q70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();

        s=s.toUpperCase();
        char ch;

        for (int i=65; i<=90 ; i++){
            for (int j=0 ; j<s.length(); j++){
                ch=s.charAt(j);
                if (ch==i){
                    System.out.print(ch);
                }
            }
        }
    }
}
