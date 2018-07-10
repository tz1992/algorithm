package algorithm.meituan;
/*
 * dp[i][j]表示使用前i种硬币能够凑成的j元的个数
 * dp[0][0]=1;
 * dp[0][j]=0;
 * dp[i][0]=1;
 * dp[i][j]=当使用第i种硬币的时候能够凑成j元+当不使用第i种硬币凑成的j元
 * dp[i][j]=dp[i][j-arr[i-1]]+dp[i-1][j];(前提是j>=arr[i-1])
 * 否则
 * dp[i][j]=dp[i-1][j]
 */
import java.util.Scanner;

public class Coin {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int n=in.nextInt();
    int[]arr={1,5,10,20,50,100};
    long [][]dp=new long[arr.length+1][n+1];
    
    dp[0][0]=1;
    for (int i = 1; i < dp.length; i++) {
      dp[i][0]=1;
      }
    
    for (int i = 1; i < dp[0].length; i++) {
      dp[0][i]=0;
    }
    
    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        if(j>=arr[i-1]){
          dp[i][j]=dp[i][j-arr[i-1]]+dp[i-1][j];
        }else {
          dp[i][j]=dp[i-1][j];
        }
      }
    }
    
    System.out.println(dp[arr.length][n]);
  }
  in.close();
}
}
