package jzOffer.matrix;

import java.util.ArrayList;

/*
 * 顺时针打印矩阵
 */
public class PrintMatrix {
  public ArrayList<Integer> printMatrix(int [][] matrix) {
    ArrayList<Integer>list=new ArrayList<>();
    int col=matrix.length;
    int column=matrix[0].length;
    int min=Math.min(col, column);
    int index=0;
    if(min%2==0){
      index=min/2;
    }else {
      index=(min+1)/2;
    }
    //最外层循环表示打印的层数
    for(int i=0;i<index;i++){
      //从左到右
      for(int k=i;k<column-i;k++) list.add(matrix[i][k]);
      //从右上到右下
      for(int j=i+1;j<col-i;j++) list.add(matrix[j][column-i-1]);
      /*
       * 从右到左 ,
       * 当矩阵的行数为1的时候，此时只会打印从左到右，
       * 不会再次打印从右到左，因此当行数为奇数的时候，
       * 随着打印层数不断向内延伸，总会到剩下的行数为1的情况
       * 此时从右到左不会打印
       * col->col-2->col-4->....->1
       * 也就是
       * col-2*i!=1
       */
      for(int k=column-i-2;(k>=i&&col-i-1!=i);k--) list.add(matrix[col-i-1][k]);
      //从左下到左上,j,i为什么没有=,因为在从左向右的时候已经用了
      for(int j=col-i-2;(j>i&&column-i-1!=i);j--) list.add(matrix[j][i]);
    }
    return list;
  }
}
