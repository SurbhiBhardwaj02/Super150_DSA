public class PrintCoinOutcomes {
    public static void main(String[] args) {

         int n=3;
         printoutcomes(n,"");
    }
    public static void printoutcomes(int n,String ans)
    {
        if(n==0)
        {
            //if(!ans.contains("HH"))
            System.out.println(ans);
            return;
        }
        if(!ans.equals("H")&&!ans.equals("TH"))  {
        //if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
        printoutcomes(n-1,ans+"H");
        }
        printoutcomes(n-1,ans+"T");
    }
}
