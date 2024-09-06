package ask.urfu.examples.patterns.creation.singleton;

/**
 * How to use Singleton pattern
 */
public class Usage {

  public static void main(String[] args) {

    //this is how we use a singleton -- we call it, use its functionality, and feel happy
    LonelyRanger.instance().saveEverybody();

    //weird singletons
    Superhero.BATMAN.saveTheWorld();
    Superhero.SUPERMAN.saveTheWorld();
  }

}
