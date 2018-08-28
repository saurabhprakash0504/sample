
public class LinkedListExample {

	Nodess root;

	LinkedListExample() {

	}

	public static void main(String[] args) {
		LinkedListExample l = new LinkedListExample();
		l.add(6);
		l.add(2);
		l.add(4);
		l.add(4);
		l.display();
	}

	/*
	 * public void add(int data) { root = add(root, data); }
	 */

	private Nodess add(Nodess node, int data) {
		if (node == null) {
			node = new Nodess(data);
		}
		if (node.data > data) {
			node.left = add(node.left, data);
		} else if (node.data < data) {
			node.right = add(node.right, data);
		}
		return node;
	}

	private Nodess add(int data) {
		Nodess temp=new Nodess(data);
		//LinkedListExample l = new LinkedListExample();
		if (this.root == null) {
			this.root = new Nodess(data);
		}
		if (this.root.data > data) {
			this.root.left = add(this.root.left, data);
		} else if (this.root.data < data) {
			this.root.right = add(this.root.right, data);
		}
		return this.root;
	}

	public void display() {
		LinkedListExample l = new LinkedListExample();
		inorder(l.root);
	}

	private void inorder(Nodess node) {
		if (node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);

	}

	public boolean contains(int data) {
		return contains(root, data);
	}

	private boolean contains(Nodess node, int data) {
		if (node == null) {
			return false;
		}
		if (node.data == data) {
			return true;
		}

		if (node.data > data) {
			return contains(node.left, data);
		} else {
			return contains(node.right, data);
		}
	}
}

class Nodess {
	int data;
	Nodess left, right;

	Nodess(int data) {
		this.data = data;
	}
}
