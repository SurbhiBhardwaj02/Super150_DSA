public class  PrintPermutationRec {
    public static void main(String[] args) {
        printpermutation("abc","");
    }
    public static  void printpermutation(String ques,String ans)
    {
        if(ques.length()==0)
        {
            System.out.print(ans+" ");
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch=ques.charAt(i);
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            printpermutation(s1+s2,ans+ch);
        }
    }
}
