import java.util.Scanner;

public class Q5 {
    public static int sum(int a, int b){
        if (a == 0) return b;
        if (b == 0) return a;
        return sum(a,--b) + 1;
    } 

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
       System.out.println(sum(n1 , n2));
       sc.close();
    }
}
