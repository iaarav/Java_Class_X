package String_Assignment;

import java.util.Scanner;

public class Q65 {
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
                if (q.indexOf('a') != -1){
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
