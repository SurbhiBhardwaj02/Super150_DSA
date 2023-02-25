public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        int[] arr1={2,3,5,7,10,11,15,18};
        int[] arr2={1,2,3,5,7,8,10,13,16,17,18,19,24,25};
        int ans[]=MergeTwoArray(arr1,arr2);
        for (int i = 0; i < arr1.length+ arr2.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] MergeTwoArray(int[] arr1,int[] arr2)
    {
        int i=0;
        int j=0;
        int k=0;
        int ans[]=new int[arr1.length+arr2.length];
        while(i< arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                ans[k++]=arr1[i++];
            }
            else{
                ans[k++]=arr2[j++];
            }
        }
        while(i< arr1.length)
        {
            ans[k++]=arr1[i++];
        }
        while (j< arr2.length)
        {
            ans[k++]=arr2[j++];
        }
        return ans;
    }
}
