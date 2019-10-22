package jzOffer.str;
/*
 * 给出三个字符串:s1、s2、s3，判断s3是否由s1和s2交叉构成。
 */
public class StrGame {
  /*
   * 使用一个二维数组记录是否交错的情况
   * dp[i][j]表示s1的前i位，s2的前j位，是否能构成数组s3的钱i+j位
   */
  
  public boolean isCross(String s1,String s2,String s3){
    char[]c1=s1.toCharArray();
    char[]c2=s2.toCharArray();
    char[]c3=s3.toCharArray();
    if(c1.length+c2.length!=s3.length())
      return false;
    boolean[][]dp=new boolean[c1.length+1][c2.length+1];
    dp[0][0]=true;
    for (int i = 1; i < dp.length; i++) {
      dp[i][0]=dp[i-1][0]&&(c1[i-1]==c3[i-1]);
    }
    for (int i = 1; i < dp[0].length; i++) {
      dp[0][i]=dp[0][i-1]&&(c2[i-1]==c3[i-1]);
    }
    
    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        if(c1[i-1]==c3[i+j-1]){
          dp[i][j]=dp[i-1][j];
        }
        if(c2[i-1]==c3[i+j-1]){
          dp[i][j]=dp[i][j-1];
        }
      }
    }
    return dp[c1.length][c2.length];
  }
}
