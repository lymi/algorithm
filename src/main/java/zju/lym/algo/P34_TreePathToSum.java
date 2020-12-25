package zju.lym.algo;

import zju.lym.structure.TreeNode;

import java.util.ArrayList;

/**
 * 打印出二叉树中和为给定值的路径
 * 前序遍历，回溯法
 */
public class P34_TreePathToSum {
  private static void printPath(TreeNode node, ArrayList<Integer> path,
                                int expectedNum, int currNum) {
    if (node == null) return;
    int val = node.value;
    currNum += val;
    path.add(val);
    if (currNum == expectedNum) {
      System.out.println(path.toString());
    } else if (currNum < expectedNum) {
      printPath(node.left, path, expectedNum, currNum);
      printPath(node.right, path, expectedNum, currNum);
    }
    path.remove(path.size() - 1);
  }

  public static void solution(TreeNode root, int expectedNum) {
    if (root == null) return;
    ArrayList<Integer> list = new ArrayList<>();
    printPath(root, list, expectedNum, 0);
  }
}

