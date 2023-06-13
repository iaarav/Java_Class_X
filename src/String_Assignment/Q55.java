package String_Assignment;

import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n= sc.nextInt();

        String q="",p;

        while (n!=0){
            p=Integer.toString(n%8);

            if (p.equals("0")){
                q="0"+q;
            }
            else if (p.equals("1")){
                q="1"+q;
            }
            else if (p.equals("2")){
                q="2"+q;
            }
            else if (p.equals("3")){
                q="3"+q;
            }
            else if (p.equals("4")){
                q="4"+q;
            }
            else if (p.equals("5")){
                q="5"+q;
            }
            else if (p.equals("6")){
                q="6"+q;
            }
            else if (p.equals("7")){
                q="7"+q;
            }

            n=n/8;
        }
        System.out.println("Octal Equivalent: "+q);
    }
}
