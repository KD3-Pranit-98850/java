package tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPoint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate of first point: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y coordinate of first point: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x coordinate of second point: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y coordinate of second point: ");
        double y2 = sc.nextDouble();

        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        System.out.println("Point 1: " + p1.getDetails());
        System.out.println("Point 2: " + p2.getDetails());

        if (p1.isEqual(p2)) {
            System.out.println("Both points are same.");
        }
        else {
            System.out.println("Both points are different.");

            double distance = p1.calculateDistance(p2);

            System.out.println("Distance = " + distance);
        }

        sc.close();
    }
}