public class Cycle_Create {
    private class Node{
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int item){     //O(1)
       Node nn=new Node();
        nn.val=item;
        if(this.size==0){
            head=nn;
            tail=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
        size++;
    }
    private Node getNode(int k) throws Exception
    {
        if (k < 0 || k >= size) {
            throw new Exception("BKLOL k is out of range");
        }
        Node temp=head;
        for(int i=1;i<=k;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public void CreateCycle() throws Exception{
        Node nn=getNode(2);
        this.tail.next=nn;

    }
    public Node hasCycle() {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return slow;
            }
        }
        return null;
    }
    public void CycleRemoval1(){
        Node meet=hasCycle();
        if(meet==null){
            return;
        }
        Node temp=meet;
        int count=1;
        while (temp.next!=meet){
            count++;
            temp=temp.next;
        }
        Node fast=head;
        for (int i = 1; i <=count ; i++) {
            fast=fast.next;
        }
        Node slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
    public void CycleRemoval2(){
        Node meet=hasCycle();
        if(meet==null){
            return;
        }

        Node fast=meet;
        Node slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;

    }
}
