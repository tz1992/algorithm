package algorithm.wangyi;

import java.util.Scanner;

/*
 * 问题描述
 * 二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，
 * 网格的列编号为0~W-1。每个格子至多可以放一块蛋糕，
 * 任意两块蛋糕的欧几里得距离不能等于2。
        对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
   ( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
        小易想知道最多可以放多少块蛋糕在网格盒子里。
 */
public class GetCakeNums {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	while (in.hasNextInt()) {
		int len=in.nextInt();
		int width=in.nextInt();
		int count=0;
		int[][]arr=new int[width][len];
		for(int i=0;i<width;i++){
			if (i%4==0||i%4==1) {
				for(int j=0;j<len;j++){
					if(j%4==0||j%4==1){
						arr[i][j]=1;
					}
				}
				
			}else {
				for(int j=0;j<len;j++){
					if(j%4==2||j%4==3){
						arr[i][j]=1;
					}
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j]==1){
					count++;
				}
			}
		}
		System.out.println(count);
	}
	in.close();
}
}
