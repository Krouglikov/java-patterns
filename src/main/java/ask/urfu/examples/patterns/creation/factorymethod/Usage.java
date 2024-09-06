package ask.urfu.examples.patterns.creation.factorymethod;

/**
 * How to use Factory method pattern
 */
public class Usage {

  public static void main(String[] args) {

    DreamWeaver dreamWeaver;

    dreamWeaver = new SweetDreamsWeaver();
    dreamWeaver.showNewDream();
    dreamWeaver.showNewDream();

    dreamWeaver = new NightmaresWeaver();
    dreamWeaver.showNewDream();
    dreamWeaver.showNewDream();
  }

}
