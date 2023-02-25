import java.util.ArrayList;
import java.util.List;

public class palindrome_partition {
    public static void main(String[] args) {
        String str="nitin";
        ArrayList<String> list=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        partition(str,list,ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
    public static void partition(String ques,ArrayList<String> list,List<List<String>> ans)
    {
        if(ques.length()==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int cut = 1; cut <= ques.length() ; cut++) {
            String s= ques.substring(0,cut);

            boolean check=true;
            int i=0;
            int j=s.length()-1;
            while(i<j)
            {
                if(s.charAt(i)!=s.charAt(j)){
                    check=false;
                }
                i++;
                j--;
            }

            if(check) {
                list.add(s);
                partition(ques.substring(cut),list ,ans);
                list.remove(list.size()-1);
            }
        }
    }
}
