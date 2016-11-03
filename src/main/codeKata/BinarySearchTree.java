package main.codeKata;

public class BinarySearchTree {

	// inorder - left subtree, current node, right subtree
	// preorder - current node, left subtree, right subtree
	// postorder - left subtree, right subtree, current node

	private Node root;
	private int totalNodes = 0;

	public BinarySearchTree(Integer rootValue) {
		root = new Node(null, rootValue);
	}

	public BinarySearchTree(int[] sortedList) {
		// create a binary search tree from a sorted list
	}

	// TODO: do insert tomorrow
	public void insert(Integer k, Node curr) {
		totalNodes++;
		if (k > curr.getKey()) {
			if (curr.getRight() == null) {
				curr.setRight(new Node(curr, k));
			}
		} else if (k < curr.getKey()) {
			if (curr.getLeft() == null) {
				curr.setLeft(new Node(curr, k));
			}
		}

	}

	public String getInOrder(String str, Node curr) {
		if (curr.getKey() == null) {
			return str;
		}
		str += getInOrder(str, curr.getLeft());
		str += curr.getKey() + " ";
		str += getInOrder(str, curr.getRight());
		return str;
	}

	public String getPreOrder(String str, Node curr) {
		if (curr.getKey() == null) {
			return str;
		}
		str += curr.getKey() + " ";
		str += getInOrder(str, curr.getLeft());
		str += getInOrder(str, curr.getRight());
		return str;
	}

	public String getPostOrder(String str, Node curr) {
		if (curr.getKey() == null) {
			return str;
		}
		str += getInOrder(str, curr.getLeft());
		str += getInOrder(str, curr.getRight());
		str += curr.getKey() + " ";
		return str;
	}

	public Node Search(Node curr, Integer key) {
		while (curr != null) {
			if (curr.getKey() == key) {
				return curr;
			} else if (curr.getKey() < key) {
				curr = curr.getRight();
			} else {
				curr = curr.getLeft();
			}
		}
		return null;
	}

	public Integer getMaximum(Node curr) {
		while (curr.getLeft() != null) {
			curr = curr.getLeft();
		}
		return curr.getKey();
	}

	public Integer getMinimum(Node curr) {
		while (curr.getRight() != null) {
			curr = curr.getRight();
		}
		return curr.getKey();
	}

	public int getTotalNodes() {
		return totalNodes;
	}

}
