package zju.lym.algo;

import zju.lym.structure.TreeNode;

/**
 * 判断root2是否是root1的子树
 */
public class P26_HasSubTree {
  public static boolean solution(TreeNode root1, TreeNode root2) {
    if (root2 == null) return true;
    if (root1 == null) return false;
    boolean result = false;
    if (root1.value == root2.value) {
      // 某个节点值相同，再递归判断左右子树是否也相同
      result = solution(root1.left, root2.left) &&
               solution(root1.right, root2.right);
    }
    if (!result) {
      result = solution(root1.left, root2);
    }
    if (!result) {
      result = solution(root1.right, root2);
    }
    return result;
  }
}
