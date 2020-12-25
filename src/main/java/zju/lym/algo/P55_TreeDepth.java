package zju.lym.algo;

import zju.lym.structure.TreeNode;

/**
 * 求二叉树深度
 */
public class P55_TreeDepth {
  public static int solution(TreeNode root) {
    if (root == null) return 0;
    return 1 + Math.max(solution(root.left), solution(root.right));
  }
}
