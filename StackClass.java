

public class StackClass {
//    private int[] arr;
    protected int arr[];
    private int top;

    public StackClass() {

        arr = new int[5];
        top = -1;
    }

    public StackClass(int n) {

        arr = new int[n];
        top = -1;
    }

    public boolean isEmpty() {

        return top == -1;

    }

    public boolean isfull() {

        return top == arr.length - 1;

    }

    public void push(int item) throws Exception {
        if(isfull()) {
            throw new Exception("BkLol Stack full hai");
        }
        top++;
        arr[top] = item;


    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("BkLol Stack khali hai");
        }
        int rv = arr[top];
        top--;
        return rv;
    }

    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("BkLol Stack khali hai");
        }
        int rv = arr[top];

        return rv;
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) throws Exception {
        StackClass s = new StackClass();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        s.push(60);
        System.out.println(s.peek());
    }

}