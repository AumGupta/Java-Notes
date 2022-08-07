package PYQ2019;

public class Q2_b {
    public static void main(String[] args) {
        char ch = '5';
        int a = 4, d, e;
        //Character '4' has Unicode 52
        char f='4',p='3';
        String city="Delhi";
    
        System.out.println("City="+city+5+6);
        System.out.println("City="+city+(5+6));
        e = a + ch; // e = 57
        d = e+2; // d = 59
        long z=p+a; // z = 55
        System.out.println("f="+f+"e="+e);
        System.out.println("d="+d+"z="+z);
    }
}

/*
 * Output:
 * 
 * City=Delhi56
 * City=Delhi11
 * f=4e=57
 * d=59z=55
 */