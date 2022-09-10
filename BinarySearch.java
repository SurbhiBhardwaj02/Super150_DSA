public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,11,13,14,18,20,22,27};
        int n=13;
        System.out.println( search(arr,n));
    }
    public static int search(int arr[],int item)
    {
        int st=0;
        int end= arr.length-1;
        while(st<=end){
            int mid =(st+end)/2;

            if(arr[mid]==item)
                return mid;

            else if(arr[mid]>item)
                end=mid-1;
            else
                st=mid+1;
        }
        return -1;

    }
}
