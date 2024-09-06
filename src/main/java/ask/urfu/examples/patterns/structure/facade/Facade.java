package ask.urfu.examples.patterns.structure.facade;

/**
 * Essence of Facade pattern
 */
public class Facade {

  private final OperationService operationService;

  private final LoggingService loggingService;

  private final NotificationService notificationService;

  public Facade(
      OperationService operationService,
      LoggingService loggingService,
      NotificationService notificationService) {
    this.operationService = operationService;
    this.loggingService = loggingService;
    this.notificationService = notificationService;
  }

  /**
   * Typical operation execution logic: log start, then execute, then log and notify success. In
   * case of error, log and notify error.
   */
  public void execute(Operation operation, User user) {
    try {
      loggingService.logStart(operation, user);
      operationService.execute(operation);
      loggingService.logSuccess(operation);
      notificationService.notifySuccess(operation, user);
    } catch (Exception e) {
      loggingService.logError(operation, e);
      notificationService.notifyError(operation, user, e);
    }
  }


}
