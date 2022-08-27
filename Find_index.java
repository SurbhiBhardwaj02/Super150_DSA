public class Find_index {
    public static void main(String[] args) {
        int arr[]={2,3,-1,4,5,6,11,14};
        boolean check=true;
        int min=arr[0];
        int ans=0;

        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
            {
                ans=i;
            }
        }
        System.out.println(ans);
    }

}
