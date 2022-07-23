public class Q1 {
    public static void main(String[] args) {
        int index = 10;
        for (int x = 2; x<=index; x++){
            for (int i = 1; i<=index/2; i++){
                System.out.print(i*x +" ");
            }
            System.out.println();
            x++;
        }
    }
}
