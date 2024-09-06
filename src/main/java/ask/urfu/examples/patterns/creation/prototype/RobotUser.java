package ask.urfu.examples.patterns.creation.prototype;

public class RobotUser {

  private final Robot prototype;

  public RobotUser(Robot prototype) {
    this.prototype = prototype;
  }

  public Robot newRobot() {
    return prototype.copy();
  }

}
