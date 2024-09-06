package ask.urfu.examples.patterns.behavior.memento;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Originator in Memento pattern
 */
public class GameCharacter {

  public static final Random random = new Random(LocalDateTime.now().get(ChronoField.MILLI_OF_DAY));
  private final List<Integer> params;
  private String name;

  /**
   * Constructor prevents reconstruction by values
   */
  public GameCharacter(String name) {
    this.name = name;
    params = setRandomVals();
  }

  private static List<Integer> setRandomVals() {
    int valuesTotal = random.nextInt(5);
    ArrayList<Integer> randomValues = new ArrayList<>(valuesTotal);
    for (int i = 0; i < valuesTotal; i++) {
      randomValues.add(random.nextInt(10));
    }
    return randomValues;
  }

  public void levelUp() {
    List<Integer> newParams = params.stream().map(x -> x + 2).toList();
    params.clear();
    params.addAll(newParams);
  }

  @Override
  public String toString() {
    return name + " " + params.toString();
  }

  public Memento createMemento() {
    Memento memento = new Memento();
    memento.setState(this);
    return memento;
  }

  public void setMemento(Memento memento) {
    this.name = memento.getName();
    this.params.clear();
    this.params.addAll(memento.params);
  }

  /**
   * Static nested class hides everything from everyone but his owner
   */
  public static class Memento {

    private String name;
    private List<Integer> params;

    /**
     * Private to prevent anyone but owner from construction
     */
    private Memento() {
    }

    private String getName() {
      return name;
    }

    private void setState(GameCharacter state) {
      this.name = state.name;
      this.params = List.copyOf(state.params);
    }

  }

}
