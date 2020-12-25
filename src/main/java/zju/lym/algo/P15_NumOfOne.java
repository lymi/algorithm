package zju.lym.algo;

/**
 * 求num的二进制包含多少个1
 * 循环次数为整型int的位数
 */
public class P15_NumOfOne {
  public static int solution(int num) {
    int flag = 1;
    int cnt = 0;
    while (flag > 0) {  // 左移位溢出后为负值
      if ((num & flag) > 0) cnt++;
      flag = flag << 1;
    }
    return cnt;
  }
}
