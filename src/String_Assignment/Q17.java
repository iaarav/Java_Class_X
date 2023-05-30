package String_Assignment;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        int l=s.length();
        int c=0;


        for (int i= 0 ; i<l ; i++){
            if (s.charAt(i) == ' '){
                c++;
            }
        }

        System.out.println("There are "+(c+1)+" words");
    }
}
