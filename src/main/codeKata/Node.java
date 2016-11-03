package main.codeKata;

public class Node {

	private Node p;
	private Node left;
	private Node right;
	private Integer key;

	Node(Node p, Integer key) {
		this.p = p;
		this.key = key;
	}

	public Node getP() {
		return p;
	}

	public void setP(Node p) {
		this.p = p;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

}
