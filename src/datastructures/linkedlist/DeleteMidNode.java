package datastructures.linkedlist;
import java.awt.DisplayMode;


public class DeleteMidNode {

	public static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
			this.next = null;
		}

		public void add(int data) {
			Node temp = new Node(data);
			Node head = this;
			while (head.next != null) {
				head = head.next;
			}
			head.next = temp;
		}

		public void print() {
			Node head = this;
			while (head != null) {
				System.out.print(head.data+ "-");
				head = head.next;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Node n = new Node(10);		
		n.add(12);
		n.add(15);
		n.add(20);
		n.add(25);
		n.add(30);
		n.print();
		
		getMiddleElement(n);
		
	}

	private static void getMiddleElement(Node n) {
		int count =0;
		Node prev =null;
		Node curr = n; 
		while(n!=null){
			n=n.next;
			count++;
		}
		int mid = count/2;
		System.out.println(mid);
		
		
		while(mid>1){
			prev=curr;
			curr=curr.next;						
			mid--;
		}
		System.out.println("prev data: "+prev.data);
		System.out.println("curr data: "+curr.data);
		
		prev.next=curr.next;
		prev.print();
	}

	private static int findkthLastTerm(Node n, int k) {
		Node ptr1 = n;
		Node ptr2 = n;
		
		
		while(k!=0){
			ptr2=ptr2.next;
			k--;
		}
		
		while(ptr2!=null){
			ptr1=ptr1.next;
			ptr2=ptr2.next;
		}
		
		return ptr1.data;
		
	}

}
