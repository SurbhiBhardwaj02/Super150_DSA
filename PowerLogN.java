public class PowerLogN {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        System.out.println(power(a,b));
    }
    public  static int power(int a,int b)
    {
        if(b==0)
        {
            return 1;
        }
        int ans=power(a,b/2);
        ans=ans*ans;
        if(b%2==0)
        {
            ans=ans*a;
        }
        return ans;
    }
}
