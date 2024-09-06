package ask.urfu.examples.patterns.behavior.interpreter;

import java.util.Deque;
import java.util.LinkedList;

public class Context {

  Deque<Integer> values = new LinkedList<>();

  public Integer getValue() {
    return values.pop();
  }

  public void setValue(Integer value) {
    values.push(value);
  }

}
