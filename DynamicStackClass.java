
public class DynamicStackClass extends StackClass {

    @Override
    public void push(int item) throws Exception
    {
        if(isfull())
        {
            int arr1[]=new int[2*arr.length];
            for (int i = 0; i < arr.length; i++) {
                arr1[i]=arr[i];
            }
            arr=arr1;
        }
        super.push(item);
    }

    public static void main(String[] args) throws Exception {
        DynamicStackClass ds=new DynamicStackClass();
        ds.push(10);
        ds.push(20);
        ds.push(30);
        ds.push(40);
        ds.push(50);
        ds.push(160);
        ds.push(10);
        ds.push(10);
        ds.push(20);
        ds.push(30);
        ds.push(40);
        ds.push(50);
        ds.push(160);
        ds.push(10);
        ds.display();
    }
}
