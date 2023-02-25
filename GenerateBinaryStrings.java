import java.util.Scanner;

public class GenerateBinaryStrings {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        fillwildcards(str,"");
    }
    public static void fillwildcards(String ques,String ans)
    {
        if(ques.length()==0)
        {
            System.out.print(ans+" ");
            return;
        }

        if(ques.charAt(0)=='?')
        {
            fillwildcards(ques.substring(1),ans+'0');
            fillwildcards(ques.substring(1),ans+'1');
        }
        else
        {
            fillwildcards(ques.substring(1),ans+ques.charAt(0));
        }

    }
}
