/*
3) Write a program called PalindromicArray that checks whether the elements of the array form a palindrome or not.
Eg. Enter the array size: 5
Enter the elements of array: 10 12 9 12 10
Output: true
*/

import java.util.Scanner;

public class PalindromicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of array: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean palindrome = false;
        for (int i = 0; i<n; i++){
            if (arr[i] == arr[n-i-1]) palindrome = true;
            else palindrome = false;
        }
        System.out.print("Output: "+palindrome);

        sc.close();
    }
}
