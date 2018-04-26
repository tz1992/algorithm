package algorithm.wangyi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * 牛牛的作业薄上有一个长度为 n 的排列 A，
 * 这个排列包含了从1到n的n个数，
 * 但是因为一些原因，其中有一些位置（不超过 10 个）看不清了，
 * 但是牛牛记得这个数列顺序对的数量是 k，
 * 顺序对是指满足 i < j 且 A[i] < A[j] 的对数，
 * 请帮助牛牛计算出，符合这个要求的合法排列的数目。
 * 
 * 
 * 思路：得到缺失的数及其位置
 */
public class ArrayReset {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int k=in.nextInt();
	int arr[]=new int[n];
	boolean flag[]=new boolean[n+1];
	
	for(int i=0;i<arr.length;i++){
		arr[i]=in.nextInt();
		if(arr[i]!=0){
			flag[arr[i]]=true;
		}
	}
	in.close();
	//获取缺失的数字
	List<Integer>list=new ArrayList<>();
	for (int i = 1; i <=n; i++) {
		if(!flag[i]){
			list.add(i);
		}
	}


}

//将数字全部重排列
public static void get(ArrayList<Integer> list){
	if(list.size()==0){
		
	}

	
}
}
