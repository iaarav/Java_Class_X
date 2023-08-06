package String_Assignment;

import java.util.Scanner;

public class Q81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        int index = 0;
        char ch;
        String pigLatin;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u'){
                index = i;
                break;
            }

        }
        pigLatin =  s.substring(index)+s.substring(0, index) + "ay";
        System.out.println(pigLatin);
    }
}
