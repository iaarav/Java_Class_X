package String_Assignment.Previous_Year;

import java.util.Scanner;

public class ICSE_2012 {
    public static void main(String[] args) {
        // WAP to enter a string, convert the string to uppercase. Count and output the number of double letter sequences that exist in the string
        // Sample Input: "SHE WAS FEEDING A LITTLE RABBIT WITH AN APPLE"
        // Sample Output: Count of double letter sequences are: 4

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();

        s=s.toUpperCase();
        char ch, ch1;
        int count=0;

        for (int i=0 ; i <s.length()-1 ; i++){
            ch=s.charAt(i);
            ch1= s.charAt(i+1);

            if (ch==ch1){
                count++;
            }
        }
        System.out.println("Count of double letter sequences are: "+count);
    }
}
