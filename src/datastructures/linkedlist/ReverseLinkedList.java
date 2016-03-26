package datastructures.linkedlist;

public class ReverseLinkedList {

	/*
	 * Insert Node at the end of a linked list head pointer input could be NULL
	 * as well for empty list Node is defined as
	 */
	class Node {
		int data;
		Node next;
	}

	// This is a "method-only" submission.
	// You only need to complete this method.

	void ReversePrint(Node head) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		Node current = head;
		Node prev = null;
		Node next;
		if (head != null) {
			while (current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			head = prev;
			while (head != null) {
				System.out.println(head.data);
				head = head.next;
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
