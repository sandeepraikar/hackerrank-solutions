package ctci.solutions;

class Node {
	int data;
	Node next;
}

public class LinkedListDetectCycle {

	boolean hasCycle(Node head) {
		Node slow = head;
		Node fast = head;

		boolean foundCycle = false;

		while (slow != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == null || fast == null) {
				break;
			}

			if (slow == fast) {
				foundCycle = true;
				break;
			}

		}

		return foundCycle;
	}
}