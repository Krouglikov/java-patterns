package ask.urfu.examples.patterns.behavior.iterator;

/**
 * Some funny collection. Concrete aggregate.
 *
 * @param <T> element type
 */
public class MyCollection<T> implements Iterable<T> {

  T first;

  T second;

  T third;

  public MyCollection(T... elements) {
    if (elements == null) {
      return;
    }
    if (elements.length > 0) {
      first = elements[0];
    }
    if (elements.length > 1) {
      second = elements[1];
    }
    if (elements.length > 2) {
      third = elements[2];
    }
  }

  @Override
  public MyCollectionIterator<T> getIterator() {
    return new MyCollectionIterator<>(this);
  }

}
