package bag;

import java.util.Scanner;

/**
 * 
 * @author HP
 * 01背包问题
 * 有编号分别为a,b,c,d,e的五件物品，
 * 它们的重量分别是2,2,6,5,4，
 * 它们的价值分别是6,3,5,4,6，
 * 每件物品数量只有一个，现在给你个承重为10的背包，
 * 如何让背包里装入的物品具有最大的价值总和？
 *
 */
public class SimpleBag {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    int n=in.nextInt();
    int total=in.nextInt();
    int []weight=new int[n];
    int []value=new int[n];
    for (int i = 0; i < n; i++) {
      weight[i]=in.nextInt();
      value[i]=in.nextInt();
    }
    //dp[i][j]表示使用前i种物品达到重量j所能达到的最大价值,最后求dp[i][n]的最大值
    int[][]dp=new int[n+1][total+1];
    for (int i = 0; i < dp.length; i++) {
      dp[i][0]=0;
    }
    
    for (int i = 0; i < dp[0].length; i++) {
      dp[0][i]=0;
    }
    
    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        if(j>=weight[i-1]){
          dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-weight[i-1]]+value[i-1]);
        }else {
          dp[i][j]=dp[i-1][j];
        }
      }
    }
    
  
    int max=Integer.MIN_VALUE;
    for (int i = 0; i < dp.length; i++) {
      if(max<dp[i][total]){
        max=dp[i][total];
      }
    }
    System.out.println(max);
  }
  in.close();
}
}
