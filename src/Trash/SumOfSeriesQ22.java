package Trash;

import java.util.Scanner;

public class SumOfSeriesQ22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x= sc.nextInt();

        double s=0.0;

        for (int i =2; i<=12; i+=2){
            s=s+((i-1)*Math.pow(x,i)/(i*2-1)*Math.pow(x,(i+2)));
        }
        System.out.println("Sum of the series is "+s);
    }
}
