import java.util.Scanner;

public class SimpleInput {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i=0,sum=0;
        while(i<n)
        {
            sum=sum+arr[i];
            if(sum>=0)
            {
                System.out.println(arr[i]);
            }
            else
            {
                i=n;
            }
            i++;


        }

    }
}
