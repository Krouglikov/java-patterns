package ask.urfu.examples.patterns.behavior.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Text {

  private List<String> lines = new ArrayList<>();

  public void forEach(UnaryOperator<String> process) {
    lines = lines.stream().map(process).collect(Collectors.toList());
  }

  public void add(String line) {
    lines.add(line);
  }

  @Override
  public String toString() {
    return String.join("\n", lines);
  }

}
