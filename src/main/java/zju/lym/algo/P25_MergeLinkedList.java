package zju.lym.algo;

import zju.lym.structure.ListNode;

/**
 * 归并两个递增排序的链表
 */
public class P25_MergeLinkedList {
  public static ListNode solution(ListNode head1, ListNode head2) {
    if (head1 == null) return head2;
    if (head2 == null) return head1;
    if (head1.value <= head2.value) {
      head1.next = solution(head1.next, head2);
      return head1;
    }
    head2.next = solution(head1, head2.next);
    return head2;
  }
}
