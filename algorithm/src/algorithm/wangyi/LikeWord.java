package algorithm.wangyi;

import java.util.Scanner;

/*
 * 问题描述：
 * 小易喜欢的单词具有以下特性：
   1.单词每个字母都是大写字母
   2.单词没有连续相等的字母
   3.单词没有形如“xyxy”(这里的x，y指的都是字母，并且可以相同)这样的子序列，子序列可能不连续。
         例如：
           小易不喜欢"ABBA"，因为这里有两个连续的'B'
           小易不喜欢"THETXH"，因为这里包含子序列"THTH"
           小易不喜欢"ABACADA"，因为这里包含子序列"AAAA"
          小易喜欢"A","ABA"和"ABCBA"这些单词
          给你一个单词，你要回答小易是否会喜欢这个单词。
 */
public class LikeWord {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	while (in.hasNextLine()) {
		String word=in.nextLine();
		char[]arr=word.toCharArray();
		boolean flag1=false;
		boolean flag2=false;
		
		
		if(isUp(arr)){
			flag1=true;
		}
		
		if(isRepeat(arr)){
			flag2=true;
		}
		
		
		if(flag1&&flag2){
			System.out.println("Likes");
		}else {
			System.out.println("Dislikes");
		}
	}
	in.close();
}


public static boolean isUp(char[]arr){
	int count=0;
	for (int i = 0; i < arr.length; i++) {
		if(Character.isUpperCase(arr[i])){
			count++;
		}
	}
	if(count==arr.length){
		return true;
	}else {
		return false;
	}
}

public static boolean isRepeat(char[]arr){
	boolean flag=true;
	for (int i = 0; i < arr.length-1; i++) {
		if(arr[i]==arr[i+1]){
			flag=false;
			break	;	
	}
}
	return flag;
}


}