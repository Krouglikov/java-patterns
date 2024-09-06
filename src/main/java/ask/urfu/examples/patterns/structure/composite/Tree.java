package ask.urfu.examples.patterns.structure.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Composite implements operation usually delegating it to children.
 */
public class Tree implements Component {

  private final List<Component> children = new ArrayList<>();

  @Override
  public void operate() {
    //use any logic here, but usually the following:
    for (Component child : children) {
      child.operate();
    }
  }

  @Override
  public void addComponent(Component component) {
    if (component != null) {
      children.add(component);
    }
  }

  @Override
  public Stream<Component> children() {
    return children.stream();
  }

}
