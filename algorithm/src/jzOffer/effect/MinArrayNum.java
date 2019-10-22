package jzOffer.effect;

import java.util.Arrays;
import java.util.Comparator;

public class MinArrayNum {
  public String PrintMinNumber(int [] numbers) {
    String[]arr=new String[numbers.length];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=numbers[i]+"";
    }
    Arrays.sort(arr, new Comparator<String>() {

      @Override
      public int compare(String o1,  String o2) {
        String s1=o1+o2;
        String s2=o2+o1;
        return s1.compareTo(s2);
      }});
    String result="";
    for (int i = 0; i < arr.length; i++) {
      result+=arr[i];
      
    }
    return result;
  }
}
