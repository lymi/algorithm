package zju.lym.algo;

import zju.lym.structure.TreeNode;

/**
 * 判二叉树是否是对称二叉树
 * 即判断二叉树与其本身是否对称
 * 若二叉树root1与root2对称，则root1.left与root2.right对称，
 * 且root1.right与root2.left对称
 */
public class P28_IsSymmetricalTree {
  private static boolean isSymmetrical(TreeNode root1, TreeNode root2) {
    if (root1 == null && root2 == null) return true;
    if (root1 == null || root2 == null) return false;
    if (root1.value != root2.value) return false;
    return isSymmetrical(root1.left, root2.right) &&
           isSymmetrical(root1.right, root2.left);
  }

  public static boolean solution(TreeNode root) {
    return isSymmetrical(root, root);
  }
}
