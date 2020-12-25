package zju.lym.algo;

import zju.lym.structure.ListNode;

/**
 * 删除链表给定节点
 * 1 待删除节点是表头
 * 2 待删除节点非表头
 */
public class P18_DeleteListNode {
  public static ListNode solution(ListNode head, ListNode toBeDeleted) {
    if (head == null || toBeDeleted == null) return null;
    if (head == toBeDeleted) {
      ListNode next = head.next;
      head.next = null;
      return next;
    } else {
      ListNode prev = head;
      while (prev.next != toBeDeleted) {
        prev = prev.next;
      }
      prev.next = toBeDeleted.next;
      toBeDeleted.next = null;
      return head;
    }
  }
}
