package algorithm.meituan;

import java.util.Scanner;

/*
 * 美团/网格走法数目
 * 
 * dp[i][j]表示从左上角(0,0)这个点走到(i,j)这个位置一共有多少种走法
 * 当只有一行，或一列的时候，肯定只有一种走法
 * 
 */
public class ServiceMesh {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
      while (in.hasNextInt()) {
        int x=in.nextInt();
        int y=in.nextInt();
        int[][]dp=new int[x+1][y+1];
        dp[0][0]=0;
        for (int i = 1; i < dp.length; i++) {
          dp[i][0]=1;
        }
        for (int i = 1; i < dp[0].length; i++) {
          dp[0][i]=1;
        }
        
        for (int i = 1; i < dp.length; i++) {
          for (int j = 1; j < dp[0].length; j++) {
            dp[i][j]=dp[i][j-1]+dp[i-1][j];
          }
        }
        
        System.out.println(dp[x][y]);
        
      }
      in.close();
}
}
