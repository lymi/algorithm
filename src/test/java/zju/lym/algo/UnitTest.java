package zju.lym.algo;

import org.junit.Test;
import zju.lym.structure.ListNode;
import zju.lym.structure.TreeNode;
import zju.lym.utils.Utils;

import java.util.List;

public class UnitTest {
  @Test
  public void testMaxProfit() {
    int[] arr = {9,111,8,5,7,12,16,14};
    System.out.println(P63_MaxProfit.solution(arr));
  }

  @Test
  public void testIsContinuous() {
    int[] arr1 = {0,0,0,0,0};
    int[] arr2 = {2,0,5,3,4};
    int[] arr3 = {5,4,3,2,2};
    int[] arr4 = {7,0,3,6,5};
    int[] arr5 = {7,0,2,6,5};
    System.out.println(P61_IsContinuous.solution(arr1));
    System.out.println(P61_IsContinuous.solution(arr2));
    System.out.println(P61_IsContinuous.solution(arr3));
    System.out.println(P61_IsContinuous.solution(arr4));
    System.out.println(P61_IsContinuous.solution(arr5));
  }

  @Test
  public void testProbability() {
    P60_PrintProbability.solution(3);
  }

  @Test
  public void testLeftRotateString() {
    System.out.println(P58_LeftRotateString.solution("abcdefg", 2));
  }

  @Test
  public void testReverseSentence() {
    System.out.println(P58_ReverseSentence.solution("I am a student."));
  }

  @Test
  public void testFindSequence() {
    P57_FindSequence.solution(15);
  }

  @Test
  public void testFindNumsWithSum() {
    int[] data = {1,2,4,7,11,15};
    int[] result = P57_FindNumsWithSum.solution(data, 15);
    Utils.printArray(result);
  }

  @Test
  public void testIsBalance() {
    int[] preOrder = {1,2,4,8,9,5,3,6,7};
    int[] inOrder = {8,4,9,2,5,1,6,3,7};
    TreeNode root = P07_TreeConstruct.solution(preOrder, inOrder);
    System.out.println(P55_IsBalanced.solution(root));
  }

  @Test
  public void testTreeDepth() {
    int[] preOrder = {1,2,4,5,7,3,6};
    int[] inOrder = {4,2,7,5,1,3,6};
    TreeNode root = P07_TreeConstruct.solution(preOrder, inOrder);
    System.out.println(P55_TreeDepth.solution(root));
  }

  @Test
  public void testKthTreeNode() {
    int[] preOrder = {5,3,2,4,7,6,8};
    int[] inOrder = {2,3,4,5,6,7,8};
    TreeNode root = P07_TreeConstruct.solution(preOrder, inOrder);
    P54_KthTreeNode testObj = new P54_KthTreeNode();
    System.out.println(testObj.solution(root, 3));
  }

  @Test
  public void testFindMissingNum() {
    int[] arr1 = {1,2,3,4,5,6,7,8};
    int[] arr2 = {0,1,2,4,5,6,7,8};
    System.out.println(P53_FindMissingNum.solution(arr1));
    System.out.println(P53_FindMissingNum.solution(arr2));
  }

  @Test
  public void testTimesOfK() {
    int[] arr = {1,2,3,3,3,3,3,4,5};
    System.out.println(P53_TimesOfK.solution(arr, 3));
  }

  @Test
  public void testFirstCommonNode() {
    ListNode list1 = Utils.genLinkedList(5, 1, 1);
    ListNode list2 = Utils.genLinkedList(3, 6, 1);
    ListNode list3 = Utils.genLinkedList(3, 9, 1);
    ListNode tail1 = list1, tail2 = list2;
    assert tail1 != null;
    while (tail1.next != null) tail1 = tail1.next;
    assert tail2 != null;
    while (tail2.next != null) tail2 = tail2.next;
    tail1.next = list3;
    tail2.next = list3;
    ListNode firstCommonNode = P52_FirstCommonNode.solution(list1, list2);
    System.out.print(firstCommonNode.value);
  }

  @Test
  public void testInversePairs() {
    int[] testArr = {7,5,6,4};
    System.out.println(P51_InversePairs.solution(testArr));
  }

  @Test
  public void testFirstAppearance() {
    P50_FirstAppearance testObj = new P50_FirstAppearance();
    String str = "google";
    for (int i = 0; i < str.length(); i++) {
      testObj.insert(str.charAt(i));
    }
    System.out.println(testObj.get());
  }

  @Test
  public void testFirstNoRepeat() {
    System.out.println(P50_FirstNoRepeat.solution("abaccdef"));
  }

  @Test
  public void testUglyNum() {
    P49_UglyNum.solution(100);
  }

