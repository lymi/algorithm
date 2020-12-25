package zju.lym.algo;

/**
 * 将字符串从第位旋转
 */
public class P58_LeftRotateString {
  public static String solution(String str, int n) {
    char[] chars = str.toCharArray();
    P58_ReverseSentence.reverse(chars, 0, n-1);
    P58_ReverseSentence.reverse(chars, n, chars.length-1);
    P58_ReverseSentence.reverse(chars, 0, chars.length-1);
    return new String(chars);
  }
}
