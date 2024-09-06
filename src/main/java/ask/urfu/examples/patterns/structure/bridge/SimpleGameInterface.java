package ask.urfu.examples.patterns.structure.bridge;

/**
 * Abstraction subclass
 */
public class SimpleGameInterface extends GameInterface {

  public SimpleGameInterface(GameInterfaceImplementation gameInterfaceImplementation) {
    super(gameInterfaceImplementation);
  }

  @Override
  public Command getCommand() {
    if (gameInterfaceImplementation.quitCommand()) {
      return Command.EXIT;
    } else if (gameInterfaceImplementation.forwardCommand()) {
      return Command.FORWARD;
    } else if (gameInterfaceImplementation.backCommand()) {
      return Command.BACK;
    } else if (gameInterfaceImplementation.fireCommand()) {
      return Command.FIRE;
    } else if (gameInterfaceImplementation.specialCommand()) {
      return Command.SPECIAL;
    } else {
      return Command.NONE;
    }
  }

}
