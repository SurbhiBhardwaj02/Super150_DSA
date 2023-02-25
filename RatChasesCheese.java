import java.util.Scanner;

public class RatChasesCheese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        char arr[][]=new char[n][m];
        for (int i = 0; i < arr.length; i++) {
            String str=sc.next();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j]=str.charAt(j);
            }
        }
        int[][] ans=new int[n][m];
        hasPath(arr,0,0,ans);
    }
    public static void hasPath(char [][]maze,int cc,int cr,int ans[][])
    {
        if(cr==maze.length-1 && cc==maze[0].length-1 && maze[cr][cc]!='X')
        {
            ans[cr][cc]=1;
            Display(ans);
            return;
        }
        if(cr<0|| cc<0 || cr>= maze.length || cc>= maze[0].length || maze[cr][cc]=='X') {
            return;
        }
        maze[cr][cc]='X';
        ans[cr][cc]=1;

        int r[]={-1,1,0,0};
        int c[]={0,0,-1,1};
        for (int i = 0; i < c.length; i++) {
            hasPath(maze,cc+c[i],cr+r[i],ans);
        }
//        hasPath(maze, cc, cr - 1,ans);//up
//        hasPath(maze, cc, cr + 1,ans);//down
//        hasPath(maze, cc - 1, cr,ans);//left
//        hasPath(maze, cc + 1, cr,ans);//right
        maze[cr][cc]='0';
        ans[cr][cc]=0;
    }
    public static void Display(int[][] ans)
    {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
