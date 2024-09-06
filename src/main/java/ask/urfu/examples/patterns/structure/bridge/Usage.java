package ask.urfu.examples.patterns.structure.bridge;

import static ask.urfu.examples.patterns.structure.bridge.util.MouseImitator.MouseEvent.L_CLICK;

import ask.urfu.examples.patterns.structure.bridge.GameInterface.Command;
import ask.urfu.examples.patterns.structure.bridge.util.KeyPressImitator;
import ask.urfu.examples.patterns.structure.bridge.util.MouseImitator;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.Random;

/**
 * How to use Bridge pattern
 */
public class Usage {

  public static void main(String[] args) throws InterruptedException {
    Random random = new Random(LocalDateTime.now().get(ChronoField.MILLI_OF_DAY));
    KeyPressImitator keyboard1 =
        new KeyPressImitator("W", "W", "Space", "Ctrl", "Esc");
    KeyPressImitator keyboard2 =
        new KeyPressImitator("Space", "Space", "Space", "Space", "Space");
    MouseImitator mouse =
        new MouseImitator(L_CLICK, L_CLICK, L_CLICK, L_CLICK, L_CLICK);
    // imitate runtime choice of implementation
    GameInterface gameInterface;
    if (random.nextBoolean()) {
      // keyboard + keyboard
      gameInterface = new ComplexGameInterface(
          new SimpleGameInterface(new KeyboardInterfaceImplementation(keyboard1)),
          new SimpleGameInterface(new KeyboardInterfaceImplementation(keyboard2)));
    } else {
      // keyboard + mouse
      gameInterface = new ComplexGameInterface(
          new SimpleGameInterface(new KeyboardInterfaceImplementation(keyboard1)),
          new SimpleGameInterface(new MouseInterfaceImplementation(mouse)));
    }
    // imitate game
    Thread.sleep(1000);
    Command command = gameInterface.getCommand();
    while (command != Command.EXIT) {
      Thread.sleep(3000);
      command = gameInterface.getCommand();
    }
  }

}
