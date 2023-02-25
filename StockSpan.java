import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int arr[]={9,11,23,15,38,42,37};
        spanCal(arr);
    }
    public  static void spanCal(int arr[])
    {
        Stack<Integer> st=new Stack<>();
        int span[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i]>arr[st.peek()] )
            {
                st.pop();
            }
            if(st.isEmpty())
                span[i]=i+1;
            else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" "+span[i]+"     ");
        }
    }
}
