package ask.urfu.examples.patterns.structure.bridge.util;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Imitate mouse actions (since Java console applications cannot use mouse events)
 */
public class MouseImitator implements Runnable {

  public static final int DELAY_IN_MILLIS = 5_000;

  private final List<MouseEvent> sequence;

  public MouseImitator(MouseEvent... sequence) {
    this.sequence = new LinkedList<>(Arrays.stream(sequence).toList());
  }

  public synchronized MouseEvent lastMouseEvent() {
    return sequence.get(0);
  }

  private void nextEvent() {
    if (!sequence.isEmpty()) {
      sequence.remove(0);
    }
  }

  @Override
  public void run() {
    while (!sequence.isEmpty()) {
      try {
        System.out.println("Mouse event: " + lastMouseEvent());
        Thread.sleep(DELAY_IN_MILLIS);
        nextEvent();
      } catch (InterruptedException e) {
        // nothing
      }
    }
  }

  public enum MouseEvent {
    LEFT,
    RIGHT,
    L_CLICK,
    R_CLICK
  }

}
