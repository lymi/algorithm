package zju.lym.algo;

/**
 * 判断数组是否是二叉树的后序遍历结果
 * 若是后续遍历结果，则arr[end]是树的根节点
 * 且在start ~ end-1序列中，若某个数字小于arr[end]则之前的数字都小于arr[end]
 * 若某个数字大于arr[end]，则其后的数字都大于arr[end]
 * 递归，若有不满足该条件的则不是后序遍历结果
 */
public class P33_IsPostOrder {
  public static boolean verify(int[] sequence, int start, int end) {
    if (start == end) return true;
    int i = start;
    while (i < end && sequence[i] < sequence[end]) i++;
    int j = i;
    while (j < end) {
      if (sequence[j++] < sequence[end]) return false;
    }
    if (i == start || i == end) return verify(sequence, start, end - 1);
    return verify(sequence, start, i-1) && verify(sequence, i, end - 1);
  }

  public static boolean solution(int[] sequence) {
    if (sequence == null || sequence.length == 0) return false;
    return verify(sequence, 0, sequence.length - 1);
  }
}
