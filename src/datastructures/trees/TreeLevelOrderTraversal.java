package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrderTraversal {

	class Node {
		int data;
		Node left;
		Node right;
	}

	void LevelOrder(Node root) {
		Queue<Node> queue = new LinkedList<>();
		if (root != null) {
			queue.add(root);
			while (!queue.isEmpty()) {
				Node curr = queue.poll();
				System.out.print(curr.data + " ");
				if (curr.left != null) {
					queue.add(curr.left);
				}
				if (curr.right != null) {
					queue.add(curr.right);
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
