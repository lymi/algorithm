package zju.lym.algo;

import zju.lym.structure.TreeNode;

/**
 * 二叉树中序遍历的下一个节点
 * 1 当前节点存在右子树，下一节点为右子树的最左子节点
 * 2 当前节点不存在右子树
 *   2.1 当前节点不存在父节点，下一节点为空
 *   2.2 当前或祖先节点是某节点R的左子节点，下一节点为节点R
 *   2.3 当前或祖先节点不是任何节点的左子节点，下一节点为空
 */
public class P08_GetNextNode {
  public static TreeNode solution(TreeNode node) {
    if (node.right != null) {
      TreeNode temp = node.right;
      while (temp.left != null) {
        temp = temp.left;
      }
      return temp;
    }
    while (node.parent != null && node != node.parent.left) {
      node = node.parent;
    }
    return node.parent;
  }
}
