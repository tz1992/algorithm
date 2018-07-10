package algorithm.wangyi;

import java.util.ArrayList;
import java.util.List;
/*
 * 问题描述：
 *  小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，
 *  只提供6个每袋和8个每袋的包装(包装不可拆分)。
 * 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。
 * 如果不能购买恰好n个苹果，小易将不会购买。 
 * 输入描述： 输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
 * 输出描述： 输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
 * date:2018.6.5
 */
import java.util.Scanner;

public class BuyApple {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {
     int n=in.nextInt();
     int x=n/8;
     int temp=-1;
     List<Integer>list=new ArrayList<>();
     for(int i=0;i<=x;i++){
       if((n-2*i)%6==0){
        list.add(i);
       }
     }
     
     if(list.size()!=0){
       temp=list.get(list.size()-1);
     }
     if(temp!=-1){
       System.out.println((n-2*temp)/6);
     }else {
      System.out.println(-1);
    }
    }
    in.close();
  }
}
