package datastructures.linkedlist;

class DetectCycle {
	/*
	 * Detect cycle in the list head pointer input could be NULL as well for
	 * empty list Node is defined as
	 */
	class Node {
		int data;
		Node next;
	}

	int HasCycle(Node head) {

		if (head == null) {
			return 0;
		}

		Node slow = head;
		Node fast = head;

		while (slow != null && slow.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == null || fast == null) {
				return 0;
			}
			if (slow == fast) {
				return 1;
			}
		}
		return 0;

	}
}