package String_Assignment;

import java.util.Scanner;

public class Q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n= sc.nextInt();

        String q="",p;

        while (n!=0){
            p=Integer.toString(n%16);

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
            else if (p.equals("8")){
                q="8"+q;
            }
            else if (p.equals("9")){
                q="9"+q;
            }
            else if (p.equals("10")){
                q="A"+q;
            }
            else if (p.equals("11")){
                q="B"+q;
            }
            else if (p.equals("12")){
                q="C"+q;
            }
            else if (p.equals("13")){
                q="D"+q;
            }
            else if (p.equals("14")){
                q="E"+q;
            }
            else if (p.equals("15")){
                q="F"+q;
            }

            n=n/16;
        }
        System.out.println("HexaDecimal Equivalent: "+q);
    }
}
