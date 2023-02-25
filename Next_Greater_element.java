import java.util.Stack;
public class Next_Greater_element {
    public static void main(String[] args) {
        int arr[]= {11,3,23,9,15};
        int nge[]=NGE(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(nge[i]+"  ");
        }
    }


    public static int[] NGE(int arr[]) {
        int nge[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            //nge
            while(!st.isEmpty() && arr[i]>arr[st.peek()])
            {
                int ii=st.pop();
                nge[ii]=arr[i    ];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int ii=st.pop();
            nge[ii]=-1;
        }
        return nge;
    }
}
