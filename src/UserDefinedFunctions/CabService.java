package UserDefinedFunctions;

/*A private cab service company provides service within the city at the following rate:

			             AC Car				Non-AC Car

    upto 5km		      150				120
    greater than 5 km	  10/km				8/km


design a class CabService with the following description:

member variables: String Car_Type, double Km, double bill.

member method: 1) void accept() -> to accept car type and kilometer using scanner class only
	       2) void calculate() -> to calculate bill as per the above given table
	       3) void display() -> to display the bill as per the following format:

					Car Type:
					Kilometers travelled:
					Total Bill: Rs.


Create an object of the class in the main method and invoke all the member functions.
**/

import java.util.Scanner;

public class CabService {
    String car_type;
    double km, bill;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car Type: ");
        car_type = sc.nextLine();
        System.out.println("Enter number of kilometres:  ");
        km = sc.nextInt();
    }

    public void calculate() {
        if (car_type.equalsIgnoreCase("AC")) {
            if (km <= 5.0 && km > 0.0) {
                bill = 150.0;
            } else if (km > 5.0) {
                bill = 150 + (km - 5.0) * 10.0;
            }
        } else if (car_type.equalsIgnoreCase("Non AC")) {
            if (km <= 5.0 && km > 0.0) {
                bill = 120.0;
            } else if (km > 5.0) {
                bill = 150 + (km - 5.0) * 8.0;
            }
        } else {
            System.out.println("Invalid Input");
        }
    }

    public void display() {
        System.out.println("Car Type: " + car_type.toUpperCase());
        System.out.println("Kilometers Travelled: " + km);
        System.out.println("Total bill no.: Rs. " + bill);
    }

    public static void main(String[] args) {
        CabService obj = new CabService();

        obj.accept();
        obj.calculate();
        obj.display();
    }
}
