class Complex {
    int x; //Real Part
    int y; //Complex Part

    Complex(){
        x = 0;
        y = 0;
    }

    Complex(int x){
        this.x = x;
        y = 0;
    }

    Complex(int x, int y){
        this.x = x;
        this.y = y;
    }

    Complex add(Complex b){
        Complex tmp = new Complex((this.x + b.x) , (this.y + b.y));
        return tmp;
    }

    Complex multiply(Complex b){
        Complex tmp = new Complex((this.x * b.x) , (this.y * b.y));
        return tmp;
    }

    String to_string() {
        return (x + " + i" + y );
    }
}
    
//Demo
public class Q1_ComplexClass{
    public static void main(String[] args) {
        Complex C1 = new Complex(4,5);
        Complex C2 = new Complex(1,2);
    
        System.out.println("Given Complex Numbers:\nC1 = "+ C1.to_string() + "\nC2 = " + C2.to_string());
        System.out.println("Sum of C1 and C2     = "+ (C1.add(C2)).to_string() );
        System.out.println("Product of C1 and C2 = "+ (C1.multiply(C2)).to_string() );
    }
}

