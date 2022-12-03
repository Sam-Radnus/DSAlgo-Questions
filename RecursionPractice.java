import java.util.*;
public class RecursionPractice {

    public static void reverse(Stack<Integer> st) {
        // Base Condition
        if(st.size() == 1) return;

        // Hypothesis
        int temp = st.pop();// removing 5 from stack
        reverse(st); // reversing the stack
        //insert(st, temp); // func. call
    }
    public static Stack<Integer> solve(Stack<Integer> st, int temp) {
        // Base Condition
        if(st.size() == 0){
            st.push(temp);
            return st;
        }

        // Hypothesis
        int val = st.pop(); // removing 1 from stack
       // insert(st, temp); // inserting 5 to stack;

        // Induction
        st.push(val); // inserting 1 to stack
        return st;
    }
    public static void main(String args[])
    {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        //midDel(st);
    }
}
