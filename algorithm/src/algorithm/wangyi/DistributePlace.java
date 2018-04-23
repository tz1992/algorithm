package algorithm.wangyi;

import java.util.Scanner;

/*
 * 问题描述：
 * 牛牛和 15 个朋友来玩打土豪分田地的游戏，
 * 牛牛决定让你来分田地，地主的田地可以看成是一个矩形
 * ，每个位置有一个价值。分割田地的方法是横竖各切三刀，
 * 分成 16 份，作为领导干部，牛牛总是会选择其中总价值最小的一份田地，
 *  作为牛牛最好的朋友，你希望牛牛取得的田地的价值和尽可能大
 *  ，你知道这个值最大可以是多少吗？
 *  
 *  输入描述：
 *  每个输入包含 1 个测试用例。
 *  每个测试用例的第一行包含两个整数 n 和 m（1 <= n, m <= 75），
 *  表示田地的大小，接下来的 n 行，每行包含 m 个 0-9 之间的数字，表示每块位置的价值。
 */
public class DistributePlace {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int m=in.nextInt();
	//maxtrix[i][j]表示第i行的第j个数
	int[][]matrix=new int[n+1][m+1];
	for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			matrix[i][j]=in.nextInt();
		}
	}
	//sum[i][j]表示从第一行一列到i行j列这个矩阵的和
	
	int [][]sum=new int[n+1][m+1];
	for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			sum[i][j]=sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1]+matrix[i][j];
		}
	}
	
	int right =sum[n][m];int left=0;
	int res=0;
	//使用二分查找找到最大的适合的k值
	while(right>=left){
		int mid=(right+left)/2;
		//如果是对的，表明这个数可以更大
		if(isOk(n, m, sum, mid)){
			left=mid+1;
			res=mid;
		}else{
			right=mid-1;
		}
	}
	System.out.println(res);
}
//记录从第x行y列到第i行j列的和
public static int getSum(int x,int y,int i,int j,int[][]sum){
	
	
	return sum[i][j]-sum[x-1][j]-sum[i][y-1]+sum[x-1][y-1];
	
}
//先横切三刀，然后纵向
public static boolean isOk(int n,int m,int[][]sum,int k){
	
	for(int x1=2;x1<n-2;x1++){
		for(int x2=x1+1;x2<n-1;x2++){
			for(int x3=x2+2;x3<n;x3++){
				int res=1;
				int count=0;
				for(int y=2;y<n;y++){
					if(k<=getSum(1, res, x1, y, sum)&&k<=getSum(x1, res, x2, y, sum)&&k<=getSum(x2, res, x3, y, sum)
							&&k<=getSum(x3, res, n, y, sum)
							){
						count++;
						res=y;
					}
				}
				if(count>=4){
					return true;
				}
			}
		}
	}
	return false;
	
	
	
}
}
