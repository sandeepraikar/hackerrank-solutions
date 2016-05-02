package datastructures.linkedlist;

public class KthElementFromLast {

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
		System.out.println(findkthLastTerm(n,2));
		
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
