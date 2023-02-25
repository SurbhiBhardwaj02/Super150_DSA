public class linkedlist {
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
    public void addLast(int item) throws Exception {

        if (size == 0) {
            addFirst(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
        }
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


    public void AddatIndex(int item,int k) throws Exception {
        if(k<0|| k>size){
            throw new Exception("BKLOL k is out of range");
        }
        if(k==0){
            addFirst(item);
        }
        else if(k==size){
            addLast(item);
        }
        else{
            Node k_1th=getNode(k-1);
            Node nn=new Node();
            nn.next=k_1th.next;
            k_1th.next=nn;
            size++;
        }
    }
    public int getFirst(){
        return head.val;
    }
    public int getLast(){
        return tail.val;
    }
    public int getatIndex(int k) throws Exception {
        return getNode(k).val;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public int removeFirst(){       //O(1)
        Node temp=head;
        if(size==1){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            temp.next=null;
        }
        size--;
        return temp.val;
    }
    public int removeLast() throws Exception {
        if(size==1){
            return removeFirst();
        }
        else{
            Node ss=getNode(size-2);
            int rv=tail.val;
            tail=ss;
            tail.next=null;
            size--;
            return rv;
        }

    }
//    public  int removeAtanyIndex(int k) throws Exception {
//    if(k==0){
//        return removeFirst();
//    }
//    else if(k==size-1){
//        return removeLast();
//    }
//    else{
//        Node prev=getNode(k-1);
//        Node curr=prev.next;
//        prev.next=curr.next;
//        curr.next=null;
//        size--;
//        return
//    }

}


