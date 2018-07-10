package algorithm.jingdong;

import java.util.Scanner;
import java.util.Stack;

/* 
 * 京东/保卫方案
 * 思路：当两端的峰值比中间的峰值都要高的时候，这样的情况下才是符合情况的。
 * 使用单调栈
 * 首先遍历整个数组，构建单调栈
 */

public class Protect {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=in.nextInt();
		
	}
	int maxIndex=0;
	int max=Integer.MIN_VALUE;
	for (int i = 0; i < arr.length; i++) {
      if(max<arr[i]){
        maxIndex=i;
        max=arr[i];
      }
    }
	Stack<Pair> stack=new Stack<>();
	stack.push(new Pair(max));
	int index=getNext(maxIndex, arr.length);
	long res=0;
	//遍历整个数组
	while (index!=maxIndex) {
      int value=arr[index];
      while (!stack.isEmpty()&&value>stack.peek().value) {
        int times=stack.pop().times;
   

    /* 出栈的栈顶元素之间构成可观察岗哨对数C(times)2 = n*(n-1)/2，
             当times==1时，构成的可观察岗哨对数为0
              出栈的栈顶元素与它下面的元素以及使它出栈的元素所构成的可观察岗哨对数times * 2
     */
        
        res+=getCount(times)+times*2;
      }
      if(!stack.isEmpty()&&value==stack.peek().value){
        stack.peek().times++;
      }else {
        stack.push(new Pair(value));
      }
      index=getNext(index, arr.length);
    }
	/*
	 * 当遍历完数组之后，查看单调栈是否还有元素，知道单调栈结束为止
	 * 当栈不是只剩最后一个元素的时候 此时对数任然为C(times)2 = n*(n-1)/2+times*2
	 * 当栈的最后一个元素个数>1时
	 * C(times)2 = n*(n-1)/2+times*2
	 * 当 当栈的最后一个元素个数=1时
	 * C(times)2 = n*(n-1)/2+times
	 * 
	 * 
	 */
	while (!stack.isEmpty()) {
      int times=stack.pop().times;
      res+=getCount(times);
      if(!stack.isEmpty()){
        res+=times;
        if(stack.size()>1){
          res+=times;
        }else {
          res += stack.peek().times ==1 ? 0 : times;
        }
      }
      
    }
	System.out.println(res);
	
	in.close();
	
	
}
//获取环型表的下一个值的下标
public static int getNext(int index,int size){
  return index<size-1?index+1:0;
}

//当有多个相等的峰值的山峰时候，这些山峰能够构成的观测对个数
public static long getCount(int times){
  return times==1?0L:times*(times-1)/2L;
  
}



public static class Pair{
  int value;
  int times;
  public Pair(int value){
    this.value=value;
    this.times=1;
  }
}
}
