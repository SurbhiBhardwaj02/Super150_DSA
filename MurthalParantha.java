import java.util.Arrays;
import java.util.Scanner;

public class MurthalParantha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nop= sc.nextInt();
        int noc= sc.nextInt(); // this is rank length
        int[] rank=new int[noc];
        for (int i = 0; i < noc; i++) {
            rank[i]=sc.nextInt();
        }
        Arrays.sort(rank);
        System.out.println(mintime(rank,noc,nop));
    }
    public static int mintime(int rank[],int noc,int nop)
    {
        int high= rank[noc-1] * ((nop*(nop+1))/2);
        int low=0;
        int ans=0;
        while(low<=high)
        {
            int mid= (high+low)/2;
            if(isitpossible(rank,noc,nop,mid))
            {
                ans=mid;
                high=mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int rank[],int noc,int nop,int mid)
    {
        int i=0;
        int totaltime=0;
        int totalparantha=0;
        int parantha=1;
        while(i<noc)
        {
            if(totaltime + (parantha * rank[i])<=mid )
            {
                totaltime += parantha*rank[i];
                parantha++;
                totalparantha++;
            }
            else
            {
                i++;
                parantha=1;
                totaltime=0;
            }
            if(totalparantha==nop)
            {
                return true;
            }
        }
        return false;
    }

}
