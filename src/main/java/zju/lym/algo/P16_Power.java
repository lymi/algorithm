package zju.lym.algo;

/**
 * 求base的exp次幂
 * 需注意exp的符号
 */
public class P16_Power {
  public static double solution(double base, int exp) {
    if (Double.compare(base, 0.0) == 0) return 0;
    int absExp = Math.abs(exp);
    double result = 1.0;
    for (int i = 1; i <= absExp; i++) {
      result *= base;
    }
    if (exp < 0) return 1 / result;
    return result;
  }
}
