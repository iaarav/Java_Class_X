package String_Assignment;

import java.util.Scanner;

public class Q86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = sc.next();

        s=s.toUpperCase();

        int c=0;
        String q="";
        char ch1,ch2;

        for (int i = 65; i<=90 ; i++){
            c=0;
            ch1 = (char) i;
            for (int j=0 ; j< s.length(); j++){
                ch2=s.charAt(j);
                if (ch1==ch2){
                    c++;
                }
            }
            if (c>0){
                System.out.println("Frequency of "+ch1+" is: "+c);
            }
        }
    }
}
