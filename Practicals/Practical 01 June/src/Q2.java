public class Q2 {
    static String sepByHash(String str){
        if (str.length() == 1) return str;
        return (str.charAt(0) + "#" + sepByHash(str.substring(1)));
    }
    public static void main(String[] args) {
        System.out.print(sepByHash("OmGupta"));
        
    }
}
