package algorithm.qunaer;

import java.util.Scanner;

public class FileName {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    String s1=in.next();
    String[]arr=s1.split("\\.");
    if(arr.length==1){
      System.out.println("null");
    }else {
      System.out.println(arr[1]);
    }
  }
  in.close();
}
}
