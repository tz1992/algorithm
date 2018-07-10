package algorithm.tree;

import java.util.Stack;

/*
 * 二叉树的遍历
 * 前序：1 递归  2 非递归
 * 中序：1 递归  2 非递归
 * 后序：1 递归  2 非递归
 */
public class BinaryTree {
public static void main(String[] args) {
  Node root=initial();
  System.out.print("前序遍历--递归:");
  firstRecursion(root);
  System.out.println();
  System.out.print("前序遍历--非递归:");
  firstNoRecursion(root);
  System.out.println();
  System.out.print("中序遍历--递归:");
  middleRecursion(root);
  System.out.println();
  System.out.print("中序遍历--非递归:");
  middleNoRecursion(root);
  System.out.println();
  System.out.print("后序遍历--递归:");
  lastRecursion(root);
  System.out.println();
  System.out.print("后序遍历--非递归:");
  lastNoRecursion(root);
  System.out.println();
}
/*
 * 根节点在其左右孩子为空，或者其左右孩子已经被访问过的情况下，是可以被直接访问的
 * 如果不是以上两种情况，则右孩子，左孩子依次入栈
 */
private static void lastNoRecursion(Node root) {
  Stack<Node>stack=new Stack<>();
  Node cur;
  Node pre=null;
  stack.push(root);
  while (!stack.isEmpty()) {
    cur=stack.peek();
    if((cur.left==null&&cur.right==null)||(pre!=null&&(cur.left==pre||cur.right==pre))){
      System.out.print(cur.name+" ");
      pre=cur;
      stack.pop();
    }else {
      if(cur.right!=null){
        stack.push(cur.right);
      }
      if(cur.left!=null){
        stack.push(cur.left);
      }
    }
    
  }
  
}
//按照左右根的递归顺序进行访问
private static void lastRecursion(Node root) {
  if(root!=null){
    lastRecursion(root.left);
    lastRecursion(root.right);
    System.out.print(root.name+" ");
  }
  
}
/*
 * 对于任意一节点先访问其左孩子，
 * 其左孩子又可以视为根节点，
 * 直达遇到左孩子为空为止才进行访问，
 * 然后按照同样的规则访问右子树
 */
private static void middleNoRecursion(Node root) {
 Stack<Node> stack=new Stack<>();
 while (!stack.isEmpty()||root!=null) {
   while (root!=null) {
     stack.push(root);
     root=root.left;
   }
   
   if (!stack.isEmpty()) {
     root=stack.peek();
     System.out.print(root.name+" ");
     stack.pop();
     root=root.right;
   }
}



  
}
//按照左根右的顺序进行递归访问
private static void middleRecursion(Node root) {
   if(root!=null){
     middleRecursion(root.left);
     System.out.print(root.name+" ");
     middleRecursion(root.right);
   }
  
}
//类似于非递归版的深度优先遍历
private static void firstNoRecursion(Node root) {
 Stack<Node>stack=new Stack<>();
 stack.push(root);
 while (!stack.isEmpty()) {
   Node temp=stack.pop();
   System.out.print(temp.name+" ");
  if(temp.right!=null){
    stack.push(temp.right);
  }
  if(temp.left!=null){
    stack.push(temp.left);
  }
}
  
}

//类似于递归版的的深度优先遍历
private static void firstRecursion(Node root) {
  if(root!=null){
    System.out.print(root.name+" ");
    firstRecursion(root.left);
    firstRecursion(root.right);
  }
  
}
//初始化一个二叉树
public static Node initial(){
  Node H=new Node("H", null, null);
  Node D=new Node("D", H, null);
  Node F=new Node("F", null, null);
  Node G=new Node("G", null, null);
  Node E=new Node("E", null, null);
  Node B=new Node("B", D, E);
  Node C=new Node("C", F, G);
  Node A=new Node("A", B, C);
  return A;
  
}


public static class Node{
  String name;
  Node left;
  Node right;
  public Node(String name, Node left, Node right) {
    super();
    this.name = name;
    this.left = left;
    this.right = right;
  }
  
  
}
}
