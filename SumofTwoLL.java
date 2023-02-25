import java.util.*;
public class SumofTwoLL {
    class Node{
        long val;
        Node next;
    }
    private Node head;
    private Node tail;
    public void push(long item){
        Node nn=new Node();
        nn.val=item;
        if(head==null){
            head=nn;
            tail=nn;
        }
        else{
            tail.next=nn;
            tail=nn;
        }
    }
    public static long merge(Node head,long n){
        if(head.next==null){
            return n;
        }
        return merge(head.next, (head.next.val+(long)(n*10)));

    }
    public void push2(long item){
        Node nn=new Node();
        nn.val=item;
        if(head==null){
            head=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }

    }
    public static void main (String args[]) {
        SumofTwoLL l1=new SumofTwoLL();
        SumofTwoLL l2=new SumofTwoLL();
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        for(long i=0;i<n;i++){
            l1.push(sc.nextLong());
        }
        for(long i=0;i<m;i++){
            l2.push(sc.nextLong());
        }

        long a=merge(l1.head,l1.head.val);
        long b=merge(l2.head,l2.head.val);
        long res=a+b;
        SumofTwoLL ans=new SumofTwoLL();
        while(res>0){
            ans.push2(res%10);
            res=res/10;
        }
        Node temp=ans.head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }
}
//import java.util.*;
//class Main {
//    class Node {
//        int val;
//        Node next;
//    }
//
//    Node head;Node head1;Node head2;
//    Node tail;
//    int size;
//    private ArrayList<Integer> a= new ArrayList<>();
//
//    // O(1)
//    public void addFirst(int item) {
//        Node nn = new Node();
//        nn.val = item;
//        if (head==null) {
//            head = nn;
//            tail = nn;
//            size++;
//        } else {
//            nn.next = head;
//            head = nn;
//            size++;
//
//        }
//
//    }
//
//    // O(1)
//    public void addlast(int item) {
//
//        if (head==null) {
//            addFirst(item);
//        } else {
//            Node nn = new Node();
//            nn.val = item;
//            tail.next = nn;
//            tail = nn;
//            size++;
//
//        }
//
//    }
//    public void display() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.val + " ");
//            temp = temp.next;
//        }
//        // System.out.println("NULL");
//    }
//
//    // O👎
//    private Node GetNode(int k) throws Exception {
//        if (k < 0 || k >= size) {
//            throw new Exception("BkLOL k out of Range hai ");
//        }
//        Node temp = head;
//        for (int i = 1; i <= k; i++) {
//            temp = temp.next;
//        }
//        return temp;
//    }
//    public static void main (String args[]) {
//        Scanner s = new Scanner(System.in);
//        Main obj = new Main();
//        int t=s.nextInt();
//        while(t-->0){
//            int n1=s.nextInt();
//            while(n1-->0){
//                obj.addlast(s.nextInt());
//            }obj.head1=obj.head;obj.head=null;
//            int n2=s.nextInt();
//            while(n2-->0){
//                obj.addlast(s.nextInt());
//            }obj.head2=obj.head;obj.head=null;
//
//            while(obj.head1 != null && obj.head2 != null){
//
//                if(obj.head1.val < obj.head2.val){	System.out.print(obj.head1.val+" ");
//                    obj.head1=obj.head1.next;
//                }
//                else{	System.out.print(obj.head2.val+" ");
//                    obj.head2=obj.head2.next;
//                }
//            }
//            while(obj.head1 != null){
//                System.out.print(obj.head1.val+" ");
//                obj.head1=obj.head1.next;
//            }
//            while(obj.head2 != null){
//                System.out.print(obj.head2.val+" ");
//                obj.head2=obj.head2.next;
//            }
//            System.out.println();
//            //  obj.display();
//        }
//    }
//
//}