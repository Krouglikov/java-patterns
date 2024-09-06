package ask.urfu.examples.patterns.structure.bridge.util;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Imitate keyboard keys pressed (since Java console applications cannot use key pressed events)
 */
public class KeyPressImitator implements Runnable {

  public static final int DELAY_IN_MILLIS = 5_000;

  private final List<String> sequence;

  public KeyPressImitator(String... sequence) {
    this.sequence = new LinkedList<>(Arrays.stream(sequence).toList());
  }

  public synchronized String lastKeyPressed() {
    return sequence.get(0);
  }

  private void nextKey() {
    if (!sequence.isEmpty()) {
      sequence.remove(0);
    }
  }

  @Override
  public void run() {
    while (!sequence.isEmpty()) {
      try {
        System.out.println("Key pressed: " + lastKeyPressed());
        Thread.sleep(DELAY_IN_MILLIS);
        nextKey();
      } catch (InterruptedException e) {
        // nothing
      }
    }
  }

}
