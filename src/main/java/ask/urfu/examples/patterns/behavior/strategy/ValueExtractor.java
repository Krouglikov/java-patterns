package ask.urfu.examples.patterns.behavior.strategy;

/**
 * Concrete strategy
 */
public class ValueExtractor<T> implements Extractor<NamedValue<T>, T> {

  @Override
  public T extractKey(NamedValue<T> object) {
    return object.value();
  }
}
