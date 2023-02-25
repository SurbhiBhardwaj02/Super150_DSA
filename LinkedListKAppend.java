import java.util.*;
public class LinkedListKAppend {


    class Node{
        int data;
        Node next;
    }
    Node head;
    Node tail;
    public void push(int item){
        Node nn=new Node();
        nn.data = item;
        if(head==null){
            head=nn;
            tail=nn;
        } else {

            tail.next = nn;
            tail = nn;
        }
    }
    public void addFirst(int item){     //O(1)
        Node nn=new Node();
        nn.data=item;
        if(head==null){
            head=nn;
            tail=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
    }
    public void display(Node head){
        Node tempr=head;
        while(tempr!=null){
            System.out.print(tempr.data + " ");
            tempr=tempr.next;
        }
    }
    public void append(int n,int k,Node head) throws Exception {
        Stack<Integer> st=new Stack<>();
        Node temp=head;


        while(temp != null) {
            st.push(temp.data);
            temp=temp.next;
        }

        LinkedListKAppend res=new LinkedListKAppend();
        temp=head;
        for(int i=0;i<n-k-1;i++){
            temp=temp.next;
        }
        temp.next=null;
        while(k-->0){
            res.addFirst(st.peek());
            st.pop();
        }
        res.tail.next=head;
        display(res.head);

    }
    public static void main(String args[]) throws Exception {
        LinkedListKAppend ll=new LinkedListKAppend();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            ll.push(sc.nextInt());
        }
        int k=sc.nextInt();

        ll.append(n,k,ll.head);


    }
}