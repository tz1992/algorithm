package jzOffer.binary;

import java.util.ArrayList;

public class FindLargestPath {
  ArrayList<ArrayList<Integer>>listAll=new ArrayList<>();
  ArrayList<Integer>list=new ArrayList<>();
 public ArrayList<Integer> findPath(TreeNode root){
   findAll(root);
   int max=Integer.MIN_VALUE;
   ArrayList<Integer>flist=null;
   for(ArrayList<Integer> temp:listAll){
     int count=0;
     for(Integer i:temp){
       count+=i;
     }
     if(count>max){
       flist=temp;
     }
   }
   return flist;
 }
 
 public void findAll(TreeNode root){
   if(root==null){
     return ;
   }
   list.add(root.val);
   if(root.left==null&&root.right==null){
     listAll.add(new ArrayList<>(list));
   }
   findAll(root.left);
   findAll(root.right);
   list.remove(list.size()-1);
   
 }
}
