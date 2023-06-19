package String_Assignment.Previous_Year;

import java.util.Scanner;

public class ICSE_2014 {
    public static void main(String[] args) {
        /* WAP a program to assign a full path and file name as given below using library functions, extract and output the file path, file name and file extension separately
        as shown below:

        Sample Input: C:\Users\admin\Pictures\flowers.jpg
        Sample Output: path: C:\Users\admin\Pictures\
        File name: flowers
        File Extension: jpg
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        int a=s.lastIndexOf('/');
        System.out.println("Path: "+s.substring(0, a+1));
        int b= s.lastIndexOf('.');
        System.out.println("File Name: "+s.substring(a+1,b));
        System.out.println("File Extension: "+s.substring(b));
    }
}
