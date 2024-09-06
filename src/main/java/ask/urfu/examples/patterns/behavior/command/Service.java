package ask.urfu.examples.patterns.behavior.command;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Receiver in Command pattern
 */
public class Service {

  private final Deque<Command> history = new ArrayDeque<>();

  private String text = "";

  public Deque<Command> getHistory() {
    return history;
  }

  public String getText() {
    return text;
  }

  /**
   * Execute 'Undo' action
   */
  public void undo() {
    Command toUndo = history.pop();
    toUndo.undo();
  }

  /**
   * Execute 'Edit' action
   */
  public void edit(int start, int end, String newValue) {
    if (newValue == null) {
      throw new IllegalArgumentException("new value must not be null");
    }
    int originalLength = text.length();
    if (start < 0 || start > originalLength) {
      throw new IllegalArgumentException("position out of text limits");
    }
    if (end < 0 || end > originalLength) {
      throw new IllegalArgumentException("position out of text limits");
    }
    String head = text.substring(0, start);
    String tail = text.substring(end);
    String oldValue = text.substring(start, end);
    text = head + newValue + tail;
    // log command to history
    history.push(new EditCommand(this, start, end, oldValue, newValue));
  }

}
