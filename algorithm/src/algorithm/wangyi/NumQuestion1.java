package algorithm.wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumQuestion1 {
/*
 * 问题描述：
 * 输入一组数组，使得arr[i]*arr[i+1]能够被四整除
 * 
 * 问题解决 ：
 * 计算出数组中的数能够被4,2和奇数的个数 
 * 当被2整除的个数不为0，此时只要是4的倍数的个数大于等于奇数的个数   满足条件
 * 但只是2的倍数，不是4的倍数的个数为0  此时只要 mod_4>=odd-1，时满足条件，
 * 
 * 
 */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		List<Integer>list =new ArrayList<Integer>();
		while (in.hasNext()){
			list.add(in.nextInt());
		}
		in.close();
		int mod_4=0;
		int mod_2=0;
		int odd=0;
		for(Integer i:list){
			if(i%4==0){
				mod_4++;
			}else if(i%2==0){
				mod_2++;
			}else{
				odd++;
			}
		}
		if(mod_2>0){
			if(mod_4>=odd){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
			
		}else{
			if(mod_4>=odd-1){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}
}
