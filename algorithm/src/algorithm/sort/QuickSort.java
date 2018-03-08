package algorithm.sort;

import org.junit.Test;

public class QuickSort {
	/*
	 * 快速排序有两个指针，最开始一个指向数组的第一个数，另外一个指针指向指向数组的最后的一个数，初始参照值为第一个数 i=0 j=length-1
	 * k=arr[0] 指针j从最后一个数向前移，直到找到第一个比arr[0]小的数，把此时将arr[j],和arr[i]互换位置
	 * 指针i从第一个数，向后移，直到找到比k大的数，此时把arr[j],和arr[i]互换位置
	 * 重复上述的步骤，直到j==i,此时标志着一趟快速排序结束。
	 */

	public void quick(int[] arr, int low, int high) {
		int h = high;
		int l = low;
		int k = arr[low];
		while (l < h) {
			while (h > l && arr[h] >= k) {
				h--;
			}
			if (l < h) {
				int temp = arr[l];
				arr[l] = arr[h];
				arr[h] = temp;
				l++;
			}
			while (h > l && arr[l] <= k) {
				l++;
			}
			if (l < h) {
				int temp = arr[l];
				arr[l] = arr[h];
				arr[h] = temp;
				h--;
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("");
		}

		if (l > low) {
			quick(arr, low, l - 1);
		}
		if (h < high) {
			quick(arr, l + 1, high);
		}

	}
	@Test
	public void test1(){
		int []arr={8,89,3,8,7,98,6};
		quick(arr, 0, arr.length-1);
	}
}
