public class MaximumCircularSum {
    public static void main(String[] args) {
        int arr[]={8,-8,9,-9,10,-11,12};
        System.out.println(maxsum(arr));

    }
    public static int maxsum(int arr[])
    {
        int lsum=kadane(arr);//24
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];//77
            arr[i] *= -1;
        }
        int msum=kadane(arr);//11
        sum+=msum;//sum=sum-(-msum)
        if(sum==0)
        {
            return lsum;
        }
        return Math.max(sum,lsum);

    }
    public static int kadane(int arr[])
    {
        int prevsum=0;
        int ans= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            prevsum += arr[i];
            ans = Math.max(ans, prevsum);

            if (prevsum < 0) {
                prevsum = 0;
            }
        }
        return ans;
    }
}
