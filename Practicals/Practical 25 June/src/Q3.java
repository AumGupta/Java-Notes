import java.util.Scanner;
import P2.Rectangle;
import P3.Circle;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\t1 - Rectangle\n\t2 - Circle\nCHOSE FROM (1-2): ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length & breadth: ");
                double length = in.nextDouble(), breadth = in.nextDouble();
                Rectangle R = new Rectangle(length, breadth);
                System.out.println("Area = "+R.area());
                break;
        
            case 2:
                System.out.print("Enter radius: ");
                double radius = in.nextDouble();
                Circle C = new Circle(radius);
                System.out.println("Area = "+C.area());
                break;
        
            default:
                System.out.println("Invalid Choice!");
                break;
        }

        in.close();
    }
}
