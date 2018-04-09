package algorithm.jingdong;

/*
 * 小东所在公司要发年终奖，而小东恰好获得了最高福利，他要在公司年会上参与一个抽奖游戏，
 * 游戏在一个6*6的棋盘上进行，上面放着36个价值不等的礼物，每个小的棋盘上面放置着一个礼物，
 * 他需要从左上角开始游戏，每次只能向下或者向右移动一步，到达右下角停止，一路上的格子里的礼物小东都能拿到，
 * 请设计一个算法使小东拿到价值最高的礼物。
      给定一个6*6的矩阵board，其中每个元素为对应格子的礼物价值,左上角为[0,0],
      请返回能获得的最大价值，保证每个礼物价值大于100小于1000。
 */
import java.util.*;

public class MostValued {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		in.nextLine();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			String[] strings = in.nextLine().split(" ");
			for (int j = 0; j < n; j++) {
				arr[0][j] = Integer.parseInt(strings[j]);
			}
		}
		in.close();
		System.out.println(getMost(arr));
	}

	public static int getMost(int[][] arr) {
		int [][]dp=new int[arr.length][arr[0].length];
		for(int i=0;i<dp.length;i++){
			for (int j = 0; j < dp.length; j++) {
				int b=arr[i][j];
				if(i==0&&j==0){
					dp[i][j]=b;
				}else if(i==0&&j!=0){
					dp[i][j]=dp[i][j-1]+b;
				}else if(i!=0&&j==0){
					dp[i][j]=dp[i-1][j]+b;
				}else{
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1])+b;
				}
			}
		}
		return dp[dp.length-1][dp.length-1];

	}
}