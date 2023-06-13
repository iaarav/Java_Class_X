package String_Assignment;

import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n= sc.nextInt();

        String q="",p;

        while (n!=0){
            p=Integer.toString(n%2);

            if (p.equals("0")){
                q="0"+q;
            }
            else {
                q="1"+q;
            }
            n=n/2;
        }
        System.out.println("Binary Equivalent: "+q);
    }
}
