import java.util.*;
public class MergeLL {
    class Node{
        int data;
        Node next;
    }
    Node head;
    Node tail;
    public void push(int item){
        Node nn=new Node();
        if(head==null){
            head=nn;
            tail=nn;
        } else {
            nn.data = item;
            tail.next = nn;
            tail = nn;
        }
    }
    public static void main (String args[]) {
        MergeLL l1=new MergeLL();
        MergeLL l2=new MergeLL();
        MergeLL res=new MergeLL();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l1.push(sc.nextInt());
        }
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            l2.push(sc.nextInt());
        }
        Node temp1=l1.head;
        Node temp2=l2.head;
        while(temp1!=null && temp2!=null){
            if(temp1.data<=temp2.data)
            {
                res.push(temp1.data);
                temp1=temp1.next;
            }
            else{
                res.push(temp2.data);
                temp2=temp2.next;
            }
        }
        if(temp1!=null){
            while(temp1!=null){
                res.push(temp1.data);
                temp1=temp1.next;
            }
        }
        if(temp2!=null){
            while(temp2!=null){
                res.push(temp2.data);
                temp2=temp2.next;
            }
        }
        Node temp=res.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}