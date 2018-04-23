package algorithm.wangyi;

import java.util.Scanner;

/*
 * 问题描述：
 * 牛牛拿到了一个藏宝图，
 * 顺着藏宝图的指示，牛牛发现了一个藏宝盒，
 * 藏宝盒上有一个机关，机关每次会显示两个字符串 s 和 t，
 * 根据古老的传说，牛牛需要每次都回答 t 是否是 s 的子序列。
 * 注意，子序列不要求在原字符串中是连续的，
 * 例如串 abc，它的子序列就有 {空串, a, b, c, ab, ac, bc, abc} 8 种。
 * 
 * 直接遍历
 */
public class TreasureMap {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	while(in.hasNextLine()){
		String pString=in.nextLine();
		String cString=in.nextLine();
		int len=cString.length();
		char[]arr=pString.toCharArray();
		int i=0;
		int j=0;
		while(i<arr.length&&j<len){
			if(arr[i]==cString.charAt(j)){
				i++;
				j++;
			}else {
				i++;
			}
		}
		if(j==len){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
}
