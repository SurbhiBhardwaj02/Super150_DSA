import org.w3c.dom.Node;

public class Cycle_Client {
    public static void main(String[] args) throws Exception {
        Cycle_Create cc=new Cycle_Create();
        cc.addFirst(10);
        cc.addFirst(20);
        cc.addFirst(30);
        cc.addFirst(40);
        cc.addFirst(50);
        cc.addFirst(60);
        cc.addFirst(70);
        cc.addFirst(80);
        cc.addFirst(90);
        cc.CreateCycle();
        cc.CycleRemoval2();
        cc.display();
    }
}
