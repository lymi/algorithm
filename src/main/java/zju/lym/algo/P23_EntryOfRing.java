package zju.lym.algo;

import zju.lym.structure.ListNode;

/**
 * 判断链表是否有环，若有找到环的入口
 * 1. 快慢指针若能相遇说明有环
 * 2. 计算环中节点个数为n
 * 3. 双指针，一个指向表头，一个向后移动n步
 * 4. 两个指针相遇处即是环的入口
 */
public class P23_EntryOfRing {
  public static ListNode solution(ListNode head) {
    if (head == null || head.next == null) return  null;
    ListNode p1 = head, p2 = head.next.next;
    while (p2.next != null && p1 != p2) {
      p1 = p1.next;
      p2 = p2.next.next;
    }
    if (p2.next == null) return null;
    int cnt = 1;
    p1 = p1.next;
    while (p1 != p2) {
      cnt++;
      p1 = p1.next;
    }
    p1 = head;
    p2 = head;
    for (int i = 0; i < cnt; i++) {
      p1 = p1.next;
    }
    while (p1 != p2) {
      p1 = p1.next;
      p2 = p2.next;
    }
    return p1;
  }
}
