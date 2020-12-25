package zju.lym.algo;

/**
 * 反转句子，单词顺序反转，但单词内字母顺序不反转，空格为单词分隔符
 * 思路: 先整体反转，再针对每个单词反转
 */
public class P58_ReverseSentence {
  public static void reverse(char[] chars, int low, int high) {
    if (chars == null) return;
    while (low < high) {
      char temp = chars[low];
      chars[low] = chars[high];
      chars[high] = temp;
      low++;
      high--;
    }
  }

  public static String solution(String sentence) {
    char[] chars = sentence.toCharArray();
    reverse(chars, 0, chars.length-1);
    int i = 0, j = 0;
    while (j < chars.length) {
      if (chars[i] == ' ') {
        i++;
        j++;
      } else if (chars[j] == ' ') {
        reverse(chars, i, j-1);
        i = j;
      } else {
        j++;
      }
    }
    return new String(chars);
  }
}
