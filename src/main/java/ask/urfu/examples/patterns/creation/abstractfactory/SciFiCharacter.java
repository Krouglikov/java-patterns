package ask.urfu.examples.patterns.creation.abstractfactory;

import java.util.List;
import java.util.stream.Stream;

public class SciFiCharacter implements Character<SciFiItem> {

  private final List<SciFiItem> items;

  public SciFiCharacter(SciFiItem... items) {
    this.items = List.of(items);
  }

  @Override
  public Stream<SciFiItem> getItems() {
    return items.stream();
  }
}
