package jzOffer.str;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
/*
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列
 * 
 * 全排序+去重
 */
public class Sort {
  //标志位，查看当前的字符是否使用
  int[]flag;
  char[]seq;
  //用于去重
  HashSet<String> result=new HashSet<>();
  public ArrayList<String> Permutation(String str) {
    char[]arr=str.toCharArray();
    seq=new char[arr.length];
    flag=new int[arr.length];
    //初始化flag数组，0表示还未使用，1表示已经使用过
    for (int i = 0; i < flag.length; i++) {
      flag[i]=0;
    }
    dfs(arr,0);
    ArrayList<String>list=new ArrayList<>();
   
    list.addAll(result);
    Collections.sort(list);
    return list;
  }
  private void dfs(char[] arr, int step) {
    if(arr.length==step){
      String string="";
      for (int i = 0; i < seq.length; i++) {
        string+=seq[i];
      }
      result.add(string);
      return;//返回上一步
    }
    
    for(int i=0;i<arr.length;i++){
      if(flag[i]==0){
        seq[i]=arr[i];
        flag[i]=1;
        dfs(arr, step+1);
        //走完最后一步，回退
        flag[i]=0;
      }
    }
    
  }
}
