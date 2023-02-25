import java.util.*;
public class Kelementfromlastinlinkedlist {
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
    public static void main (String args[]) {
        Kelementfromlastinlinkedlist ll=new Kelementfromlastinlinkedlist();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        while(x>=0){
            ll.push(x);
            x=sc.nextInt();
        }
        int t=sc.nextInt();
        Node temp=ll.head;

        boolean f=false;
        int c=0;
        while(temp!=null){
            if(f==true||temp.val==t){
                c++;
                f=true;
            }
            temp=temp.next;
        }
//        while(temp!=null){
//            System.out.print(temp.val+" ");
//            temp=temp.next;
//        }
        if(c==0){
            System.out.print(-1);
        }else{
            System.out.print(c);
        }

    }
}