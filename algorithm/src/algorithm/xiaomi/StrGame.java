package algorithm.xiaomi;
/*
 * 句子反转
 */
import java.util.Scanner;

public class StrGame {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextLine()) {
    String[]arr=in.nextLine().split(" ");
    for (int i = arr.length-1; i >=0; i--) {
      if(i!=0){
        System.out.print(arr[i]+" ");
      }else {
        System.out.print(arr[i]);
      }
    }
  }
  in.close();
}
}
