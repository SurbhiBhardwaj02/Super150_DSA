import java.util.Scanner;

public class SpiralClockwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        printSpiral(arr);
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print( arr[i][j]+" ");
//            }
//            System.out.println( );
//        }
    }
    public static void printSpiral(int arr[][]) {
        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length -1;

        int count = 0;
        int k = arr.length * arr[0].length;
        while (count<k) {
             for (int i = minc; i <= maxc && count<k; i++) {
                System.out.print(arr[minr][i] + " ");
                count++;
            }

            minr++;
            for (int i = minr; i <= maxr && count<k; i++) {
                System.out.print(arr[i][maxc] + " ");
                count++;
            }
            maxc--;

            for (int i = maxc; i >= minc && count<k; i--) {
                System.out.print(arr[maxr][i] + " ");
                count++;
            }

            maxr--;
            for (int i = maxr; i >= minr && count<k; i--) {
                System.out.print  (arr[i][minc] + " ");
                count++;
            }

            minc++;
        }


    }

}
