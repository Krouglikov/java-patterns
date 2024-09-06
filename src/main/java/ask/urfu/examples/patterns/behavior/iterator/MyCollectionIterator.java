package ask.urfu.examples.patterns.behavior.iterator;

/**
 * Classic Iterator
 *
 * @param <T> element type
 */
public class MyCollectionIterator<T> implements Iterator<T> {

  private final MyCollection<T> collection;

  private int count = -1;

  public MyCollectionIterator(MyCollection<T> collection) {
    this.collection = collection;
  }

  @Override
  public T first() {
    count = 0;
    return get();
  }

  @Override
  public T next() {
    count++;
    return get();
  }

  @Override
  public T prev() {
    count--;
    return get();
  }

  @Override
  public T current() {
    return get();
  }

  @Override
  public boolean isDone() {
    return count == 2;
  }

  private T get() {
    return switch (count) {
      case 0 -> collection.first;
      case 1 -> collection.second;
      case 2 -> collection.third;
      default -> throw new IndexOutOfBoundsException();
    };
  }

}
