package saima;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author tz
 *  基本算法/计算机的新功能
 *
 */
public class NewFunction {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  
  while (in.hasNext()) {
    int n=in.nextInt();
    int temp=n;
    List<Integer>list=new ArrayList<>();
    int i=n;
    while(!judge(temp)){
      if(temp%i==0&&judge(i)){
        list.add(i);
        temp=temp/i;
      }else {
        i--;
      }
    }
    list.add(temp);
    for(Integer e:list){
      System.out.println(e);
    }
   
  }
  in.close();
}

public static boolean judge(int n){
  int count=0;
  for(int i=1;i<=n;i++){
    if(n%i==0){
      count++;
    }
  }
  if(count==2){
    return true;
  }else{
    return false;
  }
}

public static void print(int n){
  switch (n) {
    case 0:
      System.out.print(" ");
      System.out.println("-");
      System.out.print("|");
      System.out.print(" ");
      System.out.print("|");
      System.out.println();
      System.out.print("|");
      System.out.print(" ");
      System.out.print("|");
      System.out.println();
      System.out.print(" ");
      System.out.println("-");
      break;

    case 1:
      System.out.println();
      System.out.print(" ");
      System.out.print("|");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.print(" ");
      System.out.print("|");
      break;
  }
}
}
