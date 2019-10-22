package jzOffer.binary;
/*
 * 判定某序列是不是后序遍历
 */
public class Judge {
  /*
   * 左子树<根<=右子树
   * 采用分治的思想
   */
  public boolean VerifySquenceOfBST(int [] sequence) {
    if(sequence.length==0)
      return false;
    if(sequence.length==1)
      return true;
    return makeDecision(sequence,0,sequence.length-1);
  }

  private boolean makeDecision(int[] sequence, int start, int end) {
    if(start >= end){
      return true;
  }
    int i=start;
    while (sequence[i]<sequence[end]) {
      ++i;
      }
    for(int j=i;j<=end;j++){
      if(sequence[j]<sequence[end])
        return false;
    }
    return makeDecision(sequence, 0, i-1)&&makeDecision(sequence, i, end-1);
  }
  
  
}
