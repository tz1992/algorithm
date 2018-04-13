package algorithm.qiniu;

import java.util.Scanner;

/*
 * 问题描述：
 * 妞妞得到一个(1~n)的排列p1, p2, p3,...,pn, 听村里的老人牛牛说如果让这个排列变为:
对于所有的1 <= i <= n, 都满足pi ≠ i, 就可以获得Google Girl Hackathon的入场券。

妞妞仅允许的操作是: 交换排列中两个相邻的元素, 并且妞妞允许做这个操作任意次。

但是Google Girl Hackathon就快要开始了, 妞妞希望做最少的操作就使排列满足要求, 妞妞希望你能帮助她。
 */
public class DifficultSort {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int []arr=new int[n+1];
	for(int i=1;i<=n;i++){
		arr[i]=in.nextInt();
	}
	in.close();
	int count =0;
	for(int i=1;i<arr.length-1;i++){
		if(arr[i]==i){
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			count++;
		}
	}
	if(arr[n]==n){
		count++;
	}
	System.out.println(count);
}
}
