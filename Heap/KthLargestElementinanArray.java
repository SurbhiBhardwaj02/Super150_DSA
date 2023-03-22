package Heap;

import java.util.PriorityQueue;

public class KthLargestElementinanArray {
    public static void main(String[] args) {
        int arr[]= {3,2,3,1,2,4,5,5,6};
        int k=3;
        kthLargest(arr,k);
    }
    public static int kthLargest(int arr[],int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();  //min Heap
        //PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());// max Heap
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (arr[i] > pq.peek()) {
                pq.poll(); //remove
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}

