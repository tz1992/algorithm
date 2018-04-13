package algorithm.mogujie;
/*
 * 给定一个递增序列，a1 <a2 <...<an 。定义这个序列的最大间隔为d=max{ai+1 - ai }(1≤i<n),
 * 现在要从a2 ,a3 ..an-1 中删除一个元素。问剩余序列的最大间隔最小是多少？
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxdisNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			
			int n = in.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = in.nextInt();
			}
			List<Integer> list = new ArrayList<>();
			for (int i = 1; i < n - 1; i++) {
				int max = Integer.MIN_VALUE;
				for (int j = 1; j < n; j++) {

					if (j == i) {
						int dis = arr[j + 1] - arr[j-1];
						if (dis >= max) {
							max = dis;
						}
					}else{
						int dis = arr[j ] - arr[j-1];
						if (dis >= max) {
							max = dis;
						}
					}
				}
				list.add(max);
			}
			int min=Integer.MAX_VALUE;
			for(Integer i:list){
				min=i<min?i:min;
			}
			System.out.println(min);
		}
		in.close();
	}
	
}
