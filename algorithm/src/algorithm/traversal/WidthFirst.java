package algorithm.traversal;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 树的广度优先遍历
 * 
 */
public class WidthFirst {

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

	public static void widthFirst(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode temp = root;
		queue.offer(temp);
		while (queue.size() != 0) {
			temp = queue.poll();
			if (temp.firstNode != null) {

				queue.offer(temp.firstNode);
			}
			if (temp.secNode != null) {

				queue.offer(temp.secNode);
			}
			if (temp.thirdNode != null) {

				queue.offer(temp.thirdNode);
			}
       
			
			System.out.println(temp.name);
		}
	}
public static void main(String[] args) {
	TreeNode rNode=initTree();
	widthFirst(rNode);
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
