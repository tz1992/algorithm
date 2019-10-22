package saima.baidu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 度度熊找子串
 */
public class StrGame {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    String str=in.next();
   
    char[]arr=str.toCharArray();
    
    Map<Character, Integer>map=new HashMap<>();
    int count=1;
    for (int i = 0; i < arr.length-1; i++) {
      if(arr[i]==arr[i+1]){
        count++;
      }else {
        if(map.containsKey(arr[i])){
          int temp=map.get(arr[i]);
          if(count>temp){
            map.put(arr[i], count);
            
          }
        }else {
          map.put(arr[i], count);
        }
        
        count=1;
      }
    }
    int sum=0;
    for(Map.Entry<Character, Integer> entry:map.entrySet()){
      sum+=entry.getValue();
    }
    System.out.println(sum);
  }
  in.close();
}
}
