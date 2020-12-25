package zju.lym.algo;

import java.util.PriorityQueue;

/**
 * 获取数据流中位数，若已读取奇数个数值，则中位数为排序
 * 后的中间值，否则为排序后中间两个值的平均值。
 * 不同方法时间复杂度比较：
 *                     插入新值              获取中位数
 * 不排序数组            O(1)                  O(n)    // 采用partition函数
 * 排序数组              O(n)                  O(1)
 * 二叉搜索数        平均O(logn) 最差O(n)   平均O(logn) 最差O(n)
 * AVL树                O(logn)                O(1)   // 实现复杂
 * 大顶堆和小顶堆配合    O(logn)                O(1)
 */
public class P41_DataStreamMedium {
  private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
  private PriorityQueue<Integer> maxHeap = new PriorityQueue<>((v1, v2) -> v2 - v1);

  public void insert(int val) {
    if ((maxHeap.size() + minHeap.size()) % 2 == 0) {
      if (minHeap.size() > 0 && val > minHeap.peek()) {
        maxHeap.add(minHeap.poll());
        minHeap.add(val);
      } else {
        maxHeap.add(val);
      }
    } else {
      if (maxHeap.size() > 0 && val < maxHeap.peek()) {
        minHeap.add(maxHeap.poll());
        maxHeap.add(val);
      } else {
        minHeap.add(val);
      }
    }
  }

  public double getMedium() {
    if (maxHeap.size() == 0) return Double.MIN_VALUE;
    if ((maxHeap.size() + minHeap.size()) % 2 == 0 && minHeap.size() > 0) {
      return ((double)maxHeap.peek() + (double)minHeap.peek()) / 2;
    }
    return maxHeap.peek();
  }
}
