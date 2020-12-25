package zju.lym.algo;

/**
 * 和为target的连续正数序列
 */
public class P57_FindSequence {
  public static void solution(int target) {
    int low = 1, high = 2;
    while (low < high) {
      if (getSum(low, high) > target) {
        low++;
      } else if (getSum(low, high) < target) {
        high++;
      } else {
        print(low, high);
        low++;
      }
    }
  }

  private static int getSum(int low, int high) {
    int sum = 0;
    for (int i = low; i <= high; i++) {
      sum += i;
    }
    return sum;
  }

  private static void print(int low, int high) {
    for (int i = low; i <= high; i++) {
      System.out.print(i + " ");
    }
    System.out.println("");
  }


}
