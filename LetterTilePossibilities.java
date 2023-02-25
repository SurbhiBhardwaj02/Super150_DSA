public class LetterTilePossibilities {
    public static void main(String[] args) {
        String str="ABAC";
        int freq[]=new int[26];
        for (int i = 0; i < str.length(); i++) {
            int idx= str.charAt(i)-'A';
            freq[idx]++;//freq[idx]=freq[idx]+1
        }
        System.out.println(possibilities(freq,""));
    }
    public static int possibilities(int freq[],String ans)
    {
        int count=0;
        //System.out.println(ans);
        for (int i = 0; i < freq.length; i++)
        {
            if(freq[i]>=1)
            {
                char ch=(char)(i+'A');
                freq[i]--;
                count += possibilities(freq,ans+ch)+1;
                freq[i]++;
            }
        }
        return count;
    }
}