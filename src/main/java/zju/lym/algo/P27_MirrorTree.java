package zju.lym.algo;

import zju.lym.structure.TreeNode;

/**
 * 获取给定二叉树的镜像
 */
public class P27_MirrorTree {
  public static TreeNode solution(TreeNode root) {
    if (root == null) return null;
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;
    solution(root.left);
    solution(root.right);
    return root;
  }
}
