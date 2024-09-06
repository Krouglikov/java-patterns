package ask.urfu.examples.patterns.behavior.state;

/**
 * Context. A state machine
 */
public class AssaultRifle {

  // state
  private State currentState = FireState.SAFE;

  public void switchState(State state) {
    if (state != null) {
      System.out.println("Switched to state " + state);
      currentState = state;
    }
  }

  public void operate() {
    // essence of state pattern
    currentState.operate();
  }

}
