import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    public static void main(String[] args) {
     int nums[]={1,2,5,2,3};
        List<Integer> ans=new ArrayList<>();
     ans=targetIndices(nums,3);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     int min=i;
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[j]<nums[min])
        //         {
        //             min=j;
        //         }
        //     }
        //     int temp=nums[min];
        //     nums[min]=nums[i];
        //     nums[i]=temp;
        // }
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        List<Integer> ans=new ArrayList<>();
        int arr[]=new int[nums.length];

        int count=0,p=0;
        while(i<j)
        {
            int mid=(i+j)/2;

            if(target>nums[mid])
            {
                i=mid+1;
            }
            else if(nums[mid]==target)
            {
                p=mid;
                count++;
                j=mid;
            }
            else{
                j=mid;
            }

        }



        for(int k=0;k<count;k++)
        {
            ans.add(p);
            p++;
        }

        return ans;
    }
}
