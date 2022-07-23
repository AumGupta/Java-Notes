/*
2) WAP with a class named Fact that prompts the user to enter a positive integer n, calculates its factorial and prints the result. (Assume n <= 12)
*/

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive interger: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i<=num; i++){
            fact *= i;
        }
        System.out.print("Factorial = "+fact);
        sc.close();
    }    
}
