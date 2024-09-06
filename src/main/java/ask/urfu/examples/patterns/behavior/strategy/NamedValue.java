package ask.urfu.examples.patterns.behavior.strategy;

public record NamedValue<T>(
    String name,
    T value
) {

  @Override
  public String toString() {
    return name + ": " + value.toString();
  }
}
