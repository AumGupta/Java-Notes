class Stack {
    int stk[] = new int[20];
    int tos = -1;

    void push(int item){
        if (tos==19){
            System.out.print("STACK IS FULL");
        } else {
            stk[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.print("STACK UNDERFLOW");
            return 0;
        } else return stk[tos--];
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack stk1 = new Stack();
        
        for (int i =0; i<20; i++){
            stk1.push(i);
        }

        System.out.println("Given Stack 1: ");
        for (int i = 0; i<20; i++){
            System.out.println(stk1.pop());
        }
    }
}
