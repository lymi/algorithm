package zju.lym.algo;

/**
 * 机器人在M*N的矩阵中移动，不能到达数位之和大于K的格子
 * 求机器人一共能到达多少个格子
 * 回溯法
 */
public class P13_MovingCount {
  private int M;
  private int N;
  private int K;
  private boolean[][] visited;

  public int getDigitSum(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }

  public int movingCountCore(int x, int y) {
    int cnt = 0;
    if (x >= 0 && x < M && y >= 0 && y < N && !visited[x][y] &&
        getDigitSum(x) + getDigitSum(y) < K) {
      visited[x][y] = true;
      cnt = 1 + movingCountCore(x - 1, y) +
                movingCountCore(x + 1, y) +
                movingCountCore(x, y - 1) +
                movingCountCore(x, y + 1);
    }
    return cnt;
  }

  public int solution(int M, int N, int K) {
    this.M = M;
    this.N = N;
    this.K = K;
    this.visited = new boolean[M][N];
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        this.visited[i][j] = false;
      }
    }
    return movingCountCore(0,0);
  }
}
