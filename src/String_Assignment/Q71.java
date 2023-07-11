package String_Assignment;

import java.util.Scanner;

public class Q71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        s=s.toUpperCase();
        char ch;
        char ch1 = '\u0000';
        int fre=0, maxfre=0;

        for (int i=65; i<=90 ; i++){
            fre=0;
            for (int j=0 ; j<s.length(); j++){
                ch=s.charAt(j);
                if (ch==i){
                    fre++;
                }
            }
            if (fre>maxfre){
                maxfre=fre;
                ch1= (char) i;
            }
        }
        System.out.println("Maximum frequency: "+maxfre+" Character: "+ch1);
    }
}
