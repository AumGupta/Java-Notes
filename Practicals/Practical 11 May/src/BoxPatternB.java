import java.util.Scanner;

public class BoxPatternB {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = get.nextInt();

        for (int i = 1; i < n; i++){
            for (int j = 1; j < n; j++){
                if (i==1 || i==(n-1) || i==j){
                    System.out.print("# ");
                }else{System.out.print("  ");}
            }
            System.out.print('\n');
        }

        get.close();
    }
}
