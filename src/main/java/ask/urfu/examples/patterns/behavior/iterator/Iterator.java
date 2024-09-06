package ask.urfu.examples.patterns.behavior.iterator;

/**
 * Essence of Iterator pattern
 *
 * @param <T> iterated elements type
 */
public interface Iterator<T> {

  T first();

  T next();

  T prev();

  T current();

  boolean isDone();

}
