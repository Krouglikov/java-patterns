package ask.urfu.examples.patterns.structure.bridge;

/**
 * Abstraction subclass
 */
public class ComplexGameInterface extends GameInterface {

  private final GameInterface first;

  private final GameInterface second;

  public ComplexGameInterface(GameInterface first, GameInterface second) {
    super(null);
    this.first = first;
    this.second = second;
  }

  @Override
  public Command getCommand() {
    Command command = doGetCommand();
    System.out.println("Command: " + command);
    return command;
  }

  private Command doGetCommand() {
    Command command1 = first.getCommand();
    Command command2 = second.getCommand();
    if (command1 == Command.SPECIAL) {
      if (command2 == Command.FORWARD) {
        return Command.RUN;
      } else if (command2 == Command.FIRE) {
        return Command.BLAST;
      } else {
        return command2;
      }
    } else {
      return command1;
    }
  }

}
