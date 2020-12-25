package zju.lym.algo;

import zju.lym.utils.Utils;

/**
 * 求N个正六面体骰子点数之和的概率分布
 *
 */
public class P60_PrintProbability {
  private static final int K = 6;

  private static void probability(int[] results, int N, int n, int sum) {
    if (n == 1) {
      results[sum-N]++;
    } else {
      for (int i = 1; i <= K; i++) {
        probability(results, N, n-1, sum+i);
      }
    }
  }

  public static void solution(int N) {
    int[] results = new int[5 * N + 1];
    for (int i = 1; i <= K; i++) {
      probability(results, N, N, i);
    }
    Utils.printArray(results);
  }
}
