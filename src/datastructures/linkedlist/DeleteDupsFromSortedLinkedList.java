package datastructures.linkedlist;

public class DeleteDupsFromSortedLinkedList {

	// Node is defined as
	class Node {
		int data;
		Node next;
	}

	Node RemoveDuplicates(Node head) {
		// This is a "method-only" submission.
		// You only need to complete this method.

		if (head == null) {
			return null;
		}
		Node curr = head;
		while (head.next != null) {
			if (head.data == head.next.data) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}
		}
		return curr;

	}
}