package zju.lym.structure;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {
  public TreeNode left;
  public TreeNode right;
  public TreeNode parent;
  public int value;

  @Override
  public String toString() {
    return "TreeNode {value: " + value + "}";
  }
}
