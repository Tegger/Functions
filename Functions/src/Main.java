import java.util.Scanner;
import java.util.ArrayList;
import java.security.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        double area = 0;
        int userInput = 0;
        boolean check = false;

        while (!check) {

            System.out.println("Please enter a number to set the corrispoding shape that you would like to find the area of:  ");
            System.out.println("1: Rectangle");
            System.out.println("2: Triangle");
            System.out.println("3: Box Surface Area");
            System.out.println("4: Box Internal Area");
            userInput = scanner.nextInt();

            if (userInput == 1) {
                System.out.println("Please enter the rectangles Width: ");
                b = scanner.nextDouble();
                System.out.println("Please enter the rectangles Height: ");
                c = scanner.nextDouble();
                area = rectangle(b, c);
                System.out.println("Your rectangles Area is " + area);
                check = true;

            } else if (userInput == 2) {
                System.out.println("Please enter the Triangles Base: ");
                b = scanner.nextDouble();
                System.out.println("Please enter the Triangle Height: ");
                c = scanner.nextDouble();
                area = triangle(b, c);
                System.out.println("Your Triangles Area is " + area);
                check = true;

            } else if (userInput == 3) {
                System.out.println("Please enter the Boxes Length: ");
                a = scanner.nextDouble();
                System.out.println("Please enter the Boxes Width: ");
                b = scanner.nextDouble();
                System.out.println("Please enter the Boxes Height: ");
                c = scanner.nextDouble();
                area = boxSurf(a, b, c);
                System.out.println("Your Boxes Area is " + area);
                check = true;

            } else if (userInput == 4) {
                System.out.println("Please enter the Boxes Length: ");
                a = scanner.nextDouble();
                System.out.println("Please enter the Boxes Width: ");
                b = scanner.nextDouble();
                System.out.println("Please enter the Boxes Height: ");
                c = scanner.nextDouble();
                area = boxInt(a, b, c);
                System.out.println("Your Boxes Area is " + area);
                check = true;

            } else {
                System.out.println("That is not a viable input... ");
            }


        }

    }
    //rectangle area
    public static double rectangle(double b, double c) {
        double x = b * c;
        return x;
    }
    //triangle area
    public static double triangle(double b, double c) {
       double x = (b * c) / 2;
        return x;
    }
    //box surface area
    public static double boxSurf(double a,double b, double c) {
       double x = 2 * (a * b) + 2 * (b * c) + 2 * (a * c);
        return x;
    }
    //box internal area
    public static double boxInt(double a,double b, double c) {
       double x = a * b * c;
        return x;
    }

}
