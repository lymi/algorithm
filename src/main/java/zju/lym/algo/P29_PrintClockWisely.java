package zju.lym.algo;

/**
 * 顺时针打印矩阵
 * 左上右下四个边界分别为left, top, right, bottom
 * 每打印最上一行, top++
 * 每打印最右一列, right--
 * 每打印最下一行, bottom--
 * 每打印最左一列, left++
 */
public class P29_PrintClockWisely {
  public static void solution(int[][] matrix) {
    if (matrix == null || matrix.length == 0 ||matrix[0].length == 0) return;

    int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;

    while (left <= right && top <= bottom) {
      for (int i = left; i <= right; i++) {
        System.out.print(matrix[top][i] + " ");
      }
      top++;
      for (int i = top; i <= bottom; i++) {
        System.out.print(matrix[i][right] + " ");
      }
      right--;
      for (int i = right; i >= left; i--) {
        System.out.print(matrix[bottom][i] + " ");
      }
      bottom--;
      for (int i = bottom; i >= top; i--) {
        System.out.print(matrix[i][left] + " ");
      }
      left++;
    }
  }
}
