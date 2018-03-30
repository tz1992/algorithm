package algorithm.dp;

import java.util.Scanner;

public class BagQuestion {
	/*问题描述：
	 * 背包问题，背包总量v,一个n个物品，每个物品的价值和总量是v[i],w[i]
	 * 使得背包的总量不要超过v,且价值总量最大，每个物品只有一个。
	 * dp[i][k]表示使用前n个物品，使总重量不超过k的最大价值
	 */
	
	
	
	/*
	 * 问题解决：
	 * 
	 */
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int v=in.nextInt();
	int n=in.nextInt();
	int[]weight=new int[n];
	int[]value=new int[n];
	int[][] dp=new int[n][v+1];
	for(int i=0;i<n;i++){
		dp[i][0]=0;
	}
	
	for(int i=0;i<n;i++){
		String[]arr=in.nextLine().split(" ");
		weight[i]=Integer.parseInt(arr[0]);
		value[i]=Integer.parseInt(arr[1]);
	}
		for(int i=1;i<=n;i++){
			for(int j=0;j<v;j++){
				if(j-weight[i]>0){
					dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-weight[i-1]+value[i-1]]);
				}
			}
		}
	
}
}
