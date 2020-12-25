package zju.lym.algo;

import zju.lym.utils.Utils;

/**
 * 5张扑克牌是否是顺子，王牌(用0表示)可以代表任意一张牌
 * 排序后，判断王牌张数是否能填补最大值与最小值之差与非王牌张数间的空隙
 * 若存在两张非王牌值相同，则一定不是顺子
 */
public class P61_IsContinuous {
  public static boolean solution(int[] arr) {
    Utils.quickSort(arr);
    for (int i = 0; i < arr.length-2; i++) {
      if (arr[i] != 0 && arr[i] == arr[i+1]) return false;
    }
    int i = 0, j = arr.length-1;
    if (arr[j] == 0) return true;
    while (i < arr.length && arr[i] == 0) i++;
    int gap = (arr[j] - arr[i]) - (j - i);
    int numOfZero = 0;
    for (int value : arr) {
      if (value == 0) numOfZero++;
    }
    return numOfZero >= gap;
  }
}
