package ask.urfu.examples.patterns.structure.facade;

/**
 * Worker class
 */
public class NotificationService {

  public void notifyStart(Operation operation, User user) {
    //implement logic
    System.out.printf("NOTIFICATION: '%s' started.%n", operation.getNotificationPrefix());
  }

  public void notifySuccess(Operation operation, User user) {
    //implement logic
    System.out.printf("NOTIFICATION: '%s' successful.%n", operation.getNotificationPrefix());
  }

  public void notifyError(Operation operation, User user, Exception e) {
    //implement logic
    System.out.printf("NOTIFICATION: '%s' failed.%n", operation.getNotificationPrefix());
  }

}
