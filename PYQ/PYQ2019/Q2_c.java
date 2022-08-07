package PYQ2019;

public class Q2_c {
    static int sum(int... integers){
        int sum = 0;
        for(int number: integers){
            sum+=number;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,3,4));
    }
}
