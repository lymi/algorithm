package zju.lym.algo;

import zju.lym.utils.Utils;

/**
 * 将字符串的所有字符进行全排列
 * 将字符串看作两部分，一部分是第一个字符，另一部分是剩余所有字符，
 * 将第一个字符依次与后面的每个字符交换，并递归剩余部分。
 * 注：加上适当条件还可用于解决八皇后问题
 */
public class P38_Permutation {
  private static void permutation(char[] chars, int begin) {
    if (begin == chars.length - 1) {
      Utils.printArray(chars);
      return;
    }

    for (int i = begin; i < chars.length; i++) {
      Utils.swap(chars, i, begin);
      permutation(chars, begin + 1);
      Utils.swap(chars, i, begin);
    }
  }

  public static void solution(String str) {
    if (str == null) return;
    char[] chars = str.toCharArray();
    permutation(chars, 0);
  }
}
