import java.util.Scanner;

public class NumberPatternA {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = get.nextInt();

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.print('\n');
        }
        get.close();
    }
}