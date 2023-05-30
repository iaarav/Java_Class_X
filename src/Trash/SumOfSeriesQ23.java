package Trash;

import java.util.Scanner;

public class SumOfSeriesQ23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms, n: ");
        int n= sc.nextInt();

        int sum=0; int f=1; double s=0.0;

        for (int i = 1; i<=n ; i++){
            sum+=i;
            f*=1;

            s=s+ (s/f);
        }

        System.out.println("Sum of the series is, s:"+s);
    }
}
