package com.tz.algorithm.monotonousStack;

import java.util.Scanner;
import java.util.Stack;

/*
 * 求柱状图中的最大矩形面积 思路 首先考虑最大面积的矩形X的左右边界的性质： 设其左边界为L，右边界为R，则其高H = min{h[i] | L <= i <= R} 此时最大面积为 (R - L
 * + 1) * H 因此，左右边界一定是第一个比h(i)小的数 max=max{h(i)*(R-L)} 因此，此时需要求出每一个位置对应的左右的第一个比该位置小的数
 * 
 * 
 */
public class LargestRectangle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {
      int n = in.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = in.nextInt();
      }
      int[] L = getLeft(arr);
      int[] R = getRight(arr);
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
        int size = arr[i] * (R[i] - L[i] - 1);
        if (max <= size) {
          max = size;
        }
      }
      System.out.println(max);
    }
    in.close();
  }


  public static int[] getLeft(int[] arr) {
    int[] L = new int[arr.length];
    L[0] = 0;
    Stack<Pair> stack = new Stack<>();
    stack.push(new Pair(1, arr[0]));
    int index = 2;
    while (index <= arr.length) {
      int value = arr[index - 1];
      while (!stack.isEmpty() && stack.peek().value >= value) {
        stack.pop();
      }
      if (stack.isEmpty()) {
        L[index - 1] = 0;
      } else {
        L[index - 1] = stack.peek().index;

      }
      stack.push(new Pair(index, value));
      index++;
    }
    return L;

  }

  public static int[] getRight(int[] arr) {
    int[] R = new int[arr.length];
    int index = arr.length;
    Stack<Pair> stack = new Stack<>();
    stack.push(new Pair(index, arr[index - 1]));
    R[index - 1] = index + 1;
    while (index >= 1) {
      int value = arr[index - 1];
      while (!stack.isEmpty() && stack.peek().value >= value) {
        stack.pop();
      }

      if (stack.isEmpty()) {
        R[index - 1] = arr.length + 1;
      } else {
        R[index - 1] = stack.peek().index;

      }
      stack.push(new Pair(index, value));
      index--;
    }

    return R;
  }

  public static class Pair {
    // 这里的index表示第index个数，index从1开始，第index数的值为arr[index-1]
    int index;
    int value;

    public Pair(int index, int value) {
      this.index = index;
      this.value = value;
    }
  }
}
