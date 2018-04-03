package algorithm.tecent;

import java.util.Scanner;

/*
 * 

   在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同， 则称这种编码为格雷码(Gray Code)，
    请编写一个函数，使用递归的方法生成N位的格雷码。
    给定一个整数n，请返回n位的格雷码，顺序为从0开始。
 * 
 * 
 * 思路
 * 0 1
 * 在0,1 之前加0   00 01
 * 在0,1 之前加1   10 11
 * 最后   00 01 11 10
 * 
 */
public class GrayCode {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	in.close();
	String[] finals=getArr(n);
	for (int i = 0; i < finals.length; i++) {
		System.out.println(finals[i]);
	}
}

public static String[]getArr(int n){
	if(n==1){
		return new String[]{"0","1"};
	}
	
	String arr[]=getArr(n-1);
	int m=1<<n;
	String arrs[]=new String[m];
	
	for(int i=0;i<m;i++){
		if(i<m/2){
			arrs[i]="0"+arr[i];
		}else{
			arrs[i]="1"+arr[m-1-i];
		}
		
		
	}
	return arrs;
}
}
