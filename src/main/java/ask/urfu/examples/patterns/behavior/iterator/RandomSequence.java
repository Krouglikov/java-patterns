package ask.urfu.examples.patterns.behavior.iterator;

import java.util.function.Supplier;

/**
 * Iterator without external collection
 *
 * @param <T> generated element type
 */
public class RandomSequence<T> implements Iterator<T> {

  private final Supplier<T> generate;

  private int limit;

  public RandomSequence(Supplier<T> generate, int limit) {
    this.generate = generate;
    this.limit = limit;
  }

  @Override
  public T first() {
    throw new UnsupportedOperationException();
  }

  @Override
  public T next() {
    if (isDone()) {
      throw new IndexOutOfBoundsException();
    }
    limit--;
    return value();
  }

  @Override
  public T prev() {
    throw new UnsupportedOperationException();
  }

  @Override
  public T current() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isDone() {
    return limit == 0;
  }

  private T value() {
    return generate.get();
  }

}
