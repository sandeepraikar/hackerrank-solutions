package datastructures.linkedlist;

public class FindMergePointOfTwoLinkedLists {

	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as */
	  class Node {
	     int data;
	     Node next;
	  }
	
	int FindMergeNode(Node headA, Node headB) {
	    // Complete this function
	    // Do not write the main method. 
	    Node currA= headA;
	    Node currB= headB;
	    
	    while(currA!=currB){
	        if(currA.next==null){
	            currA=headB;
	        }else{
	            currA=currA.next;
	        }
	        
	        if(currB.next==null){
	            currB=headA;
	        }else{
	            currB=currB.next;
	        }
	          
	    }
	    return currA.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
