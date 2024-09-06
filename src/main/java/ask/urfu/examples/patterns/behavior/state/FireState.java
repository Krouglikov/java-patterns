package ask.urfu.examples.patterns.behavior.state;

/**
 * State implementations
 */
public enum FireState implements State {

  /**
   * Safety mode. Rifle doesn't shoot.
   */
  SAFE {
    @Override
    public void operate() {
      //implement
      System.out.println("... (silence) ...");
    }
  },

  /**
   * Single mode. Rifle shoots one shot at a time
   */
  SINGLE_SHOT {
    @Override
    public void operate() {
      //implement
      System.out.println("BLAM!");
    }
  },

  /**
   * Burst mode. Rifle shoots several shots at a time.
   */
  BURST {
    @Override
    public void operate() {
      //implement
      System.out.println("BLAM-BLAM-BLAM!!!");
    }
  }

}
