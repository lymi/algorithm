package zju.lym.algo;

import java.util.Stack;

/**
 * 给定两个序列，第一个为栈的压入序列，判断第二个能否作为该栈的弹出序列
 * 序列无重复数字
 * 如{1,2,3,4,5}作为压入序列，{4,5,3,2,1}可作为弹出序列
 * 而{4,3,5,1,2}不能作为弹出序列
 */
public class P31_IsStackPopOrder {
  public static boolean solution(int[] pushOrder, int[] popOrder) {
    // 参数合规校验略
    Stack<Integer> dataStack = new Stack<>();
    int i = 0, j = 0;
    while (j < popOrder.length) {
      while (i < pushOrder.length && pushOrder[i] != popOrder[j]) {
        dataStack.push(pushOrder[i++]);  // 将下一次弹出前的元素全部压入栈中
      }
      if (i < pushOrder.length) {  // 压入后立刻弹出
        i++;
        j++;
      } else {   // 压入完毕
        break;
      }
    }

    while (j < popOrder.length && dataStack.size() > 0) {
      // 判断栈中数据弹出顺序与给定弹出序列是否一致
      if (dataStack.pop() != popOrder[j++]) {
        return false;
      }
    }
    return true;
  }
}
