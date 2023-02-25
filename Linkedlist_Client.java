public class Linkedlist_Client {
    public static void main(String[] args) throws Exception {
        linkedlist l=new linkedlist();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
        l.display();
        l.addLast(40);
        l.display();
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.getatIndex(2));
        System.out.println(l.removeFirst());
        l.display();
        l.addFirst(60);
        l.removeLast();
        l.display();
    }
}
