public class TowerOfHanoi {
    public static void main(String[] args) {
        int n=3;
        String source="A";
        String help="B";
        String dest="C";
        toh(n,source,help,dest);
    }
    public static void toh(int n,String source,String help,String dest)
    {
        if(n==0) return;
        toh(n-1,source,dest,help);
        System.out.println("Move "+n+"th disc from "+source+" to "+dest);
        toh(n-1,help,source,dest);
    }
}

