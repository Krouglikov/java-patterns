package ask.urfu.examples.patterns.structure.bridge;

/**
 * GameInterface. Main hierarchy root
 */
public abstract class GameInterface {

  // Bridge. Composition used instead of inheritance. Note reverse order.
  protected final GameInterfaceImplementation gameInterfaceImplementation;

  protected GameInterface(GameInterfaceImplementation gameInterfaceImplementation) {
    this.gameInterfaceImplementation = gameInterfaceImplementation;
  }

  public abstract Command getCommand();

  public enum Command {
    FORWARD,
    BACK,
    RUN,
    FIRE,
    BLAST,
    SPECIAL,
    NONE,
    EXIT
  }

}
