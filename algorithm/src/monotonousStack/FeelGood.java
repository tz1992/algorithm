package monotonousStack;

import java.util.Scanner;
import java.util.Stack;

/*
 *  问题描述：
 *  给出一个数组，表示这段时间的心情，值越大表示心情越好，现在需要在这个时间里去连续的子数组
 *  使得这个子数组的和与这个子数组里面最小的值的乘积最大
 *  思路：使用单调栈
 *  h[i]表示以这个值为最小的值
 *  使用单调栈记录h[i]左边第一个比它小的数的位置，记为左边界，
 *           记录h[i]右边第一个比它小的数记为右边界
 * 
 */
public class FeelGood {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int n=in.nextInt();
    int []arr=new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=in.nextInt();
    }
    int[]R=getRight(arr);
    int[]L=getLeft(arr);
    int max=Integer.MIN_VALUE;
    int index=0;
    for (int i = 0; i < arr.length; i++) {
      int left=L[i];
      int right=R[i];
      
      int num=0;
  
      
      
      for (int j = left; j <right-1; j++) {
        
        num+=arr[j];
      }
      
      int temp=arr[i]*num;
      if(max<temp){
        max=temp;
        index=i;
      }
      
    }
    System.out.println(max);
    System.out.print((L[index]+1)+" ");
    System.out.println(R[index]-1);
    
    
  }
  in.close();
}


public static int[] getRight(int[]arr){
  int []R=new int[arr.length];
  Stack<Pair>stack=new Stack<>();
  int index=arr.length;
  R[index-1]=index+1;
  stack.push(new Pair(index, arr[index-1]));
  index--;
  while (index>=1) {
    int value=arr[index-1];
    while (!stack.isEmpty()&&stack.peek().value>=value) {
      stack.pop();
    }
    if(stack.isEmpty()){
      R[index-1]=arr.length+1;
    }else {
      R[index-1]=stack.peek().index;
    }
    
    stack.push(new Pair(index, value));
    index--;
  }
  return R;
  
}

public static int[] getLeft(int []arr){
  int []L=new int[arr.length];
  Stack<Pair>stack=new Stack<>();
  stack.push(new Pair(0, arr[0]));
  int index=2;
  while (index<=arr.length) {
    int value=arr[index-1];
    while (!stack.isEmpty()&&stack.peek().value>=value) {
      stack.pop();
    }
    if(stack.isEmpty()){
      L[index-1]=0;
    }else {
      L[index-1]=stack.peek().index;
    }
    stack.push(new Pair(index, value));
    index++;
  }
  return L;
}

public static class Pair{
  int index;
  int value;
  public Pair(int index,int value) {
  this.index=index;
  this.value=value;
  }
}
}
