package datastructures.linkedlist;


public class MyLinkedList {

	private static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
		
	}
	Node head;
	Node tail;
	
	public MyLinkedList() {
	}

	public MyLinkedList(int data) {
		Node temp = new Node(data); 
		this.head = temp;
		this.tail = temp;
	}

	private void addNewNode(int i) {
		//If there are no elements in the linked list
		if(this.head==null){
			MyLinkedList newNode =(new MyLinkedList(i));
			this.head= newNode.head;
			this.tail= newNode.tail;
			return;
		}
		//if there are already few elements in the list, then the approach would be add this new node at the end of the list
		Node item = new Node(i);
		Node current = this.head, prev=null;
		
		while(current!=null){
			prev=current;
			current=current.next;
		}
		prev.next=item;
		this.tail=item;
		
	}
	
	private static void printList(MyLinkedList list) {
		if(list==null){
			System.out.println("List is empty!!");
		}else{
			Node ptr = list.head;
			while(ptr!=null){
				System.out.println(ptr.data);
				ptr=ptr.next;
			}
		}		
	}
	
	private void introduceLoop(int length) {
		if(this.head==null){
			System.out.println("List is empty!!");
			return;
		}
		Node p1=this.head,p2=this.head;
		int count=0;
		while(count<length){
			if(p2==null){
				System.out.println("Incorrect length of the loop given");
				break;
			}
			p2=p2.next;
			count++;
		}
		
		Node prevP2=null;
		while(p2!=null){
			prevP2=p2;
			p2=p2.next;
			p1=p1.next;
		}
		prevP2.next=p1;
		System.out.println("Loop of length " + length + " added starting at node " + p1.data);
	}
	private static int detectLoop(MyLinkedList list) {

		Node ptr=list.head;
		Node slow=ptr;
		Node fast=ptr;
		
		while(slow!=null && slow.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==null || fast==null){
				return 0;
			}
			if(slow==fast){
				return 1;
			}
		}
		return 0;
	}

	private void findDataAtLoopStart() {
		 if (this.head == null)
	        {
	            System.out.println("Empty list");
	            return;
	        }
	        Node p1 = this.head;
	        Node p2 = p1;
	 
	        // Step-1: Loop detection
	        do
	        {
	            if (p1 == null || p2 == null || p2.next == null)
	            {
	                System.out.println("No loop found");
	                return;
	            }
	            p1 = p1.next;
	            p2 = p2.next.next;
	        } while (p1 != p2);
	 
	        // Step-2: Detecting the start of the loop
	        p1 = this.head;
	        while (p1 != p2)
	        {
	            p1 = p1.next;
	            p2 = p2.next;
	        }
	         
	        System.out.println(p1.data);
	}
	
	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		
		list.addNewNode(20);
		list.addNewNode(40);
		list.addNewNode(60);
		list.addNewNode(70);
		list.addNewNode(80);
		list.addNewNode(90);
		
		list.introduceLoop(3); // created a loop [http://www.ideserve.co.in/learn/detect-a-loop-in-a-linked-list]
		//printList(list); // Dont print this if you introduce loop!!!
		
		int res= detectLoop(list);
		System.out.println(res==1?"Loop detected":"No Loops");
		list.findDataAtLoopStart();
	}


}
