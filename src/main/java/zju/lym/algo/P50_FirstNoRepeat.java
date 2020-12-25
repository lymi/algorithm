package zju.lym.algo;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串中第一个只出现依次的字符
 * hash表记录每个字符出现的次数
 * 时间复杂度O(n)，空间复杂度O(1)
 */
public class P50_FirstNoRepeat {
  public static char solution(String str) {
    if (str == null) return '\0';
    Map<Character, Integer> map = new HashMap<>();
    int cnt = 0;
    for(int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      cnt = map.get(c) == null ? 0 : map.get(c);
      map.put(c, cnt + 1);
    }
    for(int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (map.get(c) == 1) {
        return c;
      }
    }
    return '\0';
  }
}
