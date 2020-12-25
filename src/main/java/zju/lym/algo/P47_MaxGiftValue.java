package zju.lym.algo;

/**
 * m*n矩阵中每个放置价值大于0的礼物，从(0,0)移动到(m-1,n-1)，
 * 只能向右或向下移动，一次移动一格，求能够获得礼物的最大值。
 * 动态规划
 * DP[i][j]表示到达坐标(i,j)能够获取礼物的最大值
 * DP[i][j] = max(DP[i-1][j], DP[i][j-1]) + matrix[i][j]
 */
public class P47_MaxGiftValue {
  public static int solution(int[][] matrix) {
    int M = matrix.length;
    if (M == 0) return 0;
    int N = matrix[0].length;
    int[][] DP = new int[M][N];
    DP[0][0] = matrix[0][0];

    for (int i = 1; i < M; i++) {
      DP[i][0] = DP[i-1][0] + matrix[i][0];
    }

    for (int j = 1; j < N; j++) {
      DP[0][j] = DP[0][j-1] + matrix[0][j];
    }

    for (int i = 1; i < M; i++) {
      for (int j = 1; j < N; j++) {
        DP[i][j] = Math.max(DP[i-1][j], DP[i][j-1]) + matrix[i][j];
      }
    }
    return DP[M-1][N-1];
  }
}
