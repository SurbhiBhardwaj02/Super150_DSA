package Graph;

import java.util.*;

public class Alien_Dictionary {
    //lintcode
    public class Solution {

        public String alienOrder(String[] words) {
            // Write your code here
            HashMap<Character, List<Character>> map= new HashMap<Character, List<Character>>();
            for (int i = 0; i < words.length; i++) {
                String s= words[i];
                for (int j = 0; j < s.length(); j++) {
                    if(!map.containsKey(s.charAt(j))){
                        map.put(s.charAt(j),new ArrayList<>());
                    }

                }
            }
            for (int i = 0; i < words.length; i++) {
                String s1=words[i];
                String s2=words[i+1];
                if(s1.startsWith(s2) && s2.length()<s1.length()){
                    return "";
                }

                for (int j = 0; j < Math.min(s1.length(),s2.length()); j++) {
                    if(s1.charAt(j)!=s2.charAt(j)){
                        map.get(s1.charAt(j)).add(s2.charAt(j));
                        break;
                    }
                }
            }
            return TopologicalSort(map);

        }

        public String TopologicalSort(HashMap<Character,List<Character>> map) {
            int[] in = indegree(map);
            StringBuilder sb= new StringBuilder();
            Queue<Character> q = new LinkedList<>();
            for (char ch: map.keySet()) { // loop from 1 bcs no element is 0
                if (in[ch-'a']==0) {
                    q.add(ch);
                }
            }
            int count=0;
            while (!q.isEmpty()) {
                char ch = q.remove();
                count++;
                sb.append(ch);

                for (char nbrs : map.get(ch)) {
                    in[nbrs-'a']--;
                    if (in[nbrs] == 0) {
                        q.add(nbrs);
                    }
                }
            }
            return map.size()==count ? sb.toString() : "";

        }
        public int[] indegree(HashMap<Character,List<Character>> map) {
            int[] in = new int[26];//+1 bcs we have to do indexing till n
            for (int key : map.keySet()) {
                for (int nbrs : map.get(key)) {
                    in[nbrs-'a']++;
                }

            }
            return in;
        }
    }
}
