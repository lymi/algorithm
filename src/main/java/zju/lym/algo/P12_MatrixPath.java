package zju.lym.algo;

/**
 * 判断字符矩阵中是否存在构成给定字符串的路径
 * 回溯法
 */
public class P12_MatrixPath {
  private char[][] matrix;
  private boolean[][] visited;
  private char[] chars;
  private int M;
  private int N;

  private boolean hasPathCore(int x, int y, int pos) {
    if (pos >= chars.length) return true;
    boolean result = false;
    if (x >= 0 && x < M && y >= 0 && y < N &&
        !visited[x][y] && matrix[x][y] == chars[pos]) {
      visited[x][y] = true;
      result = hasPathCore(x-1, y, pos + 1) ||
               hasPathCore(x+1, y, pos + 1) ||
               hasPathCore(x, y-1, pos + 1) ||
               hasPathCore(x, y+1, pos + 1);
      if (!result) {
        visited[x][y] = false;
      }
    }

    return result;
  }

  public boolean solution(char[][] matrix, String target) {
    this.M = matrix.length;
    this.N = matrix[0].length;
    this.visited = new boolean[M][N];
    this.matrix = matrix;
    this.chars = target.toCharArray();

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        visited[i][j] = false;
      }
    }

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (hasPathCore(i, j, 0)) {
          return true;
        }
      }
    }

    return false;
  }
}
