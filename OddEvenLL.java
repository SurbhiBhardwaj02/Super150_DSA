import java.util.*;
public class OddEvenLL {
    class Node{
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    public void push(int item){
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
    public static void arrange(Node head){
        Node even=null;
        Node odd=null;
        Node e=null;
        Node o=null;
        Node temp=head;
        while(temp!=null){
            if(temp.val%2!=0){
                if(o==null){
                    o=temp;
                    odd=temp;
                }
                else{
                    odd.next=temp;
                    odd=odd.next;
                }
            }
            else{
                if(e==null){
                    even=temp;
                    e=temp;
                }
                else{
                    even.next=temp;
                    even=even.next;
                }
            }
            temp=temp.next;
        }
        if(even!=null){
        even.next=null;}


        if(o==null){
            Node t=e;
            while(t!=null)
            {
                System.out.print(t.val +" ");
                t=t.next;
            }
        }
        else{
            odd.next=e;
            Node t=o;
            while(t!=null)
            {
                System.out.print(t.val+" ");
                t=t.next;
            }
        }
    }
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        OddEvenLL ll=new OddEvenLL();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            ll.push(sc.nextInt());
        }

        arrange(ll.head);


    }
}