import java.util.Random;
import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        Reverse(st);
        System.out.println("%%%%%%555555");
        System.out.println(st);
    }
    private static void Reverse(Stack<Integer> st)
    {
        if(st.isEmpty())
        {
            return;
        }
        int x=st.pop();
        Reverse(st);
        InsertDown(st,x);
    }
    private static void InsertDown(Stack<Integer> st,int x)
    {
        if(st.isEmpty())
        {
            st.push(x);
            return;
        }
        int y=st.pop();
        InsertDown(st,x);
        st.push(y);
    }
}
