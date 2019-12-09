package com.tz.algorithm.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 获取树的高度，其实也是获得根节点到叶子节点的最长路径
 */
public class TreeHigh {
  //递归
public int getHigh(TreeNode root){
  if(root==null) 
    return 0;
  if(root.left==null&&root.right==null)
    return 1;
  
  return Math.max(getHigh(root.left), getHigh(root.right))+1;
}

//非递归

public int maxDepth(TreeNode root){
  if(root==null) 
    return 0;
  if(root.left==null&&root.right==null)
    return 1;
  
  Queue<TreeNode>queue=new LinkedList<>();
  queue.add(root);
  int depth=0;
  while (!queue.isEmpty()) {
    int size=queue.size();
    for(int i=0;i<size;i++){
      TreeNode temp=queue.poll();
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
