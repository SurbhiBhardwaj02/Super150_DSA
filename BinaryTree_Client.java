public class BinaryTree_Client {
    public static void main(String[] args) {
        BinaryTree t=new BinaryTree();
        t.Display();
        System.out.println(t.find(13));
        t.PreOrder();
        System.out.println( );
        t.PostOrder();
        System.out.println();
        t.InOrder();
        System.out.println();
        t.LevelOrder();
        System.out.println();
        System.out.println(t.ht());
        System.out.println(t.min());
    }
}
