/*
 *3) Write a program called Dec2Hex that prompts the user for a positive decimal number, read as
 *int, and print its equivalent hexadecimal string. The output shall look like:
 *
 * Program by Om Gupta 214047 
 */
import java.util.Scanner;

public class Dec2Hex {
    String convert(int num){
        String hex = "";
        while(true)
        {
            int x = num%16;
            num = num/16;
            String tmp = ""; //For adding x at begining of hex
            if (x<10) tmp += x;
            else tmp += (char)(x+55);
            tmp += hex;
            hex = tmp;
            if (num == 0) break;
        }
        return hex; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dec2Hex hx = new Dec2Hex();

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();
        System.out.print("The equivalent hexadecimal number is "+hx.convert(number));
        sc.close();
    }
}
