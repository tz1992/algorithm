package algorithm.wangyi;

import java.util.Scanner;

/*
 * 星际穿越：
 * 航天飞行器是一项复杂而又精密的仪器，
 * 飞行器的损耗主要集中在发射和降落的过程，
 * 科学家根据实验数据估计，如果在发射过程中，
 * 产生了 x 程度的损耗，那么在降落的过程中就会产生 x2 程度的损耗，
 * 如果飞船的总损耗超过了它的耐久度，飞行器就会爆炸坠毁。
 * 问一艘耐久度为 h 的飞行器，假设在飞行过程中不产生损耗，
 * 那么为了保证其可以安全的到达目的地，
 * 只考虑整数解，至多发射过程中可以承受多少程度的损耗？
 * 
 * 输入描述：
 * 每个输入包含一个测试用例。
 * 每个测试用例包含一行一个整数 h （1 <= h <= 10^18）。
 * 
 * 思路：
 * x*x<x*x+x<(x+1)*(x+1)
 */
public class InterstellarCross {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	long n=Long.parseLong(in.next());
	in.close();
	long p=(long) Math.sqrt(n);
	long q=p-1;
	if(p*p+p<=n){
		System.out.println(p);
	}else {
		System.out.println(q);
	}

}
}
