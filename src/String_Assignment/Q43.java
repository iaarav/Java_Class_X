package String_Assignment;

import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        String name = s.substring(s.lastIndexOf(" ") + 1) +" "+ s.substring(0, s.indexOf(" ")) + " " + s.substring(s.indexOf(" ") + 1, s.lastIndexOf(" "));
        System.out.println("Required Name: "+name);
    }
}