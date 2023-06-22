package String_Assignment;

import java.util.Scanner;

public class Q64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Enter a character: ");
        char ch1= sc.next().charAt(0);

        s=s+" ";
        char ch;
        String q="",r="";
        for (int i=0; i<s.length();i++){
            ch=s.charAt(i);

            if (ch==' '){
                if (q.charAt(0) == ch1) {
                    r=r+q+" ";
                }
                q="";
            }
            else {
                q=q+ch;
            }
        }
        System.out.println("Required string: "+r);
    }
}
