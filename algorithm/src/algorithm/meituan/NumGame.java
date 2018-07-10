package algorithm.meituan;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * 美团/丢失的三个数
 */
public class NumGame {
public static void main(String[] args) {
  
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int []inputs=new int[9997];
    for (int i = 0; i < inputs.length; i++) {
      inputs[i]=in.nextInt();
    }
    Arrays.sort(inputs);
    
    List<Integer>list=new ArrayList<>();
    for (int i = 0; i < inputs.length-1; i++) {
      int dis=inputs[i+1]-inputs[i];
      if(dis==2){
        list.add(inputs[i]+1);
       
      }else if(dis==3) {
        list.add(inputs[i]+2);
        list.add(inputs[i]+1);
       
      }else if (dis==3) {
        list.add(inputs[i]+1);
        list.add(inputs[i]+2);
        list.add(inputs[i]+3);
        
      }else {
        continue;
      }
    }
    
    int size=list.size();
    if(size==2){
      int num1=inputs[0];
      
      if(num1==1){
        list.add(10000);
      }else {
        list.add(1);
      }
    }else if (size==1) {
      int num1=inputs[0];
      int num2=inputs[inputs.length-1];
      if(num1!=1&&num2!=10000){
        list.add(1);
        list.add(10000);
      }else if (num1==1) {
        list.add(9999);
        list.add(10000);
      }else {
        list.add(1);
        list.add(2);
      }
    }else if (size==0) {
      int num1=inputs[0];
      int num2=inputs[inputs.length-1];
      if(num1==1&&num2!=1000){
        list.add(9998);
        list.add(9999);
        list.add(1000);
      }else if (num2==10000&&num1!=1) {
        list.add(1);
        list.add(2);
        list.add(3);
      }else if (num2!=10000&&num1!=1) {
        list.add(1);
        list.add(10000);
        if(inputs[1]==2){
          list.add(9999);
        }else {
          list.add(2);
        }
      }
    }
  
    int []arr=new int[3];
  for (int i = 0; i < arr.length; i++) {
    arr[i]=list.get(i);
  }
    
   
    Arrays.sort(arr);
    String string="";
        for (int i = 0; i < arr.length; i++) {
          string+=arr[i];
        }
      long num=Long.parseLong(string);
      System.out.println(num%7);
  }
  in.close();
}
}
