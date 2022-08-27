public class reverseArr {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7,8};
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j ) {
            swap(arr, i, j);
            i++;
            j--;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k]+" ");
        }
    }
        public static void swap( int arr[], int a, int b)
        {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

}


