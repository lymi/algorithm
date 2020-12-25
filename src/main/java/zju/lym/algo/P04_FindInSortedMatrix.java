package zju.lym.algo;

/**
 * 二维矩阵，从左到右、从上到下依次增大
 * 查找给定数字是否在矩阵中。
 * 从右上或左下角开始寻找。
 * 1  2  8  9
 * 2  4  9  12
 * 4  7  10 13
 * 6  8  11 15
 */
public class P04_FindInSortedMatrix {
  public static boolean solution(int[][] matrix, int target) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int i = rows - 1, j = 0;
    while (i >= 0 && j < cols) {
      if (matrix[i][j] > target) {
        i--;
      } else if (matrix[i][j] < target) {
        j++;
      } else {
        return true;
      }
    }
    return false;
  }
}
