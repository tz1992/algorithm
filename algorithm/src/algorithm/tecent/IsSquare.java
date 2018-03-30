package algorithm.tecent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsSquare {
	
	/*
	 * 问题描述，输入四个坐标，判断是否为正方形
	 * 
	 */
	
	/*
	 * 问题解决
	 * 计算边的数量，如果边的数量大于2，则一定不是正方形，如果边的数量等于2 ，则判断存在的两条边的关系
	 */
public static void main(String[] args) {
	Scanner inScanner=new Scanner(System.in);
     int[]x=new int[4];
     int[]y=new int [4];
     for(int i=0;i<4;i++){
    	 x[i]=inScanner.nextInt();
     }
     for(int i=0;i<4;i++){
    	 y[i]=inScanner.nextInt();
     }
     int d;
     inScanner.close();
     List<Integer>list=new ArrayList<Integer>();
     for(int i=1;i<4;i++){
    	d=(x[0]-x[i])*(x[0]-x[i])+(y[0]-y[i])*(y[0]-y[i]);
    	if(!IsHave(d, list)){
    		list.add(d);
    	}
    	 }
     if(list.size()>2){
    	 System.out.println("no");
     }
     
     if(list.size()==2){
    	int d1=list.get(0);
    	int d2=list.get(1);
    	if(2*d1==d2||2*d2==d1){
    		System.out.println("yes");
    	}else {
			System.out.println("no");
		}
     }
     
     }
	
public static Boolean IsHave(int d,List<Integer> list){
	int num=0;
	for(Integer i:list){
		if(i==d){
			num++;
		}
	}
	if(num==0){
		return false;
	}else{
		return true;
	}
}
}
