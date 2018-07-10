package algorithm.qunaer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringGame {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextLine()) {
    char[]arr=in.nextLine().trim().toCharArray();
    String temp="";
    for (int i = 0; i < arr.length; i++) {
      if((arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z')){
        temp+=arr[i];
      }
    }
    char[]arr1=temp.toCharArray();
    
    Map<Character, Integer>map=new HashMap<>();
    for (int i = 0; i < arr1.length; i++) {
      if(map.containsKey(arr1[i])){
        int times=map.get(arr1[i]);
        if(times==2){
          System.out.println(arr1[i]);
          break;
        }else {
          map.put(arr1[i], 2);
        }
      }else {
        map.put(arr1[i], 1);
      }
    }
  }
  in.close();
}
}
