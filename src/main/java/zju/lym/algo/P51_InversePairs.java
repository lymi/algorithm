package zju.lym.algo;

/**
 * 求数组中的逆序对总数，若某个数字m大于后面的数字n，则(m,n)构成逆序对
 * 思路: 数组进行归并排序，归并过程中若leftArr[i] > rightArr[j],
 *       则leftArr[i]及其后的所有值均与arrRight[j]构成逆序对
 */
public class P51_InversePairs {
  private static int inversePairsCnt = 0;

  private static int[] merge(int[] leftArr, int[] rightArr) {
    int[] target = new int[leftArr.length + rightArr.length];
    int i = 0, j = 0, index = 0;
    while (i < leftArr.length && j < rightArr.length) {
      if (leftArr[i] <= rightArr[j]) {
        target[index++] = leftArr[i++];
      } else {
        inversePairsCnt += (leftArr.length - i);
        target[index++] = rightArr[j++];
      }
    }
    while (i < leftArr.length) target[index++] = leftArr[i++];
    while (j < rightArr.length) target[index++] = leftArr[j++];
    return target;
  }

  public static int[] mergeSort(int[] source, int low, int high) {
    if (low == high) return new int[]{source[low]};
    int middle = (low + high) >> 1;
    return merge(mergeSort(source, low, middle), mergeSort(source, middle+1, high));
  }

  public static int solution(int[] source) {
    mergeSort(source, 0, source.length-1);
    return inversePairsCnt;
  }
}
