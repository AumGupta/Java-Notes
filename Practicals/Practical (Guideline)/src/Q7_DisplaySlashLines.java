import java.io.FileInputStream;
import java.io.IOException;

public class Q7_DisplaySlashLines {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Usage: Q7_DisplaySlashLines fileName");
            return;
        }

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
