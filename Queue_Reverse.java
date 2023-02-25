import java.util.Queue;

public class Queue_Reverse extends DynamicQueue {
    public static void main(String[] args) throws Exception {
        DynamicQueue dq=new DynamicQueue();
        dq.Enqueue(10);
        dq.Enqueue(20);
        dq.Enqueue(30);
        dq.Enqueue(40);
        dq.Display();
        System.out.println(dq.GetFront());
        System.out.println("**********");
        Reverse( dq);
        dq.Display();
        System.out.println(dq.GetFront());
    }
    private static void Reverse(DynamicQueue dq) throws Exception {
    if(dq.isEmpty()){
        return;
    }
    int x=dq.dequeue();
    Reverse(dq);
    dq.Enqueue(x);
    }
}
