public class Queen_Problem {
    public static void main(String[] args) {
        int n=4;
        boolean [][] board = new boolean[n][n];

    }
    public static void N_Queen(boolean[][] board,int tq,int row)
    {
        if(tq==0)
        {
            Display(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if(issafe(board,row,col)==true)
            {
                board[row][col]=true;
                N_Queen(board,tq-1,row+1);
                board[row][col]=false;
            }
        }
    }
    public static boolean issafe(boolean[][] board,int row,int col)
    {
        int r=row;
        int c=col;
        while(r>=0&& c< board.length)
        {
            if(board[r][c]==true)
            {
                return false;
            }
            c++;
            r--;
        }
        return false;
    }
    public static void Display(boolean[][] board)
    {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.println(board[i][j]);
            }
        }
    }
}
