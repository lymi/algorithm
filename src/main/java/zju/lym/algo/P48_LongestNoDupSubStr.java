package zju.lym.algo;

/**
 * 最长不含重复字符的子字符串长度
 * 动态规划
 * DP[i]代表以chars[i]为结尾的不含重复字符的子字符串的最大长度
 * 若chars[i]与之前的DP[i-1]个字符不重复，则DP[i] = 1 + DP[i-1]
 * 否则 DP[i] = 1;
 * 最后找DP数组的最大值
 */
public class P48_LongestNoDupSubStr {
  private static boolean hasDup(char[] chars, int index, int len, char c) {
    int start = index + 1 - len;
    if (start < 0) return false;
    for (int i = start; i <= index; i++) {
      if (c == chars[i]) return true;
    }
    return false;
  }

  public static int solution(String str) {
    if (str == null || str.equals("")) return 0;
    char[] chars = str.toCharArray();
    int[] DP = new int[chars.length];
    DP[0] = 1;
    int result = DP[0];
    for (int i = 1; i < chars.length; i++) {
      DP[i] = hasDup(chars, i-1, DP[i-1], chars[i]) ? 1 : DP[i-1] + 1;
      if (result < DP[i]) result = DP[i];
    }
    return result;
  }
}
