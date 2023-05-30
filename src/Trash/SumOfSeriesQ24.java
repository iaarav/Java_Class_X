package Trash;

import java.util.Scanner;

public class SumOfSeriesQ24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms to be printed, n: ");
        int n= sc.nextInt();
        System.out.println("Enter the value of x: ");
        int x= sc.nextInt();

        int p = 0; double a=1; double s=0.0;

        for (int i = 1; i<=n;i++){
            s=s+((Math.pow(x,a)/a)*p);
            p=p*-1;
            a+=2;
        }
        System.out.println("Sum of the given series is s: "+s);
    }
}
