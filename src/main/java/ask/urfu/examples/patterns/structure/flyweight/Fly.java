package ask.urfu.examples.patterns.structure.flyweight;

import ask.urfu.examples.patterns.structure.flyweight.Map.Coordinates;
import java.util.Random;

/**
 * Flyweight pattern
 */
public class Fly { //note: can be a record

  private final Type type;

  public Fly(Type type) {
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  public Coordinates move(Coordinates originalLocation, Random random) {
    int dx = random.nextInt(-1, 1);
    int dy = random.nextInt(-1, 1);
    return new Coordinates(originalLocation.x() + dx, originalLocation.y() + dy);
  }

  public enum Type {
    MALE,
    FEMALE,
    EGG
  }

}
