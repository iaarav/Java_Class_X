package String_Assignment;

import java.util.Scanner;

public class Q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        String q="",r="";
        char ch;

        for (int i=0; i<s.length();i++){
            ch=s.charAt(i);

            if (ch==' '){
                q="";
                if (q.length()>4){
                    r=r+q;
                }
                else {
                    continue;
                }
            }
            else {
                q=q+ch;
            }
        }
        System.out.println("Final String is: "+q);
    }
}
