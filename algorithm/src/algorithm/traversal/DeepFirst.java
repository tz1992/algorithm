package algorithm.traversal;

import java.util.Stack;

public class DeepFirst {
	public static void main(String[] args) {
		TreeNode treeNode=initTree();
		deepFirst(treeNode);
	}
	public static void deepFirst(TreeNode root){
		Stack<TreeNode>stack=new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode temp=stack.pop();
			System.out.println(temp.name);
			if(temp.thirdNode!=null){
				stack.push(temp.thirdNode);
			}
			
			if(temp.secNode!=null){
				stack.push(temp.secNode);
			}
			
			if(temp.firstNode!=null){
				stack.push(temp.firstNode);
			}
		}
	}
	
	public static TreeNode initTree() {
		TreeNode I = new TreeNode("I", null, null, null);
		TreeNode D = new TreeNode("D", null, null, null);
		TreeNode F = new TreeNode("F", null, null, null);
		TreeNode G = new TreeNode("G", null, null, null);
		TreeNode H = new TreeNode("H", null, null, null);
		TreeNode E = new TreeNode("E", null, null, I);
		TreeNode B = new TreeNode("B", D, null, E);
		TreeNode C = new TreeNode("C", F, G, H);
		TreeNode A = new TreeNode("A", B, null, C);
		return A;
	}
	static class TreeNode {

		TreeNode firstNode, secNode, thirdNode;
		String name;

		public TreeNode(String name, TreeNode firstNode, TreeNode secNode, TreeNode thirdNode) {
			this.name = name;
			this.firstNode = firstNode;
			this.secNode = secNode;
			this.thirdNode = thirdNode;
		}

	}
}
