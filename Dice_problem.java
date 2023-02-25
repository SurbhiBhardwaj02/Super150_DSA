public class Dice_problem {
    public static void main(String[] args) {
        int n=4;
        print_path(0,n,"");
    }
    public static void print_path(int curr,int end,String ans)
    {
        if(curr==end)
        {
            System.out.print(ans+" ");
            return;
        }
        if(curr>end) return;
//        print_path(curr+1,end,ans+1);
//        print_path(curr+2,end,ans+2);
//        print_path(curr+3,end,ans+3);
        for(int dice = 1; dice <=3 ; dice++) {
            print_path(curr+dice,end,ans+dice);
        }
    }
}
