/*
4) WAP with a class named SumOfDigits that prompts the user for a positive integer. The program shall read the input as int; compute and print the sum of all its digits. No input validation is needed.
*/
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER: ");
        int num = sc.nextInt();
        
        int sum = 0;
        System.out.print("SUM OF DIGITS OF "+num+" = ");
        while(num>0){
            sum += num%10;
            num = num/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
