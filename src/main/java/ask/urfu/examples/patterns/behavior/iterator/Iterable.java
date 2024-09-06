package ask.urfu.examples.patterns.behavior.iterator;

/**
 * Aggregate to be iterated over
 *
 * @param <T> element type
 */
public interface Iterable<T> {

  MyCollectionIterator<T> getIterator();

}
