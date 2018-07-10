package algorithm.goodfuture;
/*
 * 好未来/n个数里出现次数大于等于n/2的数
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumGame2 {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextLine()) {
    String str=in.nextLine();
    String[]arr=str.split(" ");
    Map<Integer, Integer> map=new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int num=Integer.parseInt(arr[i]);
      if(map.containsKey(num)){
        map.put(num, map.get(num)+1);
      }else {
        map.put(num, 1);
      }
    }
    
    for(Map.Entry<Integer, Integer> entry:map.entrySet()){
      if(entry.getValue()>=arr.length/2){
        System.out.println(entry.getKey());
      }
    }
  }
  in.close();
}
}
