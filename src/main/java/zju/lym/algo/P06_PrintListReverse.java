package zju.lym.algo;

import zju.lym.structure.ListNode;

/**
 * 从后到前打印链表
 * 思路1: 用栈
 * 思路2: 递归
 */
public class P06_PrintListReverse{
  public static void solution(ListNode head) {
    if (head == null) return;
    solution(head.next);
    System.out.print(head.value + " ");
  }
}
