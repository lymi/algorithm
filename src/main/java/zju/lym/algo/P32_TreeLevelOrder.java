package zju.lym.algo;

import zju.lym.structure.TreeNode;

import java.util.LinkedList;

/**
 * 二叉树分层打印
 * 队列实现层序遍历
 * 两个变量currLevelNum和nextLevelNum分别记录当前层剩余节点数和下一层节点数
 * 每读取当前层一个变量，currLevelNum减一，当减为0时分层，并赋予下一层节点数
 */
public class P32_TreeLevelOrder {
  public static void solution(TreeNode root) {
    LinkedList<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int currLevelNum = 1, nextLevelNum = 0;
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node != null) {
        System.out.print(node.value + " ");
        if (node.left != null) {
          queue.offer(node.left);
          nextLevelNum++;
        }
        if (node.right != null) {
          queue.offer(node.right);
          nextLevelNum++;
        }
        if (--currLevelNum == 0) {
          System.out.println();
          currLevelNum = nextLevelNum;
          nextLevelNum = 0;
        }
      }
    }
  }
}
