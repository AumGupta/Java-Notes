import java.util.Scanner;

public class Q6 {
    // public static int CalcSum(int n) {
    //     if(n == 1)
    //     return n;
    //     return (int)(Math.pow(n , n)) + CalcSum(n-1);
    // }


    public static int sumSqr(int n){
        if (n == 0) return 0;
        return n*n + sumSqr(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER N : ");
        int n = sc.nextInt();
        System.out.println("SUM OF N^2 SERIES IS : " + sumSqr(n));
        sc.close();
    }
}
