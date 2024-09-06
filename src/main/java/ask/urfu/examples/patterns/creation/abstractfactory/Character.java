package ask.urfu.examples.patterns.creation.abstractfactory;

import java.util.Optional;
import java.util.stream.Stream;

public interface Character<I extends Item> {

  Stream<I> getItems();

  default String getInfo() {
    Optional<String> items = getItems()
        .map(item -> item.getClass().getSimpleName())
        .reduce((s, s1) -> s + ", " + s1);
    return items
        .map(s -> this.getClass().getSimpleName() + " with " + s)
        .orElseGet(() -> this.getClass().getSimpleName());
  }

}