  @Test
  public void testLongestNoDupSubStr() {
    System.out.println(P48_LongestNoDupSubStr.solution("abcdefedde"));
  }

  @Test
  public void testMaxValuePath() {
    int[][] matrix = {
      {1,10,3,8},
      {12,2,9,6},
      {5,7,4,11},
      {3,7,16,5}
    };
    System.out.println(P47_MaxGiftValue.solution(matrix));
  }

  @Test
  public void testMaxInWindow() {
    int[] arr = {2,3,4,2,6,2,5,1};
    System.out.println(P59_MaxInWindow.solution1(arr, 3));
    System.out.println(P59_MaxInWindow.solution2(arr, 3));
  }

  @Test
  public void testTranslationCount() {
    System.out.println(P46_TranslationCount.solution(12258));
  }

  @Test
  public void testCombineMinNum() {
    int[] arr = {3,32,321};
    System.out.println(P45_CombineMinNum.solution(arr));
  }

  @Test
  public void testDigitAtIndex() {
    System.out.println(P44_DigitAtIndex.solution(0));
    System.out.println(P44_DigitAtIndex.solution(13));
    System.out.println(P44_DigitAtIndex.solution(19));
    System.out.println(P44_DigitAtIndex.solution(1001));
  }

  @Test
  public void testSubArrMaxSum() {
    int[] arr = {1,-2,3,10,-4,7,2,-5};
    System.out.println(P42_SubArrMaxSum.solution(arr));
  }

  @Test
  public void testDataStreamMedium() {
    int[] data = {4,5,1,6,2,7,3,8,9};
    P41_DataStreamMedium dataStreamMedium = new P41_DataStreamMedium();
    for (int num : data) {
      dataStreamMedium.insert(num);
    }
    System.out.println(dataStreamMedium.getMedium());
  }

  @Test
  public void testGetLeastKNums() {
    int[] arr = {4,5,1,6,2,7,3,8};
    System.out.println(P40_GetLeastKNums.solution1(arr, 5));
    System.out.println(P40_GetLeastKNums.solution2(arr, 5));
  }

  @Test
  public void testMoreThanHalfNum() {
    int[] arr = {1,2,3,2,2,2,5,4,2};
    System.out.println(P39_MoreThanHalfNum.solution(arr));
  }

  @Test
  public void testPermutation() {
    P38_Permutation.solution("abcd");
  }

  @Test
  public void testTreeDeserialize() {
    int[] preOrder = {1,2,4,3,5,6};
    int[] inOrder = {4,2,1,5,3,6};
    TreeNode root = P07_TreeConstruct.solution(preOrder, inOrder);
    String str = P37_TreeDeserialize.serialize(root);
    System.out.println(str);
    TreeNode result = new P37_TreeDeserialize().deSerialize(str);
    Utils.printTreePreOrder(result);
  }

  @Test
  public void testConvertTreeToList() {
    int[] preOrder = {10,6,4,8,14,12,16};
    int[] inOrder = {4,6,8,10,12,14,16};
    TreeNode root = P07_TreeConstruct.solution(preOrder, inOrder);
    TreeNode head = new P36_ConvertTreeToList().solution(root);
    while (head != null) {
      System.out.print(head.value + " ");
      head = head.right;
    }
  }

  @Test
  public void testTreePathToSum() {
    int[] preOrder = {10,5,4,7,12};
    int[] inOrder = {4,5,7,10,12};
    TreeNode root = P07_TreeConstruct.solution(preOrder, inOrder);
    P34_TreePathToSum.solution(root, 22);
  }

  @Test
  public void testIsPostOrder() {
    int[] sequence1 = {5,7,6,9,11,10,8};
    int[] sequence2 = {7,4,6,5};
    System.out.println(P33_IsPostOrder.solution(sequence1));
    System.out.println(P33_IsPostOrder.solution(sequence2));
  }

  @Test
  public void testTreeLevelOrder() {
    int[] preOrder = {8,6,5,7,10,9,11};
    int[] inOrder = {5,6,7,8,9,10,11};
    TreeNode root = P07_TreeConstruct.solution(preOrder, inOrder);
    P32_TreeLevelOrder.solution(root);
  }

  @Test
  public void testIsPopOrder() {
    int[] pushOrder = {1,2,3,4,5,6};
    int[] popOrder = {4,6,5,3,2,1};
    System.out.println(P31_IsStackPopOrder.solution(pushOrder, popOrder));
  }

  @Test
  public void testStackWithMin() {
    P30_StackWithMin testObj = new P30_StackWithMin();
    testObj.push(2);
    testObj.push(4);
    System.out.println(testObj.min());
    testObj.push(1);
    System.out.println(testObj.min());
    testObj.pop();
    System.out.println(testObj.min());
  }

