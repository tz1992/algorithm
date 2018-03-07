package algorithm.sort;

public class QuickSort {
/*
 * 快速排序有两个指针，最开始一个指向数组的第一个数，另外一个指针指向指向数组的最后的一个数，初始参照值为第一个数
 * i=0 j=length-1 k=arr[0]
 * 指针j从最后一个数向前移，直到找到第一个比arr[0]小的数，把此时将arr[j],和arr[i]互换位置
 * 指针i从第一个数，向后移，直到找到比k大的数，此时把arr[j],和arr[i]互换位置
 * 重复上述的步骤，直到j==i,此时标志着一趟快速排序结束。
 */
	
	public void quick(){
		int []arr={3,5,1,100,88,103,66};
		int high=arr.length-1;
		int low=0;
		int h=high;
		int l=low;
		int k=arr[low];
		while(h>l&&arr[h]>k){
			h--;
		}
		
	}
}
