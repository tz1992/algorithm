package algorithm.qiniu;
/*
 * 妞妞听说Nowcoder Girl女生编程挑战赛要开始了, 但是她没有足够的勇气报名参加,
 *  牛牛为了帮助妞妞,给她准备一台勇气获得机。初始的时候妞妞的勇气值是0, 勇气获得机有两个按钮:
1、N按钮: 如果当期拥有的勇气值为x, 按下之后勇气值将变为2*x+1，
2、G按钮: 如果当前拥有的勇气值为x, 按下之后勇气值将变为2*x+2，
勇气值过高也会膨胀,所以妞妞需要将自己的勇气值恰好变为n, 请你帮助她设计一个勇气获得机的按键方案使妞妞的勇气值恰好变为n。
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Encourage {
public static void main(String[] args) {
	Scanner in  =new Scanner(System.in);
	while (in.hasNextInt()) {
		int n=in.nextInt();
		List<String>list=new ArrayList<>();
	
		while(n>0){
			if(n%2==0){
				n=(n-2)/2;
				list.add("G");
			}else{
				list.add("N");
				n=(n-1)/2;
			}
		}
		
		for(int i=list.size()-1;i>=0;i--){
			System.out.print(list.get(i));
		}
		
	}
}
}
