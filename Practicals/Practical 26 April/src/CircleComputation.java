/*
3) WAP with a class named CircleComputation that prompts the user for the radius of a circle. The program shall read the input as double; compute the diameter, circumference, and area of the circle in double. Use System-provided constant Math.PI.
*/
import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Diameter = "+radius*2+ "\nCircumference = "+2*Math.PI*radius+"\nArea = "+Math.PI*radius*radius);
        sc.close();
    }
}
