package zju.lym.algo;

/**
 * 大数相加，注意进位
 */
public class P17_BigNumAdd {
  public static String solution(String num1, String num2) {
    int M = num1.length(), N = num2.length();
    int K = 1 + Math.max(M, N);
    char[] charArr1 = num1.toCharArray();
    char[] charArr2 = num2.toCharArray();
    char[] result = new char[K];
    int i = M - 1, j = N - 1, k = K - 1, takeOver = 0, sum;
    while (i >= 0 || j >= 0 || takeOver == 1) {
      int a = i >= 0 ? (int)(charArr1[i--] - '0') : 0;
      int b = j >= 0 ? (int)(charArr2[j--] - '0') : 0;
      sum = a + b + takeOver;
      takeOver = 0;
      if (sum >= 10) {
        takeOver = 1;
        sum -= 10;
      }
      result[k--] = (char)(sum + '0');
    }
    return new String(result).trim();
  }
}
