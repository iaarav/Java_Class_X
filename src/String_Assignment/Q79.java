package String_Assignment;

import java.util.Scanner;

public class Q79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, s=0;
        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter number "+i+": ");
             n = sc.nextInt();
             if(n/10 > 4 && n%2 ==0){
                s=s+n;
             }
        }
        System.out.println("Req sum: "+s);
    }
}
