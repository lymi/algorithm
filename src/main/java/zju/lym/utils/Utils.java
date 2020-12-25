package zju.lym.utils;

import zju.lym.structure.ListNode;
import zju.lym.structure.TreeNode;

public class Utils {
  public static int partition(int[] arr, int low, int high) {
    int v = arr[low], i = low, j = high;
    while (i < j) {
      while (i < j && arr[j] >= v) j--;
      arr[i] = arr[j];
      while (i < j && arr[i] <= v) i++;
      arr[j] = arr[i];
    }
    arr[i] = v;
    return i;
  }

  private static void sort(int[] arr, int low, int high) {
    if (low >= high) return;
    int pivot = partition(arr, low, high);
    sort(arr, low, pivot);
    sort(arr, pivot+1, high);
  }

  public static void quickSort(int[] arr) {
    sort(arr, 0, arr.length-1);
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void swap(char[] arr, int i, int j) {
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void printArray(int[] arr) {
    if (arr == null || arr.length == 0) return;
    for (int num: arr) {
      System.out.print(num + " ");
    }
    System.out.println("");
  }

  public static void printArray(char[] arr) {
    if (arr == null || arr.length == 0) return;
    for (char num: arr) {
      System.out.print(num + " ");
    }
    System.out.println("");
  }

  public static void printTreePreOrder(TreeNode root) {
    if (root == null) return;
    System.out.print(root.value + " ");
    printTreePreOrder(root.left);
    printTreePreOrder(root.right);
  }

  public static void printNum(char[] num) {
    boolean begin = false;
    for (char c : num) {
      if (!begin && c != '0') {
        begin = true;
      }
      if (begin) {
        System.out.print(c);
      }
    }
    System.out.println("");
  }

  public static void printList(ListNode node) {
    while (node != null) {
      System.out.print(node.value);
      if (node.next != null) {
        System.out.print("->");
      }
      node = node.next;
    }
    System.out.println("");
  }

  public static ListNode genLinkedList(int N, int initVal, int gap) {
    if (N <= 0) return null;
    return new ListNode(genLinkedList(N-1, initVal + gap, gap), initVal);
  }
}
