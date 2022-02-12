public class StackUsingQueues {
    int myStack[]=new int[Integer.MAX_VALUE];
    int top=0;
    public StackUsingQueues() {

    }
    public void push(int x) {
        myStack[top++]=x;
    }
    public int pop() {
        return myStack[top--];
    }

    public int top() {
        return myStack[top];
    }

    public boolean empty() {
        return (top==0);
    }
}
