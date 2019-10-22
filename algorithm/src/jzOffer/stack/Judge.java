package jzOffer.stack;

import java.util.Stack;

/*
 * 假定第一个序列是栈的压入序列，第二个是栈的弹出序列
 * 判定第二个栈是不是第一个栈的弹出序列
 */
public class Judge {
  /*
   * 将入栈的序列依次压栈，如果栈顶元素和出栈序列相同，则出栈，依次遍历
   * 如果最后栈的元素个数为0，则返回true否则返回false  
   */
  public boolean IsPopOrder(int [] pushA,int [] popA) {
    Stack<Integer>stack=new Stack<>();
    int index=0;
    for (int i = 0; i < popA.length; i++) {
      stack.push(pushA[i]);
      while (!stack.isEmpty()&&stack.peek()==popA[index]) {
        stack.pop();
        index++;
      }
    }
    return stack.isEmpty();
  }
}
