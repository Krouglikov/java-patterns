package ask.urfu.examples.patterns.behavior.strategy;

/**
 * Strategy interface
 */
public interface Extractor<T, K> {

  K extractKey(T object);

}
