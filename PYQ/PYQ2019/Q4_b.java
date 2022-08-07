package PYQ2019;

import java.lang.Math;

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}

public class Q4_b {
    static double MySqrt(double n) throws MyException{
        if (n<0) throw new MyException("Positive number required.");
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        try{
            System.out.println(MySqrt(4));
        }catch(MyException e){
            System.out.println(e);
        }
    }
}
