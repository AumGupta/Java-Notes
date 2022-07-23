public class Q3 {
    static boolean chkPalindrome(String string, int startIndex, int endIndex){
        if (string.charAt(startIndex) != string.charAt(endIndex)) return false;
        if (endIndex-startIndex <=1) return true;
        return chkPalindrome(string, ++startIndex, --endIndex);
    }

    public static void main(String[] args) {
        System.out.print(chkPalindrome("htth", 0, 3));
    }
}
