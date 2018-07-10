package monotonousStack;

import java.util.Stack;

/*
 * 单调栈入门： 求数组 1 6 2 9 4 每个元素向左第一个比自己小的元素的位置，
 * 如果不存在则为0 因此 这个数组 是 0 1 1 3 3
 *  思路1：直接遍历数组 
 *  思路2：使用单调栈
 * 
 */
public class JustIn {
  public static void main(String[] args) {
    int[] arr = {1, 6, 2, 9, 4};
    int[] arr1 = solve1(arr);
    int[] arr2 = solve2(arr);
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i] + " ");
    }

  }

  /*
   * 此时时间复杂度在最坏的情况下是O(n2)
   */
  public static int[] solve1(int[] arr) {
    int[] arr1 = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        arr1[i] = 0;
      }
      int temp = arr[i];
      for (int j = i; j >= 0; j--) {
        if (temp > arr[j]) {
          arr1[i] = j + 1;
          break;
        }

      }

    }
    return arr1;
  }
/*
 * 时间复杂度 O(n)
 * 单调栈需要升序
 */
  public static int[] solve2(int[] arr) {
    int[] arr2 = new int[arr.length];
    Stack<Pair> stack = new Stack<>();
    arr2[0] = 0;
    stack.push(new Pair(1, arr[0]));
    int index = 2;
    while (index <= arr.length) {
      int value = arr[index-1];
      while (!stack.isEmpty() && stack.peek().value >= value) {
        stack.pop();
      }
      
      if(stack.isEmpty()){
        arr2[index-1]=0;
      }else {
        
          arr2[index-1]=stack.peek().index;
         
        
      }
      stack.push(new Pair(index+1, value));

      
      index++;
    }
    return arr2;

  }

  public static class Pair {
  //这里的index表示第index个数，index从1开始，第index数的值为arr[index-1]
    int index;
    int value;

    public Pair(int index, int value) {
      this.index = index;
      this.value = value;
    }
  }
}
