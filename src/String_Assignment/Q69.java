package String_Assignment;

import java.util.Scanner;

public class Q69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        s=s+" ";
        char ch;
        String q="",r="";
        for (int i=0; i<s.length();i++){
            ch=s.charAt(i);

            if (ch==' '){
                r=r+ q.substring(1,q.length()-1) + " ";
                q="";
            }
            else {
                q=q+ch;
            }
        }
        System.out.println("Required string: "+r);
    }
}
