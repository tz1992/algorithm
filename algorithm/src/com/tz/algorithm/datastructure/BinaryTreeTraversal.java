package com.tz.algorithm.datastructure;

import java.util.Stack;

public class BinaryTreeTraversal {

	// 初始化树
	public TreeNode initTree() {
		TreeNode G = new TreeNode("G", null, null);
		TreeNode H = new TreeNode("H", null, null);
		TreeNode D = new TreeNode("D", G, H);
		TreeNode B = new TreeNode("B", D, null);
		TreeNode I = new TreeNode("I", null, null);
		TreeNode E = new TreeNode("E", null, I);
		TreeNode F = new TreeNode("F", null, null);
		TreeNode C = new TreeNode("C", E, F);
		TreeNode A = new TreeNode("A", B, C);
		return A;
	}

	// 先序递归遍历
	public void preOrderRec(TreeNode root) {
		if (root != null) {
			System.out.print(root.data);
			preOrderRec(root.lNode);
			preOrderRec(root.rNode);
		}

	}

	// 中序递归遍历
	public void inOrderRec(TreeNode root) {
		if (root != null) {
			inOrderRec(root.lNode);
			System.out.print(root.data);
			inOrderRec(root.rNode);
		}
	}

	// 后序递归遍历
	public void postOrderRec(TreeNode root) {
		if (root != null) {
			postOrderRec(root.lNode);
			postOrderRec(root.rNode);
			System.out.print(root.data);
		}
	}

	// 非递归前序遍历
	public void preOrderStack(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		if (root != null) {
			stack.push(root);
			while (!stack.isEmpty()) {
				TreeNode p = stack.pop();
				System.out.print(p.data);
				if (p.rNode != null) {
					stack.push(p.rNode);
				}

				if (p.lNode != null) {
					stack.push(p.lNode);
				}
			}
		}
	}

	// 非递归中序遍历
	public void inOrderStack(TreeNode root) {
          if(root==null) return;
        Stack<TreeNode>stack=new Stack<>();
        while(root!=null||!stack.isEmpty()){
        	while(root!=null){
        		stack.push(root);
        		root=root.lNode;
        	}
        	root=stack.pop();
        	System.out.print(root.data);
        	root=root.rNode;
        }
        	  
          
	}

	// 非递归后序遍历
	public void postOrderStack(TreeNode root) {

	}

	public static void main(String[] args) {
		BinaryTreeTraversal b=new BinaryTreeTraversal();
	      TreeNode root=b.initTree();
	      System.out.println("递归前序遍历");
	      b.preOrderRec(root);
	      System.out.println("");
	      System.out.println("递归中序遍历");
	      b.inOrderRec(root);
	      System.out.println("");
	      System.out.println("递归后序遍历");
	      b.postOrderRec(root);
	      System.out.println("");
	      System.out.println("非递归前序遍历");
	      b.preOrderStack(root);
	      System.out.println("");
	      System.out.println("非递归中序遍历");
	      b.inOrderStack(root);
	}
	
	
	static class TreeNode {
		String data;
		TreeNode lNode;
		TreeNode rNode;

		public TreeNode(String data, TreeNode lNode, TreeNode rNode) {

			this.data = data;
			this.lNode = lNode;
			this.rNode = rNode;
		}

	}
}
