package algorithm.mogujie;
/*有一个投篮游戏。球场有p个篮筐，编号为0，1...，p-1。每个篮筐下有个袋子，每个袋子最多装一个篮球
 * 有n个篮球，每个球编号xi 。规则是将数字为xi 的篮球投到xi 除p的余数为编号的袋里
 * 若袋里已有篮球则球弹出游戏结束输出i，否则重复至所有球都投完。输出-1。问游戏最终的输出是什么？
 * 
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ShootBasket {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	while(in.hasNextInt()){
		int p=in.nextInt();
		int n=in.nextInt();
		if(n==0){
			System.out.println(-1);
		}else{
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=in.nextInt();
			}
			Set<Integer>set=new HashSet<>();
			int i=0;
			for ( ; i < arr.length; i++) {
				int temp=arr[i]%p;
				if(set.contains(temp)){
					break;
				}else{
					set.add(temp);
				}
				
			}
			if(i==n-1||i==n){
				System.out.println(-1);
			}else{
				System.out.println(i+1);
			}
		}
		
	}
	in.close();
}
}
