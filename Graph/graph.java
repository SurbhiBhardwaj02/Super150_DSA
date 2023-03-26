package Graph;

import java.util.*;

public class graph {
    private HashMap<Integer, HashMap<Integer,Integer>> map= new HashMap<>();

    public graph(int v){
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean ContainsEdge(int v1,int v2){
        return map.get(v1).containsKey(v2);
    }
    public boolean ContainsVertex(int v1){
        return map.containsKey(v1);
    }
    public int noofEdge(){
        int sum=0;
        for(int key: map.keySet()){
            sum= sum+ map.get(key).size();
        }
        return sum/2;
    }
    public  void removeEdge(int v1,int v2){
        if(ContainsEdge(v1,v2)){
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }
    public void removeVertex(int v1){
        for(int key:map.get(v1).keySet()){
            map.get(key).remove(v1);
        }
        map.remove(v1);
    }
    public void display(){
        for(int key: map.keySet()){
            System.out.println(key+ " " +map.get(key));
        }
    }
    public boolean hasPath(int src, int des, HashSet<Integer> visited){
        if(src==des){
            return true;
        }
        visited.add(src);
        for(int nbrs: map.get(src).keySet()){
            if(!visited.contains(nbrs)) {
                boolean ans = hasPath(nbrs, des, visited);
                if (ans)
                    return ans;
            }
        }
        visited.remove(src);
        return false;
    }
    public void printAllPath(int src, int des, HashSet<Integer> visited,String ans){
        if(src==des){
            System.out.println(ans+src);
            return;
        }
        visited.add(src);
        for(int nbrs: map.get(src).keySet()){
            if(!visited.contains(nbrs)) {
                printAllPath(nbrs, des, visited,ans+src+" ");

            }
        }
        visited.remove(src);

    }

    public boolean BFS(int src,int des){
        HashSet<Integer> vis= new HashSet<>();
        Queue<Integer> q= new LinkedList<>(); ///second case of inheritance
        q.add(src);

        while(!q.isEmpty()){
            //remove
            int rv= q.poll();

            //if already visited then ignore
            if(vis.contains(rv))
                continue;

            //visited
            vis.add(rv);

            //self work
            if(rv==des)
                return true;

            //add neighbour
            for(int nbrs: map.get(rv).keySet()){
                if(!vis.contains(nbrs))
                    q.add(nbrs);
            }
        }
        return false;
    }
    public boolean DFS(int src,int des){
        HashSet<Integer> vis= new HashSet<>();
        Stack<Integer> st= new Stack<>();
        st.push(src);

        while(!st.isEmpty()){
            //remove
            int rv= st.pop();

            //if already visited then ignore
            if(vis.contains(rv))
                continue;

            //visited
            vis.add(rv);

            //self work
            if(rv==des)
                return true;

            //add neighbour
            for(int nbrs: map.get(rv).keySet()){
                if(!vis.contains(nbrs))
                    st.push(nbrs);
            }
        }
        return false;
    }
    public void BFT(){
        HashSet<Integer> vis= new HashSet<>();
        Queue<Integer> q= new LinkedList<>(); ///second case of inheritance

        for (int src: map.keySet()) {
            if (vis.contains(src))
                continue;

            q.add(src);

            while (!q.isEmpty()) {
                //remove
                int rv = q.poll();

                //if already visited then ignore
                if (vis.contains(rv))
                    continue;

                //visited
                vis.add(rv);

                //self work
                System.out.print(rv + " ");

                //add neighbour
                for (int nbrs : map.get(rv).keySet()) {
                    if (!vis.contains(nbrs))
                        q.add(nbrs);
                }
            }
        }
    }
    public void DFT(){
        HashSet<Integer> vis= new HashSet<>();
        Stack<Integer> q= new Stack<>(); ///second case of inheritance
        for (int src: map.keySet()) {
            if (vis.contains(src))
                continue;

            q.add(src);

            while (!q.isEmpty()) {
                //remove
                int rv = q.pop();

                //if already visited then ignore
                if (vis.contains(rv))
                    continue;

                //visited
                vis.add(rv);

                //self work
                System.out.print(rv+" ");

                //add neighbour
                for (int nbrs : map.get(rv).keySet()) {
                    if (!vis.contains(nbrs))
                        q.push(nbrs);
                }
            }
        }

    }


    public boolean isConnected(){
        HashSet<Integer> vis= new HashSet<>();
        Queue<Integer> q= new LinkedList<>(); ///second case of inheritance

        int count=0;
        for (int src: map.keySet()) {
            if (vis.contains(src))
                continue;
            count++;

            q.add(src);

            while (!q.isEmpty()) {
                //remove
                int rv = q.poll();

                //if already visited then ignore
                if (vis.contains(rv))
                    continue;

                //visited
                vis.add(rv);

                //self work
                //System.out.print(rv + " ");

                //add neighbour
                for (int nbrs : map.get(rv).keySet()) {
                    if (!vis.contains(nbrs))
                        q.add(nbrs);
                }
            }
        }
        return count==1;
    }


    public boolean isCycle(){
        HashSet<Integer> vis= new HashSet<>();
        Queue<Integer> q= new LinkedList<>(); ///second case of inheritance

        for (int src: map.keySet()) {
            if (vis.contains(src))
                return true;

            q.add(src);

            while (!q.isEmpty()) {
                //remove
                int rv = q.poll();

                //if already visited then ignore
                if (vis.contains(rv))
                    continue;

                //visited
                vis.add(rv);

                //self work
                //System.out.print(rv + " ");

                //add neighbour
                for (int nbrs : map.get(rv).keySet()) {
                    if (!vis.contains(nbrs))
                        q.add(nbrs);
                }
            }
        }
        return false;
    }

}
