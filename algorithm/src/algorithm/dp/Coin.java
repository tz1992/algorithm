package algorithm.dp;

import java.util.Scanner;
/*
 * 求出一个数的最少的硬币组合
 * dp[i]=min{dp[i-coins[j]+1} 对于不同的金币额度
 */
public class Coin {
public static void main(String[] args) {
	int []coins={1,2,5,10,20,50,100};
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int []dp=new int[n+1];
	dp[0]=0;
	for(int i=1;i<n+1;i++){
		int min=n;
		for(int j=0;j<coins.length;j++){
			int a=i-coins[j];
			if(a>=0){
		  int b=dp[a]+1;
		   if(b<min){
			   min=b;
		   }
			}
			dp[i]=min;
		}
		
	}
	System.out.println(dp[n]);
}
}