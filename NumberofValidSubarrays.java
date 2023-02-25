import java.util.Stack;

public class NumberofValidSubarrays {
    public static void main(String[] args) {
        int arr[]= {1,4,2,5,3};
        System.out.println(vaildsubarr(arr));
    }
    public static int vaildsubarr(int arr[])
    {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[i]<st. peek())
            {
                st.pop();
            }
            st.push(arr[i]);
            ans+=st.size();
        }
        return ans;
    }
}
