package zju.lym.algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 获取长度为size的每个滑动窗口的最大值
 */
public class P59_MaxInWindow {
  /**
   * 采用双端队列deque
   * deque中保存可能是窗口最大值的index，且当前窗口最大值index一定在deque尾部
   * 滑入窗口的值从头部加入deque，滑出窗口的值从尾部移除
   */
  public static List<Integer> solution1(int[] arr, int size) {
    List<Integer> result = new ArrayList<>();
    if (arr == null || size <= 0 || arr.length < size) return result;
    LinkedList<Integer> deque = new LinkedList<>();

    deque.addFirst(0);

    for (int i = 1; i < size; i++) {
      if (arr[deque.getFirst()] < arr[i]) {
        deque.removeFirst();
        deque.addFirst(i);
      }
    }

    result.add(arr[deque.getLast()]);
    for (int i = size; i < arr.length; i++) {
      while (!deque.isEmpty() && arr[deque.getFirst()] < arr[i]) {
        deque.removeFirst();
      }
      if (!deque.isEmpty() && deque.getLast() <= i-size) {
        deque.removeLast();
      }
      deque.addFirst(i);
      result.add(arr[deque.getLast()]);
    }

    return result;
  }

  /**
   * 采用大顶堆
   */
  public static ArrayList<Integer> solution2(int[] arr, int size) {
    ArrayList<Integer> result = new ArrayList<>();
    if (arr == null || size <= 0 || arr.length < size) return result;
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);

    for (int i = 0; i < size; i++) {
      maxHeap.add(arr[i]);
    }

    result.add(maxHeap.peek());
    int i = 0, j = size;
    while (j < arr.length) {
      maxHeap.remove(arr[i]);
      maxHeap.add(arr[j]);
      result.add(maxHeap.peek());
      i++;
      j++;
    }

    return result;
  }
}
