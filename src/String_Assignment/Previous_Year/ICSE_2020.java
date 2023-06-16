package String_Assignment.Previous_Year;

import java.util.Scanner;

public class ICSE_2020 {
    public static void main(String[] args) {
        /*
        WAP to enter a sentence and convert it into uppercase and write each word in a separate line

        Sample Input: India is my Country
        Sample Output:
        INDIA
        IS
        MY
        COUNTRY                                     [ICSE 2020]
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();

        String s1=s.toUpperCase();
        s1=s1+" ";
        char ch;
        String q="";

        for (int i= 0 ; i< s1.length(); i++){
            ch=s1.charAt(i);

            if (ch==' '){
                System.out.println(q);
                q="";
            }
            else {
                q=q+ch;
            }
        }
    }
}
