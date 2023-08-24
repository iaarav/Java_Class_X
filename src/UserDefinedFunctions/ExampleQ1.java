package UserDefinedFunctions;

import java.util.Objects;
import java.util.Scanner;

// WAP a function with the name add which takes two int parameters
public class ExampleQ1 {
    Scanner sc = new Scanner(System.in);
    // Receiving a value and Returning a value
    public int add(int a, int b){
        return (a+b);
    }

    // Receiving a value and not returning it
    public static void Add(int a, int b){
        System.out.println("Sum: "+(a+b));
    }

    // Neither Receiving a value nor returning it
    public void Add(){
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum is: " + (a + b));
    }

    public static void main(String[] args) {
        ExampleQ1 obj = new ExampleQ1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int p = sc.nextInt();
        System.out.println("Enter second number: ");
        int q = sc.nextInt();

        System.out.println("Sum is: "+obj.add(p,q));
        Add(p,q);
        obj.Add();
    }
}
