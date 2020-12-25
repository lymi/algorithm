package zju.lym.algo;

import zju.lym.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的序列化与反序列化
 * 序列化：前序遍历，空子节点用$标记
 * 反序列化：将序列化的字符串还原成二叉树，遇到$返回null，否则返回树节点
 */
public class P37_TreeDeserialize {
  private static void serialize(TreeNode root, List<String> list) {
    if (root == null)  {
      list.add("$,");
      return;
    }
    list.add(root.value + ",");
    serialize(root.left, list);
    serialize(root.right, list);
  }

  public static String serialize(TreeNode root) {
    if (root == null) return null;
    List<String> list = new ArrayList<>();
    serialize(root, list);
    StringBuilder sb = new StringBuilder();
    list.forEach(sb::append);
    String result = sb.toString();
    return result.substring(0, result.length() - 1);
  }

  private int index = 0;

  private TreeNode deSerialize(String[] arr) {
    if (index == arr.length) return null;
    if (!arr[index].equals("$")) {
      TreeNode node = new TreeNode(null, null, null, Integer.parseInt(arr[index]));
      index++;
      node.left = deSerialize(arr);
      node.right = deSerialize(arr);
      return node;
    } else {
      index++;
      return null;
    }
  }

  public TreeNode deSerialize(String str) {
    if (str == null) return null;
    String[] arr = str.split(",");
    return deSerialize(arr);
  }
}
