package algorithm.meituan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
 * 美团/集合
 */
public class Collection {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int n=in.nextInt();
    int m=in.nextInt();
    int []a=new int[n];
    int []b=new int[m];
    for (int i = 0; i < a.length; i++) {
      a[i]=in.nextInt();
    }
    for (int i = 0; i < b.length; i++) {
      b[i]=in.nextInt();
    }
    
    List<Integer>list=new ArrayList<>();
    for (int i = 0; i < a.length; i++) {
      int temp=a[i];
      if(!list.contains(temp)){
        list.add(temp);
      }
    }
    for (int i = 0; i < b.length; i++) {
      int temp=b[i];
      if(!list.contains(temp)){
        list.add(temp);
      }
    }
    int []finals=new int[list.size()];
    for (int i = 0; i < finals.length; i++) {
      finals[i]=list.get(i);
    }
    Arrays.sort(finals);
    for (int i = 0; i < finals.length; i++) {
      if(i==finals.length-1){
        System.out.print(finals[i]);
      }else {
        System.out.print(finals[i]+" ");
      }
    }
  }
  in.close();
}
}
