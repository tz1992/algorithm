package algorithm.sort;

import java.util.Arrays;

/*
 * 堆排序
 */
public class HeapSort {
public static void main(String[] args) {
  int[]arr={1,9,6,8,3,7,2,5};
  sort(arr);
  System.out.println(Arrays.toString(arr));
}

private static void sort(int[] arr) {
 //构建大根堆,从第一个非叶子节点从下到上，从左到右进行调整
  for (int i = arr.length/2-1; i >=0; i--) {
    adjustHeap(arr,i,arr.length);
  }
  
  for(int i=arr.length-1;i>0;i--){
    swap(arr, 0, i);//将堆顶元素和末尾元素进行交换
    adjustHeap(arr, 0, i);//从新对堆进行调整
    
  }
}

private static void adjustHeap(int[] arr, int i, int length) {
  // TODO Auto-generated method stub
    int temp=arr[i];
    //从当前元素的左节点开始
    for(int k=2*i+1;k<length;k=k*2+1){
      //如果右节点存在，并且值大于左节点
      if(k+1<length&&arr[k]<arr[k+1]){
        k++;
      }
      if(arr[k]>temp){
        arr[i]=arr[k];//如果子节点的值大于父节点的值，将子节点的值赋值
        i=k;//将当前节点向k的位置移动
      }else{
        break;
      }
    }
    arr[i]=temp;//将temp值放到最终位置
}

private static void swap(int[]arr,int i,int j){
  int temp=arr[i];
  arr[i]=arr[j];
  arr[j]=temp;
}
}
