package datastructures.trees;

public class BinaryTreeInsertion {

	class Node {
		int data;
		Node left;
		Node right;
	}

	public Node Insert(Node root, int value) {
		Node node = root;
		while (node != null) {
			if (value > node.data) {
				if (node.right != null) {
					node = node.right;
				} else {
					Node temp = new Node();
					temp.data = value;
					node.right = temp;
					break;
				}
			}

			if (value <= node.data) {
				if (node.left != null) {
					node = node.left;
				} else {
					Node temp = new Node();
					temp.data = value;
					node.left = temp;
					break;
				}

			}
		}
		if (node == null) {
			node = new Node();
			node.data = value;
			root = node;
		}
		return root;
	}

	public static void main(String[] args) {

	}

}
