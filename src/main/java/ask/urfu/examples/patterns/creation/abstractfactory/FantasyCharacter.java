package ask.urfu.examples.patterns.creation.abstractfactory;

import java.util.List;
import java.util.stream.Stream;

public class FantasyCharacter implements Character<FantasyItem> {

  private final List<FantasyItem> items;

  public FantasyCharacter(FantasyItem... items) {
    this.items = List.of(items);
  }

  @Override
  public Stream<FantasyItem> getItems() {
    return items.stream();
  }
}
