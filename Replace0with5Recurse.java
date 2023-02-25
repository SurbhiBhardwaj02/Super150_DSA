import java.util.Scanner;

public class Replace0with5Recurse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        replace(n,0,1);
    }
    public static void replace(int n,int m,int mul)
    {
        if(n==0)
        {
            System.out.println(m);
            return;
        }
        if(n%10==0)
        {
            m=5*mul+m;
        }
        else
        {
            m=m+(mul*(n%10));
        }

        replace(n/10,m,mul*10);

    }
}
