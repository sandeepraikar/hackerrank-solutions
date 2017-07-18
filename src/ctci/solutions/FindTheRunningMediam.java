package ctci.solutions;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindTheRunningMediam {

    public static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int x: a){
            addNum(x);
            getMedian();
        }
        
    }
    
    public static void addNum(int x){
        maxHeap.add(x);
        minHeap.add(maxHeap.poll());
        if(maxHeap.size()<minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public static void getMedian(){
        double result = 0;
        if(maxHeap.size()==minHeap.size()){
            result = (maxHeap.peek()+minHeap.peek())/2.0;
        }else{
            result= maxHeap.peek();
        }
        System.out.println(result);
    }
}
