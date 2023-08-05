package String_Assignment;

import java.util.Scanner;

public class Q75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        
        int isUpperCase=0, isLowerCase=0;
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if(Character.isUpperCase(ch)){
                isUpperCase++;
            }
            else{
                isLowerCase++;
            }
        }
        System.out.println("Number of LoweCase Letters: "+isLowerCase);
        System.out.println("Number of UpperCase leters: "+isUpperCase);
    }
}
