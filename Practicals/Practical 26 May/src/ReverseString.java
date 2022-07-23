import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input:  ");
        String str = in.nextLine();
        System.out.print("Output: ");
        for (int i = str.length()-1; i>-1; i--){
            System.out.print(str.charAt(i));
        }
        in.close();
    }
}
