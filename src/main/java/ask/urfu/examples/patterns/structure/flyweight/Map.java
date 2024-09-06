package ask.urfu.examples.patterns.structure.flyweight;

import ask.urfu.examples.patterns.structure.flyweight.Fly.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntConsumer;

public class Map {

  //region Constants

  public static final int MIN_COORDINATES = 0;
  public static final int MAX_COORDINATES = 500;
  public static final int MAX_FLIES = 50_000;

  //endregion

  //region Fields
  private final Fly[] flies = new Fly[MAX_FLIES];
  private final Coordinates[] coords = new Coordinates[MAX_FLIES];
  private int totalFiles;

  //endregion

  //region Methods

  public Map(FlyFactory factory, Random random) {
    totalFiles = random.nextInt(1_000, 10_000);
    for (int i = 0; i < totalFiles; i++) {
      flies[i] = factory.randomImago();
      coords[i] = new Coordinates(
          random.nextInt(MIN_COORDINATES, MAX_COORDINATES),
          random.nextInt(MIN_COORDINATES, MAX_COORDINATES)
      );
    }
  }

  public java.util.Map<Coordinates, List<Fly>> analyze() {
    java.util.Map<Coordinates, List<Fly>> map = new java.util.HashMap<>();
    for (int i = 0; i < totalFiles; i++) {
      Coordinates flyCoords = coords[i];
      Fly fly = flies[i];
      map.computeIfAbsent(flyCoords, x -> new ArrayList<>()).add(fly);
    }
    return map;
  }

  public void moveFly(int index, Coordinates newCoords) {
    this.coords[index] = newCoords;
  }

  public Fly getFly(int i) {
    return flies[i];
  }

  public Coordinates getCoordinates(int i) {
    return coords[i];
  }

  public void forEach(IntConsumer processor) {
    for (int i = 0; i < totalFiles; i++) {
      processor.accept(i);
    }
  }

  public void addFly(Fly fly, Coordinates coords) {
    if (totalFiles + 1 < MAX_FLIES) {
      this.flies[totalFiles] = fly;
      this.coords[totalFiles] = Coordinates.copyOf(coords);
      this.totalFiles++;
    } else {
      throw new IllegalStateException("Maximum number reached");
    }
  }

  public void changeFly(Integer index, Fly newFly) {
    flies[index] = newFly;
  }

  @Override
  public String toString() {
    long males = Arrays.stream(flies).limit(totalFiles)
        .filter(fly -> fly.getType() == Type.MALE)
        .count();
    long females = Arrays.stream(flies).limit(totalFiles)
        .filter(fly -> fly.getType() == Type.FEMALE)
        .count();
    long eggs = Arrays.stream(flies).limit(totalFiles)
        .filter(fly -> fly.getType() == Type.EGG)
        .count();
    return String.format("Males: %s%nFemales: %s%nEggs: %s%n", males, females, eggs);
  }

  //endregion

  public record Coordinates(int x, int y) {

    public static Coordinates copyOf(Coordinates original) {
      return new Coordinates(original.x, original.y);
    }

    @Override
    public boolean equals(Object obj) {
      return (obj != null)
          && (obj.getClass().isAssignableFrom(Coordinates.class))
          && (((Coordinates) obj).x == this.x)
          && (((Coordinates) obj).y == this.y);
    }

  }

}
