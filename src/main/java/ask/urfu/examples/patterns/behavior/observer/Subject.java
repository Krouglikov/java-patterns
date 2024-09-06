package ask.urfu.examples.patterns.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Observation subject
 */
public class Subject {

  private final List<Observer> observers = new ArrayList<>();

  //region for Observer pattern
  // some inner state
  private int count;

  public void addObserver(Observer o) {
    if (o != null) {
      observers.add(o);
    }
  }

  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  void notifyChange() {
    observers.forEach(o ->
        o.update(this)
    );
  }

  public String getState() {
    return String.format("Count: %s", count);
  }

  //endregion

  public void increaseCount() {
    count++;
    notifyChange();
  }

}
