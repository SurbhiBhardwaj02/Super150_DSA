import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
    Scanner sc = new Scanner(System.in);

    public class Node {
        int data;
        Node left;
        Node right;

    }

    private Node root;

    public BinaryTree() {
        // TODO Auto-generated constructor stub
        this.root = CreateTree();

    }

    private Node CreateTree() {
        // TODO Auto-generated method stub

        int item = sc.nextInt();
        Node nn = new Node();
        nn.data = item;
        boolean hlc = sc.nextBoolean(); //has left child
        if (hlc == true) {
            nn.left = CreateTree();// left subStree
        }

        boolean hlr = sc.nextBoolean();
        if (hlr == true) {
            nn.right = CreateTree();// right SubStree
        }
        return nn;

    }

    public void Display() {
        Display(this.root);
    }

    private void Display(Node nn) {
        if (nn == null) {
            return;
        }
        String str = "";
        str = str + nn.data;
        str = "<--" + str + "-->";
        if (nn.left != null) {
            str = nn.left.data + str;
        } else {
            str = "." + str;
        }
        if (nn.right != null) {
            str = str + nn.right.data;
        } else {
            str = str + ".";
        }
        System.out.println(str);
        Display(nn.left);// left subtree visit
        Display(nn.right);// right subtree visit

    }
    public void PreOrder(){
        PreOrder(this.root);
    }
    private void PreOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        PreOrder(node.left);
        PreOrder(node.right);
    }
    public void PostOrder(){
        PostOrder(this.root);
    }
    private void PostOrder(Node node){
        if(node==null){
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data+" ");
    }
    public void InOrder(){
        InOrder(this.root);
    }
    private void InOrder(Node node){
        if(node==null){
            return;
        }
        InOrder(node.left);
        System.out.print(node.data+" ");
        InOrder(node.right);
    }

    public void LevelOrder(){
        LevelOrder(this.root);
    }
    private void LevelOrder(Node node){
        LinkedList<Node> queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node rv= queue.remove();
            System.out.print(rv.data+" ");
            if(rv.left!=null){
                queue.add(rv.left);
            }
            if(rv.right!=null){
                queue.add(rv.right);
            }
        }
        //System.out.println();
    }

    public int max() {

        return max(this.root);
    }

    private int max(Node node) {

        if (node == null) {
            return Integer.MIN_VALUE;       ///for min return integer.max
        }

        int lmax = max(node.left);
        int rmax = max(node.right);
        return Math.max(lmax, Math.max(rmax, node.data));

    }

    public int min(){
        return min(this.root);
    }
    private int min(Node node){
        if(node==null){
            return Integer.MAX_VALUE;
        }
        int lmin=min(node.left);
        int rmin=min(node.right);
        return Math.min(rmin,Math.min(node.data,lmin));

    }

    public boolean find(int item) {


        return Search(this.root, item);
    }

    private boolean Search(Node nn, int item) {
        // TODO Auto-generated method stub
        if (nn == null) {
            return false;
        }

        if (nn.data == item) {
            return true;
        }

        return Search(nn.left, item) || Search(nn.right, item);

    }

    public int ht() {

        return ht(this.root);
    }

    private int ht(Node node) {

        if(node==null) {
            return -1;
        }

        int lh = ht(node.left);
        int rh = ht(node.right);

        return Math.max(lh, rh) + 1; //// we have taken only left side or right side of tree so we add 1 bcs to add root node

    }

}