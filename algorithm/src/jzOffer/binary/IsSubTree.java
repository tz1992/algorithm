package jzOffer.binary;
/*
 * 判断root2是不是root1的子结构
 */
public class IsSubTree {
  public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    boolean flag=false;
    if(root1!=null&&root2!=null){
      if(root1.val==root2.val)
      flag=doesTree1HasTree2(root1, root2);
      if(!flag)
        flag=HasSubtree(root1.left, root2);
      if(!flag)
        flag=HasSubtree(root1.right, root2);
      
    }
    return flag;
  }
  //从当前节点比较，查看root1是否包含root2
  public boolean doesTree1HasTree2(TreeNode root1,TreeNode root2){
    if(root2==null)
      return true;
    if(root1==null)
      return false;
    if(root1.val!=root2.val)
      return false;
    return doesTree1HasTree2(root1.left, root2.left)
        &&doesTree1HasTree2(root1.right, root2.right);
    
  }
}
