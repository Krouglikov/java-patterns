package ask.urfu.examples.patterns.behavior.command;

/**
 * Concrete command
 */
public class UndoCommand extends Command {

  public UndoCommand(Service service) {
    super(service);
  }

  @Override
  public void execute() {
    service.undo();
  }

  @Override
  public Command clone(Object... params) {
    return new UndoCommand(this.service);
  }

  @Override
  public String toString() {
    return "Undo command";
  }
}
