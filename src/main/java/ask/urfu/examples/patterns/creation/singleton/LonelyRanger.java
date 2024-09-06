package ask.urfu.examples.patterns.creation.singleton;

/**
 * Singleton pattern
 */
public class LonelyRanger {

  /**
   * The one and only instance
   */
  private static final LonelyRanger INSTANCE = new LonelyRanger();

  //insert any needed fields here

  /**
   * Private constructor ensures no other instance ever appears
   */
  private LonelyRanger() {
    //initialize any needed fields here
  }

  /**
   * Everyone can call the one and only instance this way
   *
   * @return the one and only instance
   */
  public static LonelyRanger instance() {
    return INSTANCE;
  }

  /**
   * Functionality
   */
  public void saveEverybody() {
    //insert code here
  }

}
