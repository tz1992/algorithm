package algorithm.sort;

import java.util.Arrays;

/*
 * 归并排序
 * 稳定
 * 时间复杂度 O(nlogn)
 * 
 */
public class Merge {
  public static void main(String[] args) {
    int[] nums = {8, 4, 5, 7, 1, 3, 6, 2};
    int []temp=new int[nums.length];
    sort(nums, 0, nums.length-1, temp);
    System.out.println(Arrays.toString(nums));

  }


  public static void sort(int[] nums, int left, int right, int[] temp) {
    if (left < right) {
      int middle = (right + left) / 2;
      sort(nums, left, middle, temp);
      sort(nums, middle + 1, right, temp);
      merge(nums, left, middle, right, temp);
    }
  }

  // left,right,middle是指下标
  public static void merge(int[] nums, int left, int middle, int right, int[] temp) {
    int i = left;
    int j = middle + 1;
    int k = 0;
    while (i <= middle && j <= right) {
      if (nums[i] <= nums[j]) {
        temp[k++] = nums[i++];
      } else {
        temp[k++] = nums[j++];
      }
    }
    // 当后面的使用完毕
    while (i <= middle) {
      temp[k++] = nums[i++];

    }
    // 当前面的已经使用完毕
    while (j <= right) {
      temp[k++] = nums[j++];
    }
    // 将结果拷贝到nums数组中
    k=0;
  while (left<=right) {
    nums[left++]=temp[k++];
  }
  }
}
