import java.util.Scanner;

public class NumberPatternC {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = get.nextInt();

        for (int i = 1; i<=n; i++){
            for (int j = n; j > i; j--){
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--){
                System.out.print(j+" ");
            }
            System.out.print('\n');
        }
        get.close();
    }
}
