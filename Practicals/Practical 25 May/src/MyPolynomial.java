public class MyPolynomial {
    double[] coeffs;

    MyPolynomial(double[] coeffs){
        this.coeffs = coeffs;
    }

    int getDegree(){
        return coeffs.length - 1;
    }

    String to_string(){
        String tmp = "";
        for (int i = coeffs.length-1; i>0; i--){
            tmp += coeffs[i]+"x^"+i+" + ";
        }
        return tmp + coeffs[0];
    }
    
    double evaluate(double x){
        double tmp = 0;
        for (int i = coeffs.length-1; i>0; i--){
            tmp += coeffs[i]*java.lang.Math.pow(x, i);
        }
        return tmp + coeffs[0];
    }

    MyPolynomial add(MyPolynomial p){
        double[] tmpC = this.coeffs;
        for (int i = 0; i<coeffs.length; i++){
            tmpC[i]+=p.coeffs[i];
        }
        MyPolynomial tmpP = new MyPolynomial(tmpC);
        return tmpP;
    }
}

class MyPolynomialDemo{
    public static void main(String[] args) {
        double[] coefficients = {1.2,3.4,5.6,7.8};
        MyPolynomial p1 = new MyPolynomial(coefficients);

        System.out.println("Given Polynomial = "+p1.to_string());
        System.out.println("Degree = "+p1.getDegree());
        System.out.println("Value at 2.0 = "+p1.evaluate(2.0));
        MyPolynomial sum = p1.add(p1);
        System.out.println("Sum p+p = "+sum.to_string());
    }
}
