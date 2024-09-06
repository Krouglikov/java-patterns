package ask.urfu.examples.patterns.behavior.state;

/**
 * How to use State pattern
 */
public class Usage {

  public static void main(String[] args) {
    AssaultRifle rifle = new AssaultRifle();
    rifle.operate();
    rifle.switchState(FireState.SINGLE_SHOT);
    rifle.operate();
    rifle.switchState(FireState.BURST);
    rifle.operate();
    rifle.switchState(FireState.SAFE);
    rifle.operate();
    // non-enum state
    rifle.switchState(new DetachedState());
    rifle.operate();
  }

}
