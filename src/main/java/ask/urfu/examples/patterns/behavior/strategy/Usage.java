package ask.urfu.examples.patterns.behavior.strategy;

import static ask.urfu.examples.patterns.behavior.strategy.Sorter.bubbleSort;

import java.util.Arrays;
import java.util.List;

/**
 * How to use Strategy pattern
 */
public class Usage {

  public static void main(String[] args) {
    // different orderings
    List<Integer> ints = Arrays.asList(
        10, 9, 8, 7, 6, 5, 4, 3, 2, 1
    );
    System.out.println("Before sorting");
    System.out.println(ints);

    // looks ugly
    List<Integer> sortedInts = new Sorter<Integer, Integer>(i -> i, Ordering.ASC).bubbleSort(ints);
    System.out.println("After ASC sorting");
    System.out.println(sortedInts);

    // looks prettier
    System.out.println("After DESC sorting");
    sortedInts = bubbleSort(sortedInts, i -> i, Ordering.DESC);
    System.out.println(sortedInts);

    // different extractors
    List<NamedValue<Integer>> romanDigits = Arrays.asList(
        new NamedValue<>("I", 1),
        new NamedValue<>("V", 5),
        new NamedValue<>("X", 10),
        new NamedValue<>("C", 100),
        new NamedValue<>("M", 1000)
    );
    System.out.println("Before sorting");
    System.out.println(romanDigits);

    List<NamedValue<Integer>> sorted = bubbleSort(romanDigits, NamedValue::name, Ordering.ASC);
    System.out.println("After sorting by names");
    System.out.println(sorted);

    // old-style extractor, equivalent to NamedValue::value
    sorted = bubbleSort(sorted, new ValueExtractor<>(), Ordering.ASC);
    System.out.println("After sorting by values");
    System.out.println(sorted);
  }

}
