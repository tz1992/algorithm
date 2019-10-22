package jzOffer.binary;

public class Convert {
  public TreeNode Convert(TreeNode pRootOfTree) {
    if(pRootOfTree==null){
      return null;
    }
    if(pRootOfTree.left==null&&pRootOfTree.right==null){
      return pRootOfTree;
    }
    TreeNode left=Convert(pRootOfTree.left);
    //定位左子树的最后一个节点
    TreeNode p=left;
    while(p.right!=null&&p!=null){
      p=p.right;
    }
    if(left!=null){
      p.right=pRootOfTree;
      pRootOfTree.left=p;
    }
    TreeNode right=Convert(pRootOfTree.right);
    if(right!=null){
      pRootOfTree.right=right;
      right.left=pRootOfTree;
    }
    return left==null?pRootOfTree:left;
  }
}
