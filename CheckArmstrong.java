import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        int m=s.length();
        System.out.println(chack( n,m));

    }
    public static boolean chack(int n,int m)
    {
        int res=0;
        int num=n;
        while(n>0){
            int c=n%10;
            res=res+(int)(Math.pow(c,m));
            n=n/10;
        }
        return num==res;


    }
}
