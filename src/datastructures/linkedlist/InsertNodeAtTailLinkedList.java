package datastructures.linkedlist;

public class InsertNodeAtTailLinkedList {
	/*
	 * Insert Node at the end of a linked list head pointer input could be NULL
	 * as well for empty list Node is defined as
	 */
	class Node {
		int data;
		Node next;
	}

	Node Insert(Node head, int data) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		Node curr = head;

		if (head == null) {
			head = temp;
			return head;
		}
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		return head;

	}
}