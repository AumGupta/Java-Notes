public class Q4 {
    public static boolean isNestedPara(String s,int start, int end){
        if (start > end) return true;
        return (s.charAt(start) == '(' && s.charAt(end) == ')' && isNestedPara(s, ++start, --end));
    }

    public static void main(String[] args) {
        String s ="((()))";
        System.out.println(isNestedPara(s,0,s.length()-1));
    }
}
