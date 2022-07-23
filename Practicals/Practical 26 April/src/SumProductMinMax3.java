/*
1) WAP with a class named SumProductMinMax3 that prompts the user for three integers. The program shall read the inputs as int; compute the sum, product, minimum and maximum of the three integers; and print the results.
*/
import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers (Separated by Space): ");
        int num = sc.nextInt();
        int sum=num, product=num, i=0,min=num,max=num;
        while(i<2){
            num = sc.nextInt();
            sum += num;
            product *= num;
            if (num < min) min = num;
            if (num > max) max = num;
            i++;
        }
        System.out.print("Sum = "+sum+"\nProduct = "+product+"\nMinimum = "+min+"\nMaximum = "+max);
        sc.close();
    }
}