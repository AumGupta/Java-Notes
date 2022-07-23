/*
2) Write a program called Hex2Bin that prompts the user for a hexadecimal string and prints its equivalent binary string.
*/

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexArr[] = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        
        System.out.print("ENTER A HEXADECIMAL: ");
        String hex = sc.next();
        hex = hex.toUpperCase();
        String bin = "";
        for (int i=0; i<hex.length(); i++){
            char c = hex.charAt(i);
            if (c>47 && c<58){
                bin  += hexArr[c-48];
            }
            else if (c>64 && c<71){
                bin += hexArr[c-55];
            }
        }
        System.out.print("Binary: "+bin);

        sc.close();
    }
}