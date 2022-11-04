import java.util.*;
public class StackReversal {
    public static void reverse(Stack<Integer>st)
    {
        if(st.size()>0) {
            int x = st.pop();
            reverse(st);
            insert(st, x);
        }
    }
    public static void insert(Stack<Integer>st,int x)
    {
       if(st.isEmpty())
       {
           st.push(x);
       }else {
           int a = st.peek();
           st.pop();
           insert(st, x);
           st.push(a);
       }
    }
    public static void main(String args[])
    {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println("Reversed Stack");

        System.out.println(st);
    }
}
