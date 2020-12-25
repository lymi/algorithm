package zju.lym.algo;

import zju.lym.structure.TreeNode;

/**
 * 将二叉搜索树转化成排序的双向链表
 * 二叉搜索树中序遍历即有序
 * 树的左右子节点引用分别转换成链表的前后指针
 * 转换过程中需要全局变量lastNode记录链表的尾节点
 */
public class P36_ConvertTreeToList {
  private TreeNode lastNode = null;
  private void convert(TreeNode node) {
    if (node == null) return;
    convert(node.left);
    if (lastNode != null) {
      lastNode.right = node;
    }
    node.left = lastNode;
    lastNode = node;
    convert(node.right);
  }

  public TreeNode solution(TreeNode root) {
    if (root == null) return null;
    convert(root);
    TreeNode result = root;
    while (result.left != null) {
      result = result.left;
    }
    return result;
  }
}
