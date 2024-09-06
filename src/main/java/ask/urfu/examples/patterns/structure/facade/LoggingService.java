package ask.urfu.examples.patterns.structure.facade;

/**
 * Worker class
 */
public class LoggingService {

  public void logStart(Operation operation, User user) {
    //implement logic
    System.out.printf(
        "LOG: '%s' started by user '%s'.%n", operation.getLogBegin(), user.getName()
    );
  }

  public void logSuccess(Operation operation) {
    //implement logic
    System.out.printf("LOG: '%s' successful.%n", operation.getLogEnd());
  }

  public void logError(Operation operation, Exception e) {
    //implement logic
    System.out.printf(
        "LOG: Operation '%s' failed.%nCause:%s%%n", operation.getName(), e.getMessage()
    );
  }
}
