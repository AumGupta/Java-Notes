package PYQ2019;

class X{
    int a;

    X(int i){
        a = i;
    }
}

class Y extends X{
    int b;
    Y(int i, int j){
        super(j); // *Error - 1
        b= i;
    }
}

public class Q3_a {
    public static void main(String[] args) {
        X xob1 = new X(10);
        X xob2;
        Y yob = new Y(5,6);
        xob2 = xob1;
        System.out.println("xob2.a = "+xob2.a);
        xob2 = yob;
        System.out.println("xob2.a = "+xob2.a);
        xob2.a = 21;
        // xob2.b = 32; // *Error - 2
    }
}


