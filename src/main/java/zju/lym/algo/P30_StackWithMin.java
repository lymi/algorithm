package zju.lym.algo;

import java.util.Stack;

/**
 * 实现一个栈，能够在O(1)时间内获取栈中最小值
 * 用两个栈，一个保存数据，另一个栈顶始终是栈中数据最小值
 */
public class P30_StackWithMin {
  private Stack<Integer> dataStack = new Stack<>();
  private Stack<Integer> minValStack = new Stack<>();

  public void push(int val) {
    dataStack.push(val);
    if (minValStack.size() == 0) {
      minValStack.push(val);
    } else {
      minValStack.push(Math.min(minValStack.peek(), val));
    }
  }

  public Integer pop() {
    if (dataStack.size() == 0) return null;
    minValStack.pop();
    return dataStack.pop();
  }

  public Integer min() {
    if (minValStack.size() == 0) return null;
    return minValStack.peek();
  }
}
