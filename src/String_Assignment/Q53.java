package String_Assignment;

import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        String s = Integer.toString(n);

        int sum = 0, pro = 1, sEven = 0, sOdd = 0, sPrime = 0, sFandL = 0, dig;

        String ch;

        for (int i = 0; i < s.length(); i++) {
            // as we have to use string function, we can not use char at instead we will use this:
            ch = s.substring(i, i + 1);

            dig = Integer.parseInt(ch);

            sum = sum + dig;
            pro = pro * dig;

            if (dig % 2 == 0)
                sEven = sEven + dig;
            else
                sOdd = sOdd + dig;

            if (dig == 1 || dig == 3 || dig == 5 || dig == 7) {
                sPrime = sPrime + dig;
            }

            sFandL = Integer.parseInt(s.substring(0, 1)) + Integer.parseInt(s.substring(s.length() - 1));
        }


        System.out.println("Sum of all digits: " + sum);
        System.out.println("Product of all digits: " + pro);
        System.out.println("Sum of even digits: " + sEven);
        System.out.println("Sum of odd digits: " + sOdd);
        System.out.println("Sum of prime digits: " + sPrime);
        System.out.println("Sum of First and Last digit: "+sFandL);
    }
}
