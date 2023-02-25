import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
 public static void main(String[] args) {
     generate(6);
     //        Scanner sc= new Scanner(System.in);
//        int n= sc.nextInt();
//        int row =0;
//        int star=1;
//        while(row<n)
//        {
//            int i=0;
//            int val=1;
//            while(i<star)
//            {
//                System.out.print(val+" ");
//                val=(val*(row-i))/(i+1);
//                i++;
//            }
//            row++;
//            star++;
//            System.out.println();
//        }
}
public static List<List<Integer>> generate(int numRows) {
    int str=0;
    int row=0;
    List<List<Integer>> list=new ArrayList<>();
    List<Integer> ans=new ArrayList<>();

    while(row<numRows)
    {
        int i=0;
        int ncr=1;
        while(i<=str)
        {
            ans.add(ncr);
            System.out.print(ncr);
            ncr=((row-i)* ncr)/(i+1) ;
            i++;
        }
        row++;
        str++;
        list.add(ans);
        System.out.println();

    }
    return list;
}
}
