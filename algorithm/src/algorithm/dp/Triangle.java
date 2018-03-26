package algorithm.dp;

import java.util.Scanner;

public class Triangle {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[][]=new int[n][];
	for (int i = 0; i < arr.length; ++i) {
		for(int j=0;j<=i;++j){
			arr[i][j]=in.nextInt();
		}
	}
	int dp[][]=new int[n][];
	
	for(int i=0;i<n;i++){
		dp[n-1][i]=arr[n-1][i];
	}
	
	for(int i=n-1;i>=0;i--){
		for(int j=0;j<i+1;j++){
			dp[i][j]=arr[i][j]+Math.max(dp[i+1][j+1], dp[i+1][j]);
		}
	}
	
	
	System.out.println(dp[0][0]);
}
}
