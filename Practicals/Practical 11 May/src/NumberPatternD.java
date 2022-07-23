import java.util.Scanner;

public class NumberPatternD {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = get.nextInt();

        for (int i = n; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print(j+" ");
            }
            System.out.print('\n');
        }
        get.close();
    }
}
