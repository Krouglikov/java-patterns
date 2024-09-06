package ask.urfu.examples.patterns.behavior.state;

/**
 * State that is not part of enum
 */
public class DetachedState implements State {


  @Override
  public void operate() {
    //implement
    System.out.println("Detached state");
  }

  @Override
  public String toString() {
    return "DETACHED_STATE";
  }

}
