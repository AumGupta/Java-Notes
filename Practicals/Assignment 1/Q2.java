public class Q2{
    public static int countOH(String s, int index){
        if (index == s.length()) return 0;
        if (s.charAt(index) == 'o' && s.charAt(index+1) == 'h') return 1 + countOH(s, index+1);
        return countOH(s, index+1);
    }

    public static void main(String[] args) {
        System.out.print(countOH("Abohohohf", 0));   
    }
}