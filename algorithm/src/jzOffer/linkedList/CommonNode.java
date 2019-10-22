package jzOffer.linkedList;

import java.util.Stack;

/*
 * 找出两个链表的第一个公共节点
 * 两个节点相同是指从这一节点开始向后的每个节点的状态相同
 */
public class CommonNode {
  public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    Stack<ListNode>stack1=new Stack<>();
    Stack<ListNode>stack2=new Stack<>();
    while (pHead1!=null) {
      stack1.push(pHead1);
      pHead1=pHead1.next;
    }
    
    while (pHead2!=null) {
      stack2.push(pHead2);
      pHead2=pHead2.next;
    }
    
    ListNode commonNode=null;
    while (!stack1.isEmpty()&&stack2.isEmpty()&&stack1.peek()==stack2.peek()) {
      commonNode=stack1.pop();
      stack2.pop();
    }
    return commonNode;
    
  }
}
