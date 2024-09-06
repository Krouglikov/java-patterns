package ask.urfu.examples.patterns.structure.composite;

import java.util.stream.Stream;

/**
 * Essence of Composite pattern. Basic operations and component operations united.
 */
public interface Component {

  /**
   * Basic operation
   */
  void operate();

  /**
   * Component operation
   */
  void addComponent(Component component);

  /**
   * Component operation
   */
  Stream<Component> children();

}
