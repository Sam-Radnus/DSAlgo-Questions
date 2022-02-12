import java.util.Arrays;

public class StackCreation {
    int myStack[]=new int[10];
    int top;
    public StackCreation()
    {
         top=-1;
    }
    public boolean isFull()
    {
        return top==9;
    }
    public boolean isEmpty()
    {
        return top<=0;
    }
    public void push(int x)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow");      //Stack is Full
        }
        else{
            myStack[++top]=x;
        }
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");    //Stack is Empty
            return -1;
        }
        return myStack[top--];

    }
    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");    //Stack is Empty
        }
        else
        System.out.println(myStack[top]);
    }
    public void printStack()
    {
        //System.out.println(Arrays.toString(myStack));
        for(int c=0;c<=top;c++)
        {
            System.out.print(myStack[c]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        StackCreation st=new StackCreation();
        System.out.println("Is the Stack Empty:"+st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Is the Stack Empty:"+st.isEmpty());
        st.printStack();
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);
        System.out.println("Is the Stack Full:"+st.isFull());
        int pop=st.pop();
        System.out.println(pop);
        st.printStack();
        st.peek();
        System.out.println("Is the Stack Full:"+st.isFull());
        System.out.println("Is the Stack Empty:"+st.isEmpty());
        while(!st.isEmpty())
        {
            System.out.print(st.pop()+" ");
        }
        st.printStack();
        System.out.println("Is the Stack Empty"+st.isEmpty());
    }
}
