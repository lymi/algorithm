package zju.lym.algo;

/**
 * 将字符串中的空格替换为"20%"，时间复杂度O(n)
 * 从后向前替换
 */
public class P05_ReplaceBlank {
  public static String solution(String str) {
    if (str == null) return null;
    char[] chars = str.toCharArray();
    int numOfBlank = 0;
    for (char c : chars) {
      if (c == ' ') numOfBlank++;
    }
    char[] newChars = new char[chars.length + 2 * numOfBlank];
    int i = chars.length - 1, j = newChars.length - 1;
    while (i >= 0) {
      if (chars[i] != ' ') {
        newChars[j--] = chars[i--];
      } else {
        i--;
        newChars[j--] = '0';
        newChars[j--] = '2';
        newChars[j--] = '%';
      }
    }
    return new String(newChars);
  }
}
