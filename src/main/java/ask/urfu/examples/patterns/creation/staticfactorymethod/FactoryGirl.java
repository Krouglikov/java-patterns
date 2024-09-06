package ask.urfu.examples.patterns.creation.staticfactorymethod;

/**
 * Static factory method pattern
 */
public class FactoryGirl {

  //insert fields here

  /**
   * Constructor is non-public to encourage static factory method use
   */
  FactoryGirl() {
  }

  /**
   * Create instance
   */
  public static FactoryGirl withJobExperience(int years) {
    //ensure invariants here
    return new FactoryGirl();
  }

  /**
   * Functionality
   */
  void doWork() {
    //insert code here
  }

}
