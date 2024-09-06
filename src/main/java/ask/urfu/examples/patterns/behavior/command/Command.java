package ask.urfu.examples.patterns.behavior.command;

/**
 * Abstract command
 */
public abstract class Command {

  protected final Service service;

  protected Command(Service service) {
    this.service = service;
  }

  public abstract void execute();

  public void undo() {
  }

  public abstract Command clone(Object... params);

}
