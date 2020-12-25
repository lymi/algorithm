package zju.lym.algo;

import zju.lym.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * 找出数组中最小的k个值
 * 方法一: 用partition方法找到第k小的值
 * 方法二: 采用红黑树，适合海量数据
 */
public class P40_GetLeastKNums {
  public static List<Integer> solution1(int[] arr, int K) {
    int low = 0, high = arr.length-1, pivot = 0;
    List<Integer> result = new ArrayList<>();
    while (low < high) {
      pivot = Utils.partition(arr, low, high);
      if (pivot > K-1) {
        high = pivot - 1;
      } else {
        low = pivot + 1;
      }
    }
    for (int i = 0; i < K; i++) {
      result.add(arr[i]);
    }
    return result;
  }

  public static List<Integer> solution2(int[] arr, int K) {
    TreeSet<Integer> treeSet = new TreeSet<>();

    for (int i = 0; i < arr.length; i++) {
      if (i < K) {
        treeSet.add(arr[i]);
      } else if (arr[i] < treeSet.last()) {
        treeSet.remove(treeSet.last());
        treeSet.add(arr[i]);
      }
    }

    return new ArrayList<>(treeSet);
  }
}
