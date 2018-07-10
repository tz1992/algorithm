package algorithm.s360;

import java.util.Scanner;

/*
 * 360/头脑风暴 思路：kmp匹配算法
 * 
 */
public class BrainStorm {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextLine()) {
      String total = in.nextLine();
      String reverse = "";
      String s1 = in.nextLine();
      String s2 = in.nextLine();

      for (int i = total.length() - 1; i >= 0; i--) {
        reverse += total.charAt(i);
      }
      boolean forward = judge1(total, s1, s2);
      boolean back = judge1(reverse, s1, s2);
      if (forward && !back) {
        System.out.println("forward");
      } else if (!forward && back) {
        System.out.println("backward");
      } else if (forward && back) {
        System.out.println("both");
      } else {
        System.out.println("invalid");
      }
    }
    in.close();
  }

  public static int judge(String total, String c) {
    char[] totals = total.toCharArray();
    char[] cs = c.toCharArray();
    int len1=totals.length;
    int len2=cs.length;
    //主串位置
    int i = 0;
    //模式串位置
    int j = 0;

    while (i<len1&&j<len2) {
     
      if (totals[i] == cs[j]) {
        i++;
        j++;  
     } else {
       //i回退
        i = i - j + 1;
        //归零
        j = 0;

      }


    }
    
   
    if (j == cs.length) {
      
      return i;
    } else {
      return -1;
    }

  }

  public static boolean judge1(String total, String s1, String s2) {
    int index = judge(total, s1);
    
    if (index != -1) {
      int index2 = judge(total.substring(index), s2);
      if (index2 != -1) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }

  }


}
