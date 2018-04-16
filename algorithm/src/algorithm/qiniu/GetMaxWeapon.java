package algorithm.qiniu;

import java.util.EventListenerProxy;
import java.util.Scanner;

import org.w3c.dom.css.ElementCSSInlineStyle;

/*
 * 美丽的牛家庄受到了外星人的侵略, 勇敢的妞妞要上战场抵御侵略。

在妞妞上战场前, 村长牛牛给了妞妞N件装备, 妞妞需要选择其中的K件,装备在身上提升自己的战斗力。
每件装备有5种属性增幅值,对于第i件装备它的属性增幅值为(ri1, ri2, ri3, ri4, ri5), 分别代表该装备对不同的属性值增幅。
当妞妞装备多件装备的时候,由于装备之前会互相影响, 对于每种属性值的增幅并不是所有装备该属性值之和, 
而是该种属性值下所有装备中最大的属性值。而妞妞最终增加的战斗力为这5种属性值增幅之和。

妞妞一定要保卫牛家庄, 所以她希望她能提升尽可能多的战斗力, 请你帮帮她计算她最多能增加多少战斗力。

 */
public class GetMaxWeapon {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNextInt()) {
			int n = in.nextInt();
			int k = in.nextInt();

			int[][] arr = new int[n][5];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 5; j++) {
					arr[i][j] = in.nextInt();

				}
			}
			int max = Integer.MIN_VALUE;

			if (k == 1) {
				for (int i = 0; i < n; i++) {
					int total = 0;
					for (int j = 0; j < 5; j++) {
						total = total + arr[i][j];
					}
					if (total > max) {
						max = total;
					}
				}
			} else if (k == 2) {
				for (int i = 0; i < n - 1; i++) {
					int total = 0;
					for (int j = i + 1; j < n; j++) {

						for (int m = 0; m < 5; m++) {
							total += Math.max(arr[i][m], arr[j][m]);
						}
					}
					if (total > max) {
						max = total;
					}
				}
			}else if(k==3){
				for(int i=0;i<n-2;i++){
					int total=0;
					for(int j=i+1;j<n-1;j++){
						for(int m=j+1;m<n;m++){
							for (int p = 0; p < 5; p++) {
								total += Math.max(arr[m][p], Math.max(arr[i][p], arr[j][p]));
							}
						}
					}
					if (total > max) {
						max = total;
					}
				}
			}else if(k>=5){
				int total=0;
				for(int i=0;i<5;i++){
					
					for(int j=0;j<n;j++){
						int temp=Integer.MIN_VALUE;
						temp=arr[i][j]>temp?arr[i][j]:temp;
						total+=temp;
						
					}
				}
				max=total;
			}else{
				
			}
		}
	}
}
