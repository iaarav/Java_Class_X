package String_Assignment.Previous_Year;

import java.util.Scanner;

public class ICSE_2018 {
    public static void main(String[] args) {

        /* WAP a menu-driven program to display the pattern as per the user's choice:

        Pattern 1 (using String Functions only):  [Note 1 is the case for switch case here]
        ABCDE
        ABCD
        ABC
        AB
        A

        Pattern 2:
        B
        LL
        UUU
        EEEE
        JJJJJ

           [ICSE 2018]
         */
        Scanner sc = new Scanner(System.in);

        String q;
        int choice;
        System.out.println("Enter 1 for Pattern 1 and 2 for pattern 2");
        choice=sc.nextInt();

        switch (choice){
            case 1:
                 q="ABCDE";

                for (int i=q.length();i>=0;i--){
                    System.out.println(q.substring(0,i));
                }
                break;
            case 2:
                q = "BLUEJ";

                for (int i=0; i<q.length();i++){
                    for (int j=0;j<=i;j++){
                        System.out.print(q.charAt(i));
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
