package zju.lym.algo;

import zju.lym.structure.ListNode;

/**
 * 获取链表中倒数第K个节点
 * 两个指针p1和p2，p1指向链表头，p2指向第K个节点
 * 同时向后移动，当p2到达终点时，p1指向倒数第K个节点
 */
public class P22_FindKthToTail {
  public static ListNode solution(ListNode head, int k) {
    if (head == null || k == 0) return null;
    ListNode p1 = head;
    ListNode p2 = head;
    for (int i = 1; i < k; i++) {
      p2 = p2.next;
      if (p2 == null) {
        return null;
      }
    }
    while (p2.next != null) {
      p1 = p1.next;
      p2 = p2.next;
    }
    return p1;
  }
}
