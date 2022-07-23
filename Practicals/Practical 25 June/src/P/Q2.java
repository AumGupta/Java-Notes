package P;

import P1.TwoDim;
import P2.ThreeDim;

public class Q2 {
    public static void main(String[] args) {
        TwoDim A1 = new TwoDim(2,3);
        TwoDim A2 = new TwoDim();
        System.out.println(A1.toString());
        System.out.println(A2.toString());
        
        ThreeDim B1 = new ThreeDim(3,4,5);
        ThreeDim B2 = new ThreeDim();
        System.out.println(B1.toString());
        System.out.println(B2.toString());
    }
}
