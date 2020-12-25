package zju.lym.algo;

/**
 * 连续子数组最大和，数组中有正数和负数
 * 动态规划
 * DP[i]代表数组前i位数字中子数组和的最大值
 * 若DP[i-1] < 0 则DP[i] = arr[i]
 * 否则 DP[i] = DP[i-1] + arr[i]
 */
public class P42_SubArrMaxSum {
  public static int solution(int[] arr) {
    int[] DP = new int[arr.length];
    DP[0] = arr[0];
    int result = DP[0];
    for (int i = 1; i < arr.length; i++) {
      if (DP[i-1] < 0) {
        DP[i] = arr[i];
      } else {
        DP[i] = DP[i-1] + arr[i];
      }
      if (result < DP[i]) result = DP[i];
    }
    return result;
  }
}
