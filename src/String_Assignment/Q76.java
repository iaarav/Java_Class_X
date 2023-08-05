package String_Assignment;

import java.util.Scanner;

public class Q76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        String q="";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if(Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
            }
            else{
                ch = Character.toUpperCase(ch);
            }

            q=q+ch;
        }
        System.out.println("The required String: "+q);
    }
}