  @Test
  public void testPrintClockWisely() {
    int[][] matrix = {
      {1,  2,  3,  4},
      {5,  6,  7,  8},
      {9,  10, 11, 12},
      {13, 14, 15, 16},
    };
    P29_PrintClockWisely.solution(matrix);
  }

  @Test
  public void testIsSymmetricalTree() {
    int[] preOrder1 = {8,6,5,7,6,7,5};
    int[] inOrder1 = {5,6,7,8,7,6,5};
    TreeNode root1 = P07_TreeConstruct.solution(preOrder1, inOrder1);
    System.out.println(P28_IsSymmetricalTree.solution(root1));
    int[] preOrder2 = {8,6,5,7,9,7,5};
    int[] inOrder2 = {5,6,7,8,7,9,5};
    TreeNode root2 = P07_TreeConstruct.solution(preOrder2, inOrder2);
    System.out.println(P28_IsSymmetricalTree.solution(root2));
  }

  @Test
  public void testMirrorTree() {
    int[] preOrder = {1,2,4,7,3,5,6,8};
    int[] inOrder = {4,7,2,1,5,3,8,6};
    TreeNode tree = P07_TreeConstruct.solution(preOrder, inOrder);
    Utils.printTreePreOrder(tree);
    System.out.println();
    TreeNode mirroredTree = P27_MirrorTree.solution(tree);
    Utils.printTreePreOrder(mirroredTree);
  }

  @Test
  public void testHasSubTree() {
    int[] preOrder1 = {1,2,4,7,3,5,6,8};
    int[] inOrder1 = {4,7,2,1,5,3,8,6};
    TreeNode tree1 = P07_TreeConstruct.solution(preOrder1, inOrder1);
    int[] preOrder2 = {2,4,3};
    int[] inOrder2 = {4,3,2};
    TreeNode tree2 = P07_TreeConstruct.solution(preOrder2, inOrder2);
    System.out.println(P26_HasSubTree.solution(tree1, tree2));
  }

  @Test
  public void testMergeLinkedList() {
    ListNode head1 = Utils.genLinkedList(5, 1, 2);
    ListNode head2 = Utils.genLinkedList(5, 2, 2);
    Utils.printList(head1);
    Utils.printList(head2);
    ListNode result = P25_MergeLinkedList.solution(head1, head2);
    System.out.println("After Merged: ");
    Utils.printList(result);
  }

  @Test
  public void testReverseList() {
    ListNode head = Utils.genLinkedList(10, 1, 1);
    Utils.printList(head);
    ListNode reversedHead = P24_ReverseList.solution(head);
    Utils.printList(reversedHead);
  }

  @Test
  public void testEntryOfRing() {
    ListNode head = Utils.genLinkedList(5,1,1);
    assert head != null;
    assert P23_EntryOfRing.solution(head) == null;
    head.next.next.next.next.next = head.next.next;
    System.out.println(P23_EntryOfRing.solution(head));
  }

  @Test
  public void testFindKthToTail() {
    ListNode head = Utils.genLinkedList(10, 1, 1);
    ListNode result = P22_FindKthToTail.solution(head, 3);
    System.out.println(result);
  }

  @Test
  public void testReOrder() {
    int[] arr = {1,2,3,4,5,6,7,8,8};
    P21_ReOrderOddEven.solution(arr);
    Utils.printArray(arr);
  }

  @Test
  public void testDeleteListNode() {
    ListNode head = Utils.genLinkedList(5,1,1);
    Utils.printList(P18_DeleteListNode.solution(head, head));
    head = Utils.genLinkedList(5,1,1);
    assert head != null;
    Utils.printList(P18_DeleteListNode.solution(head, head.next.next));
    head = Utils.genLinkedList(5,1,1);
    assert head != null;
    Utils.printList(P18_DeleteListNode.solution(head, head.next.next.next.next));
    head = Utils.genLinkedList(1,0,1);
    Utils.printList(P18_DeleteListNode.solution(head, head));
  }

  @Test
  public void testBigNumAdd() {
    System.out.println(P17_BigNumAdd.solution("12", "99"));
    System.out.println(P17_BigNumAdd.solution("12343242424242", "31412341234124"));
  }

  @Test
  public void testPrintOneToMax() {
    P17_PrintOneToMax.solution1(3);
  }

  @Test
  public void testPower() {
    System.out.println(P16_Power.solution(0.0, 3));
    System.out.println(P16_Power.solution(3.0, 0));
    System.out.println(P16_Power.solution(3.1, 3));
    System.out.println(P16_Power.solution(3.2, -2));
  }

