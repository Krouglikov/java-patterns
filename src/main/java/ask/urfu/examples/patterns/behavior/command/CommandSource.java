package ask.urfu.examples.patterns.behavior.command;

/**
 * Invoker in Command pattern
 */
public class CommandSource {

  private Command command;

  public CommandSource(Command command) {
    this.command = command;
  }

  public void use(Object... params) {
    command = command.clone(params);
    command.execute();
  }

}
