package com.ds.st;

public class DemoBst1 {

	// Tree Creation

	public class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {

			this.data = data;
			this.left = this.right = null;
            }

	}

	TreeNode root;

	public DemoBst1() {

		root = null;
	}

	// Binary tree insert operation

	public TreeNode insert(TreeNode root, int dataTobeInserted) {

		if (root == null) {
			root = new TreeNode(dataTobeInserted);
			return root;
		}

		if (root.data > dataTobeInserted) {

			root.left = insert(root.left, dataTobeInserted);
		}
		if (root.data < dataTobeInserted) {
			root.right = insert(root.right, dataTobeInserted);

		}
		return root;

	}

	// Binary Tree Serach operation

	public TreeNode serach(TreeNode root, int dataToBeSearched) {

		if (root == null || root.data == dataToBeSearched) {
			return root;
		}

		if (root.data > dataToBeSearched) {
			return serach(root.left, dataToBeSearched);
		}
		if (root.data < dataToBeSearched) {
			return serach(root.right, dataToBeSearched);
		}
		return root;

	}
	// Inorder Traversal

	// Left -> Root -> Right, alwayas print content in sorted manner.

	public void inOrder(TreeNode root) {

		if (root == null)
			return;

		inOrder(root.left); // left
		System.out.print(root.data + " "); // root
		inOrder(root.right); // right

	}

//preorder => root ->left ->right

	public void preOrder(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.data + " "); // root
		inOrder(root.left); // left
		inOrder(root.right); // right
	}
	
	//postorder => left->right->root
	public void postOrder(TreeNode root) {
		if (root == null)
			return;
		inOrder(root.left); // left
		inOrder(root.right); // right
		System.out.print(root.data + " "); // root
		
	}

	public void insertIntoTree(int dataToBeInserted) {

		root = insert(root, dataToBeInserted);

	}

	public TreeNode serchIntoTree(int dataToBeSearched) {

		return serach(root, dataToBeSearched);

	}

	public void inOrderTraversal() {
		inOrder(root);

	}

	public void preOrderTraversal() {
		inOrder(root);

	}

	public void postOrderTraversal() {
		inOrder(root);

	}



}
