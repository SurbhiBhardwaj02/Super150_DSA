public class Count_sequence {
    //static int count=0;
    public static void main(String[] args) {
        String str="abc";
        System.out.println(countpermutation(str,""));
       //  System.out.println(str.substring(1));

    }
    public static int countpermutation(String ques,String ans )
    {
        if(ques.length()==0)
        {
            //System.out.print(ans+" ");
            //count++;
            return 1;
        }
        char ch= ques.charAt(0);
        int ans1=countpermutation(ques.substring(1),ans);
        int ans2=countpermutation(ques.substring(1), ans+ch);
        return ans1+ans2;
    }
}
