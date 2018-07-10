package algorithm.sohu;

import java.util.Scanner;

/*
 * 彩色宝石项链
 */
public class Necklace {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextLine()) {
    String s=in.nextLine();
    int len=s.length();
    char[]arr=s.toCharArray();
    //被拿走的项链的最小长度即为5
    for(int i=5;i<len;i++){
      for(int j=0;j<len;j++){
        StringBuilder temp=new StringBuilder();
        for (int k = j; k <i+j; k++) {
          temp.append(arr[k%len]);
        }
        String res=temp.toString();
        if(res.contains("A")&&
            res.contains("B")&&
            res.contains("C")&&
            res.contains("D")&&
            res.contains("E")){
          System.out.println(len-i);
          return;
        }
      }
    }
  }
  in.close();
}
}
