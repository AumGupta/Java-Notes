import java.util.Scanner;

public class RemDuplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of array below:\n");
        for (int i = 0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Input:  [");
        for (int i = 0; i<size; i++){
            System.out.print(arr[i]);
            if (i!=size-1){
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

        for (int i = 0; i<size; i++){
            for (int j = i+1; j<size; j++){
                if (arr[i] == arr[j]){
                    arr[j] = 0;
                }
            }
        }

        System.out.print("Output: [");
        for (int i = 0; i<size; i++){
            System.out.print(arr[i]);
            if (i!=size-1){
                System.out.print(", ");
            }
        }
        System.out.print(" ]");

        in.close();   
    }
}
