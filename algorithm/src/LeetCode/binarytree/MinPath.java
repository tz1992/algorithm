package LeetCode.binarytree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class MinPath {
  
  //递归
 public int run(TreeNode root){
   if(root==null) 
     return 0;
   if(root.left==null&&root.right==null)
     return 1;
   if(root.left==null||root.right==null)
     return Math.max(run(root.left),run(root.right))+1;
   
   return Math.min(run(root.left), run(root.right))+1;
   
 }
 //非递归，使用BFS广度优先遍历，使用队列
 public int run1(TreeNode root){
   if(root==null) 
     return 0;
   Queue<TreeNode>queue=new LinkedBlockingQueue<>();
   queue.add(root);
   int depth=1;
   while(!queue.isEmpty()){
     int size=queue.size();
     //遍历每一层，查看这一层是否有叶子节点，如果这一层含有叶子节点，当前层的高度即为最短路径
     for(int i=0;i<size;i++){
       TreeNode temp=queue.poll();
       if(temp.left==null&&temp.right==null)
         return depth;
       if(temp.left!=null){
         queue.add(temp.left);
       }
       if(temp.right!=null){
         queue.add(temp.right);
       }
     }
    
     depth++;
   }
   return depth;
 }
 
 
}
