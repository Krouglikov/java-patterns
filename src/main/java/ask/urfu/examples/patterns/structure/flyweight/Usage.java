package ask.urfu.examples.patterns.structure.flyweight;

import ask.urfu.examples.patterns.structure.flyweight.Fly.Type;
import ask.urfu.examples.patterns.structure.flyweight.Map.Coordinates;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.Random;

/**
 * How to use Flyweight pattern
 */
public class Usage {


  public static void main(String[] args) throws IOException {
    // initialization
    Random random = new Random(LocalDateTime.now().get(ChronoField.MILLI_OF_DAY));
    FlyFactory factory = new FlyFactory(random);
    Map map = new Map(factory, random);
    // initial state
    System.out.println(map);
    // game turns
    while (System.in.read() != 0) {
      gameTurn(map, factory, random);
      System.out.println(map);
    }
  }

  public static void gameTurn(Map map, FlyFactory factory, Random random) {
    // flies get born
    map.forEach(index -> {
      Fly fly = map.getFly(index);
      if (fly.getType() == Type.EGG) {
        Fly newFly = factory.randomImago();
        map.changeFly(index, newFly);
      }
    });
    // flies move
    map.forEach(index -> {
      Fly fly = map.getFly(index);
      Coordinates coordinates = map.getCoordinates(index);
      map.moveFly(index, fly.move(coordinates, random));
    });
    // flies lay eggs
    java.util.Map<Coordinates, List<Fly>> analyze = map.analyze();
    analyze.forEach((coords, flies) -> {
      long females = count(flies, Type.FEMALE);
      long males = count(flies, Type.MALE);
      long eggs = Math.min(females, males);
      for (int i = 0; i < eggs; i++) {
        Fly egg = factory.getEgg();
        map.addFly(egg, coords);
      }
    });
  }

  private static long count(List<Fly> flies, Fly.Type ofType) {
    return flies.stream().filter(fly -> ofType == fly.getType()).count();
  }
}
