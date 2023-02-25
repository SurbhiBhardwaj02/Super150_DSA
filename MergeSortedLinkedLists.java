import java.util.*;
public class MergeSortedLinkedLists {
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
    public static void main (String args[]) {


        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            MergeSortedLinkedLists l1=new MergeSortedLinkedLists();
            MergeSortedLinkedLists l2=new MergeSortedLinkedLists();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                l1.push(sc.nextInt());
            }
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                l2.push(sc.nextInt());
            }
            MergeSortedLinkedLists res=new MergeSortedLinkedLists();

            Node temp1 = l1.head;
            Node temp2 = l2.head;
            while (temp1 != null && temp2 != null) {
                if (temp1.data <= temp2.data) {
                    System.out.print(temp1.data+" ");
                    res.push(temp1.data);
                    temp1 = temp1.next;
                } else {
                    System.out.print(temp2.data+" ");
                    res.push(temp2.data);
                    temp2 = temp2.next;
                }
            }
            if (temp1 != null) {
                while (temp1 != null) {
                    System.out.print(temp1.data+" ");
                    res.push(temp1.data);
                    temp1 = temp1.next;
                }
            }
            if (temp2 != null) {
                while (temp2 != null) {
                    System.out.print(temp2.data+" ");
                    res.push(temp2.data);
                    temp2 = temp2.next;
                }
            }

            System.out.println();

        }
    }

}