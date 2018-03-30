package algorithm.dp;

import java.util.Scanner;

public class Sing {
	
	/* 问题描述
	 * 小Q和牛博士合唱一首歌曲,这首歌曲由n个音调组成,每个音调由一个正整数表示。
                对于每个音调要么由小Q演唱要么由牛博士演唱,对于一系列音调演唱的难度等于所有相邻音调变化幅度之和, 
                例如一个音调序列是8, 8, 13, 12, 那么它的难度等于|8 - 8| + |13 - 8| + |12 - 13| = 6(其中||表示绝对值)。
                   现在要对把这n个音调分配给小Q或牛博士,让他们演唱的难度之和最小,请你算算最小的难度和是多少。
                 如样例所示: 小Q选择演唱{5, 6}难度为1, 牛博士选择演唱{1, 2, 1}难度为2,难度之和为3,这一个是最小难度和的方案了。
	 */
	
	
	/*
	 * 问题解决：
	 * 使用动态规划的方式
	 * dp[i][j]表示当前演唱到第i个音调，另外一个人唱到第j个音调的最小难度
	 * 此时令i>j，
	 * 当i-j==1的时候,表示换人了 ,不知道上次这个人唱到哪个音调  dp[i][j]=min{dp[k][j]+abs(v[j]-v[k])}
	 * 当i-j>1的时候，表示第i-1个音调到i个音调没有换人  dp[i][j]=dp[i-1][j]+abs(v[i]-v[i-1])
	 */
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=in.nextInt();
	}
	in.close();
	
	int[][]dp=new int[n][n];
	for(int i=0;i<n;i++){
		for(int j=0;j<i;j++){
			if(i-j==1){
				int min=Integer.MAX_VALUE;
				for(int k=0;k<j;k++){
					if(dp[k][j]+Math.abs(arr[i]-arr[k])<min){
						min=dp[k][j]+Math.abs(arr[i]-arr[k]);
						
					}
				}
				dp[i][j]=min;
			}else{
				dp[i][j]=dp[i-1][j]+Math.abs(arr[i]-arr[i-1]);
			}
		}
	}
	int min2=Integer.MAX_VALUE;
	for(int i=0;i<n;i++){
		if(min2<dp[n-1][i]){
			min2=dp[n-1][i];
		}
	}
	System.out.println(min2);
}
}
