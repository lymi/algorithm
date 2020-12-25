package zju.lym.algo;

import java.util.Stack;

/**
 * 用两个栈实现队列
 */
public class P09_CQueue {
  private Stack<Integer> stack1 = new Stack<>();
  private Stack<Integer> stack2 = new Stack<>();

  public void append(int v) {
    stack1.push(v);
  }

  public int remove() {
    if (stack2.size() > 0) return stack2.pop();
    while (stack1.size() > 0) {
      stack2.push(stack1.pop());
    }
    return stack2.pop();
  }
}
