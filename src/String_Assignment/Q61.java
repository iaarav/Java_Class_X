package String_Assignment;

import java.util.Scanner;

public class Q61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        s=s+" ";
        String q="",r="";
        char ch;
        int c=0, c1=0;

        for (int i=0; i<s.length();i++){
            ch=s.charAt(i);

            if (ch==' '){
                c=c+q.length();
                q="";
                c1++;
            }
            else {
                q=q+ch;
            }
        }
        System.out.println("average characters per word: " +(c/(c1*1.0)));
    }
}
