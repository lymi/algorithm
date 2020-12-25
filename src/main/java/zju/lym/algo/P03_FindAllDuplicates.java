package zju.lym.algo;

import zju.lym.utils.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度为n的数组，所有元素都在0~n-1的范围内
 * 找出所有重复数字，空间复杂度O(1)，时间复杂度O(n)
 * 思路:
 * 若 i == arr[i], 向后移动一位
 * 若 arr[i] == arr[arr[i]], 找到一个重复值，并后移一位
 * 否将下标为i和arr[i]的值交换位置
 */
public class P03_FindAllDuplicates {
 public static List<Integer> solution(int[] arr) {
    List<Integer> result = new ArrayList<>();
    if (arr == null || arr.length == 0) return result;
    int i = 0;
    while (i < arr.length) {
      if (arr[i] == i) {
        i++;
      } else if (arr[i] == arr[arr[i]]) {
        result.add(arr[i++]);
      } else {
        Utils.swap(arr, i, arr[i]);
      }
    }
    return result;
  }
}

