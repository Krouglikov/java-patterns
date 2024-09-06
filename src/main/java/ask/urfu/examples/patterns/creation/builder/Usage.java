package ask.urfu.examples.patterns.creation.builder;

/**
 * How to use Builder pattern
 */
public class Usage {

  public static void main(String[] args) {
    Beaver beaver1 = Beaver.builder()
        .age(12)
        .weightCapacity(45)
        .buildingSpeed(12.0)
        .movementSpeed(22.5)
        .build();
    beaver1.buildHut();
  }

}
