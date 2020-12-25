package zju.lym.algo;

/**
 * 数字以0123456789101112231415...的格式序列化为字符串
 * 求序列中第n位对应的数字，如第5位是5，第19位是4
 */
public class P44_DigitAtIndex {
  /**
   * 获取给定位数的数字在序列中占有的总位数
   * 如二位数有90个，共占180位
   */
  public static int getCntOfDigit(int digit) {
    if (digit == 1) return 10;
    return 9 * digit * (int)Math.pow(10, digit-1);
  }

  /**
   * 获取给定位数的第一个数字的首位在序列中的位置
   * 如三位数的首位数字1在序列中下标为190
   */
  public static int getFirstPosOfDigit(int digit) {
    if (digit == 1) return 0;
    return getFirstPosOfDigit(digit-1) + getCntOfDigit(digit-1);
  }

  /**
   * 获取给定位数的第一个数字
   * 如三位数第一个数字100
   */
  private static int getFirstValueOfDigit(int digit) {
    if (digit == 1) return 0;
    return (int)Math.pow(10, digit-1);
  }

  public static int solution(int index) {
    if (index < 0) return -1;
    int digit = 1;
    while (index >= getFirstPosOfDigit(digit)) digit++;
    digit--;
    int pos = getFirstPosOfDigit(digit);
    int num = getFirstValueOfDigit(digit);
    while (index >= pos) {
      pos += digit;
      num++;
    }
    pos -= digit;
    num--;
    int offset = index - pos;
    return Integer.toString(num).toCharArray()[offset] - '0';
  }
}
