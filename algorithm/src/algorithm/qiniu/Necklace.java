package algorithm.qiniu;

import java.util.Scanner;

/*
 * 问题描述：
 * 妞妞参加了Nowcoder Girl女生编程挑战赛, 但是很遗憾, 她没能得到她最喜欢的黑天鹅水晶项链。
于是妞妞决定自己来制作一条美丽的项链。一条美丽的项链需要满足以下条件:
1、需要使用n种特定的水晶宝珠
2、第i种水晶宝珠的数量不能少于li颗, 也不能多于ri颗
3、一条美丽的项链由m颗宝珠组成
妞妞意识到满足条件的项链种数可能会很多, 所以希望你来帮助她计算一共有多少种制作美丽的项链的方案。

 */
public  class Necklace{
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		Node[]nodes=new Node[n];
		for (int i = 0; i < nodes.length; i++) {
			nodes[i]=new Node(in.nextInt(), in.nextInt());
		}
		long dp[][]=new long[n+1][m+1];
		for(int i=nodes[0].start;i<=nodes[0].end;i++){
			dp[1][i]=1;
		}
		
		for(int i=2;i<=n;i++){
			for(int j=1;j<=m;j++){
				for(int k=nodes[i-1].start;k<=nodes[i-1].end&&k<=j;k++){
					dp[i][j]+=dp[i-1][j-k];
				}
			}
		}
		System.out.println(dp[n][m]);
	}
	
	private static class Node{
		int start,end;

		public Node(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}
		
	}
}