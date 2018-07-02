package binary;

public class BinaryTree {

	Node root;

	public BinaryTree() {
		this.root = null;
	}

	public void add(int value) {
		root = addRecursive(root, value);
	}

	private Node addRecursive(Node current, int value) {

		if(current == null) {
			return new Node(value);
		}

		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			return current;
		}

		return current;
	}

	public boolean containsElement(int value) {
		return containsRecursive(root, value);
	}

	private boolean containsRecursive(Node current, int value) {
		if (current == null) {
			return false;
		}

		if (value == current.value) {
			return true;
		}

		if (value < current.value) {
			return containsRecursive(current.left, value);
		} else if (value > current.value) {
			return containsRecursive(current.right, value);
		}

		return false;
	}

	public static BinaryTree createBinaryTree() {
		BinaryTree bt = new BinaryTree();

		bt.add(5);
		bt.add(13);
		bt.add(2);
		bt.add(8);
		bt.add(10);
		bt.add(1);
		return bt;
	}

}
