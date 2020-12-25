package zju.lym.algo;

/**
 * 数字翻译成字符串有多少种翻译方法
 * 翻译规则：0->a, 1->b,..., 11->l,...,25->z
 * 动态规划
 * DP[i]代表前i位数字有多少种翻译方法
 * 若nums[i-1]与nums[i]能够组成一种翻译, 则DP[i] = DP[i-2] + DP[i-1]
 * 否则DP[i] = DP[i-1]
 */
public class P46_TranslationCount {
  private static int getFactor(char c1, char c2) {
    int val = Integer.parseInt(new String(new char[]{c1, c2}));
    if (val >= 10 && val <= 25) return 1;
    return 0;
  }

  private static int getCount(char[] nums) {
    int[] DP = new int[nums.length];
    DP[0] = 1;
    DP[1] = 1 + getFactor(nums[0], nums[1]);
    for (int i = 2; i < nums.length; i++) {
      DP[i] = DP[i-1] + DP[i-2] * getFactor(nums[i-1], nums[i]);
    }
    return DP[nums.length-1];
  }

  public static int solution(int num) {
    if (num < 0) num = -num;
    if (num < 10) return 1;
    return getCount(Integer.toString(num).toCharArray());
  }
}
