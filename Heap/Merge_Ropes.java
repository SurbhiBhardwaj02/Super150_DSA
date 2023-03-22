package Heap;

import java.util.PriorityQueue;

public class Merge_Ropes {
    public static void main(String[] args) {
        int arr[]={12,1,3,4};
    }
    public static int Cost(int arr[]){
        int sum=0;
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while(pq.size()>1){
            int a= pq.poll();
            int b= pq.poll();

        }
        return 1;
    }
}
