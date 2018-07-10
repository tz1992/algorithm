package algorithm.xiaomi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * 电话号码分身
 * 
 * 思路：
 * 第一轮
 * 独有
 * two w 
 * four u
 * six x
 * eight g
 * zero z
 * 将带有这些独有的字母删除
 * 第二轮 当删除了上面的数之后
 * 独有
 * one o 
 * three r
 * five f
 * seven s 
 * 第三轮当其他全部删除之后，只剩9了
 */
public class Main {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    int n=in.nextInt();
    String[]arr=new String[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=in.next();
    }
    for (int i = 0; i < arr.length; i++) {
      Object[]objects=getList(arr[i]);
      for (int j = 0; j < objects.length; j++) {
        System.out.print(objects[j]);
      }
      System.out.println();
    }
    
  }
  in.close();
}
public static Object[] getList(String s){
  List<Integer>list=new ArrayList<>();
  StringBuffer sb=new StringBuffer(s);
  //第一轮
  //0-Z-2
  while (sb.toString().contains("Z")) {
    sb.deleteCharAt(sb.indexOf("Z"));
    sb.deleteCharAt(sb.indexOf("E"));
    sb.deleteCharAt(sb.indexOf("R"));
    sb.deleteCharAt(sb.indexOf("O"));
    list.add(2);
  }
  //2-W-4
  while (sb.toString().contains("W")) {
    sb.deleteCharAt(sb.indexOf("T"));
    sb.deleteCharAt(sb.indexOf("W"));
    sb.deleteCharAt(sb.indexOf("O"));
    list.add(4);
  }
  //4-U-6
  while (sb.toString().contains("U")) {
    sb.deleteCharAt(sb.indexOf("F"));
    sb.deleteCharAt(sb.indexOf("O"));
    sb.deleteCharAt(sb.indexOf("U"));
    sb.deleteCharAt(sb.indexOf("R"));
    list.add(6);
  }
  //6-X-8
  while (sb.toString().contains("X")) {
    sb.deleteCharAt(sb.indexOf("S"));
    sb.deleteCharAt(sb.indexOf("I"));
    sb.deleteCharAt(sb.indexOf("X"));
    list.add(8);
  } 
  //8-G-0
  while (sb.toString().contains("G")) {
    sb.deleteCharAt(sb.indexOf("E"));
    sb.deleteCharAt(sb.indexOf("I"));
    sb.deleteCharAt(sb.indexOf("G"));
    sb.deleteCharAt(sb.indexOf("H"));
    sb.deleteCharAt(sb.indexOf("T"));
    list.add(0);
  }
  //第二轮
  //1-O-3
  while (sb.toString().contains("O")) {
    sb.deleteCharAt(sb.indexOf("O"));
    sb.deleteCharAt(sb.indexOf("N"));
    sb.deleteCharAt(sb.indexOf("E"));
    
    list.add(3);
  }
  //3-R-5
  while (sb.toString().contains("R")) {
    sb.deleteCharAt(sb.indexOf("T"));
    sb.deleteCharAt(sb.indexOf("H"));
    sb.deleteCharAt(sb.indexOf("R"));
    sb.deleteCharAt(sb.indexOf("E"));
    sb.deleteCharAt(sb.indexOf("E"));
    
    list.add(5);
  }
  //5-F-7
  while (sb.toString().contains("F")) {
    sb.deleteCharAt(sb.indexOf("F"));
    sb.deleteCharAt(sb.indexOf("I"));
    sb.deleteCharAt(sb.indexOf("V"));
    sb.deleteCharAt(sb.indexOf("E"));
    
    
    list.add(7);
  }
  //7-S-9
  while (sb.toString().contains("S")) {
    sb.deleteCharAt(sb.indexOf("S"));
    sb.deleteCharAt(sb.indexOf("E"));
    sb.deleteCharAt(sb.indexOf("V"));
    sb.deleteCharAt(sb.indexOf("E"));
    sb.deleteCharAt(sb.indexOf("N"));
    
    
    list.add(9);
  }
  //第三轮
//9-N-1
  while (sb.toString().contains("N")) {
    sb.deleteCharAt(sb.indexOf("N"));
    sb.deleteCharAt(sb.indexOf("I"));
    sb.deleteCharAt(sb.indexOf("N"));
    sb.deleteCharAt(sb.indexOf("E"));
    
    
    
    list.add(1);
  }
    Object[]objects= list.toArray();
    Arrays.sort(objects);
  return objects;
  }
  
}