  @Test
  public void testNumOfOne() {
    System.out.println(P15_NumOfOne.solution(16));
    System.out.println(P15_NumOfOne.solution(10));
    System.out.println(P15_NumOfOne.solution(7));
  }

  @Test
  public void testCutRope() {
    System.out.println(P14_CutRope.solution(8));
  }

  @Test
  public void testMatrixPath() {
    char[][] matrix = new char[][]{
      {'a', 'b', 't', 'g'},
      {'c', 'f', 'c', 's'},
      {'j', 'd', 'e', 'h'}
    };
    P12_MatrixPath testObj = new P12_MatrixPath();
    System.out.println(testObj.solution(matrix, "bfce"));
    System.out.println(testObj.solution(matrix, "abfb"));
  }

  @Test
  public void testMinInRotateArray() {
    int[] arr1 = {3,4,5,6,1,2};
    int[] arr2 = {1,2,3,4,5,6};
    int[] arr3 = {1,1,1,0,1};
    System.out.println(P11_MinInRotateArray.solution(arr1));
    System.out.println(P11_MinInRotateArray.solution(arr2));
    System.out.println(P11_MinInRotateArray.solution(arr3));
  }

  @Test
  public void testFibonacci() {
    System.out.println(P10_Fibonacci.solution(10));
  }

  @Test
  public void testCQueue() {
    P09_CQueue queue = new P09_CQueue();
    queue.append(1);
    queue.append(2);
    queue.append(3);
    System.out.println(queue.remove());
    queue.append(4);
    System.out.println(queue.remove());
    System.out.println(queue.remove());
    queue.append(5);
    System.out.println(queue.remove());
    System.out.println(queue.remove());
  }

  @Test
  public void testGetNextNode() {
    int[] preOrder = {8,4,3,6,5,7,10,9,11};
    int[] inOrder = {3,4,5,6,7,8,9,10,11};
    TreeNode root = P07_TreeConstruct.solution(preOrder, inOrder);
    TreeNode node1 = root.left.left;
    TreeNode node2 = root.left.right.right;
    TreeNode node3 = root.left;
    TreeNode node4 = root.right.right;
    System.out.println(P08_GetNextNode.solution(node1));
    System.out.println(P08_GetNextNode.solution(node2));
    System.out.println(P08_GetNextNode.solution(node3));
    System.out.println(P08_GetNextNode.solution(node4));
    System.out.println(P08_GetNextNode.solution(root));
  }

  @Test
  public void testTreeConstruct() {
    int[] preOrder = {1,2,4,7,3,5,6,8};
    int[] inOrder = {4,7,2,1,5,3,8,6};
    TreeNode root = P07_TreeConstruct.solution(preOrder, inOrder);
    Utils.printTreePreOrder(root);
    System.out.println();
    int[] preOrder2 = {2,4,3};
    int[] inOrder2 = {4,7,3};
    TreeNode root2 = P07_TreeConstruct.solution(preOrder2, inOrder2);
    Utils.printTreePreOrder(root2);
  }

  @Test
  public void testPrintListReverse() {
    ListNode head = Utils.genLinkedList(7, 1, 2);
    P06_PrintListReverse.solution(head);
  }

  @Test
  public void testReplaceBlank() {
    System.out.println(P05_ReplaceBlank.solution("Hello World !"));
  }

  @Test
  public void testFindInSortedMatrix() {
    int[][] matrix = {
        {1,2,8,9},
        {2,4,9,12},
        {4,7,10,13},
        {6,8,11,15}
    };
    System.out.println(P04_FindInSortedMatrix.solution(matrix, 7));
    System.out.println(P04_FindInSortedMatrix.solution(matrix, 14));
  }

  @Test
  public void testFindAllDuplicates() {
    int[] arr1 = {2,3,1,0,2,5,3};
    int[] arr2 = {2,2,2,2,2};
    System.out.println(P03_FindAllDuplicates.solution(arr1));
    System.out.println(P03_FindAllDuplicates.solution(arr2));
  }

  @Test
  public void testFindAnyDuplicate() {
    int[] arr1 = {2,3,5,4,3,2,6,7};
    int[] arr2 = {5,4,3,1,6,7,8,4,2};
    int[] arr3 = {2,2,2,2,2};
    System.out.println(P03_FindAnyDuplicate.solution(arr1));
    System.out.println(P03_FindAnyDuplicate.solution(arr2));
    System.out.println(P03_FindAnyDuplicate.solution(arr3));
  }

  @Test
  public void testQuickSort() {
    int[] arr1 = {3,1,7,5,6,9,0,6,3,10,13,4,8};
    Utils.quickSort(arr1);
    Utils.printArray(arr1);
    int[] arr2 = {5,4,3,2,1};
    Utils.quickSort(arr2);
    Utils.printArray(arr2);
  }
}
