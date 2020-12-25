package zju.lym.algo;

/**
 * 长度为N的绳子切成若干段，求各段长度乘积可能的最大值
 * DP[i]代表长度为i的绳子，各段长度乘积的最大值
 * 当N <= 3时，绳子不分割(即为一段)时乘积最大
 * 当N > 3时，绳子分割为两段的乘积一定大于等于不分割
 */
public class P14_CutRope {
  public static int solution(int N) {
    if (N <= 3) return N;
    int[] DP = new int[N+1];
    DP[0] = 0;
    DP[1] = 1;
    DP[2] = 2;
    DP[3] = 3;
    for (int i = 4; i <= N; i++) {
      int max = 0;
      for (int j = 1 ; j <= i / 2; j++) {
        int temp = DP[j] * DP[i-j];
        if (max < temp) max = temp;
      }
      DP[i] = max;
    }
    return DP[N];
  }
}
