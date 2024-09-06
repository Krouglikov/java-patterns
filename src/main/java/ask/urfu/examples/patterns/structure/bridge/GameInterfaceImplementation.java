package ask.urfu.examples.patterns.structure.bridge;

/**
 * Implementation hierarchy root. Implementation is independent of abstraction.
 */
public interface GameInterfaceImplementation {

  boolean forwardCommand();

  boolean backCommand();

  boolean fireCommand();

  boolean specialCommand();

  boolean quitCommand();

}
