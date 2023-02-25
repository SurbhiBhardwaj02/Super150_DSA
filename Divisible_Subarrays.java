import java.util.*;
public class Divisible_Subarrays {

        public static void main(String args[]) {
            // Your Code Here
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int j=0;j<t;j++)
            {
                int n=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                }
                System.out.println(goodarr(arr,n));
            }
        }
        public static long goodarr(int arr[],int n)
        {
            long sum=0;
            int frq[]=new int[n];
            frq[0]=1;
            for(int i=0;i<n;i++)
            {
                sum=sum+arr[i];
                int idx=(int)(sum%n);
                if(idx<0)
                {
                    idx+=n;
                }
                frq[idx]=frq[idx]+1;
            }
            long ans=0;
            for(int i=0;i<n;i++)
            {
                if(frq[i]>1)
                {
                    long p=frq[i];
                    ans =ans + (p*(p-1))/2;

                }
            }
            return ans;
        }


}
