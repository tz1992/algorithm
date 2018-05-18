package algorithm.wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 问题描述：
 *   洗牌在生活中十分常见，现在需要写一个程序模拟洗牌的过程。 
 *   现在需要洗2n张牌，从上到下依次是第1张，第2张，第3张一直到第2n张。
 *   首先，我们把这2n张牌分成两堆，左手拿着第1张到第n张（上半堆），右手拿着第n+1张到第2n张（下半堆）。
 *   接着就开始洗牌的过程，先放下右手的最后一张牌，再放下左手的最后一张牌，接着放下右手的倒数第二张牌，
 *   再放下左手的倒数第二张牌，直到最后放下左手的第一张牌。接着把牌合并起来就可以了。
 *   例如有6张牌，最开始牌的序列是1,2,3,4,5,6。首先分成两组，左手拿着1,2,3；右手拿着4,5,6。
 *   在洗牌过程中按顺序放下了6,3,5,2,4,1。把这六张牌再次合成一组牌之后，我们按照从上往下的顺序看这组牌，
 *   就变成了序列1,4,2,5,3,6。 现在给出一个原始牌组，请输出这副牌洗牌k次之后从上往下的序列。
 *  输入描述：
 *   第一行一个数T(T ≤ 100)，表示数据组数。
 *   对于每组数据，第一行两个数n,k(1 ≤ n,k ≤ 100)，
 *   接下来一行有2n个数a1,a2,...,a2n(1 ≤ ai ≤ 1000000000)。
 *   表示原始牌组从上到下的序列。
 *  输出描述：
 *   对于每组数据，输出一行，最终的序列。数字之间用空格隔开，不要在行末输出多余的空格。
 *   
 *   date：2018.5.18
 *   
 *   输入：3 3 1 1 2 3 4 5 6 3 2 1 2 3 4 5 6 2 2 1 1 1 1
 */
public class Shuffle {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	while (in.hasNextInt()) {
		List<Node>list=new ArrayList<>();
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			int x=in.nextInt();
			int y=in.nextInt();
			Node node=new Node(x, y);
			for(int j=0;j<node.arr.length;j++){
				node.arr[j]=in.nextInt();
			}
			list.add(node);
		}
		
		List<Integer>list2=new ArrayList<>();
		for(Node node:list){
			int num=node.k;
			int arr1[]=node.arr;
			while(num>0){
				num--;
				game(arr1);
			}
			for(int i=0;i<arr1.length;i++){
				list2.add(arr1[i]);
			}
		
		}
	Object[]objects=	list2.toArray();
	for (int i = 0; i < objects.length; i++) {
		if(i==(objects.length-1)){
			System.out.print(objects[i]);
		}else {
			System.out.print(objects[i]+" ");
		}
	}
	}
	in.close();
}
  


static class Node{
	private int[]arr;
	int k;
	public Node(int n,int k){
		this.k=k;
		arr=new int[2*n];
	}
}

public static void game(int[]arr){
	List<Integer>list=new ArrayList<>();
	int len=arr.length;
	for(int i=0;i<len/2;i++){
		list.add(arr[i]);
		list.add(arr[i+len/2]);
	}
	
	for(int i=0;i<list.size();i++){
		arr[i]=list.get(i);
	}
}
}
