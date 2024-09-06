package ask.urfu.examples.patterns.structure.facade;

public class Operation {

  private final String name;
  private final String logBegin;
  private final String logEnd;
  private final String notificationPrefix;

  public Operation(String name, String logBegin, String logEnd, String notificationPrefix) {
    this.name = name;
    this.logBegin = logBegin;
    this.logEnd = logEnd;
    this.notificationPrefix = notificationPrefix;
  }

  public String getLogBegin() {
    return logBegin;
  }

  public String getLogEnd() {
    return logEnd;
  }

  public String getNotificationPrefix() {
    return notificationPrefix;
  }

  public String getName() {
    return name;
  }

}
