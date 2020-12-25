package zju.lym.algo;

import zju.lym.structure.TreeNode;

/**
 * 二叉搜索树的第K大节点
 * 中序遍历
 */
public class P54_KthTreeNode {
  private TreeNode result;
  private int cnt = 1;
  private void inOrder(TreeNode node, int K) {
    if (node == null || K == 0) return;
    inOrder(node.left, K);
    if (cnt++ == K) {
      result = node;
      return;
    }
    inOrder(node.right, K);
  }

  public TreeNode solution(TreeNode root, int K) {
    inOrder(root, K);
    return result;
  }
}
