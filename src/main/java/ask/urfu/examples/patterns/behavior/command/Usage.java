package ask.urfu.examples.patterns.behavior.command;

/**
 * How to use Command pattern
 */
public class Usage {

  public static void main(String[] args) {
    // initialize
    Service service = new Service();
    CommandSource keyboardInput = new CommandSource(
        new EditCommand(service, 0, 0, "", "")
    );
    CommandSource undoButton = new CommandSource(
        new UndoCommand(service)
    );
    // imitate user actions
    showText(service);
    keyboardInput.use(0, 0, "lorem ipsum dolor");
    showText(service);
    keyboardInput.use(5, 5 + " satum".length(), " satum");
    showText(service);
    undoButton.use();
    showText(service);

    showHistory(service);
  }

  private static void showHistory(Service service) {
    System.out.println("\nHistory\n============");
    service.getHistory().descendingIterator().forEachRemaining(x ->
        System.out.println(x.toString())
    );
  }

  private static void showText(Service service) {
    System.out.println(service.getText());
  }

}
