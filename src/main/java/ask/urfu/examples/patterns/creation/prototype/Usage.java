package ask.urfu.examples.patterns.creation.prototype;

/**
 * How to use Prototype pattern
 */
public class Usage {


  public static void main(String[] args) {
    RobotUser robotUser1 = new RobotUser(new Terminator());
    System.out.println(robotUser1.newRobot().report());
    System.out.println(robotUser1.newRobot().report());
    System.out.println(robotUser1.newRobot().report());

    RobotUser robotUser2 = new RobotUser(new Walle());
    System.out.println(robotUser2.newRobot().report());
    System.out.println(robotUser2.newRobot().report());
    System.out.println(robotUser2.newRobot().report());
  }

}
