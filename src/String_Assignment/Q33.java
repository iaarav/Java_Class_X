package String_Assignment;

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        char ch;
        int space=0;

        for (int i=0 ; i<= s.length()-1 ; i++){
            ch=s.charAt(i);

            if (ch==' '){
                space++;
            }
        }
        System.out.println("Number of characters: "+s.length());
        System.out.println("Number of blank spaces: "+space);
        System.out.println("Number of words: "+(space+1));
    }
}
