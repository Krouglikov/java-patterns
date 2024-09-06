package ask.urfu.examples.patterns.creation.factorymethod;

/**
 * Creator in Factory method pattern
 */
public abstract class DreamWeaver {

  protected abstract Dream createDream();

  void showNewDream() {
    Dream dream = createDream();
    System.out.println(dream.getClass().getSimpleName());
  }

}
