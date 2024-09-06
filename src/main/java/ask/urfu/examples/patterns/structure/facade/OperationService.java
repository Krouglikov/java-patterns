package ask.urfu.examples.patterns.structure.facade;

/**
 * Worker class
 */
public class OperationService {

  public void execute(Operation operation) {
    //implement logic
    System.out.printf("Operation '%s' executing.%n", operation.getName());
  }
}
