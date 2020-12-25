package zju.lym.algo;

/**
 * 找到字符流中第一个只出现一次的字符
 * hash数组中记录字符第一次出现的位置
 * 若未出现则为-1，出现超过1次记为-2
 */
public class P50_FirstAppearance {
  private int[] occurrence = new int[256];  // 保存字符第一次出现的位置
  private int index = 0;

  public P50_FirstAppearance() {
    for (int i = 0; i < 256; i++) {
      occurrence[i] = -1;
    }
  }

  public void insert(char c) {
    if (occurrence[c] == -1) {
      occurrence[c] = index;
    } else {
      occurrence[c] = -2;
    }
    index++;
  }

  public char get() {
    int minPos = Integer.MAX_VALUE;
    char result = '\0';
    for (int i = 0; i < 256; i++) {
      if (occurrence[i] >= 0 && minPos > occurrence[i]) {
        result = (char)i;
        minPos = occurrence[i];
      }
    }
    return result;
  }
}
