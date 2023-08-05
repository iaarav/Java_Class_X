    package String_Assignment;

import java.util.Scanner;

public class Q80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        String q;
        if(s.charAt(0)== 'E' || s.charAt(0)=='e'){
            q=s.substring(0,s.length()-2) + "O";
        }
        else{
            q=s;
        }
        System.out.println("Required String: "+q);
    }
}
