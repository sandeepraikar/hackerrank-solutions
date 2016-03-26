package datastructures.trees;

public class TreeHeight {

	class Node {
		int data;
		Node left;
		Node right;
	}

	int height(Node root) {
		if (root == null) {
			return 0;
		} else {
			return Math.max(height(root.left) + 1, height(root.right) + 1);
		}
	}

	public static void main(String[] args) {

	}

}
