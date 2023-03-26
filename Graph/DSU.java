package Graph;

import java.util.HashMap;

public class DSU {

    class Node {
        int vtx;
        Node parent;
        int rank;

    }

    HashMap<Integer, Node> map = new HashMap<Integer, Node>();

    public void createSet(int v) {
        Node node = new Node();
        node.vtx = v;
        node.parent = node;
        node.rank = 0;
        map.put(v, node);
    }

    public int find(int v) {
        Node nn= map.get(v);
        return find(nn).vtx;
    }

    private Node find(Node nn) { //findParent
        if(nn.parent ==nn){
            return nn;
        }

        Node node = find(nn.parent);
        nn.parent=node; //path compression
        return node;
    }

    public void Union(int v1,int v2){
        Node n1= map.get(v1);
        Node n2= map.get(v2);
        Node re1 = find(n1);
        Node re2= find(n2);

        if(re1.rank== re2.rank){
            re1.parent=re2;
            re2.rank+=1;
        }
        else if(re1.rank >re2.rank){
            re2.parent=re1;
        }
        else{
            re1.parent=re2;
        }


    }
}

