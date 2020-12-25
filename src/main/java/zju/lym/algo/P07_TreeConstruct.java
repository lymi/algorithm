package zju.lym.algo;

import zju.lym.structure.TreeNode;

/**
 * 根据前序和中序数组重建二叉树，不能有重复数值
 */
public class P07_TreeConstruct {
  private static TreeNode constructCore(int[] preOrderArr, int[] inOrderArr, TreeNode parent,
                                        int preStart, int preEnd, int inStart, int inEnd) {
    int rootValue = preOrderArr[preStart];

    TreeNode root = new TreeNode(null, null, null, rootValue);
    root.parent = parent;

    if (preStart == preEnd) {
      if (inStart == inEnd && preOrderArr[preStart] == inOrderArr[inStart]) {
        return root;
      }
      return null;
    }
    int inOrderRootIndex = inStart;
    while (inOrderRootIndex <= inEnd && inOrderArr[inOrderRootIndex] != rootValue) {
      inOrderRootIndex++;
    }
    if (inOrderRootIndex > inEnd) {
      System.out.println("ERROR:: Invalid Input!");
      return null;
    }
    int leftLen = inOrderRootIndex - inStart;
    int rightLen = inEnd - inOrderRootIndex;
    if (leftLen > 0) {
      root.left = constructCore(preOrderArr, inOrderArr, root,
          preStart+1, preStart+leftLen, inStart, inOrderRootIndex-1);
    }
    if (rightLen > 0) {
      root.right = constructCore(preOrderArr, inOrderArr, root,
          preStart + leftLen + 1, preEnd, inOrderRootIndex+1, inEnd);
    }
    return root;
  }

  public static TreeNode solution(int[] preOrderArr, int[] inOrderArr) {
    if (preOrderArr == null || inOrderArr == null ||
        inOrderArr.length == 0 || preOrderArr.length != inOrderArr.length) {
      return null;
    }
    int N = preOrderArr.length;
    return constructCore(preOrderArr,inOrderArr, null, 0, N-1, 0, N-1);
  }
}
