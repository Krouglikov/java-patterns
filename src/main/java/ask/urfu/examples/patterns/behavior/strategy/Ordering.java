package ask.urfu.examples.patterns.behavior.strategy;

/**
 * Strategy enum
 */
public enum Ordering {

  ASC {
    @Override
    public <T extends Comparable<T>> boolean follows(T a, T b) {
      return a.compareTo(b) > 0;
    }
  },

  DESC {
    @Override
    public <T extends Comparable<T>> boolean follows(T a, T b) {
      return a.compareTo(b) < 0;
    }
  };

  public abstract <T extends Comparable<T>> boolean follows(T a, T b);

}
