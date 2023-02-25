public class DynamicQueue extends Queue{
    @Override
    public void Enqueue(int item) throws Exception {
        if(super.isfull()) {
            int arr1[] = new int[2 * super.arr.length];
            for (int i = 0; i < arr.length; i++) {
                int idx=(this.front +i) % this.arr.length;
                arr1[i]=arr[idx];
            }
            this.arr=arr1;
            this.front=0;
        }
        super.Enqueue(item);
    }
    public static void main(String[] args) throws Exception {
        DynamicQueue dq=new DynamicQueue();
        dq.Enqueue(20);
        dq.Enqueue(30);
        dq.Enqueue(10);
        System.out.println(dq.dequeue());
        dq.Enqueue(50);
        dq.Enqueue(60);
        dq.Enqueue(70);
        dq.Enqueue(80);
        dq.Enqueue(90);
        dq.Enqueue(100);
        dq.Display();
    }
}
