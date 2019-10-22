package saima;

import java.util.Scanner;

/**
 * 基本算法/马路上的路灯
 * 
 * @author HP
 *
 */
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      int len = in.nextInt();
      int n = in.nextInt();
      Node[]arr=new Node[n];
      for (int i = 0; i < arr.length; i++) {
        int first=in.nextInt();
        int last=in.nextInt();
        arr[i]=new Node(first, last);
      }
      int []path=new int[len+1];
      for (int i = 0; i < path.length; i++) {
        path[i]=0;
      }
      
      for (int i = 0; i < arr.length; i++) {
        Node node=arr[i];
        int first=node.first;
        int last=node.last;
        for (int j = first; j <= last; j++) {
          path[j]=1;
        }
      }
      int count=0;
      for (int i = 0; i < path.length; i++) {
        if(path[i]==0){
          count++;
        }
      }
      System.out.println(count);

    }
    in.close();
  }

  static class Node {
    int first;
    int last;
    public Node(int first, int last) {
      super();
      this.first = first;
      this.last = last;
    }
  }
}
