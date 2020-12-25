package zju.lym.algo;

/**
 * 从小到大输出N个丑数，丑数是只能被2，3，5因数分解的数。
 * 用v2, v3, v5分别记录以2，3，5为因子的下一个最小丑数,
 * 三者的最小值即为下一个丑数
 */
public class P49_UglyNum {
  public static void solution(int N) {
    int[] uglyNums = new int[N];
    uglyNums[0] = 1;
    int i2 = 0, i3= 0, i5 = 0;
    int v2 = 1, v3 = 1, v5 = 1, lastMin = 1;

    for (int i = 1; i < N; i++) {
      while (uglyNums[i2] * 2 <= lastMin) i2++;
      v2 = uglyNums[i2] * 2;
      while (uglyNums[i3] * 3 <= lastMin) i3++;
      v3 = uglyNums[i3] * 3;
      while (uglyNums[i5] * 5 <= lastMin) i5++;
      v5 = uglyNums[i5] * 5;
      lastMin = Math.min(Math.min(v2, v3), v5);
      uglyNums[i] = lastMin;
    }
    for (int num : uglyNums) {
      System.out.print(num + " ");
    }
  }
}
