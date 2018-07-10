package algorithm.tree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * 树的广度优先遍历
 * 1.递归的意义不大，就是一层层的向下遍历
 * 2.非递归
 * 
 */
public class WidthFirst {
//初始化树，一个根节点最多有三个子节点
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
    //使用队列来存储树的节点
	public static void noRecursion(TreeNode root) {
		Queue<TreeNode>queue=new LinkedBlockingQueue<>();
		queue.add(root);
		while (!queue.isEmpty()) {
         TreeNode node=queue.poll();
         System.out.print(node.name+" ");
         if(node.firstNode!=null){
           queue.add(node.firstNode);
         }
         if(node.secNode!=null){
           queue.add(node.secNode);
         }
         if(node.thirdNode!=null){
           queue.add(node.thirdNode);
         }
        }
		
	}
public static void main(String[] args) {
	TreeNode rNode=initTree();
	System.out.print("非递归广度优先遍历：");
	noRecursion(rNode);
	
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
