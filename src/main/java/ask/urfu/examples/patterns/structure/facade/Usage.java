package ask.urfu.examples.patterns.structure.facade;

/**
 * How to use Facade pattern
 */
public class Usage {

  public static void main(String[] args) {
    NotificationService notificationService = new NotificationService();
    LoggingService loggingService = new LoggingService();
    OperationService operationService = new OperationService();
    Facade facade = new Facade(operationService, loggingService, notificationService);

    // Simple case, use facade
    Operation simpleCaseOperation = new Operation(
        "simple case operation",
        "Simple case operation",
        "Simple case operation",
        "Simple case operation"
    );
    User user = new User("ASK");
    facade.execute(simpleCaseOperation, user);

    // Complex case, facade not used
    System.out.println();
    Operation complexCaseOperation = new Operation(
        "complex case operation",
        "Complex case operation",
        "Complex case operation",
        "Complex case operation"
    );
    try {
      loggingService.logStart(complexCaseOperation, user);
      // unlike simple case, notification is sent before start
      notificationService.notifyStart(complexCaseOperation, user);
      // unlike simple case, two operations in a row are used
      operationService.execute(simpleCaseOperation);
      operationService.execute(complexCaseOperation);
      loggingService.logSuccess(complexCaseOperation);
      notificationService.notifySuccess(complexCaseOperation, user);
    } catch (Exception e) {
      loggingService.logError(complexCaseOperation, e);
      notificationService.notifyError(complexCaseOperation, user, e);
    }
  }

}
