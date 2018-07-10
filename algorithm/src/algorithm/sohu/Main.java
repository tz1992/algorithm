package algorithm.sohu;

import java.util.Scanner;

/*
 * 袋鼠过河
 * 
 * dp[i]表示走到i位置时的最小步数
 * arr[i]表示i位置时的体力
 * 当j-i<=arr[i]时
 * dp[j]=dp[i]+1;
 * 
 */
public class Main {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int n=in.nextInt();
    int []arr=new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=in.nextInt();
    }
    
    int[]dp=new int[n+1];
    for (int i = 0; i <n; i++) {
      int end=Math.min(arr[i]+i, n);
      for (int j = i+1; j <=end; j++) {
        
        if(dp[j]==0){
          dp[j]=dp[i]+1;
        }
      }
      if((dp[i]==0&&arr[i]==0)||dp[n]!=0){
        break;
      }
    }
    if(dp[n]!=0){
      System.out.println(dp[n]);
    }else {
      System.out.println(-1);
    }
  }
  in.close();
}
}
