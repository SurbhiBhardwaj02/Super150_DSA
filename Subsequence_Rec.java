public class Subsequence_Rec {
    public static void main(String[] args) {
          String str="abc";
          printpermutation(str,"");

    }
    public static void printpermutation(String ques,String ans )
    {
        if(ques.length()==0)
        {
            System.out.print(ans+" ");
            return;
        }
        char ch= ques.charAt(0);
        printpermutation(ques.substring(1),ans);
        printpermutation(ques.substring(1), ans+ch);
    }
}
