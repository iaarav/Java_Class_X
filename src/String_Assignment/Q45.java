package String_Assignment;

import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        String q = "";
        s=s.toLowerCase();
        char ch;
        int c=0;


        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (s.indexOf(ch)==i){
                q=q+ch;
            }
            else {
                c=1;
                break;
            }
        }
        if (c==0){
            System.out.println("\""+s+"\" is a unique string");
        }
        if (c==1){
            System.out.println("\""+s+"\" is not a unique string");
        }
    }
}