import java.util.Scanner;

public class Word_Search {
    public static void main(String[] args) {
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]==word.charAt(0))
                {
                    boolean ans=SearchWord(board,i,j,word,0);
                    if(ans==true)
                    {
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }
    public static boolean SearchWord(char arr[][],int cc,int cr,String word,int idx)
    {
        if(idx==word.length())
        {
            return true;
        }
        if(cr<0|| cc<0 || cr>= arr.length || cc>= arr[0].length ||arr[cr][cc]!=word.charAt(idx)) {
            return false;
        }
        arr[cr][cc]='*';
        int r[]={-1,1,0,0};
        int c[]={0,0,-1,1};
        for (int i = 0; i < c.length; i++) {
            boolean ans=SearchWord(arr,cc+c[i],cr+r[i],word,idx+1);
            if(ans==true)
            {
                return ans;
            }
        }
        arr[cr][cc]=word.charAt(idx);
        return false;
    }
}
