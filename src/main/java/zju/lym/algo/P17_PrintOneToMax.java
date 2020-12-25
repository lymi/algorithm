package zju.lym.algo;

import zju.lym.utils.Utils;

/**
 * 打印1~N的所有整数，N可能非常大
 * 方法1: 模拟加法运算，从1一直加到N
 * 方法2: 1~N的每位数字在0~9间进行全排列
 */
public class P17_PrintOneToMax {
  // 模拟加法运算
  public static void solution1(int N) {
    char[] number = new char[N];
    for (int i = 0; i < N; i++) {
      number[i] = '0';
    }
    while (!increment(number)) {
      Utils.printNum(number);
    }
  }

  private static boolean increment(char[] number) {
    boolean isOverFlow = false;
    int i = number.length - 1;
    int takeOver = 0;

    while (i >= 0) {
      int nSum = number[i] - '0' + takeOver;
      if (i == number.length - 1) nSum++;
      if (nSum >= 10) {
        if (i == 0) {
          isOverFlow = true;
        } else {
          takeOver = 1;
          nSum -= 10;
          number[i] = (char)(nSum + '0');
        }
      } else {
        number[i] = (char)(nSum + '0');
        break;
      }
      i--;
    }

    return isOverFlow;
  }

  // 全排列
  public static void solution2(int N) {
    char[] number = new char[N];
    for (int i = 0; i < N; i++) {
      number[i] = '0';
    }
    printOneToMaxRecursively(number, 0);
  }

  private static void printOneToMaxRecursively(char[] number, int index) {
    if (index >= number.length) {
      Utils.printNum(number);
      return;
    }

    for (int i = 0; i < 10; i++) {
      number[index] = (char)(i + '0');
      printOneToMaxRecursively(number, index + 1);
    }
  }
}

