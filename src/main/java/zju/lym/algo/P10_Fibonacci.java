package zju.lym.algo;

/**
 * 斐波那契数列
 * 简化的动态规划
 */
public class P10_Fibonacci {
  public static int solution(int N) {
    if (N <= 1) return N;
    int f1 = 0;
    int f2 = 1;
    int result = f1 + f2;
    for (int i = 2; i < N; i++) {
      result = f1 + f2;
      f1 = f2;
      f2 = result;
    }
    return result;
  }
}
