class UnderFlow extends Exception{}
class OverFlow extends Exception{}

class Stack {
    int stk[];;
    int tos = -1;

    public Stack(int size){
        stk = new int[size]; 
    }

    void push(int item) throws OverFlow{
        if (tos==stk.length - 1){
            throw new OverFlow();
        } else {
            stk[++tos] = item;
        }
    }
    
    int pop() throws UnderFlow{
        if (tos < 0) {
            throw new UnderFlow();
        } else return stk[tos--];
    }
}


public class Q5_StackDemo {
    public static void main(String[] args) throws UnderFlow, OverFlow{
        Stack stk1 = new Stack(20);
        
        try {
            for (int i =0; i<23; i++){
                stk1.push(i);
            }
            stk1.pop();
        } catch (OverFlow | UnderFlow e) {
            System.out.print(e + "\n");
        }

        System.out.println("Given Stack 1: ");
        for (int i = 0; i<20; i++){
            System.out.println(stk1.pop());
        }
    }
}