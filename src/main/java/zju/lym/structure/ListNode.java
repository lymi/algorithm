package zju.lym.structure;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ListNode {
  public ListNode next;
  public int value;

  @Override
  public String toString() {
    return "ListNode {value: " + value + "}";
  }
}
