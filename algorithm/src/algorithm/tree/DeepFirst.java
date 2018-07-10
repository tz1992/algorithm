package algorithm.tree;
/*
 * 树的深度优先遍历
 * 1.递归
 * 2.非递归
 */
import java.util.Stack;

public class DeepFirst {
	public static void main(String[] args) {
		TreeNode treeNode=initTree();
		System.out.print("非递归遍历：");
		noRecursion(treeNode);
		System.out.println();
		System.out.print("递归遍历：   ");
		recursion(treeNode);
	}
	//递归，一层一层向下访问，每一层都完成同样的事情
	private static void recursion(TreeNode treeNode) {
    if(treeNode!=null){
      System.out.print(treeNode.name+" ");
      recursion(treeNode.firstNode);
      recursion(treeNode.secNode);
      recursion(treeNode.thirdNode);
    }
    
  }

  //非递归的方式，将还没有访问的节点放入栈中
	public static void noRecursion(TreeNode root){
		Stack<TreeNode>stack=new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode node=stack.pop();
			System.out.print(node.name+" ");
			if(node.thirdNode!=null){
			 stack.push(node.thirdNode);
			}
			
			  if(node.secNode!=null){
			    stack.push(node.secNode);
			  }
			  
			  if(node.firstNode!=null){
                stack.push(node.firstNode);
              }
		}
	}
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
