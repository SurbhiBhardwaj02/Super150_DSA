public class Square_root {
    public static void main(String[] args) {
        int n=47;
        System.out.println(root(n));//x^2=47    x=????
    }
    public static int root(int n)
    {
        int hi=n;
        int lo=1;
        int ans=0;
        while (lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(mid * mid <= n)
            {
                ans=mid;
                lo=mid+1;
            }
            else {
                hi=mid-1;
            }
        }
        return ans;

    }
}
