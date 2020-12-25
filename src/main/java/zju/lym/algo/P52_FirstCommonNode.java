package zju.lym.algo;

import zju.lym.structure.ListNode;

/**
 * 求两个链表的第一个公共节点
 * 思路：先获取两个链表的长度之差K，长链表指针先向后移动K，
 *       两个链表指针再同时向后移动，直到相等
 */
public class P52_FirstCommonNode {
  private static int getLength(ListNode list) {
    if (list == null) return 0;
    int len = 0;
    while (list != null) {
      len++;
      list = list.next;
    }
    return len;
  }

  public static ListNode solution(ListNode head1, ListNode head2) {
    if (head1 == null || head2 == null) return null;
    ListNode p1 = head1, p2 = head2;
    if (getLength(head1) < getLength(head2)) {
      p1 = head2;
      p2 = head1;
    }
    int K = Math.abs(getLength(head1) - getLength(head2));
    for (int i = 0; i < K; i++) {
      p1 = p1.next;
    }
    while (p1 != null && p2 != null && p1 != p2) {
      p1 = p1.next;
      p2 = p2.next;
    }
    return p1;
  }
}