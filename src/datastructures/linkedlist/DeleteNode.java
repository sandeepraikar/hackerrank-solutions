package datastructures.linkedlist;

public class DeleteNode {
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

	Node Delete(Node head, int position) {
		// Complete this method
		if (head == null) {
			return null;
		}
		Node curr = head;
		int count = 0;

		if (position == 0) {
			return head.next;
		}
		while (head.next != null) {
			count++;
			if (count == position) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}
		}
		return curr;
	}

}