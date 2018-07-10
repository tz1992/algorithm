package algorithm.xiaomi;

import java.util.Scanner;

/*
 * 树的高度
 * 
 *height[i]表示i号节点的高度
 *counts数组存储子节点个数
 */
public class TreeGame {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    int n=in.nextInt();
    int[]counts=new int[n];
    int[]height=new int[n];
    height[0]=1;
    
    for (int i = 1; i <n; i++) {
      int p=in.nextInt();
      int c=in.nextInt();
     counts[p]+=1;
     if(counts[p]<3){
       height[c]=height[p]+1;
     }
     
    }
    int max=Integer.MIN_VALUE;
    for (int i = 0; i < height.length; i++) {
      if(height[i]>max){
        max=height[i];
      }
    }
    System.out.println(max);
  }
  in.close();
}


}
