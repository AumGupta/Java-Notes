import java.util.Scanner;

public class StringRotations {

    static boolean RotatedStr(String string1, String string2){
        if (string1.equals(string2)) return true;
        if (string1.length() != string2.length()) return false;
        
        int size = string2.length();
        
        for (int i = 0; i<size; i++){
            String tmp = "";
            for (int j = i; j<size+i; j++){
                if (tmp.length() == size) break;
                if (j>size-1) j = 0;
                tmp += string2.charAt(j);
            }
            if (tmp.equals(string1)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String str1 = in.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = in.nextLine();
        System.out.print("Output: "+RotatedStr(str1, str2));
        
        in.close();
    }
}
