import java.util.Scanner;

public class Queen_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tq=2;
        boolean[] board=new boolean[n];
        Printans(board,tq,0,"",0);
    }
    public static void Printans(boolean board[],int tq,int qpsf,String ans,int c)
    {
        if(qpsf==tq)
        {
            System.out.print(ans+" ");
            return;
        }
        int j=0;
        while(c>0)
        {
            board[j++]=true;
            c--;
        }
        for (int i = c; i < board.length; i++) {
            if(board[i]==false) {
                board[i] = true;
                //c=i;
                Printans(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf,i+1);
                board[i] = false;

            }
        }



    }
}
