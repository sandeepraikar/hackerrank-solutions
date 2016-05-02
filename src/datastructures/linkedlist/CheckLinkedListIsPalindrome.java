package datastructures.linkedlist;
import java.util.Stack;


public class CheckLinkedListIsPalindrome {

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
		n.add(20);
		n.add(50);
		n.add(20);
		n.add(10);
		n.print();
		
		checkPalindrom(n);
		
	}

	private static void checkPalindrom(Node n) {
		Stack<Integer> stack = new Stack<>();
		Node slow = n;
		Node fast = n;
		boolean result = true;
		while(fast!=null && fast.next!=null){
			stack.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		
		if(fast!=null){
			slow=slow.next;
		}
		
		while(slow!=null){
			int top = stack.pop().intValue();
			if(top!=slow.data){
				result = false;
				break;				
			}
			slow=slow.next;
		}
		System.out.println(result);
		
	}


}
