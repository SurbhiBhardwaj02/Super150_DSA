public class Merge2SortedArr {
    public static void main(String[] args) {
        int arr1[]=new int[6];
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;

        int arr2[]={2,5,6};
        int m=3;
        int j=0;
        for (int i = 3; i <6 ; i++) {
            arr1[i]=arr2[j];
            j++;
        }

        merge(arr1,3,arr2,3);
        for (int i = 0; i < 6; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int gap=(m+n)/2;
        if((gap%2)!=0) gap+=1;
        int temp=0;
        int p=0;
        for (int i = m; i <m+n ; i++) {
            nums1[m]=nums2[p];
            p++;
        }

        while(gap>0)
        {
            int i=0;
            int j=gap;
            while(j<nums1.length)
            {
                if(nums1[i]>nums1[j])
                {
                    temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
                i++;
                j++;
            }
//            while(j<nums2.length)
//            {
//                if(nums1[i]>nums2[j])
//                {
//                    temp=nums1[i];
//                    nums1[i]=nums1[j];
//                    nums1[j]=temp;
//                }
//                i++;
//                j++;
//
//            }
            gap=gap/2;
        }
    }
}
