package Graph;

import java.util.*;

public class Course_Schedule {
    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            HashMap<Integer, List<Integer>> map= new HashMap<>();
            for (int i = 0; i < numCourses; i++) {
                map.put(i, new ArrayList<>());
            }
            for (int i = 0; i < prerequisites.length; i++) {
                int v1= prerequisites[i][0];
                int v2= prerequisites[i][1];
                map.get(v2).add(v1);
            }
            return TopologicalSort(map);
        }
        public boolean TopologicalSort(HashMap<Integer,List<Integer>> map) {
            int[] in = indegree(map);
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < in.length; i++) { // loop from 1 bcs no element is 0
                if (in[i] == 0) {
                    q.add(i);
                }
            }
            int count=0;
            while (!q.isEmpty()) {
                int rv = q.poll();
                count++;
                //System.out.print(rv + " ");
                for (int nbrs : map.get(rv)) {
                    in[nbrs]--;
                    if (in[nbrs] == 0) {
                        q.add(nbrs);
                    }
                }
            }
            System.out.println();
            return count==map.size();

        }
        public int[] indegree(HashMap<Integer,List<Integer>> map) {
            int[] in = new int[map.size() + 1];//+1 bcs we have to do indexing till n
            for (int key : map.keySet()) {
                for (int nbrs : map.get(key)) {
                    in[nbrs]++;
                }

            }
            return in;
        }
    }
}
