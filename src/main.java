import org.w3c.dom.ranges.RangeException;

import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int user_choice = 0;
        Double num1;
        Double num2;

        System.out.println("Select an object in which you would like to calculate the area of:");
        System.out.println("___________________________________________________________________");
        System.out.println("1. Circle ");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Parallelogram");
        Scanner user_input1 = new Scanner(System.in);
        user_choice =  user_input1.nextInt();

        switch (user_choice) {

            case 1:
                System.out.println("Enter a number to calculate the area of a Circle: ");
                num1 = user_input1.nextDouble();
                circle(num1);
                break;

            case 2:
                System.out.println("Enter a length: ");
                num1 = user_input1.nextDouble();
                square(num1);
                break;

            case 3:
                System.out.println("Enter a length: ");
                num1 = user_input1.nextDouble();
                System.out.println("Enter a width: ");
                num2 = user_input1.nextDouble();
                rectangle(num1, num2);
                break;

            case 4:

                System.out.println("Enter a base: ");
                num1 = user_input1.nextDouble();
                System.out.println("Enter a height: ");
                num2 = user_input1.nextDouble();
                parl(num1, num2);
                break;

            default:
                System.out.println("That was not a valid option");
                break;
        }
    }
    public static void circle(Double num1) {
        double total = (num1 * num1) * 3.14159265;
        System.out.print("The area of a cirlce is: " + total);


    }
    public static void square(Double num1) {
//        System.out.println("TEST square");
        double total = (num1 * num1);
        System.out.print("The area of a square is: " + total);
    }

    public static void rectangle(Double num1, Double num2){
        double total = (num1 * num2);
        System.out.print("Area of the rectangle is: " + total);

    }

    public static void parl(Double num1, Double num2){
        double total = (num1 * num2);
        System.out.print("Area of the parallelogram is: " + total);

    }
}
