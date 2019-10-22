package jzOffer.binary;
/*
 * 找到从根节点到叶子节点的路径和为target的所有路径
 * 
 * 
 */
import java.util.ArrayList;

public class FindPath {
  ArrayList<ArrayList<Integer>>list=new ArrayList<>();
  ArrayList<Integer>tlist=new ArrayList<>();
  public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
  if(root==null)
    return list;
     tlist.add(root.val);
     target-=root.val;
     if(target==0&&root.left==null&&root.right==null){
       list.add(new ArrayList<Integer>(tlist));
     }
    FindPath(root.left, target);
    FindPath(root.right,target);
    //深度遍历回退
    tlist.remove(tlist.size()-1);

    return list;
  }
}
