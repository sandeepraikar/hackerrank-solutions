import java.util.*;
public class Solution {
       
          static void partition(int[] ar) {
          int pivot=ar[0];
          ArrayList<Integer> left = new ArrayList<>();
          ArrayList<Integer> right = new ArrayList<>();
          
          for(int i=1;i<ar.length;i++){
        	  if(ar[i]<=pivot){
        		  left.add(ar[i]);
        	  }else
        		  right.add(ar[i]);
          }
          for(int j=0;j<left.size();j++){
        	  ar[j]=left.get(j);
          }
          ar[left.size()]=pivot;
          for(int k=0;k<right.size();k++){
        	  ar[k+left.size()+1]=right.get(k);
          }
          printArray(ar);
       }   
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }
