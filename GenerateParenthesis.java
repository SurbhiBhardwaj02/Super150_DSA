import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n=3;
        List<String> ans=new ArrayList<>();
        generate_parenthesis(n,ans,0,0,"");
        for (String str : ans) {
            System.out.print(str+'\t');
        }
    }

    public static void generate_parenthesis(int n,List<String> ans,int open,int close,String res)
    {
        if(open==n && close==n)
        {
            ans.add(res);
        }
        if(open<n)
        {
            generate_parenthesis(n,ans,open+1,close,res+"(");
        }
        if(close<open)
        {
            generate_parenthesis(n,ans,open,close+1,res+")");
        }
    }
}
