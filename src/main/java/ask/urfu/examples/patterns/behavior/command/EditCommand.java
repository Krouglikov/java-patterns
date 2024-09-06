package ask.urfu.examples.patterns.behavior.command;

/**
 * Concrete command
 */
public class EditCommand extends Command {

  private final int start;

  private final int end;

  private final String oldValue;

  private final String newValue;

  public EditCommand(Service service, int start, int end, String oldValue, String newValue) {
    super(service);
    this.start = start;
    this.end = end;
    this.oldValue = oldValue;
    this.newValue = newValue;
  }

  @Override
  public void execute() {
    service.edit(start, end, newValue);
  }

  @Override
  public void undo() {
    service.edit(start, end, oldValue);
  }

  @Override
  public Command clone(Object... params) {
    return new EditCommand(
        this.service,
        (Integer) params[0],
        (Integer) params[1],
        null,
        (String) params[2]
    );
  }

  @Override
  public String toString() {
    return "Edit command. New value: " + newValue;
  }

}
