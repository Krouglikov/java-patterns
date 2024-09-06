package ask.urfu.examples.patterns.structure.composite;

import java.util.stream.Stream;

/**
 * Leaves don't implement composite operations.
 */
public class Leaf implements Component {

  @Override
  public void operate() {
    // implement operation here
    System.out.println("Leaf operation");
  }

  @Override
  public void addComponent(Component component) {
    throw new UnsupportedOperationException("Not implemented");
  }

  @Override
  public Stream<Component> children() {
    // for simplicity
    return Stream.empty();
  }

}
