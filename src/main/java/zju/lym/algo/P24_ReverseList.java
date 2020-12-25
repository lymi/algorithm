package zju.lym.algo;

import zju.lym.structure.ListNode;

/**
 * 反转链表
 * 三个指针分别指向当前节点，前一个节点，后一个节点
 */
public class P24_ReverseList {
  public static ListNode solution(ListNode head) {
    if (head == null) return null;
    ListNode currNode = head, prevNode = null, nextNode;
    while (currNode != null) {
      nextNode = currNode.next;
      currNode.next = prevNode;
      prevNode = currNode;
      currNode = nextNode;
    }
    return prevNode;
  }
}

