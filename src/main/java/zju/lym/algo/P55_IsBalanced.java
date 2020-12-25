package zju.lym.algo;

import zju.lym.structure.TreeNode;

/**
 * 判断二叉树是否是平衡二叉树
 * 平衡二叉树的所有子树都是平衡二叉树，
 * 若从根节点开始计算每棵子树的深度，则包含太多重复计算
 * 故可采用后序遍历，从叶子节点开始计算
 */
public class P55_IsBalanced {
  private static class TreeInfo {
    public boolean balance;
    public int depth;
  }

  private static TreeInfo isBalance(TreeNode node) {
    TreeInfo info = new TreeInfo();
    info.depth = 0;
    info.balance = true;
    if (node == null) return info;
    info.balance = false;

    TreeInfo leftInfo = isBalance(node.left);
    TreeInfo rightInfo = isBalance(node.right);

    info.depth = 1 + Math.max(leftInfo.depth, rightInfo.depth);
    if (leftInfo.balance && rightInfo.balance &&
        Math.abs(leftInfo.depth - rightInfo.depth) <= 1) {
      info.balance = true;
    }

    return info;
  }

  public static boolean solution(TreeNode root) {
    return isBalance(root).balance;
  }
}
