package algorithm.sort;

import org.junit.Test;

public class SelectedSort {
/*
 * 第一轮遍历数组，选出最小的数和第一个数交换
 * 第二轮遍历下标从1到length-1的数组，选出最小的数和下标为1的数交换
 * 。。。
 */
@Test
	public void selectedSort(){
		int []arr={2,5,4,9,6,1};
		System.out.println("排序前的数组为");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for (int i = 0; i < arr.length; i++) {
			int k=i;
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[j]>=arr[k]){
					k=j;
				}
				
			}
			int temp;
			temp=arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
			
		
		}
		System.out.println("排序后的数组为");
		
	for (int j = 0; j < arr.length; j++) {
		System.out.print(arr[j]+" ");
	}
	
	}
	
}
