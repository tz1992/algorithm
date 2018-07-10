package algorithm.toutiao;

import java.util.Scanner;

/*
 * 头条/字典序
 * 思路：按照字典序进行比较
 * 然后使用冒泡排序进行排序
 */
public class Main1 {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int n=in.nextInt();
    int m=in.nextInt();
    String []arr=new String[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=(i+1)+"";
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length-i-1; j++) {
        if(compare(arr[j], arr[j+1])){
          String temp=arr[j+1];
          arr[j+1]=arr[j];
          arr[j]=temp;
        }
      }
    }
     System.out.println(arr[m-1]);
  
  }
  in.close();
}

public static boolean compare(String s1,String s2){
  char[]arr1=s1.toCharArray();
  char[]arr2=s2.toCharArray();
  int len=Math.min(arr1.length, arr2.length);
  boolean flag=false;
  int i=0;
  for (; i < len; i++) {
    if(arr1[i]>arr2[i]){
      flag=true;
      break;
    }else if (arr1[i]<arr2[i]) {
      flag=false;
      break;
    }else {
      continue;
    }
  }
 
  if(i==len){
    if(arr1.length>arr2.length){
      flag=true;
    }
    else {
      flag=false;
    }
  }
  return flag;
}
}
