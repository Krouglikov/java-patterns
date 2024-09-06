package ask.urfu.examples.patterns.structure.flyweight;

import ask.urfu.examples.patterns.structure.flyweight.Fly.Type;
import java.util.Random;

/**
 * Flyweight factory
 */
public class FlyFactory {

  private final Random random;
  private Fly male;
  private Fly female;
  private Fly egg;

  public FlyFactory(Random random) {
    this.random = random;
  }

  Fly getMale() {
    if (male == null) {
      male = new Fly(Type.MALE);
    }
    return male;
  }

  Fly getFemale() {
    if (female == null) {
      female = new Fly(Type.FEMALE);
    }
    return female;
  }

  Fly getEgg() {
    if (egg == null) {
      egg = new Fly(Type.EGG);
    }
    return egg;
  }

  Fly randomImago() {
    return (random.nextInt(100) < 50) ? getMale() : getFemale();
  }

}
