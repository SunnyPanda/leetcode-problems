import java.util.Stack;

public class ImplementQueueUsingStacks232 {

    public static void main(String[] args) {

    }
}

class MyQueue {

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {
        int stackOutSize = stackOut.size();
        for (int i = 0; i < stackOutSize; i++) {
            stackIn.push(stackOut.pop());
        }
        stackIn.push(x);
    }

    public int pop() {
        int stackInSize = stackIn.size();
        for (int i = 0; i < stackInSize; i++) {
            stackOut.push(stackIn.pop());
        }
        return stackOut.pop();
    }

    public int peek() {
        int stackInSize = stackIn.size();
        for (int i = 0; i < stackInSize; i++) {
            stackOut.push(stackIn.pop());
        }
        return stackOut.peek();
    }

    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}
