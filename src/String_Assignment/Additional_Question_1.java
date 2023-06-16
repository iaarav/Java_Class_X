package String_Assignment;

import java.util.Scanner;

public class Additional_Question_1 {
    public static void main(String[] args) {
        // Sample Input: WelCoMe_2022
        // Sample output: wELcOmE_2022               [ICSE 2022]

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        char ch;
        String q="";

        for (int i=0; i<s.length();i++){
            ch=s.charAt(i);

            if (ch>=65 && ch<=90){
                ch=(char) (ch+32);
                q=q+ch;
            }
            else if (ch>=97 && ch<=122){
                ch=(char) (ch-32);
                q=q+ch;
            }
            else {
                q=q+ch;
            }
        }
        System.out.println("Required String: "+q);
    }
}
