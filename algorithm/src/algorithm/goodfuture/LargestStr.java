package algorithm.goodfuture;
/*
 * 思路：
 * 字符从第0个开始算
 * dp[i]表示以第i-1个字符结束时的最长数字字符长度
 * 因此当第i-1个字符是数字的时候
 * dp[i]=dp[i-1]+1
 * 否则
 * dp[i]=0
 * 得到dp数组
 * 从中求其中的最大的值，并求出此时的字母下标
 * 然后得出想要的结果
 */
import java.util.Scanner;

public class LargestStr {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    String str=in.nextLine();
    char[]arr=str.toCharArray();
    //dp[i]表示以第i-1个字符结束时的最长数字字符长度
    
    int[]dp=new int[arr.length];
    if(isContain(arr[0])){
      dp[0]=1;
    }else {
      dp[0]=0;
    }
    for (int i = 1; i < arr.length; i++) {
      if(isContain(arr[i])){
        dp[i]=dp[i-1]+1;
      }else {
        dp[i]=0;
      }
    }
    int max=Integer.MIN_VALUE;
    int index=0;
    for (int i = 0; i < dp.length; i++) {
      if(dp[i]>=max){
        max=dp[i];
        index=i;
      }
    }
  
    for (int i =index-max+1;i<=index;i++){
      System.out.print(arr[i]);
    }
    
  }
  in.close();
}

public static boolean isContain(char c){
  char []arr={'0','1','2','3','4','5','6','7','8','9'};
  int count=0;
  for (int i = 0; i < arr.length; i++) {
    if(c==arr[i]){
      count++;
    }
  }
  if(count==0){
    return false;
  }else {
    return true;
  }
}
}
