package PYQ2019;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q3_b {
    static FileInputStream fin = null;
    static FileOutputStream fout = null;
    static String vowels = "aeiouAEIOU";

    public static void main(String[] args) {
        try {
            fin = new FileInputStream("C:/Users/aaumg/Files/Programming/Java/PYQ/PYQ2019/A.txt");
            fout = new FileOutputStream("C:/Users/aaumg/Files/Programming/Java/PYQ/PYQ2019/B.txt");

            int b = fin.read();
            do{
                // A = 65 , E = 69, I = 73, O = 79,U = 85
                // a = 97 , e = 101, i = 105, o = 111, u = 117
                // if (b!=65 && b!= 69 && b!= 73 && b!= 79 && b!= 85 && b!= 97 && b!= 101 && b!= 105 && b!= 111 && b!= 117) 
                
                if (!vowels.contains((char)b+""))
                {
                    fout.write((char)b);
                }
                b = fin.read();
            }while(b!=-1);
            
        } catch (IOException e) {
            System.out.println("IOException: "+e);
        } finally {
            try {
                if (fin != null) fin.close();
                if (fout != null) fout.close();
            } catch (IOException e) {
                System.out.println("IOException: "+e);
            }
        }
    }
}
