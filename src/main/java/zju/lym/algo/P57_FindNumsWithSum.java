package zju.lym.algo;

/**
 * 找到连续递增数组中和为sum的任意两个数
 */
public class P57_FindNumsWithSum {
  public static int[] solution(int[] data, int sum) {
    int low = 0, high = data.length - 1;
    while (low < high) {
      if (data[low] + data[high] > sum) {
        high--;
      } else if (data[low] + data[high] < sum) {
        low++;
      } else {
        return new int[] {data[low], data[high]};
      }
    }
    return null;
  }
}
