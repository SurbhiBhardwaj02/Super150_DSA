public class Ratateimg {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static  void rotate(int[][] matrix) {

        // transpose the matrix
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                //swap
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int first=0;

        while(first<matrix.length)
        {
            int last=matrix.length-1;
            for(int i=0;i<matrix.length-1;i++)
            {
                int temp=matrix[first][i];
                matrix[first][i]=matrix[first][last];
                matrix[first][last]=temp;
                last--;
            }
            first++;

        }
    }
}
