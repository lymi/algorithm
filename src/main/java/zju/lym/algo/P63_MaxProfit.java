package zju.lym.algo;

/**
 * 股票最大收益
 * 贪心算法
 */
public class P63_MaxProfit {
  public static int solution(int[] arr) {
    if (arr == null || arr.length < 2) return 0;
    int min = arr[0];
    int result = arr[1] - min;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) min = arr[i];
      if (result < arr[i] - min) result = arr[i] - min;
    }
    return result;
  }
}
