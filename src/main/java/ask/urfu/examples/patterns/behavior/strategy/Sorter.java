package ask.urfu.examples.patterns.behavior.strategy;

import java.util.Arrays;
import java.util.List;

/**
 * Context
 */
public class Sorter<T, K extends Comparable<K>> {

  // strategy
  private final Extractor<T, K> extractor;

  // strategy
  private final Ordering order;

  public Sorter(Extractor<T, K> extractor, Ordering order) {
    this.extractor = extractor;
    this.order = order;
  }

  /**
   * Convenience version
   */
  public static <T, K extends Comparable<K>> List<T> bubbleSort(
      List<T> original,
      Extractor<T, K> extractor,
      Ordering order) {
    return new Sorter<>(extractor, order).bubbleSort(original);
  }

  /**
   * Bubble sort
   */
  public List<T> bubbleSort(List<T> original) {
    T[] src = (T[]) original.toArray();
    int length = src.length;
    for (int i = 1; i < length; i++) {
      for (int j = i; j > 0; j--) {
        K aKey = extractor.extractKey(src[j - 1]);
        K bKey = extractor.extractKey(src[j]);
        // if [j-1] should follow [i]
        if (order.follows(aKey, bKey)) {
          // swap
          T tmp = src[j];
          src[j] = src[j - 1];
          src[j - 1] = tmp;
        }
      }
    }
    return Arrays.asList(src);
  }

}
