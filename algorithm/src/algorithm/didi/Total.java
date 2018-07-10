package algorithm.didi;
/*
 * 思路 ：动态规划
 * dp[i][j]表示前i种数字能够凑出j的方案数
 * 所要求的即是dp[n][m];
 * dp[i][j]:为使用第i个数字时能凑出j的方案数+不使用第i个数时能够凑出的方案数
 * dp[i][j]=dp[i-1][j-arr[i]+dp[i-1][j]
 */
import java.util.Scanner;

public class Total {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int n=in.nextInt();
    int num=in.nextInt();
    int []arr=new int[n+1];
    arr[0]=0;
    for (int i = 1; i < arr.length; i++) {
      arr[i]=in.nextInt();
    }
    long dp[][]=new long[n+1][num+1];
    for (int i = 0; i < dp.length; i++) {
      dp[i][0]=1;
    }
    
    for (int i = 1; i < dp[0].length; i++) {
      dp[0][i]=0;
    }
    
    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        if(j>=arr[i]){
          dp[i][j]=dp[i-1][j-arr[i]]+dp[i-1][j];
        }else {
          dp[i][j]=dp[i-1][j];
        }
      }
      
    }
    System.out.println(dp[n][num]);
  }
  in.close();
}
}
