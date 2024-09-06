package ask.urfu.examples.patterns.behavior.iterator;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.Random;

/**
 * How to use Iterator pattern
 *
 * @see java.util.Iterator
 */
public class Usage {

  public static void main(String[] args) {
    // classic collection-iterator
    Iterable<String> strings = new MyCollection<>("Alpha", "Beta", "Gamma", "Delta");
    MyCollectionIterator<String> iterator = strings.getIterator();
    while (!iterator.isDone()) {
      System.out.println(iterator.next());
    }
    // iterator without collection
    Random random = new Random(LocalDateTime.now().get(ChronoField.MILLI_OF_DAY));
    RandomSequence<Integer> ints = new RandomSequence<>(() -> random.nextInt(1, 10), 5);
    while (!ints.isDone()) {
      System.out.println(ints.next());
    }
  }

}
