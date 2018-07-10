package algorithm.didi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * 问题描述： 某餐馆有n张桌子，每张桌子有一个参数： a 可容纳的最大人数； 有m批客人 每批客人有两个参数:b人数，c预计消费金额。 在不允许拼桌的情况下，请实现一个算法选择其中一部分客人，
 * 使得总预计消费金额最大 输入描述： 输入包括m+2行。 第一行两个整数n(1 <= n <= 50000), m(1 <= m <= 50000)
 * 第二行为n个参数a,即每个桌子可容纳的最大人数, 以空格分隔,范围均在32位int范围内。 接下来m行，每行两个参数b,c。
 * 分别表示第i批客人的人数和预计消费金额,以空格分隔,范围均在32位int范围内。 输出描述： 输出一个整数,表示最大的总预计消费金额
 * 
 */
public class Restaurant {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {
      int n = in.nextInt();
      int m = in.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = in.nextInt();

      }
      // 将桌子大小按照升序排序
      Arrays.sort(arr);
      Comparator<Node> nodeC = new Comparator<Node>() {

        @Override
        public int compare(Node o1, Node o2) {
          return o1.price - o2.price;
        }
      };
      PriorityQueue<Node> queue = new PriorityQueue<>(nodeC);

      for (int i = 0; i < m; i++) {
        int num = in.nextInt();
        int price = in.nextInt();
        //如果人数小于最大桌子能够容纳的人数，加入队列
        if (num <= arr[n - 1]) {
          Node node = new Node(num, price);
          queue.add(node);
        }

      }
      //记录桌子是否被占用
      boolean[]visited=new boolean[n];
      long sum=0;
      int count=0;
      
      while (!queue.isEmpty()) {
        Node node = queue.poll();
        //为客人分配桌子
        for(int i=0;i<n;i++){
          if(node.num<=arr[i]&&!visited[i]){
            sum+=node.price;
            visited[i]=true;
            count++;
            break;
          }
        }
        if(n==count){
          break;
        }

      }

System.out.println(sum);

    }
    in.close();
  }

  private static class Node {
    private int num;
    private int price;

    public Node(int num, int price) {

      this.num = num;
      this.price = price;
    }



  }


}
