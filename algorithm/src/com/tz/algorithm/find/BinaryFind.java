package com.tz.algorithm.find;

public class BinaryFind {
 //找到返回下标，没有找到返回-1
  public static int binaryFind(int[]arr,int target){
      int low=0;
      int high=arr.length-1;
      while (low<=high) {
        int middle=low+high/2;
        if(target>arr[middle]){
          low=middle+1;
          
        }else if(target<arr[middle]){
          high=middle-1;
          
        }else {
          return middle;
        }
      }
      return -1;
  }
}
