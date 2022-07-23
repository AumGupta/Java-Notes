import java.util.Scanner;

public class NumberPatternB {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = get.nextInt();

        for (int i = n; i>0; i--){
            for (int j = 0; j<n-i; j++){
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.print('\n');
        }
        get.close();
    }
}
