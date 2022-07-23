class UnderAge extends Exception{
    UnderAge(int age){
        super(""+age);
    }
}

public class ExceptionDemo {
    static void test(int age) throws UnderAge {
        if (age<18) throw new UnderAge(age);
        else System.out.println("Not UnderAge");
    }

    public static void main(String[] args) {
        try {
            test(13);
        } catch (UnderAge e) {
            System.out.println(e);
        }
    }
}
