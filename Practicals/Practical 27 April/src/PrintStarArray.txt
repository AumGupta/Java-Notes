/*
1) WAP called printStarArray which prompts the user for the number of items in an array (a non-negative integer). It then prompts the user for the values of all the items (non-negative integers) and saves them in an int array called items. The program shall then print the contents of the array in a graphical form, with the array index and values represented by the number of stars.
*/

import java.util.Scanner;

public class PrintStarArray {
    public static void main(String[] args) {
        System.out.print("Enter the number of items:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[] = new int[n];

        System.out.print("Enter the value of all items (Separated by Spaces): ");
        for (int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for (int i = 0; i<n; i++){
            System.out.print(i+": ");
            for (int j = 0; j<a[i];j++){
                System.out.print('*');
            }
            System.out.print("("+a[i]+")\n");
        }

        sc.close();
    }
}
