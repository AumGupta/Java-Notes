import java.io.FileReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class DisplaySlashLines {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1){
            System.out.println("Usage: Q7 fileName");
            return;
        }

        // Using BufferedReader
        System.out.println("Using BufferedReader:");
        String l;
        try (FileReader fr = new FileReader(args[0]);BufferedReader br = new BufferedReader(fr);) {
            while ((l=br.readLine()) != null) {
                if (l.charAt(0) == '/' && l.charAt(1) == '/')
                System.out.println(l);
            }

        } catch (IOException e) {
            System.out.println("I/O Exception: " + e);
        }


        // Using FIleInputStream
        System.out.println("\nUsing FileInputStream:");
        int b;
        try (FileInputStream fin = new FileInputStream(args[0]);) {
            
            do {
                b = fin.read();
                if (b == '/'){
                    b = fin.read();
                    if (b == '/'){
                        System.out.print("//");
                        while (b != '\n' && b != -1) {
                            b = fin.read();
                            if (b != -1) System.out.print((char)b);
                        }
                    }
                }
            } while (b != -1);

        } catch (IOException e) {
            System.out.println("I/O Exception: " + e);
        }
    }
}