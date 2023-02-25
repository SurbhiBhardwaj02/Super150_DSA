public class targetPermutation {
    public static void main(String[] args) {
        int amnt=10;
        int coin[]={2,3,5,7};
        print_target("",amnt,coin);
    }
    public static void print_target(String str,int amnt,int[] coin)
    {
        if(amnt==0)
        {
            System.out.print(str+" ");
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            if(amnt>=coin[i])
            {
//                amnt-=coin[i];
//                print_target(str+coin[i],amnt,coin);
//                amnt+=coin[i];  this is BACKTRACKING SOLUTION
                  print_target(str+coin[i],amnt-coin[i],coin);
            }
        }
    }
}