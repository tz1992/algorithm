package algorithm.maze;
/*
 * 思路：从入口出发，顺着某一方向向前试探
 *      若能走通，则继续向前走
 *      如果不行，沿着原路返回
 *      ，换一个方向继续试探，直至所有可能的
 *      通路都试探完成为止
 * 为了保证在任何为止都能延原路返回
 * 需要使用后进先出的栈保存从入口到当前
 * 位置的路径
 * 
 */
import java.util.Scanner;
import java.util.Stack;

public class SimpleMaze {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while(in.hasNextInt()){
    int n=in.nextInt();
    int m=in.nextInt();
    int [][]arr=new int[n][m];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j]=in.nextInt();
        
      }
    }
    
    
    Stack<Node>stack=new Stack<>();
    arr[0][0]=2;
    Node entry=new Node(0, 0, arr[0][0]);
    
    stack.push(entry);
    while (!stack.isEmpty()) {
     Node  next=stack.peek();
     //向下
     next.x+=1;
     if((next.x>=0&&next.x<n)&&(next.y<m&&next.y>=0)){
       next.value=arr[next.x][next.y];
       if(next.value==0){
         arr[next.x][next.y]=2;
         Node temp=new Node(next.x, next.y, 2);
         stack.push(temp);
         continue;
       }
     }
           
          next.x-=1;
     //向上
     next.x-=1;
     if((next.x>=0&&next.x<n)&&(next.y<m&&next.y>=0)){
       next.value=arr[next.x][next.y];
       if(next.value==0){
         arr[next.x][next.y]=2;
         Node temp=new Node(next.x, next.y, 2);
         stack.push(temp);
         continue;
       }
     }
     next.x+=1;
     //向左
     next.y-=1;
     if((next.x>=0&&next.x<n)&&(next.y<m&&next.y>=0)){
       next.value=arr[next.x][next.y];
       if(next.value==0){
         arr[next.x][next.y]=2;
         Node temp=new Node(next.x, next.y, 2);
         stack.push(temp);
         continue;
       }
     }
     next.y+=1;
     //向右
     next.y+=1;
     if((next.x>=0&&next.x<n)&&(next.y<m&&next.y>=0)){
       next.value=arr[next.x][next.y];
       if(next.value==0){
         arr[next.x][next.y]=2;
         Node temp=new Node(next.x, next.y, 2);
         stack.push(temp);
         continue;
       }
     }
     next.y-=1;
     //判断是否结束
     if(next.x==n-1&&next.y==m-1){
       break;
     }
     //当既不是结束，又不能继续走的时候，表明这个节点没路了，要往回走
     arr[next.x][next.y]=3;
     stack.pop();
    
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
   
    
  }
  in.close();
}



private static class Node{
  int x;
  int y;
  int value;
  public Node(int x, int y, int value) {
    super();
    this.x = x;
    this.y = y;
    this.value = value;
  }
  
}
}
