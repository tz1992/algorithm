package saima.qihu;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 列表任务
 */
public class ListTask {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      int n = in.nextInt();
      int m = in.nextInt();
      int[] arr1 = new int[n];
      for (int i = 0; i < arr1.length; i++) {
        arr1[i] = in.nextInt();
      }
      int[] arr2 = new int[m];
      for (int i = 0; i < arr2.length; i++) {
        arr2[i] = in.nextInt();
      }
      Arrays.sort(arr1);
      for (int i = 0; i < arr2.length; i++) {
        int temp = arr2[i];
        int index = 0;
        boolean isPrint = false;
        int judge=0;
        for (int j = 0; j < arr1.length; j++) {
          if (temp < arr1[j]) {
            int v1 = arr1[j];
            if (v1 - temp > 1) {
              System.out.println(temp + 1);
              isPrint = true;
              
            } else if(v1-temp==0) {
              index = j;
              
            }else {
              if(j>0){
                int dis=arr1[j]-arr1[j-1];
                if(dis>1){
                  System.out.println(temp );
                  isPrint = true;
                }else {
                  index=j;
                }
              }else {
                index=j;
              }
            }
            
           
            break;

          }
          judge=j;
        }
        
        if(judge==arr1.length-1){
          System.out.println(arr1[arr1.length-1]+1);
          isPrint = true;
        }

        if (!isPrint) {
          for (int j = index; j < arr1.length - 1; j++) {
            if (arr1[j + 1] - arr1[j] > 1) {
              System.out.println(arr1[j] + 1);
              isPrint = true;
              break;
            }


          }

        }
        if (!isPrint) {
          System.out.println(arr1[arr1.length - 1] + 1);
        }

      }
    }
    in.close();
  }
}
